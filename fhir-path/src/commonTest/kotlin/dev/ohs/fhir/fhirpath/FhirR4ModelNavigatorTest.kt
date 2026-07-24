/*
 * Copyright 2026 Open Health Stack Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.ohs.fhir.fhirpath

import dev.ohs.fhir.fhirpath.model.FhirR4ModelNavigator
import dev.ohs.fhir.model.r4.Age
import dev.ohs.fhir.model.r4.HumanName
import dev.ohs.fhir.model.r4.Observation
import dev.ohs.fhir.model.r4.Patient
import dev.ohs.fhir.model.r4.Quantity
import dev.ohs.fhir.model.r4.String as FhirString
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

class FhirR4ModelNavigatorTest {

  @Test
  fun `can access primitive property on resource`() {
    val patient = Patient(id = "p1")
    assertEquals("p1", FhirR4ModelNavigator.accessProperty(patient, "id")?.toString())
  }

  @Test
  fun `can access complex list property on resource`() {
    val patient = Patient(name = listOf(HumanName(family = FhirString("Smith"))))
    assertEquals(
      listOf(HumanName(family = FhirString("Smith"))),
      FhirR4ModelNavigator.accessProperty(patient, "name"),
    )
  }

  @Test
  fun `returns null for non existent property on resource`() {
    val patient = Patient(id = "p1")
    assertNull(FhirR4ModelNavigator.accessProperty(patient, "nonExistentProperty"))
  }

  @Test
  fun `can access property on backbone element`() {
    val contactName =
      HumanName(family = FhirString("du Marché"), given = listOf(FhirString("Bénédicte")))
    val contact = Patient.Contact(name = contactName)
    assertEquals(contactName, FhirR4ModelNavigator.accessProperty(contact, "name"))
  }

  @Test
  fun `returns null for non existent property on backbone element`() {
    val contact = Patient.Contact()
    assertNull(FhirR4ModelNavigator.accessProperty(contact, "nonExistentProperty"))
  }

  @Test
  fun `can access property on complex type`() {
    val name = HumanName(family = FhirString("Chalmers"), given = listOf(FhirString("Peter")))
    assertEquals(FhirString("Chalmers"), FhirR4ModelNavigator.accessProperty(name, "family"))
    assertEquals(listOf(FhirString("Peter")), FhirR4ModelNavigator.accessProperty(name, "given"))
  }

  @Test
  fun `can access property on subtype inheriting from concrete complex type`() {
    val age = Age(unit = FhirString("years"))
    assertEquals(FhirString("years"), FhirR4ModelNavigator.accessProperty(age, "unit"))
  }

  @Test
  fun `returns null for non existent property on complex type`() {
    val name = HumanName(family = FhirString("Chalmers"))
    assertNull(FhirR4ModelNavigator.accessProperty(name, "nonExistentProperty"))
  }

  @Test
  fun `can access property on polymorphic choice interface value`() {
    val quantity = Quantity(unit = FhirString("kg"))
    val valueChoice: Observation.Value = Observation.Value.Quantity(quantity)
    assertEquals(FhirString("kg"), FhirR4ModelNavigator.accessProperty(valueChoice, "unit"))
  }

  @Test
  fun `can get all children`() {
    val name = HumanName(family = FhirString("Chalmers"), given = listOf(FhirString("Peter")))
    val children = FhirR4ModelNavigator.getAllChildren(name)

    assertTrue(children.contains(FhirString("Chalmers")))
    assertTrue(children.contains(FhirString("Peter")))
  }
}
