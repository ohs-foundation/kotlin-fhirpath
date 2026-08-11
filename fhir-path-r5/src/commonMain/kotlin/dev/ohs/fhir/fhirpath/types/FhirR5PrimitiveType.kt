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

package dev.ohs.fhir.fhirpath.types

import dev.ohs.fhir.model.r5.Enumeration
import kotlin.Any

public enum class FhirR5PrimitiveType(override val typeName: kotlin.String) : FhirR5Type {
  Oid("oid"),
  Uri("uri"),
  Id("id"),
  Time("time"),
  Base64Binary("base64Binary"),
  String("string"),
  Markdown("markdown"),
  DateTime("dateTime"),
  Boolean("boolean"),
  PositiveInt("positiveInt"),
  Uuid("uuid"),
  Code("code"),
  Integer("integer"),
  Xhtml("xhtml"),
  Date("date"),
  Integer64("integer64"),
  Url("url"),
  Instant("instant"),
  Decimal("decimal"),
  Canonical("canonical"),
  UnsignedInt("unsignedInt");

  public companion object {
    public fun fromString(`value`: kotlin.String): FhirR5PrimitiveType? =
      entries.find { it.typeName == value }

    public fun fromObject(`value`: Any): FhirR5PrimitiveType? =
      when (value) {
        is dev.ohs.fhir.model.r5.Oid -> Oid
        is dev.ohs.fhir.model.r5.Uuid -> Uuid
        is dev.ohs.fhir.model.r5.Url -> Url
        is dev.ohs.fhir.model.r5.Canonical -> Canonical
        is dev.ohs.fhir.model.r5.Uri -> Uri
        is dev.ohs.fhir.model.r5.Id -> Id
        is dev.ohs.fhir.model.r5.Time -> Time
        is dev.ohs.fhir.model.r5.Base64Binary -> Base64Binary
        is dev.ohs.fhir.model.r5.Markdown -> Markdown
        is dev.ohs.fhir.model.r5.Code -> Code
        is dev.ohs.fhir.model.r5.String -> String
        is dev.ohs.fhir.model.r5.DateTime -> DateTime
        is dev.ohs.fhir.model.r5.Boolean -> Boolean
        is dev.ohs.fhir.model.r5.PositiveInt -> PositiveInt
        is dev.ohs.fhir.model.r5.UnsignedInt -> UnsignedInt
        is dev.ohs.fhir.model.r5.Integer -> Integer
        is dev.ohs.fhir.model.r5.Xhtml -> Xhtml
        is dev.ohs.fhir.model.r5.Date -> Date
        is dev.ohs.fhir.model.r5.Integer64 -> Integer64
        is dev.ohs.fhir.model.r5.Instant -> Instant
        is dev.ohs.fhir.model.r5.Decimal -> Decimal
        is Enumeration<*> -> Code
        else -> null
      }
  }
}
