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

import kotlin.Any
import kotlin.String

public enum class FhirR5ComplexType(override val typeName: String) : FhirR5Type {
  Attachment("Attachment"),
  RelatedArtifact("RelatedArtifact"),
  Count("Count"),
  RatioRange("RatioRange"),
  ContactDetail("ContactDetail"),
  ElementDefinition("ElementDefinition"),
  TriggerDefinition("TriggerDefinition"),
  MonetaryComponent("MonetaryComponent"),
  BackboneElement("BackboneElement"),
  ContactPoint("ContactPoint"),
  Annotation("Annotation"),
  VirtualServiceDetail("VirtualServiceDetail"),
  Meta("Meta"),
  BackboneType("BackboneType"),
  Contributor("Contributor"),
  Dosage("Dosage"),
  Ratio("Ratio"),
  Coding("Coding"),
  Availability("Availability"),
  DataRequirement("DataRequirement"),
  PrimitiveType("PrimitiveType"),
  ParameterDefinition("ParameterDefinition"),
  Base("Base"),
  MarketingStatus("MarketingStatus"),
  Timing("Timing"),
  Period("Period"),
  Extension("Extension"),
  ProductShelfLife("ProductShelfLife"),
  Signature("Signature"),
  Duration("Duration"),
  Identifier("Identifier"),
  HumanName("HumanName"),
  CodeableReference("CodeableReference"),
  ExtendedContactDetail("ExtendedContactDetail"),
  Expression("Expression"),
  Range("Range"),
  Reference("Reference"),
  Narrative("Narrative"),
  Money("Money"),
  Distance("Distance"),
  DataType("DataType"),
  SampledData("SampledData"),
  Age("Age"),
  CodeableConcept("CodeableConcept"),
  Quantity("Quantity"),
  Address("Address"),
  UsageContext("UsageContext");

  public companion object {
    public fun fromString(`value`: String): FhirR5ComplexType? =
      entries.find { it.typeName == value }

    public fun fromObject(`value`: Any): FhirR5ComplexType? =
      when (value) {
        is dev.ohs.fhir.model.r5.Attachment -> Attachment
        is dev.ohs.fhir.model.r5.RelatedArtifact -> RelatedArtifact
        is dev.ohs.fhir.model.r5.Count -> Count
        is dev.ohs.fhir.model.r5.RatioRange -> RatioRange
        is dev.ohs.fhir.model.r5.ContactDetail -> ContactDetail
        is dev.ohs.fhir.model.r5.ElementDefinition -> ElementDefinition
        is dev.ohs.fhir.model.r5.TriggerDefinition -> TriggerDefinition
        is dev.ohs.fhir.model.r5.MonetaryComponent -> MonetaryComponent
        is dev.ohs.fhir.model.r5.BackboneElement -> BackboneElement
        is dev.ohs.fhir.model.r5.ContactPoint -> ContactPoint
        is dev.ohs.fhir.model.r5.Annotation -> Annotation
        is dev.ohs.fhir.model.r5.VirtualServiceDetail -> VirtualServiceDetail
        is dev.ohs.fhir.model.r5.Meta -> Meta
        is dev.ohs.fhir.model.r5.BackboneType -> BackboneType
        is dev.ohs.fhir.model.r5.Contributor -> Contributor
        is dev.ohs.fhir.model.r5.Dosage -> Dosage
        is dev.ohs.fhir.model.r5.Ratio -> Ratio
        is dev.ohs.fhir.model.r5.Coding -> Coding
        is dev.ohs.fhir.model.r5.Availability -> Availability
        is dev.ohs.fhir.model.r5.DataRequirement -> DataRequirement
        is dev.ohs.fhir.model.r5.PrimitiveType -> PrimitiveType
        is dev.ohs.fhir.model.r5.ParameterDefinition -> ParameterDefinition
        is dev.ohs.fhir.model.r5.Base -> Base
        is dev.ohs.fhir.model.r5.MarketingStatus -> MarketingStatus
        is dev.ohs.fhir.model.r5.Timing -> Timing
        is dev.ohs.fhir.model.r5.Period -> Period
        is dev.ohs.fhir.model.r5.Extension -> Extension
        is dev.ohs.fhir.model.r5.ProductShelfLife -> ProductShelfLife
        is dev.ohs.fhir.model.r5.Signature -> Signature
        is dev.ohs.fhir.model.r5.Duration -> Duration
        is dev.ohs.fhir.model.r5.Identifier -> Identifier
        is dev.ohs.fhir.model.r5.HumanName -> HumanName
        is dev.ohs.fhir.model.r5.CodeableReference -> CodeableReference
        is dev.ohs.fhir.model.r5.ExtendedContactDetail -> ExtendedContactDetail
        is dev.ohs.fhir.model.r5.Expression -> Expression
        is dev.ohs.fhir.model.r5.Range -> Range
        is dev.ohs.fhir.model.r5.Reference -> Reference
        is dev.ohs.fhir.model.r5.Narrative -> Narrative
        is dev.ohs.fhir.model.r5.Money -> Money
        is dev.ohs.fhir.model.r5.Distance -> Distance
        is dev.ohs.fhir.model.r5.DataType -> DataType
        is dev.ohs.fhir.model.r5.SampledData -> SampledData
        is dev.ohs.fhir.model.r5.Age -> Age
        is dev.ohs.fhir.model.r5.CodeableConcept -> CodeableConcept
        is dev.ohs.fhir.model.r5.Quantity -> Quantity
        is dev.ohs.fhir.model.r5.Address -> Address
        is dev.ohs.fhir.model.r5.UsageContext -> UsageContext
        else -> null
      }
  }
}
