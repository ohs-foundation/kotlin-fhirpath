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

package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.ActivityDefinition
import dev.ohs.fhir.model.r4.AllergyIntolerance
import dev.ohs.fhir.model.r4.AuditEvent
import dev.ohs.fhir.model.r4.BiologicallyDerivedProduct
import dev.ohs.fhir.model.r4.CarePlan
import dev.ohs.fhir.model.r4.ChargeItem
import dev.ohs.fhir.model.r4.Claim
import dev.ohs.fhir.model.r4.ClaimResponse
import dev.ohs.fhir.model.r4.ClinicalImpression
import dev.ohs.fhir.model.r4.CodeSystem
import dev.ohs.fhir.model.r4.Communication
import dev.ohs.fhir.model.r4.CommunicationRequest
import dev.ohs.fhir.model.r4.Composition
import dev.ohs.fhir.model.r4.ConceptMap
import dev.ohs.fhir.model.r4.Condition
import dev.ohs.fhir.model.r4.Consent
import dev.ohs.fhir.model.r4.Contract
import dev.ohs.fhir.model.r4.Coverage
import dev.ohs.fhir.model.r4.CoverageEligibilityRequest
import dev.ohs.fhir.model.r4.CoverageEligibilityResponse
import dev.ohs.fhir.model.r4.DetectedIssue
import dev.ohs.fhir.model.r4.DeviceDefinition
import dev.ohs.fhir.model.r4.DeviceRequest
import dev.ohs.fhir.model.r4.DeviceUseStatement
import dev.ohs.fhir.model.r4.DiagnosticReport
import dev.ohs.fhir.model.r4.EventDefinition
import dev.ohs.fhir.model.r4.EvidenceVariable
import dev.ohs.fhir.model.r4.ExplanationOfBenefit
import dev.ohs.fhir.model.r4.FamilyMemberHistory
import dev.ohs.fhir.model.r4.Goal
import dev.ohs.fhir.model.r4.Group
import dev.ohs.fhir.model.r4.GuidanceResponse
import dev.ohs.fhir.model.r4.Immunization
import dev.ohs.fhir.model.r4.ImmunizationEvaluation
import dev.ohs.fhir.model.r4.ImmunizationRecommendation
import dev.ohs.fhir.model.r4.ImplementationGuide
import dev.ohs.fhir.model.r4.Invoice
import dev.ohs.fhir.model.r4.Library
import dev.ohs.fhir.model.r4.Measure
import dev.ohs.fhir.model.r4.Media
import dev.ohs.fhir.model.r4.Medication
import dev.ohs.fhir.model.r4.MedicationAdministration
import dev.ohs.fhir.model.r4.MedicationDispense
import dev.ohs.fhir.model.r4.MedicationKnowledge
import dev.ohs.fhir.model.r4.MedicationRequest
import dev.ohs.fhir.model.r4.MedicationStatement
import dev.ohs.fhir.model.r4.MedicinalProduct
import dev.ohs.fhir.model.r4.MedicinalProductAuthorization
import dev.ohs.fhir.model.r4.MedicinalProductContraindication
import dev.ohs.fhir.model.r4.MedicinalProductIndication
import dev.ohs.fhir.model.r4.MedicinalProductInteraction
import dev.ohs.fhir.model.r4.MessageDefinition
import dev.ohs.fhir.model.r4.MessageHeader
import dev.ohs.fhir.model.r4.NutritionOrder
import dev.ohs.fhir.model.r4.Observation
import dev.ohs.fhir.model.r4.Parameters
import dev.ohs.fhir.model.r4.Patient
import dev.ohs.fhir.model.r4.PlanDefinition
import dev.ohs.fhir.model.r4.Procedure
import dev.ohs.fhir.model.r4.Provenance
import dev.ohs.fhir.model.r4.Questionnaire
import dev.ohs.fhir.model.r4.QuestionnaireResponse
import dev.ohs.fhir.model.r4.RequestGroup
import dev.ohs.fhir.model.r4.ResearchDefinition
import dev.ohs.fhir.model.r4.ResearchElementDefinition
import dev.ohs.fhir.model.r4.RiskAssessment
import dev.ohs.fhir.model.r4.ServiceRequest
import dev.ohs.fhir.model.r4.Specimen
import dev.ohs.fhir.model.r4.SpecimenDefinition
import dev.ohs.fhir.model.r4.StructureMap
import dev.ohs.fhir.model.r4.Substance
import dev.ohs.fhir.model.r4.SubstanceReferenceInformation
import dev.ohs.fhir.model.r4.SubstanceSpecification
import dev.ohs.fhir.model.r4.SupplyDelivery
import dev.ohs.fhir.model.r4.SupplyRequest
import dev.ohs.fhir.model.r4.Task
import dev.ohs.fhir.model.r4.ValueSet
import kotlin.Any
import kotlin.Boolean
import kotlin.String

private fun Any.getPropertyInChoiceValue0(name: String): Any? =
  when (this) {
    is SubstanceSpecification.Moiety.Amount.Quantity -> this.value.getProperty(name)
    is SubstanceSpecification.Moiety.Amount.String -> this.value.getProperty(name)
    is SubstanceSpecification.Property.DefiningSubstance.Reference -> this.value.getProperty(name)
    is SubstanceSpecification.Property.DefiningSubstance.CodeableConcept ->
      this.value.getProperty(name)
    is SubstanceSpecification.Property.Amount.Quantity -> this.value.getProperty(name)
    is SubstanceSpecification.Property.Amount.String -> this.value.getProperty(name)
    is SubstanceSpecification.Relationship.Substance.Reference -> this.value.getProperty(name)
    is SubstanceSpecification.Relationship.Substance.CodeableConcept -> this.value.getProperty(name)
    is SubstanceSpecification.Relationship.Amount.Quantity -> this.value.getProperty(name)
    is SubstanceSpecification.Relationship.Amount.Range -> this.value.getProperty(name)
    is SubstanceSpecification.Relationship.Amount.Ratio -> this.value.getProperty(name)
    is SubstanceSpecification.Relationship.Amount.String -> this.value.getProperty(name)
    is DeviceUseStatement.Timing.Timing -> this.value.getProperty(name)
    is DeviceUseStatement.Timing.Period -> this.value.getProperty(name)
    is DeviceUseStatement.Timing.DateTime -> this.value.getProperty(name)
    is Condition.Onset.DateTime -> this.value.getProperty(name)
    is Condition.Onset.Age -> this.value.getProperty(name)
    is Condition.Onset.Period -> this.value.getProperty(name)
    is Condition.Onset.Range -> this.value.getProperty(name)
    is Condition.Onset.String -> this.value.getProperty(name)
    is Condition.Abatement.DateTime -> this.value.getProperty(name)
    is Condition.Abatement.Age -> this.value.getProperty(name)
    is Condition.Abatement.Period -> this.value.getProperty(name)
    is Condition.Abatement.Range -> this.value.getProperty(name)
    is Condition.Abatement.String -> this.value.getProperty(name)
    is ChargeItem.Occurrence.DateTime -> this.value.getProperty(name)
    is ChargeItem.Occurrence.Period -> this.value.getProperty(name)
    is ChargeItem.Occurrence.Timing -> this.value.getProperty(name)
    is ChargeItem.Product.Reference -> this.value.getProperty(name)
    is ChargeItem.Product.CodeableConcept -> this.value.getProperty(name)
    is Media.Created.DateTime -> this.value.getProperty(name)
    is Media.Created.Period -> this.value.getProperty(name)
    is SupplyDelivery.SuppliedItem.Item.CodeableConcept -> this.value.getProperty(name)
    is SupplyDelivery.SuppliedItem.Item.Reference -> this.value.getProperty(name)
    is SupplyDelivery.Occurrence.DateTime -> this.value.getProperty(name)
    is SupplyDelivery.Occurrence.Period -> this.value.getProperty(name)
    is SupplyDelivery.Occurrence.Timing -> this.value.getProperty(name)
    is Composition.RelatesTo.Target.Identifier -> this.value.getProperty(name)
    is Composition.RelatesTo.Target.Reference -> this.value.getProperty(name)
    is MedicationAdministration.Medication.CodeableConcept -> this.value.getProperty(name)
    is MedicationAdministration.Medication.Reference -> this.value.getProperty(name)
    is MedicationAdministration.Effective.DateTime -> this.value.getProperty(name)
    is MedicationAdministration.Effective.Period -> this.value.getProperty(name)
    is MedicationAdministration.Dosage.Rate.Ratio -> this.value.getProperty(name)
    is MedicationAdministration.Dosage.Rate.Quantity -> this.value.getProperty(name)
    is Claim.SupportingInfo.Timing.Date -> this.value.getProperty(name)
    is Claim.SupportingInfo.Timing.Period -> this.value.getProperty(name)
    is Claim.SupportingInfo.Value.Boolean -> this.value.getProperty(name)
    is Claim.SupportingInfo.Value.String -> this.value.getProperty(name)
    is Claim.SupportingInfo.Value.Quantity -> this.value.getProperty(name)
    is Claim.SupportingInfo.Value.Attachment -> this.value.getProperty(name)
    is Claim.SupportingInfo.Value.Reference -> this.value.getProperty(name)
    is Claim.Diagnosis.Diagnosis.CodeableConcept -> this.value.getProperty(name)
    is Claim.Diagnosis.Diagnosis.Reference -> this.value.getProperty(name)
    is Claim.Procedure.Procedure.CodeableConcept -> this.value.getProperty(name)
    is Claim.Procedure.Procedure.Reference -> this.value.getProperty(name)
    is Claim.Accident.Location.Address -> this.value.getProperty(name)
    is Claim.Accident.Location.Reference -> this.value.getProperty(name)
    is Claim.Item.Serviced.Date -> this.value.getProperty(name)
    is Claim.Item.Serviced.Period -> this.value.getProperty(name)
    is Claim.Item.Location.CodeableConcept -> this.value.getProperty(name)
    is Claim.Item.Location.Address -> this.value.getProperty(name)
    is Claim.Item.Location.Reference -> this.value.getProperty(name)
    is AuditEvent.Entity.Detail.Value.String -> this.value.getProperty(name)
    is AuditEvent.Entity.Detail.Value.Base64Binary -> this.value.getProperty(name)
    is ServiceRequest.Quantity.Quantity -> this.value.getProperty(name)
    is ServiceRequest.Quantity.Ratio -> this.value.getProperty(name)
    is ServiceRequest.Quantity.Range -> this.value.getProperty(name)
    is ServiceRequest.Occurrence.DateTime -> this.value.getProperty(name)
    is ServiceRequest.Occurrence.Period -> this.value.getProperty(name)
    is ServiceRequest.Occurrence.Timing -> this.value.getProperty(name)
    is ServiceRequest.AsNeeded.Boolean -> this.value.getProperty(name)
    is ServiceRequest.AsNeeded.CodeableConcept -> this.value.getProperty(name)
    is EventDefinition.Subject.CodeableConcept -> this.value.getProperty(name)
    is EventDefinition.Subject.Reference -> this.value.getProperty(name)
    is CarePlan.Activity.Detail.Scheduled.Timing -> this.value.getProperty(name)
    is CarePlan.Activity.Detail.Scheduled.Period -> this.value.getProperty(name)
    is CarePlan.Activity.Detail.Scheduled.String -> this.value.getProperty(name)
    is CarePlan.Activity.Detail.Product.CodeableConcept -> this.value.getProperty(name)
    is CarePlan.Activity.Detail.Product.Reference -> this.value.getProperty(name)
    is CoverageEligibilityResponse.Serviced.Date -> this.value.getProperty(name)
    is CoverageEligibilityResponse.Serviced.Period -> this.value.getProperty(name)
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed.UnsignedInt ->
      this.value.getProperty(name)
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed.String ->
      this.value.getProperty(name)
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed.Money ->
      this.value.getProperty(name)
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Used.UnsignedInt ->
      this.value.getProperty(name)
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Used.String ->
      this.value.getProperty(name)
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Used.Money -> this.value.getProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Boolean -> this.value.getProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Decimal -> this.value.getProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Integer -> this.value.getProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Date -> this.value.getProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.DateTime -> this.value.getProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Time -> this.value.getProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.String -> this.value.getProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Uri -> this.value.getProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Attachment -> this.value.getProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Coding -> this.value.getProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Quantity -> this.value.getProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Reference -> this.value.getProperty(name)
    is Measure.Subject.CodeableConcept -> this.value.getProperty(name)
    is Measure.Subject.Reference -> this.value.getProperty(name)
    is ActivityDefinition.Subject.CodeableConcept -> this.value.getProperty(name)
    is ActivityDefinition.Subject.Reference -> this.value.getProperty(name)
    is ActivityDefinition.Timing.Timing -> this.value.getProperty(name)
    is ActivityDefinition.Timing.DateTime -> this.value.getProperty(name)
    is ActivityDefinition.Timing.Age -> this.value.getProperty(name)
    is ActivityDefinition.Timing.Period -> this.value.getProperty(name)
    is ActivityDefinition.Timing.Range -> this.value.getProperty(name)
    is ActivityDefinition.Timing.Duration -> this.value.getProperty(name)
    is ActivityDefinition.Product.Reference -> this.value.getProperty(name)
    is ActivityDefinition.Product.CodeableConcept -> this.value.getProperty(name)
    is DeviceRequest.Code.Reference -> this.value.getProperty(name)
    is DeviceRequest.Code.CodeableConcept -> this.value.getProperty(name)
    is DeviceRequest.Parameter.Value.CodeableConcept -> this.value.getProperty(name)
    is DeviceRequest.Parameter.Value.Quantity -> this.value.getProperty(name)
    is DeviceRequest.Parameter.Value.Range -> this.value.getProperty(name)
    is DeviceRequest.Parameter.Value.Boolean -> this.value.getProperty(name)
    is DeviceRequest.Occurrence.DateTime -> this.value.getProperty(name)
    is DeviceRequest.Occurrence.Period -> this.value.getProperty(name)
    is DeviceRequest.Occurrence.Timing -> this.value.getProperty(name)
    is Substance.Ingredient.Substance.CodeableConcept -> this.value.getProperty(name)
    is Substance.Ingredient.Substance.Reference -> this.value.getProperty(name)
    is Group.Characteristic.Value.CodeableConcept -> this.value.getProperty(name)
    is Group.Characteristic.Value.Boolean -> this.value.getProperty(name)
    is Group.Characteristic.Value.Quantity -> this.value.getProperty(name)
    is Group.Characteristic.Value.Range -> this.value.getProperty(name)
    is Group.Characteristic.Value.Reference -> this.value.getProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Boolean -> this.value.getProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Decimal -> this.value.getProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Integer -> this.value.getProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Date -> this.value.getProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.DateTime -> this.value.getProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Time -> this.value.getProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.String -> this.value.getProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Coding -> this.value.getProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Quantity -> this.value.getProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Reference -> this.value.getProperty(name)
    is Questionnaire.Item.AnswerOption.Value.Integer -> this.value.getProperty(name)
    is Questionnaire.Item.AnswerOption.Value.Date -> this.value.getProperty(name)
    is Questionnaire.Item.AnswerOption.Value.Time -> this.value.getProperty(name)
    is Questionnaire.Item.AnswerOption.Value.String -> this.value.getProperty(name)
    is Questionnaire.Item.AnswerOption.Value.Coding -> this.value.getProperty(name)
    is Questionnaire.Item.AnswerOption.Value.Reference -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.Boolean -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.Decimal -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.Integer -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.Date -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.DateTime -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.Time -> this.value.getProperty(name)
    else -> null
  }

private fun Any.getPropertyInChoiceValue1(name: String): Any? =
  when (this) {
    is Questionnaire.Item.Initial.Value.String -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.Uri -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.Attachment -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.Coding -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.Quantity -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.Reference -> this.value.getProperty(name)
    is SupplyRequest.Item.CodeableConcept -> this.value.getProperty(name)
    is SupplyRequest.Item.Reference -> this.value.getProperty(name)
    is SupplyRequest.Parameter.Value.CodeableConcept -> this.value.getProperty(name)
    is SupplyRequest.Parameter.Value.Quantity -> this.value.getProperty(name)
    is SupplyRequest.Parameter.Value.Range -> this.value.getProperty(name)
    is SupplyRequest.Parameter.Value.Boolean -> this.value.getProperty(name)
    is SupplyRequest.Occurrence.DateTime -> this.value.getProperty(name)
    is SupplyRequest.Occurrence.Period -> this.value.getProperty(name)
    is SupplyRequest.Occurrence.Timing -> this.value.getProperty(name)
    is Provenance.Occurred.Period -> this.value.getProperty(name)
    is Provenance.Occurred.DateTime -> this.value.getProperty(name)
    is RiskAssessment.Occurrence.DateTime -> this.value.getProperty(name)
    is RiskAssessment.Occurrence.Period -> this.value.getProperty(name)
    is RiskAssessment.Prediction.Probability.Decimal -> this.value.getProperty(name)
    is RiskAssessment.Prediction.Probability.Range -> this.value.getProperty(name)
    is RiskAssessment.Prediction.When.Period -> this.value.getProperty(name)
    is RiskAssessment.Prediction.When.Range -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Base64Binary -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Boolean -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Canonical -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Code -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Date -> this.value.getProperty(name)
    is Parameters.Parameter.Value.DateTime -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Decimal -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Id -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Instant -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Integer -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Markdown -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Oid -> this.value.getProperty(name)
    is Parameters.Parameter.Value.PositiveInt -> this.value.getProperty(name)
    is Parameters.Parameter.Value.String -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Time -> this.value.getProperty(name)
    is Parameters.Parameter.Value.UnsignedInt -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Uri -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Url -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Uuid -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Address -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Age -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Annotation -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Attachment -> this.value.getProperty(name)
    is Parameters.Parameter.Value.CodeableConcept -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Coding -> this.value.getProperty(name)
    is Parameters.Parameter.Value.ContactPoint -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Count -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Distance -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Duration -> this.value.getProperty(name)
    is Parameters.Parameter.Value.HumanName -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Identifier -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Money -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Period -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Quantity -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Range -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Ratio -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Reference -> this.value.getProperty(name)
    is Parameters.Parameter.Value.SampledData -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Signature -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Timing -> this.value.getProperty(name)
    is Parameters.Parameter.Value.ContactDetail -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Contributor -> this.value.getProperty(name)
    is Parameters.Parameter.Value.DataRequirement -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Expression -> this.value.getProperty(name)
    is Parameters.Parameter.Value.ParameterDefinition -> this.value.getProperty(name)
    is Parameters.Parameter.Value.RelatedArtifact -> this.value.getProperty(name)
    is Parameters.Parameter.Value.TriggerDefinition -> this.value.getProperty(name)
    is Parameters.Parameter.Value.UsageContext -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Dosage -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Meta -> this.value.getProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Timing.Date -> this.value.getProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Timing.Period -> this.value.getProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Boolean -> this.value.getProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.String -> this.value.getProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Quantity -> this.value.getProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Attachment -> this.value.getProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Reference -> this.value.getProperty(name)
    is ExplanationOfBenefit.Diagnosis.Diagnosis.CodeableConcept -> this.value.getProperty(name)
    is ExplanationOfBenefit.Diagnosis.Diagnosis.Reference -> this.value.getProperty(name)
    is ExplanationOfBenefit.Procedure.Procedure.CodeableConcept -> this.value.getProperty(name)
    is ExplanationOfBenefit.Procedure.Procedure.Reference -> this.value.getProperty(name)
    is ExplanationOfBenefit.Accident.Location.Address -> this.value.getProperty(name)
    is ExplanationOfBenefit.Accident.Location.Reference -> this.value.getProperty(name)
    is ExplanationOfBenefit.Item.Serviced.Date -> this.value.getProperty(name)
    is ExplanationOfBenefit.Item.Serviced.Period -> this.value.getProperty(name)
    is ExplanationOfBenefit.Item.Location.CodeableConcept -> this.value.getProperty(name)
    is ExplanationOfBenefit.Item.Location.Address -> this.value.getProperty(name)
    is ExplanationOfBenefit.Item.Location.Reference -> this.value.getProperty(name)
    is ExplanationOfBenefit.AddItem.Serviced.Date -> this.value.getProperty(name)
    is ExplanationOfBenefit.AddItem.Serviced.Period -> this.value.getProperty(name)
    is ExplanationOfBenefit.AddItem.Location.CodeableConcept -> this.value.getProperty(name)
    is ExplanationOfBenefit.AddItem.Location.Address -> this.value.getProperty(name)
    is ExplanationOfBenefit.AddItem.Location.Reference -> this.value.getProperty(name)
    is ExplanationOfBenefit.BenefitBalance.Financial.Allowed.UnsignedInt ->
      this.value.getProperty(name)
    is ExplanationOfBenefit.BenefitBalance.Financial.Allowed.String -> this.value.getProperty(name)
    is ExplanationOfBenefit.BenefitBalance.Financial.Allowed.Money -> this.value.getProperty(name)
    is ExplanationOfBenefit.BenefitBalance.Financial.Used.UnsignedInt ->
      this.value.getProperty(name)
    is ExplanationOfBenefit.BenefitBalance.Financial.Used.Money -> this.value.getProperty(name)
    is Patient.Deceased.Boolean -> this.value.getProperty(name)
    is Patient.Deceased.DateTime -> this.value.getProperty(name)
    is Patient.MultipleBirth.Boolean -> this.value.getProperty(name)
    is Patient.MultipleBirth.Integer -> this.value.getProperty(name)
    is MedicinalProduct.SpecialDesignation.Indication.CodeableConcept ->
      this.value.getProperty(name)
    is MedicinalProduct.SpecialDesignation.Indication.Reference -> this.value.getProperty(name)
    is Specimen.Collection.Collected.DateTime -> this.value.getProperty(name)
    is Specimen.Collection.Collected.Period -> this.value.getProperty(name)
    is Specimen.Collection.FastingStatus.CodeableConcept -> this.value.getProperty(name)
    is Specimen.Collection.FastingStatus.Duration -> this.value.getProperty(name)
    is Specimen.Processing.Time.DateTime -> this.value.getProperty(name)
    is Specimen.Processing.Time.Period -> this.value.getProperty(name)
    is Specimen.Container.Additive.CodeableConcept -> this.value.getProperty(name)
    is Specimen.Container.Additive.Reference -> this.value.getProperty(name)
    is FamilyMemberHistory.Born.Period -> this.value.getProperty(name)
    is FamilyMemberHistory.Born.Date -> this.value.getProperty(name)
    is FamilyMemberHistory.Born.String -> this.value.getProperty(name)
    is FamilyMemberHistory.Age.Age -> this.value.getProperty(name)
    is FamilyMemberHistory.Age.Range -> this.value.getProperty(name)
    is FamilyMemberHistory.Age.String -> this.value.getProperty(name)
    is FamilyMemberHistory.Deceased.Boolean -> this.value.getProperty(name)
    is FamilyMemberHistory.Deceased.Age -> this.value.getProperty(name)
    is FamilyMemberHistory.Deceased.Range -> this.value.getProperty(name)
    is FamilyMemberHistory.Deceased.Date -> this.value.getProperty(name)
    is FamilyMemberHistory.Deceased.String -> this.value.getProperty(name)
    is FamilyMemberHistory.Condition.Onset.Age -> this.value.getProperty(name)
    is FamilyMemberHistory.Condition.Onset.Range -> this.value.getProperty(name)
    is FamilyMemberHistory.Condition.Onset.Period -> this.value.getProperty(name)
    is FamilyMemberHistory.Condition.Onset.String -> this.value.getProperty(name)
    is ResearchElementDefinition.Subject.CodeableConcept -> this.value.getProperty(name)
    is ResearchElementDefinition.Subject.Reference -> this.value.getProperty(name)
    is ResearchElementDefinition.Characteristic.Definition.CodeableConcept ->
      this.value.getProperty(name)
    is ResearchElementDefinition.Characteristic.Definition.Canonical -> this.value.getProperty(name)
    is ResearchElementDefinition.Characteristic.Definition.Expression ->
      this.value.getProperty(name)
    is ResearchElementDefinition.Characteristic.Definition.DataRequirement ->
      this.value.getProperty(name)
    is ResearchElementDefinition.Characteristic.StudyEffective.DateTime ->
      this.value.getProperty(name)
    is ResearchElementDefinition.Characteristic.StudyEffective.Period ->
      this.value.getProperty(name)
    is ResearchElementDefinition.Characteristic.StudyEffective.Duration ->
      this.value.getProperty(name)
    is ResearchElementDefinition.Characteristic.StudyEffective.Timing ->
      this.value.getProperty(name)
    is ResearchElementDefinition.Characteristic.ParticipantEffective.DateTime ->
      this.value.getProperty(name)
    is ResearchElementDefinition.Characteristic.ParticipantEffective.Period ->
      this.value.getProperty(name)
    is ResearchElementDefinition.Characteristic.ParticipantEffective.Duration ->
      this.value.getProperty(name)
    is ResearchElementDefinition.Characteristic.ParticipantEffective.Timing ->
      this.value.getProperty(name)
    is MedicinalProductIndication.OtherTherapy.Medication.CodeableConcept ->
      this.value.getProperty(name)
    is MedicinalProductIndication.OtherTherapy.Medication.Reference -> this.value.getProperty(name)
    is Medication.Ingredient.Item.CodeableConcept -> this.value.getProperty(name)
    is Medication.Ingredient.Item.Reference -> this.value.getProperty(name)
    is DiagnosticReport.Effective.DateTime -> this.value.getProperty(name)
    is DiagnosticReport.Effective.Period -> this.value.getProperty(name)
    else -> null
  }

private fun Any.getPropertyInChoiceValue2(name: String): Any? =
  when (this) {
    is RequestGroup.Action.RelatedAction.Offset.Duration -> this.value.getProperty(name)
    is RequestGroup.Action.RelatedAction.Offset.Range -> this.value.getProperty(name)
    is RequestGroup.Action.Timing.DateTime -> this.value.getProperty(name)
    is RequestGroup.Action.Timing.Age -> this.value.getProperty(name)
    is RequestGroup.Action.Timing.Period -> this.value.getProperty(name)
    is RequestGroup.Action.Timing.Duration -> this.value.getProperty(name)
    is RequestGroup.Action.Timing.Range -> this.value.getProperty(name)
    is RequestGroup.Action.Timing.Timing -> this.value.getProperty(name)
    is MessageHeader.Event.Coding -> this.value.getProperty(name)
    is MessageHeader.Event.Uri -> this.value.getProperty(name)
    is DeviceDefinition.Manufacturer.String -> this.value.getProperty(name)
    is DeviceDefinition.Manufacturer.Reference -> this.value.getProperty(name)
    is Goal.Start.Date -> this.value.getProperty(name)
    is Goal.Start.CodeableConcept -> this.value.getProperty(name)
    is Goal.Target.Detail.Quantity -> this.value.getProperty(name)
    is Goal.Target.Detail.Range -> this.value.getProperty(name)
    is Goal.Target.Detail.CodeableConcept -> this.value.getProperty(name)
    is Goal.Target.Detail.String -> this.value.getProperty(name)
    is Goal.Target.Detail.Boolean -> this.value.getProperty(name)
    is Goal.Target.Detail.Integer -> this.value.getProperty(name)
    is Goal.Target.Detail.Ratio -> this.value.getProperty(name)
    is Goal.Target.Due.Date -> this.value.getProperty(name)
    is Goal.Target.Due.Duration -> this.value.getProperty(name)
    is Immunization.Occurrence.DateTime -> this.value.getProperty(name)
    is Immunization.Occurrence.String -> this.value.getProperty(name)
    is Immunization.ProtocolApplied.DoseNumber.PositiveInt -> this.value.getProperty(name)
    is Immunization.ProtocolApplied.DoseNumber.String -> this.value.getProperty(name)
    is Immunization.ProtocolApplied.SeriesDoses.PositiveInt -> this.value.getProperty(name)
    is Immunization.ProtocolApplied.SeriesDoses.String -> this.value.getProperty(name)
    is ValueSet.Expansion.Parameter.Value.String -> this.value.getProperty(name)
    is ValueSet.Expansion.Parameter.Value.Boolean -> this.value.getProperty(name)
    is ValueSet.Expansion.Parameter.Value.Integer -> this.value.getProperty(name)
    is ValueSet.Expansion.Parameter.Value.Decimal -> this.value.getProperty(name)
    is ValueSet.Expansion.Parameter.Value.Uri -> this.value.getProperty(name)
    is ValueSet.Expansion.Parameter.Value.Code -> this.value.getProperty(name)
    is ValueSet.Expansion.Parameter.Value.DateTime -> this.value.getProperty(name)
    is ClaimResponse.AddItem.Serviced.Date -> this.value.getProperty(name)
    is ClaimResponse.AddItem.Serviced.Period -> this.value.getProperty(name)
    is ClaimResponse.AddItem.Location.CodeableConcept -> this.value.getProperty(name)
    is ClaimResponse.AddItem.Location.Address -> this.value.getProperty(name)
    is ClaimResponse.AddItem.Location.Reference -> this.value.getProperty(name)
    is Contract.Topic.CodeableConcept -> this.value.getProperty(name)
    is Contract.Topic.Reference -> this.value.getProperty(name)
    is Contract.Term.Topic.CodeableConcept -> this.value.getProperty(name)
    is Contract.Term.Topic.Reference -> this.value.getProperty(name)
    is Contract.Term.Offer.Answer.Value.Boolean -> this.value.getProperty(name)
    is Contract.Term.Offer.Answer.Value.Decimal -> this.value.getProperty(name)
    is Contract.Term.Offer.Answer.Value.Integer -> this.value.getProperty(name)
    is Contract.Term.Offer.Answer.Value.Date -> this.value.getProperty(name)
    is Contract.Term.Offer.Answer.Value.DateTime -> this.value.getProperty(name)
    is Contract.Term.Offer.Answer.Value.Time -> this.value.getProperty(name)
    is Contract.Term.Offer.Answer.Value.String -> this.value.getProperty(name)
    is Contract.Term.Offer.Answer.Value.Uri -> this.value.getProperty(name)
    is Contract.Term.Offer.Answer.Value.Attachment -> this.value.getProperty(name)
    is Contract.Term.Offer.Answer.Value.Coding -> this.value.getProperty(name)
    is Contract.Term.Offer.Answer.Value.Quantity -> this.value.getProperty(name)
    is Contract.Term.Offer.Answer.Value.Reference -> this.value.getProperty(name)
    is Contract.Term.Asset.ValuedItem.Entity.CodeableConcept -> this.value.getProperty(name)
    is Contract.Term.Asset.ValuedItem.Entity.Reference -> this.value.getProperty(name)
    is Contract.Term.Action.Occurrence.DateTime -> this.value.getProperty(name)
    is Contract.Term.Action.Occurrence.Period -> this.value.getProperty(name)
    is Contract.Term.Action.Occurrence.Timing -> this.value.getProperty(name)
    is Contract.Friendly.Content.Attachment -> this.value.getProperty(name)
    is Contract.Friendly.Content.Reference -> this.value.getProperty(name)
    is Contract.Legal.Content.Attachment -> this.value.getProperty(name)
    is Contract.Legal.Content.Reference -> this.value.getProperty(name)
    is Contract.Rule.Content.Attachment -> this.value.getProperty(name)
    is Contract.Rule.Content.Reference -> this.value.getProperty(name)
    is Contract.LegallyBinding.Attachment -> this.value.getProperty(name)
    is Contract.LegallyBinding.Reference -> this.value.getProperty(name)
    is BiologicallyDerivedProduct.Collection.Collected.DateTime -> this.value.getProperty(name)
    is BiologicallyDerivedProduct.Collection.Collected.Period -> this.value.getProperty(name)
    is BiologicallyDerivedProduct.Processing.Time.DateTime -> this.value.getProperty(name)
    is BiologicallyDerivedProduct.Processing.Time.Period -> this.value.getProperty(name)
    is BiologicallyDerivedProduct.Manipulation.Time.DateTime -> this.value.getProperty(name)
    is BiologicallyDerivedProduct.Manipulation.Time.Period -> this.value.getProperty(name)
    is SpecimenDefinition.TypeTested.Container.MinimumVolume.Quantity ->
      this.value.getProperty(name)
    is SpecimenDefinition.TypeTested.Container.MinimumVolume.String -> this.value.getProperty(name)
    is SpecimenDefinition.TypeTested.Container.Additive.Additive.CodeableConcept ->
      this.value.getProperty(name)
    is SpecimenDefinition.TypeTested.Container.Additive.Additive.Reference ->
      this.value.getProperty(name)
    is ConceptMap.Source.Uri -> this.value.getProperty(name)
    is ConceptMap.Source.Canonical -> this.value.getProperty(name)
    is ConceptMap.Target.Uri -> this.value.getProperty(name)
    is ConceptMap.Target.Canonical -> this.value.getProperty(name)
    is Invoice.LineItem.ChargeItem.Reference -> this.value.getProperty(name)
    is Invoice.LineItem.ChargeItem.CodeableConcept -> this.value.getProperty(name)
    is CommunicationRequest.Payload.Content.String -> this.value.getProperty(name)
    is CommunicationRequest.Payload.Content.Attachment -> this.value.getProperty(name)
    is CommunicationRequest.Payload.Content.Reference -> this.value.getProperty(name)
    is CommunicationRequest.Occurrence.DateTime -> this.value.getProperty(name)
    is CommunicationRequest.Occurrence.Period -> this.value.getProperty(name)
    is MedicinalProductInteraction.Interactant.Item.Reference -> this.value.getProperty(name)
    is MedicinalProductInteraction.Interactant.Item.CodeableConcept -> this.value.getProperty(name)
    is GuidanceResponse.Module.Uri -> this.value.getProperty(name)
    is GuidanceResponse.Module.Canonical -> this.value.getProperty(name)
    is GuidanceResponse.Module.CodeableConcept -> this.value.getProperty(name)
    is DetectedIssue.Identified.DateTime -> this.value.getProperty(name)
    is DetectedIssue.Identified.Period -> this.value.getProperty(name)
    is ResearchDefinition.Subject.CodeableConcept -> this.value.getProperty(name)
    is ResearchDefinition.Subject.Reference -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.Definition.Reference -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.Definition.Canonical -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.Definition.CodeableConcept -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.Definition.Expression -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.Definition.DataRequirement -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.Definition.TriggerDefinition -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.ParticipantEffective.DateTime -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.ParticipantEffective.Period -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.ParticipantEffective.Duration -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.ParticipantEffective.Timing -> this.value.getProperty(name)
    is MessageDefinition.Event.Coding -> this.value.getProperty(name)
    is MessageDefinition.Event.Uri -> this.value.getProperty(name)
    is ImplementationGuide.Definition.Resource.Example.Boolean -> this.value.getProperty(name)
    is ImplementationGuide.Definition.Resource.Example.Canonical -> this.value.getProperty(name)
    is ImplementationGuide.Definition.Page.Name.Url -> this.value.getProperty(name)
    is ImplementationGuide.Definition.Page.Name.Reference -> this.value.getProperty(name)
    is ImplementationGuide.Manifest.Resource.Example.Boolean -> this.value.getProperty(name)
    is ImplementationGuide.Manifest.Resource.Example.Canonical -> this.value.getProperty(name)
    is NutritionOrder.EnteralFormula.Administration.Rate.Quantity -> this.value.getProperty(name)
    is NutritionOrder.EnteralFormula.Administration.Rate.Ratio -> this.value.getProperty(name)
    is CoverageEligibilityRequest.Serviced.Date -> this.value.getProperty(name)
    is CoverageEligibilityRequest.Serviced.Period -> this.value.getProperty(name)
    is CoverageEligibilityRequest.Item.Diagnosis.Diagnosis.CodeableConcept ->
      this.value.getProperty(name)
    is CoverageEligibilityRequest.Item.Diagnosis.Diagnosis.Reference -> this.value.getProperty(name)
    is CodeSystem.Concept.Property.Value.Code -> this.value.getProperty(name)
    is CodeSystem.Concept.Property.Value.Coding -> this.value.getProperty(name)
    is CodeSystem.Concept.Property.Value.String -> this.value.getProperty(name)
    is CodeSystem.Concept.Property.Value.Integer -> this.value.getProperty(name)
    is CodeSystem.Concept.Property.Value.Boolean -> this.value.getProperty(name)
    is CodeSystem.Concept.Property.Value.DateTime -> this.value.getProperty(name)
    is CodeSystem.Concept.Property.Value.Decimal -> this.value.getProperty(name)
    is MedicationRequest.Reported.Boolean -> this.value.getProperty(name)
    is MedicationRequest.Reported.Reference -> this.value.getProperty(name)
    is MedicationRequest.Medication.CodeableConcept -> this.value.getProperty(name)
    is MedicationRequest.Medication.Reference -> this.value.getProperty(name)
    is MedicationRequest.Substitution.Allowed.Boolean -> this.value.getProperty(name)
    is MedicationRequest.Substitution.Allowed.CodeableConcept -> this.value.getProperty(name)
    is ImmunizationRecommendation.Recommendation.DoseNumber.PositiveInt ->
      this.value.getProperty(name)
    is ImmunizationRecommendation.Recommendation.DoseNumber.String -> this.value.getProperty(name)
    is ImmunizationRecommendation.Recommendation.SeriesDoses.PositiveInt ->
      this.value.getProperty(name)
    is ImmunizationRecommendation.Recommendation.SeriesDoses.String -> this.value.getProperty(name)
    is Coverage.CostToBeneficiary.Value.Quantity -> this.value.getProperty(name)
    is Coverage.CostToBeneficiary.Value.Money -> this.value.getProperty(name)
    is MedicationKnowledge.Ingredient.Item.CodeableConcept -> this.value.getProperty(name)
    is MedicationKnowledge.Ingredient.Item.Reference -> this.value.getProperty(name)
    is MedicationKnowledge.AdministrationGuidelines.Indication.CodeableConcept ->
      this.value.getProperty(name)
    is MedicationKnowledge.AdministrationGuidelines.Indication.Reference ->
      this.value.getProperty(name)
    is MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics.Characteristic.CodeableConcept ->
      this.value.getProperty(name)
    is MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics.Characteristic.Quantity ->
      this.value.getProperty(name)
    is MedicationKnowledge.DrugCharacteristic.Value.CodeableConcept -> this.value.getProperty(name)
    else -> null
  }

private fun Any.getPropertyInChoiceValue3(name: String): Any? =
  when (this) {
    is MedicationKnowledge.DrugCharacteristic.Value.String -> this.value.getProperty(name)
    is MedicationKnowledge.DrugCharacteristic.Value.Quantity -> this.value.getProperty(name)
    is MedicationKnowledge.DrugCharacteristic.Value.Base64Binary -> this.value.getProperty(name)
    is SubstanceReferenceInformation.Target.Amount.Quantity -> this.value.getProperty(name)
    is SubstanceReferenceInformation.Target.Amount.Range -> this.value.getProperty(name)
    is SubstanceReferenceInformation.Target.Amount.String -> this.value.getProperty(name)
    is ImmunizationEvaluation.DoseNumber.PositiveInt -> this.value.getProperty(name)
    is ImmunizationEvaluation.DoseNumber.String -> this.value.getProperty(name)
    is ImmunizationEvaluation.SeriesDoses.PositiveInt -> this.value.getProperty(name)
    is ImmunizationEvaluation.SeriesDoses.String -> this.value.getProperty(name)
    is MedicationStatement.Medication.CodeableConcept -> this.value.getProperty(name)
    is MedicationStatement.Medication.Reference -> this.value.getProperty(name)
    is MedicationStatement.Effective.DateTime -> this.value.getProperty(name)
    is MedicationStatement.Effective.Period -> this.value.getProperty(name)
    is AllergyIntolerance.Onset.DateTime -> this.value.getProperty(name)
    is AllergyIntolerance.Onset.Age -> this.value.getProperty(name)
    is AllergyIntolerance.Onset.Period -> this.value.getProperty(name)
    is AllergyIntolerance.Onset.Range -> this.value.getProperty(name)
    is AllergyIntolerance.Onset.String -> this.value.getProperty(name)
    is PlanDefinition.Subject.CodeableConcept -> this.value.getProperty(name)
    is PlanDefinition.Subject.Reference -> this.value.getProperty(name)
    is PlanDefinition.Goal.Target.Detail.Quantity -> this.value.getProperty(name)
    is PlanDefinition.Goal.Target.Detail.Range -> this.value.getProperty(name)
    is PlanDefinition.Goal.Target.Detail.CodeableConcept -> this.value.getProperty(name)
    is PlanDefinition.Action.Subject.CodeableConcept -> this.value.getProperty(name)
    is PlanDefinition.Action.Subject.Reference -> this.value.getProperty(name)
    is PlanDefinition.Action.RelatedAction.Offset.Duration -> this.value.getProperty(name)
    is PlanDefinition.Action.RelatedAction.Offset.Range -> this.value.getProperty(name)
    is PlanDefinition.Action.Timing.DateTime -> this.value.getProperty(name)
    is PlanDefinition.Action.Timing.Age -> this.value.getProperty(name)
    is PlanDefinition.Action.Timing.Period -> this.value.getProperty(name)
    is PlanDefinition.Action.Timing.Duration -> this.value.getProperty(name)
    is PlanDefinition.Action.Timing.Range -> this.value.getProperty(name)
    is PlanDefinition.Action.Timing.Timing -> this.value.getProperty(name)
    is PlanDefinition.Action.Definition.Canonical -> this.value.getProperty(name)
    is PlanDefinition.Action.Definition.Uri -> this.value.getProperty(name)
    is ClinicalImpression.Effective.DateTime -> this.value.getProperty(name)
    is ClinicalImpression.Effective.Period -> this.value.getProperty(name)
    is Consent.Source.Attachment -> this.value.getProperty(name)
    is Consent.Source.Reference -> this.value.getProperty(name)
    is Communication.Payload.Content.String -> this.value.getProperty(name)
    is Communication.Payload.Content.Attachment -> this.value.getProperty(name)
    is Communication.Payload.Content.Reference -> this.value.getProperty(name)
    is Library.Subject.CodeableConcept -> this.value.getProperty(name)
    is Library.Subject.Reference -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Base64Binary -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Boolean -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Canonical -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Code -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Date -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.DateTime -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Decimal -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Id -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Instant -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Integer -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Markdown -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Oid -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.PositiveInt -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.String -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Time -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.UnsignedInt -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Uri -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Url -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Uuid -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Address -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Age -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Annotation -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Attachment -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.CodeableConcept -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Coding -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.ContactPoint -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Count -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Distance -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Duration -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.HumanName -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Identifier -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Money -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Period -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Quantity -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Range -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Ratio -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Reference -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.SampledData -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Signature -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Timing -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.ContactDetail -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Contributor -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.DataRequirement -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Expression -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.ParameterDefinition ->
      this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.RelatedArtifact -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.TriggerDefinition -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.UsageContext -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Dosage -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Meta -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Id -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.String -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Boolean -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Integer -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Decimal -> this.value.getProperty(name)
    is Task.Input.Value.Base64Binary -> this.value.getProperty(name)
    is Task.Input.Value.Boolean -> this.value.getProperty(name)
    is Task.Input.Value.Canonical -> this.value.getProperty(name)
    is Task.Input.Value.Code -> this.value.getProperty(name)
    is Task.Input.Value.Date -> this.value.getProperty(name)
    is Task.Input.Value.DateTime -> this.value.getProperty(name)
    is Task.Input.Value.Decimal -> this.value.getProperty(name)
    is Task.Input.Value.Id -> this.value.getProperty(name)
    is Task.Input.Value.Instant -> this.value.getProperty(name)
    is Task.Input.Value.Integer -> this.value.getProperty(name)
    is Task.Input.Value.Markdown -> this.value.getProperty(name)
    is Task.Input.Value.Oid -> this.value.getProperty(name)
    is Task.Input.Value.PositiveInt -> this.value.getProperty(name)
    is Task.Input.Value.String -> this.value.getProperty(name)
    is Task.Input.Value.Time -> this.value.getProperty(name)
    is Task.Input.Value.UnsignedInt -> this.value.getProperty(name)
    is Task.Input.Value.Uri -> this.value.getProperty(name)
    is Task.Input.Value.Url -> this.value.getProperty(name)
    is Task.Input.Value.Uuid -> this.value.getProperty(name)
    is Task.Input.Value.Address -> this.value.getProperty(name)
    is Task.Input.Value.Age -> this.value.getProperty(name)
    is Task.Input.Value.Annotation -> this.value.getProperty(name)
    is Task.Input.Value.Attachment -> this.value.getProperty(name)
    is Task.Input.Value.CodeableConcept -> this.value.getProperty(name)
    is Task.Input.Value.Coding -> this.value.getProperty(name)
    is Task.Input.Value.ContactPoint -> this.value.getProperty(name)
    is Task.Input.Value.Count -> this.value.getProperty(name)
    is Task.Input.Value.Distance -> this.value.getProperty(name)
    is Task.Input.Value.Duration -> this.value.getProperty(name)
    is Task.Input.Value.HumanName -> this.value.getProperty(name)
    is Task.Input.Value.Identifier -> this.value.getProperty(name)
    is Task.Input.Value.Money -> this.value.getProperty(name)
    is Task.Input.Value.Period -> this.value.getProperty(name)
    is Task.Input.Value.Quantity -> this.value.getProperty(name)
    is Task.Input.Value.Range -> this.value.getProperty(name)
    is Task.Input.Value.Ratio -> this.value.getProperty(name)
    is Task.Input.Value.Reference -> this.value.getProperty(name)
    is Task.Input.Value.SampledData -> this.value.getProperty(name)
    is Task.Input.Value.Signature -> this.value.getProperty(name)
    is Task.Input.Value.Timing -> this.value.getProperty(name)
    is Task.Input.Value.ContactDetail -> this.value.getProperty(name)
    is Task.Input.Value.Contributor -> this.value.getProperty(name)
    is Task.Input.Value.DataRequirement -> this.value.getProperty(name)
    is Task.Input.Value.Expression -> this.value.getProperty(name)
    is Task.Input.Value.ParameterDefinition -> this.value.getProperty(name)
    is Task.Input.Value.RelatedArtifact -> this.value.getProperty(name)
    is Task.Input.Value.TriggerDefinition -> this.value.getProperty(name)
    is Task.Input.Value.UsageContext -> this.value.getProperty(name)
    is Task.Input.Value.Dosage -> this.value.getProperty(name)
    is Task.Input.Value.Meta -> this.value.getProperty(name)
    else -> null
  }

private fun Any.getPropertyInChoiceValue4(name: String): Any? =
  when (this) {
    is Task.Output.Value.Base64Binary -> this.value.getProperty(name)
    is Task.Output.Value.Boolean -> this.value.getProperty(name)
    is Task.Output.Value.Canonical -> this.value.getProperty(name)
    is Task.Output.Value.Code -> this.value.getProperty(name)
    is Task.Output.Value.Date -> this.value.getProperty(name)
    is Task.Output.Value.DateTime -> this.value.getProperty(name)
    is Task.Output.Value.Decimal -> this.value.getProperty(name)
    is Task.Output.Value.Id -> this.value.getProperty(name)
    is Task.Output.Value.Instant -> this.value.getProperty(name)
    is Task.Output.Value.Integer -> this.value.getProperty(name)
    is Task.Output.Value.Markdown -> this.value.getProperty(name)
    is Task.Output.Value.Oid -> this.value.getProperty(name)
    is Task.Output.Value.PositiveInt -> this.value.getProperty(name)
    is Task.Output.Value.String -> this.value.getProperty(name)
    is Task.Output.Value.Time -> this.value.getProperty(name)
    is Task.Output.Value.UnsignedInt -> this.value.getProperty(name)
    is Task.Output.Value.Uri -> this.value.getProperty(name)
    is Task.Output.Value.Url -> this.value.getProperty(name)
    is Task.Output.Value.Uuid -> this.value.getProperty(name)
    is Task.Output.Value.Address -> this.value.getProperty(name)
    is Task.Output.Value.Age -> this.value.getProperty(name)
    is Task.Output.Value.Annotation -> this.value.getProperty(name)
    is Task.Output.Value.Attachment -> this.value.getProperty(name)
    is Task.Output.Value.CodeableConcept -> this.value.getProperty(name)
    is Task.Output.Value.Coding -> this.value.getProperty(name)
    is Task.Output.Value.ContactPoint -> this.value.getProperty(name)
    is Task.Output.Value.Count -> this.value.getProperty(name)
    is Task.Output.Value.Distance -> this.value.getProperty(name)
    is Task.Output.Value.Duration -> this.value.getProperty(name)
    is Task.Output.Value.HumanName -> this.value.getProperty(name)
    is Task.Output.Value.Identifier -> this.value.getProperty(name)
    is Task.Output.Value.Money -> this.value.getProperty(name)
    is Task.Output.Value.Period -> this.value.getProperty(name)
    is Task.Output.Value.Quantity -> this.value.getProperty(name)
    is Task.Output.Value.Range -> this.value.getProperty(name)
    is Task.Output.Value.Ratio -> this.value.getProperty(name)
    is Task.Output.Value.Reference -> this.value.getProperty(name)
    is Task.Output.Value.SampledData -> this.value.getProperty(name)
    is Task.Output.Value.Signature -> this.value.getProperty(name)
    is Task.Output.Value.Timing -> this.value.getProperty(name)
    is Task.Output.Value.ContactDetail -> this.value.getProperty(name)
    is Task.Output.Value.Contributor -> this.value.getProperty(name)
    is Task.Output.Value.DataRequirement -> this.value.getProperty(name)
    is Task.Output.Value.Expression -> this.value.getProperty(name)
    is Task.Output.Value.ParameterDefinition -> this.value.getProperty(name)
    is Task.Output.Value.RelatedArtifact -> this.value.getProperty(name)
    is Task.Output.Value.TriggerDefinition -> this.value.getProperty(name)
    is Task.Output.Value.UsageContext -> this.value.getProperty(name)
    is Task.Output.Value.Dosage -> this.value.getProperty(name)
    is Task.Output.Value.Meta -> this.value.getProperty(name)
    is MedicinalProductContraindication.OtherTherapy.Medication.CodeableConcept ->
      this.value.getProperty(name)
    is MedicinalProductContraindication.OtherTherapy.Medication.Reference ->
      this.value.getProperty(name)
    is Observation.Effective.DateTime -> this.value.getProperty(name)
    is Observation.Effective.Period -> this.value.getProperty(name)
    is Observation.Effective.Timing -> this.value.getProperty(name)
    is Observation.Effective.Instant -> this.value.getProperty(name)
    is Observation.Value.Quantity -> this.value.getProperty(name)
    is Observation.Value.CodeableConcept -> this.value.getProperty(name)
    is Observation.Value.String -> this.value.getProperty(name)
    is Observation.Value.Boolean -> this.value.getProperty(name)
    is Observation.Value.Integer -> this.value.getProperty(name)
    is Observation.Value.Range -> this.value.getProperty(name)
    is Observation.Value.Ratio -> this.value.getProperty(name)
    is Observation.Value.SampledData -> this.value.getProperty(name)
    is Observation.Value.Time -> this.value.getProperty(name)
    is Observation.Value.DateTime -> this.value.getProperty(name)
    is Observation.Value.Period -> this.value.getProperty(name)
    is Observation.Component.Value.Quantity -> this.value.getProperty(name)
    is Observation.Component.Value.CodeableConcept -> this.value.getProperty(name)
    is Observation.Component.Value.String -> this.value.getProperty(name)
    is Observation.Component.Value.Boolean -> this.value.getProperty(name)
    is Observation.Component.Value.Integer -> this.value.getProperty(name)
    is Observation.Component.Value.Range -> this.value.getProperty(name)
    is Observation.Component.Value.Ratio -> this.value.getProperty(name)
    is Observation.Component.Value.SampledData -> this.value.getProperty(name)
    is Observation.Component.Value.Time -> this.value.getProperty(name)
    is Observation.Component.Value.DateTime -> this.value.getProperty(name)
    is Observation.Component.Value.Period -> this.value.getProperty(name)
    is MedicationDispense.StatusReason.CodeableConcept -> this.value.getProperty(name)
    is MedicationDispense.StatusReason.Reference -> this.value.getProperty(name)
    is MedicationDispense.Medication.CodeableConcept -> this.value.getProperty(name)
    is MedicationDispense.Medication.Reference -> this.value.getProperty(name)
    is Procedure.Performed.DateTime -> this.value.getProperty(name)
    is Procedure.Performed.Period -> this.value.getProperty(name)
    is Procedure.Performed.String -> this.value.getProperty(name)
    is Procedure.Performed.Age -> this.value.getProperty(name)
    is Procedure.Performed.Range -> this.value.getProperty(name)
    is MedicinalProductAuthorization.Procedure.Date.Period -> this.value.getProperty(name)
    is MedicinalProductAuthorization.Procedure.Date.DateTime -> this.value.getProperty(name)
    else -> null
  }

internal fun Any.getPropertyInChoiceValue(name: String): Any? {
  getPropertyInChoiceValue0(name)?.let {
    return it
  }
  getPropertyInChoiceValue1(name)?.let {
    return it
  }
  getPropertyInChoiceValue2(name)?.let {
    return it
  }
  getPropertyInChoiceValue3(name)?.let {
    return it
  }
  getPropertyInChoiceValue4(name)?.let {
    return it
  }
  return null
}

private fun Any.hasPropertyInChoiceValue0(name: String): Boolean =
  when (this) {
    is SubstanceSpecification.Moiety.Amount.Quantity -> this.value.hasProperty(name)
    is SubstanceSpecification.Moiety.Amount.String -> this.value.hasProperty(name)
    is SubstanceSpecification.Property.DefiningSubstance.Reference -> this.value.hasProperty(name)
    is SubstanceSpecification.Property.DefiningSubstance.CodeableConcept ->
      this.value.hasProperty(name)
    is SubstanceSpecification.Property.Amount.Quantity -> this.value.hasProperty(name)
    is SubstanceSpecification.Property.Amount.String -> this.value.hasProperty(name)
    is SubstanceSpecification.Relationship.Substance.Reference -> this.value.hasProperty(name)
    is SubstanceSpecification.Relationship.Substance.CodeableConcept -> this.value.hasProperty(name)
    is SubstanceSpecification.Relationship.Amount.Quantity -> this.value.hasProperty(name)
    is SubstanceSpecification.Relationship.Amount.Range -> this.value.hasProperty(name)
    is SubstanceSpecification.Relationship.Amount.Ratio -> this.value.hasProperty(name)
    is SubstanceSpecification.Relationship.Amount.String -> this.value.hasProperty(name)
    is DeviceUseStatement.Timing.Timing -> this.value.hasProperty(name)
    is DeviceUseStatement.Timing.Period -> this.value.hasProperty(name)
    is DeviceUseStatement.Timing.DateTime -> this.value.hasProperty(name)
    is Condition.Onset.DateTime -> this.value.hasProperty(name)
    is Condition.Onset.Age -> this.value.hasProperty(name)
    is Condition.Onset.Period -> this.value.hasProperty(name)
    is Condition.Onset.Range -> this.value.hasProperty(name)
    is Condition.Onset.String -> this.value.hasProperty(name)
    is Condition.Abatement.DateTime -> this.value.hasProperty(name)
    is Condition.Abatement.Age -> this.value.hasProperty(name)
    is Condition.Abatement.Period -> this.value.hasProperty(name)
    is Condition.Abatement.Range -> this.value.hasProperty(name)
    is Condition.Abatement.String -> this.value.hasProperty(name)
    is ChargeItem.Occurrence.DateTime -> this.value.hasProperty(name)
    is ChargeItem.Occurrence.Period -> this.value.hasProperty(name)
    is ChargeItem.Occurrence.Timing -> this.value.hasProperty(name)
    is ChargeItem.Product.Reference -> this.value.hasProperty(name)
    is ChargeItem.Product.CodeableConcept -> this.value.hasProperty(name)
    is Media.Created.DateTime -> this.value.hasProperty(name)
    is Media.Created.Period -> this.value.hasProperty(name)
    is SupplyDelivery.SuppliedItem.Item.CodeableConcept -> this.value.hasProperty(name)
    is SupplyDelivery.SuppliedItem.Item.Reference -> this.value.hasProperty(name)
    is SupplyDelivery.Occurrence.DateTime -> this.value.hasProperty(name)
    is SupplyDelivery.Occurrence.Period -> this.value.hasProperty(name)
    is SupplyDelivery.Occurrence.Timing -> this.value.hasProperty(name)
    is Composition.RelatesTo.Target.Identifier -> this.value.hasProperty(name)
    is Composition.RelatesTo.Target.Reference -> this.value.hasProperty(name)
    is MedicationAdministration.Medication.CodeableConcept -> this.value.hasProperty(name)
    is MedicationAdministration.Medication.Reference -> this.value.hasProperty(name)
    is MedicationAdministration.Effective.DateTime -> this.value.hasProperty(name)
    is MedicationAdministration.Effective.Period -> this.value.hasProperty(name)
    is MedicationAdministration.Dosage.Rate.Ratio -> this.value.hasProperty(name)
    is MedicationAdministration.Dosage.Rate.Quantity -> this.value.hasProperty(name)
    is Claim.SupportingInfo.Timing.Date -> this.value.hasProperty(name)
    is Claim.SupportingInfo.Timing.Period -> this.value.hasProperty(name)
    is Claim.SupportingInfo.Value.Boolean -> this.value.hasProperty(name)
    is Claim.SupportingInfo.Value.String -> this.value.hasProperty(name)
    is Claim.SupportingInfo.Value.Quantity -> this.value.hasProperty(name)
    is Claim.SupportingInfo.Value.Attachment -> this.value.hasProperty(name)
    is Claim.SupportingInfo.Value.Reference -> this.value.hasProperty(name)
    is Claim.Diagnosis.Diagnosis.CodeableConcept -> this.value.hasProperty(name)
    is Claim.Diagnosis.Diagnosis.Reference -> this.value.hasProperty(name)
    is Claim.Procedure.Procedure.CodeableConcept -> this.value.hasProperty(name)
    is Claim.Procedure.Procedure.Reference -> this.value.hasProperty(name)
    is Claim.Accident.Location.Address -> this.value.hasProperty(name)
    is Claim.Accident.Location.Reference -> this.value.hasProperty(name)
    is Claim.Item.Serviced.Date -> this.value.hasProperty(name)
    is Claim.Item.Serviced.Period -> this.value.hasProperty(name)
    is Claim.Item.Location.CodeableConcept -> this.value.hasProperty(name)
    is Claim.Item.Location.Address -> this.value.hasProperty(name)
    is Claim.Item.Location.Reference -> this.value.hasProperty(name)
    is AuditEvent.Entity.Detail.Value.String -> this.value.hasProperty(name)
    is AuditEvent.Entity.Detail.Value.Base64Binary -> this.value.hasProperty(name)
    is ServiceRequest.Quantity.Quantity -> this.value.hasProperty(name)
    is ServiceRequest.Quantity.Ratio -> this.value.hasProperty(name)
    is ServiceRequest.Quantity.Range -> this.value.hasProperty(name)
    is ServiceRequest.Occurrence.DateTime -> this.value.hasProperty(name)
    is ServiceRequest.Occurrence.Period -> this.value.hasProperty(name)
    is ServiceRequest.Occurrence.Timing -> this.value.hasProperty(name)
    is ServiceRequest.AsNeeded.Boolean -> this.value.hasProperty(name)
    is ServiceRequest.AsNeeded.CodeableConcept -> this.value.hasProperty(name)
    is EventDefinition.Subject.CodeableConcept -> this.value.hasProperty(name)
    is EventDefinition.Subject.Reference -> this.value.hasProperty(name)
    is CarePlan.Activity.Detail.Scheduled.Timing -> this.value.hasProperty(name)
    is CarePlan.Activity.Detail.Scheduled.Period -> this.value.hasProperty(name)
    is CarePlan.Activity.Detail.Scheduled.String -> this.value.hasProperty(name)
    is CarePlan.Activity.Detail.Product.CodeableConcept -> this.value.hasProperty(name)
    is CarePlan.Activity.Detail.Product.Reference -> this.value.hasProperty(name)
    is CoverageEligibilityResponse.Serviced.Date -> this.value.hasProperty(name)
    is CoverageEligibilityResponse.Serviced.Period -> this.value.hasProperty(name)
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed.UnsignedInt ->
      this.value.hasProperty(name)
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed.String ->
      this.value.hasProperty(name)
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed.Money ->
      this.value.hasProperty(name)
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Used.UnsignedInt ->
      this.value.hasProperty(name)
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Used.String ->
      this.value.hasProperty(name)
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Used.Money -> this.value.hasProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Boolean -> this.value.hasProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Decimal -> this.value.hasProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Integer -> this.value.hasProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Date -> this.value.hasProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.DateTime -> this.value.hasProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Time -> this.value.hasProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.String -> this.value.hasProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Uri -> this.value.hasProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Attachment -> this.value.hasProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Coding -> this.value.hasProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Quantity -> this.value.hasProperty(name)
    is QuestionnaireResponse.Item.Answer.Value.Reference -> this.value.hasProperty(name)
    is Measure.Subject.CodeableConcept -> this.value.hasProperty(name)
    is Measure.Subject.Reference -> this.value.hasProperty(name)
    is ActivityDefinition.Subject.CodeableConcept -> this.value.hasProperty(name)
    is ActivityDefinition.Subject.Reference -> this.value.hasProperty(name)
    is ActivityDefinition.Timing.Timing -> this.value.hasProperty(name)
    is ActivityDefinition.Timing.DateTime -> this.value.hasProperty(name)
    is ActivityDefinition.Timing.Age -> this.value.hasProperty(name)
    is ActivityDefinition.Timing.Period -> this.value.hasProperty(name)
    is ActivityDefinition.Timing.Range -> this.value.hasProperty(name)
    is ActivityDefinition.Timing.Duration -> this.value.hasProperty(name)
    is ActivityDefinition.Product.Reference -> this.value.hasProperty(name)
    is ActivityDefinition.Product.CodeableConcept -> this.value.hasProperty(name)
    is DeviceRequest.Code.Reference -> this.value.hasProperty(name)
    is DeviceRequest.Code.CodeableConcept -> this.value.hasProperty(name)
    is DeviceRequest.Parameter.Value.CodeableConcept -> this.value.hasProperty(name)
    is DeviceRequest.Parameter.Value.Quantity -> this.value.hasProperty(name)
    is DeviceRequest.Parameter.Value.Range -> this.value.hasProperty(name)
    is DeviceRequest.Parameter.Value.Boolean -> this.value.hasProperty(name)
    is DeviceRequest.Occurrence.DateTime -> this.value.hasProperty(name)
    is DeviceRequest.Occurrence.Period -> this.value.hasProperty(name)
    is DeviceRequest.Occurrence.Timing -> this.value.hasProperty(name)
    is Substance.Ingredient.Substance.CodeableConcept -> this.value.hasProperty(name)
    is Substance.Ingredient.Substance.Reference -> this.value.hasProperty(name)
    is Group.Characteristic.Value.CodeableConcept -> this.value.hasProperty(name)
    is Group.Characteristic.Value.Boolean -> this.value.hasProperty(name)
    is Group.Characteristic.Value.Quantity -> this.value.hasProperty(name)
    is Group.Characteristic.Value.Range -> this.value.hasProperty(name)
    is Group.Characteristic.Value.Reference -> this.value.hasProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Boolean -> this.value.hasProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Decimal -> this.value.hasProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Integer -> this.value.hasProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Date -> this.value.hasProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.DateTime -> this.value.hasProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Time -> this.value.hasProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.String -> this.value.hasProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Coding -> this.value.hasProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Quantity -> this.value.hasProperty(name)
    is Questionnaire.Item.EnableWhen.Answer.Reference -> this.value.hasProperty(name)
    is Questionnaire.Item.AnswerOption.Value.Integer -> this.value.hasProperty(name)
    is Questionnaire.Item.AnswerOption.Value.Date -> this.value.hasProperty(name)
    is Questionnaire.Item.AnswerOption.Value.Time -> this.value.hasProperty(name)
    is Questionnaire.Item.AnswerOption.Value.String -> this.value.hasProperty(name)
    is Questionnaire.Item.AnswerOption.Value.Coding -> this.value.hasProperty(name)
    is Questionnaire.Item.AnswerOption.Value.Reference -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.Boolean -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.Decimal -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.Integer -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.Date -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.DateTime -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.Time -> this.value.hasProperty(name)
    else -> false
  }

private fun Any.hasPropertyInChoiceValue1(name: String): Boolean =
  when (this) {
    is Questionnaire.Item.Initial.Value.String -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.Uri -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.Attachment -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.Coding -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.Quantity -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.Reference -> this.value.hasProperty(name)
    is SupplyRequest.Item.CodeableConcept -> this.value.hasProperty(name)
    is SupplyRequest.Item.Reference -> this.value.hasProperty(name)
    is SupplyRequest.Parameter.Value.CodeableConcept -> this.value.hasProperty(name)
    is SupplyRequest.Parameter.Value.Quantity -> this.value.hasProperty(name)
    is SupplyRequest.Parameter.Value.Range -> this.value.hasProperty(name)
    is SupplyRequest.Parameter.Value.Boolean -> this.value.hasProperty(name)
    is SupplyRequest.Occurrence.DateTime -> this.value.hasProperty(name)
    is SupplyRequest.Occurrence.Period -> this.value.hasProperty(name)
    is SupplyRequest.Occurrence.Timing -> this.value.hasProperty(name)
    is Provenance.Occurred.Period -> this.value.hasProperty(name)
    is Provenance.Occurred.DateTime -> this.value.hasProperty(name)
    is RiskAssessment.Occurrence.DateTime -> this.value.hasProperty(name)
    is RiskAssessment.Occurrence.Period -> this.value.hasProperty(name)
    is RiskAssessment.Prediction.Probability.Decimal -> this.value.hasProperty(name)
    is RiskAssessment.Prediction.Probability.Range -> this.value.hasProperty(name)
    is RiskAssessment.Prediction.When.Period -> this.value.hasProperty(name)
    is RiskAssessment.Prediction.When.Range -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Base64Binary -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Boolean -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Canonical -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Code -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Date -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.DateTime -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Decimal -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Id -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Instant -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Integer -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Markdown -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Oid -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.PositiveInt -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.String -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Time -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.UnsignedInt -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Uri -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Url -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Uuid -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Address -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Age -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Annotation -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Attachment -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.CodeableConcept -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Coding -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.ContactPoint -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Count -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Distance -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Duration -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.HumanName -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Identifier -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Money -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Period -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Quantity -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Range -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Ratio -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Reference -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.SampledData -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Signature -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Timing -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.ContactDetail -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Contributor -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.DataRequirement -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Expression -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.ParameterDefinition -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.RelatedArtifact -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.TriggerDefinition -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.UsageContext -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Dosage -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Meta -> this.value.hasProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Timing.Date -> this.value.hasProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Timing.Period -> this.value.hasProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Boolean -> this.value.hasProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.String -> this.value.hasProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Quantity -> this.value.hasProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Attachment -> this.value.hasProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Reference -> this.value.hasProperty(name)
    is ExplanationOfBenefit.Diagnosis.Diagnosis.CodeableConcept -> this.value.hasProperty(name)
    is ExplanationOfBenefit.Diagnosis.Diagnosis.Reference -> this.value.hasProperty(name)
    is ExplanationOfBenefit.Procedure.Procedure.CodeableConcept -> this.value.hasProperty(name)
    is ExplanationOfBenefit.Procedure.Procedure.Reference -> this.value.hasProperty(name)
    is ExplanationOfBenefit.Accident.Location.Address -> this.value.hasProperty(name)
    is ExplanationOfBenefit.Accident.Location.Reference -> this.value.hasProperty(name)
    is ExplanationOfBenefit.Item.Serviced.Date -> this.value.hasProperty(name)
    is ExplanationOfBenefit.Item.Serviced.Period -> this.value.hasProperty(name)
    is ExplanationOfBenefit.Item.Location.CodeableConcept -> this.value.hasProperty(name)
    is ExplanationOfBenefit.Item.Location.Address -> this.value.hasProperty(name)
    is ExplanationOfBenefit.Item.Location.Reference -> this.value.hasProperty(name)
    is ExplanationOfBenefit.AddItem.Serviced.Date -> this.value.hasProperty(name)
    is ExplanationOfBenefit.AddItem.Serviced.Period -> this.value.hasProperty(name)
    is ExplanationOfBenefit.AddItem.Location.CodeableConcept -> this.value.hasProperty(name)
    is ExplanationOfBenefit.AddItem.Location.Address -> this.value.hasProperty(name)
    is ExplanationOfBenefit.AddItem.Location.Reference -> this.value.hasProperty(name)
    is ExplanationOfBenefit.BenefitBalance.Financial.Allowed.UnsignedInt ->
      this.value.hasProperty(name)
    is ExplanationOfBenefit.BenefitBalance.Financial.Allowed.String -> this.value.hasProperty(name)
    is ExplanationOfBenefit.BenefitBalance.Financial.Allowed.Money -> this.value.hasProperty(name)
    is ExplanationOfBenefit.BenefitBalance.Financial.Used.UnsignedInt ->
      this.value.hasProperty(name)
    is ExplanationOfBenefit.BenefitBalance.Financial.Used.Money -> this.value.hasProperty(name)
    is Patient.Deceased.Boolean -> this.value.hasProperty(name)
    is Patient.Deceased.DateTime -> this.value.hasProperty(name)
    is Patient.MultipleBirth.Boolean -> this.value.hasProperty(name)
    is Patient.MultipleBirth.Integer -> this.value.hasProperty(name)
    is MedicinalProduct.SpecialDesignation.Indication.CodeableConcept ->
      this.value.hasProperty(name)
    is MedicinalProduct.SpecialDesignation.Indication.Reference -> this.value.hasProperty(name)
    is Specimen.Collection.Collected.DateTime -> this.value.hasProperty(name)
    is Specimen.Collection.Collected.Period -> this.value.hasProperty(name)
    is Specimen.Collection.FastingStatus.CodeableConcept -> this.value.hasProperty(name)
    is Specimen.Collection.FastingStatus.Duration -> this.value.hasProperty(name)
    is Specimen.Processing.Time.DateTime -> this.value.hasProperty(name)
    is Specimen.Processing.Time.Period -> this.value.hasProperty(name)
    is Specimen.Container.Additive.CodeableConcept -> this.value.hasProperty(name)
    is Specimen.Container.Additive.Reference -> this.value.hasProperty(name)
    is FamilyMemberHistory.Born.Period -> this.value.hasProperty(name)
    is FamilyMemberHistory.Born.Date -> this.value.hasProperty(name)
    is FamilyMemberHistory.Born.String -> this.value.hasProperty(name)
    is FamilyMemberHistory.Age.Age -> this.value.hasProperty(name)
    is FamilyMemberHistory.Age.Range -> this.value.hasProperty(name)
    is FamilyMemberHistory.Age.String -> this.value.hasProperty(name)
    is FamilyMemberHistory.Deceased.Boolean -> this.value.hasProperty(name)
    is FamilyMemberHistory.Deceased.Age -> this.value.hasProperty(name)
    is FamilyMemberHistory.Deceased.Range -> this.value.hasProperty(name)
    is FamilyMemberHistory.Deceased.Date -> this.value.hasProperty(name)
    is FamilyMemberHistory.Deceased.String -> this.value.hasProperty(name)
    is FamilyMemberHistory.Condition.Onset.Age -> this.value.hasProperty(name)
    is FamilyMemberHistory.Condition.Onset.Range -> this.value.hasProperty(name)
    is FamilyMemberHistory.Condition.Onset.Period -> this.value.hasProperty(name)
    is FamilyMemberHistory.Condition.Onset.String -> this.value.hasProperty(name)
    is ResearchElementDefinition.Subject.CodeableConcept -> this.value.hasProperty(name)
    is ResearchElementDefinition.Subject.Reference -> this.value.hasProperty(name)
    is ResearchElementDefinition.Characteristic.Definition.CodeableConcept ->
      this.value.hasProperty(name)
    is ResearchElementDefinition.Characteristic.Definition.Canonical -> this.value.hasProperty(name)
    is ResearchElementDefinition.Characteristic.Definition.Expression ->
      this.value.hasProperty(name)
    is ResearchElementDefinition.Characteristic.Definition.DataRequirement ->
      this.value.hasProperty(name)
    is ResearchElementDefinition.Characteristic.StudyEffective.DateTime ->
      this.value.hasProperty(name)
    is ResearchElementDefinition.Characteristic.StudyEffective.Period ->
      this.value.hasProperty(name)
    is ResearchElementDefinition.Characteristic.StudyEffective.Duration ->
      this.value.hasProperty(name)
    is ResearchElementDefinition.Characteristic.StudyEffective.Timing ->
      this.value.hasProperty(name)
    is ResearchElementDefinition.Characteristic.ParticipantEffective.DateTime ->
      this.value.hasProperty(name)
    is ResearchElementDefinition.Characteristic.ParticipantEffective.Period ->
      this.value.hasProperty(name)
    is ResearchElementDefinition.Characteristic.ParticipantEffective.Duration ->
      this.value.hasProperty(name)
    is ResearchElementDefinition.Characteristic.ParticipantEffective.Timing ->
      this.value.hasProperty(name)
    is MedicinalProductIndication.OtherTherapy.Medication.CodeableConcept ->
      this.value.hasProperty(name)
    is MedicinalProductIndication.OtherTherapy.Medication.Reference -> this.value.hasProperty(name)
    is Medication.Ingredient.Item.CodeableConcept -> this.value.hasProperty(name)
    is Medication.Ingredient.Item.Reference -> this.value.hasProperty(name)
    is DiagnosticReport.Effective.DateTime -> this.value.hasProperty(name)
    is DiagnosticReport.Effective.Period -> this.value.hasProperty(name)
    else -> false
  }

private fun Any.hasPropertyInChoiceValue2(name: String): Boolean =
  when (this) {
    is RequestGroup.Action.RelatedAction.Offset.Duration -> this.value.hasProperty(name)
    is RequestGroup.Action.RelatedAction.Offset.Range -> this.value.hasProperty(name)
    is RequestGroup.Action.Timing.DateTime -> this.value.hasProperty(name)
    is RequestGroup.Action.Timing.Age -> this.value.hasProperty(name)
    is RequestGroup.Action.Timing.Period -> this.value.hasProperty(name)
    is RequestGroup.Action.Timing.Duration -> this.value.hasProperty(name)
    is RequestGroup.Action.Timing.Range -> this.value.hasProperty(name)
    is RequestGroup.Action.Timing.Timing -> this.value.hasProperty(name)
    is MessageHeader.Event.Coding -> this.value.hasProperty(name)
    is MessageHeader.Event.Uri -> this.value.hasProperty(name)
    is DeviceDefinition.Manufacturer.String -> this.value.hasProperty(name)
    is DeviceDefinition.Manufacturer.Reference -> this.value.hasProperty(name)
    is Goal.Start.Date -> this.value.hasProperty(name)
    is Goal.Start.CodeableConcept -> this.value.hasProperty(name)
    is Goal.Target.Detail.Quantity -> this.value.hasProperty(name)
    is Goal.Target.Detail.Range -> this.value.hasProperty(name)
    is Goal.Target.Detail.CodeableConcept -> this.value.hasProperty(name)
    is Goal.Target.Detail.String -> this.value.hasProperty(name)
    is Goal.Target.Detail.Boolean -> this.value.hasProperty(name)
    is Goal.Target.Detail.Integer -> this.value.hasProperty(name)
    is Goal.Target.Detail.Ratio -> this.value.hasProperty(name)
    is Goal.Target.Due.Date -> this.value.hasProperty(name)
    is Goal.Target.Due.Duration -> this.value.hasProperty(name)
    is Immunization.Occurrence.DateTime -> this.value.hasProperty(name)
    is Immunization.Occurrence.String -> this.value.hasProperty(name)
    is Immunization.ProtocolApplied.DoseNumber.PositiveInt -> this.value.hasProperty(name)
    is Immunization.ProtocolApplied.DoseNumber.String -> this.value.hasProperty(name)
    is Immunization.ProtocolApplied.SeriesDoses.PositiveInt -> this.value.hasProperty(name)
    is Immunization.ProtocolApplied.SeriesDoses.String -> this.value.hasProperty(name)
    is ValueSet.Expansion.Parameter.Value.String -> this.value.hasProperty(name)
    is ValueSet.Expansion.Parameter.Value.Boolean -> this.value.hasProperty(name)
    is ValueSet.Expansion.Parameter.Value.Integer -> this.value.hasProperty(name)
    is ValueSet.Expansion.Parameter.Value.Decimal -> this.value.hasProperty(name)
    is ValueSet.Expansion.Parameter.Value.Uri -> this.value.hasProperty(name)
    is ValueSet.Expansion.Parameter.Value.Code -> this.value.hasProperty(name)
    is ValueSet.Expansion.Parameter.Value.DateTime -> this.value.hasProperty(name)
    is ClaimResponse.AddItem.Serviced.Date -> this.value.hasProperty(name)
    is ClaimResponse.AddItem.Serviced.Period -> this.value.hasProperty(name)
    is ClaimResponse.AddItem.Location.CodeableConcept -> this.value.hasProperty(name)
    is ClaimResponse.AddItem.Location.Address -> this.value.hasProperty(name)
    is ClaimResponse.AddItem.Location.Reference -> this.value.hasProperty(name)
    is Contract.Topic.CodeableConcept -> this.value.hasProperty(name)
    is Contract.Topic.Reference -> this.value.hasProperty(name)
    is Contract.Term.Topic.CodeableConcept -> this.value.hasProperty(name)
    is Contract.Term.Topic.Reference -> this.value.hasProperty(name)
    is Contract.Term.Offer.Answer.Value.Boolean -> this.value.hasProperty(name)
    is Contract.Term.Offer.Answer.Value.Decimal -> this.value.hasProperty(name)
    is Contract.Term.Offer.Answer.Value.Integer -> this.value.hasProperty(name)
    is Contract.Term.Offer.Answer.Value.Date -> this.value.hasProperty(name)
    is Contract.Term.Offer.Answer.Value.DateTime -> this.value.hasProperty(name)
    is Contract.Term.Offer.Answer.Value.Time -> this.value.hasProperty(name)
    is Contract.Term.Offer.Answer.Value.String -> this.value.hasProperty(name)
    is Contract.Term.Offer.Answer.Value.Uri -> this.value.hasProperty(name)
    is Contract.Term.Offer.Answer.Value.Attachment -> this.value.hasProperty(name)
    is Contract.Term.Offer.Answer.Value.Coding -> this.value.hasProperty(name)
    is Contract.Term.Offer.Answer.Value.Quantity -> this.value.hasProperty(name)
    is Contract.Term.Offer.Answer.Value.Reference -> this.value.hasProperty(name)
    is Contract.Term.Asset.ValuedItem.Entity.CodeableConcept -> this.value.hasProperty(name)
    is Contract.Term.Asset.ValuedItem.Entity.Reference -> this.value.hasProperty(name)
    is Contract.Term.Action.Occurrence.DateTime -> this.value.hasProperty(name)
    is Contract.Term.Action.Occurrence.Period -> this.value.hasProperty(name)
    is Contract.Term.Action.Occurrence.Timing -> this.value.hasProperty(name)
    is Contract.Friendly.Content.Attachment -> this.value.hasProperty(name)
    is Contract.Friendly.Content.Reference -> this.value.hasProperty(name)
    is Contract.Legal.Content.Attachment -> this.value.hasProperty(name)
    is Contract.Legal.Content.Reference -> this.value.hasProperty(name)
    is Contract.Rule.Content.Attachment -> this.value.hasProperty(name)
    is Contract.Rule.Content.Reference -> this.value.hasProperty(name)
    is Contract.LegallyBinding.Attachment -> this.value.hasProperty(name)
    is Contract.LegallyBinding.Reference -> this.value.hasProperty(name)
    is BiologicallyDerivedProduct.Collection.Collected.DateTime -> this.value.hasProperty(name)
    is BiologicallyDerivedProduct.Collection.Collected.Period -> this.value.hasProperty(name)
    is BiologicallyDerivedProduct.Processing.Time.DateTime -> this.value.hasProperty(name)
    is BiologicallyDerivedProduct.Processing.Time.Period -> this.value.hasProperty(name)
    is BiologicallyDerivedProduct.Manipulation.Time.DateTime -> this.value.hasProperty(name)
    is BiologicallyDerivedProduct.Manipulation.Time.Period -> this.value.hasProperty(name)
    is SpecimenDefinition.TypeTested.Container.MinimumVolume.Quantity ->
      this.value.hasProperty(name)
    is SpecimenDefinition.TypeTested.Container.MinimumVolume.String -> this.value.hasProperty(name)
    is SpecimenDefinition.TypeTested.Container.Additive.Additive.CodeableConcept ->
      this.value.hasProperty(name)
    is SpecimenDefinition.TypeTested.Container.Additive.Additive.Reference ->
      this.value.hasProperty(name)
    is ConceptMap.Source.Uri -> this.value.hasProperty(name)
    is ConceptMap.Source.Canonical -> this.value.hasProperty(name)
    is ConceptMap.Target.Uri -> this.value.hasProperty(name)
    is ConceptMap.Target.Canonical -> this.value.hasProperty(name)
    is Invoice.LineItem.ChargeItem.Reference -> this.value.hasProperty(name)
    is Invoice.LineItem.ChargeItem.CodeableConcept -> this.value.hasProperty(name)
    is CommunicationRequest.Payload.Content.String -> this.value.hasProperty(name)
    is CommunicationRequest.Payload.Content.Attachment -> this.value.hasProperty(name)
    is CommunicationRequest.Payload.Content.Reference -> this.value.hasProperty(name)
    is CommunicationRequest.Occurrence.DateTime -> this.value.hasProperty(name)
    is CommunicationRequest.Occurrence.Period -> this.value.hasProperty(name)
    is MedicinalProductInteraction.Interactant.Item.Reference -> this.value.hasProperty(name)
    is MedicinalProductInteraction.Interactant.Item.CodeableConcept -> this.value.hasProperty(name)
    is GuidanceResponse.Module.Uri -> this.value.hasProperty(name)
    is GuidanceResponse.Module.Canonical -> this.value.hasProperty(name)
    is GuidanceResponse.Module.CodeableConcept -> this.value.hasProperty(name)
    is DetectedIssue.Identified.DateTime -> this.value.hasProperty(name)
    is DetectedIssue.Identified.Period -> this.value.hasProperty(name)
    is ResearchDefinition.Subject.CodeableConcept -> this.value.hasProperty(name)
    is ResearchDefinition.Subject.Reference -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.Definition.Reference -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.Definition.Canonical -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.Definition.CodeableConcept -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.Definition.Expression -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.Definition.DataRequirement -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.Definition.TriggerDefinition -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.ParticipantEffective.DateTime -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.ParticipantEffective.Period -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.ParticipantEffective.Duration -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.ParticipantEffective.Timing -> this.value.hasProperty(name)
    is MessageDefinition.Event.Coding -> this.value.hasProperty(name)
    is MessageDefinition.Event.Uri -> this.value.hasProperty(name)
    is ImplementationGuide.Definition.Resource.Example.Boolean -> this.value.hasProperty(name)
    is ImplementationGuide.Definition.Resource.Example.Canonical -> this.value.hasProperty(name)
    is ImplementationGuide.Definition.Page.Name.Url -> this.value.hasProperty(name)
    is ImplementationGuide.Definition.Page.Name.Reference -> this.value.hasProperty(name)
    is ImplementationGuide.Manifest.Resource.Example.Boolean -> this.value.hasProperty(name)
    is ImplementationGuide.Manifest.Resource.Example.Canonical -> this.value.hasProperty(name)
    is NutritionOrder.EnteralFormula.Administration.Rate.Quantity -> this.value.hasProperty(name)
    is NutritionOrder.EnteralFormula.Administration.Rate.Ratio -> this.value.hasProperty(name)
    is CoverageEligibilityRequest.Serviced.Date -> this.value.hasProperty(name)
    is CoverageEligibilityRequest.Serviced.Period -> this.value.hasProperty(name)
    is CoverageEligibilityRequest.Item.Diagnosis.Diagnosis.CodeableConcept ->
      this.value.hasProperty(name)
    is CoverageEligibilityRequest.Item.Diagnosis.Diagnosis.Reference -> this.value.hasProperty(name)
    is CodeSystem.Concept.Property.Value.Code -> this.value.hasProperty(name)
    is CodeSystem.Concept.Property.Value.Coding -> this.value.hasProperty(name)
    is CodeSystem.Concept.Property.Value.String -> this.value.hasProperty(name)
    is CodeSystem.Concept.Property.Value.Integer -> this.value.hasProperty(name)
    is CodeSystem.Concept.Property.Value.Boolean -> this.value.hasProperty(name)
    is CodeSystem.Concept.Property.Value.DateTime -> this.value.hasProperty(name)
    is CodeSystem.Concept.Property.Value.Decimal -> this.value.hasProperty(name)
    is MedicationRequest.Reported.Boolean -> this.value.hasProperty(name)
    is MedicationRequest.Reported.Reference -> this.value.hasProperty(name)
    is MedicationRequest.Medication.CodeableConcept -> this.value.hasProperty(name)
    is MedicationRequest.Medication.Reference -> this.value.hasProperty(name)
    is MedicationRequest.Substitution.Allowed.Boolean -> this.value.hasProperty(name)
    is MedicationRequest.Substitution.Allowed.CodeableConcept -> this.value.hasProperty(name)
    is ImmunizationRecommendation.Recommendation.DoseNumber.PositiveInt ->
      this.value.hasProperty(name)
    is ImmunizationRecommendation.Recommendation.DoseNumber.String -> this.value.hasProperty(name)
    is ImmunizationRecommendation.Recommendation.SeriesDoses.PositiveInt ->
      this.value.hasProperty(name)
    is ImmunizationRecommendation.Recommendation.SeriesDoses.String -> this.value.hasProperty(name)
    is Coverage.CostToBeneficiary.Value.Quantity -> this.value.hasProperty(name)
    is Coverage.CostToBeneficiary.Value.Money -> this.value.hasProperty(name)
    is MedicationKnowledge.Ingredient.Item.CodeableConcept -> this.value.hasProperty(name)
    is MedicationKnowledge.Ingredient.Item.Reference -> this.value.hasProperty(name)
    is MedicationKnowledge.AdministrationGuidelines.Indication.CodeableConcept ->
      this.value.hasProperty(name)
    is MedicationKnowledge.AdministrationGuidelines.Indication.Reference ->
      this.value.hasProperty(name)
    is MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics.Characteristic.CodeableConcept ->
      this.value.hasProperty(name)
    is MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics.Characteristic.Quantity ->
      this.value.hasProperty(name)
    is MedicationKnowledge.DrugCharacteristic.Value.CodeableConcept -> this.value.hasProperty(name)
    else -> false
  }

private fun Any.hasPropertyInChoiceValue3(name: String): Boolean =
  when (this) {
    is MedicationKnowledge.DrugCharacteristic.Value.String -> this.value.hasProperty(name)
    is MedicationKnowledge.DrugCharacteristic.Value.Quantity -> this.value.hasProperty(name)
    is MedicationKnowledge.DrugCharacteristic.Value.Base64Binary -> this.value.hasProperty(name)
    is SubstanceReferenceInformation.Target.Amount.Quantity -> this.value.hasProperty(name)
    is SubstanceReferenceInformation.Target.Amount.Range -> this.value.hasProperty(name)
    is SubstanceReferenceInformation.Target.Amount.String -> this.value.hasProperty(name)
    is ImmunizationEvaluation.DoseNumber.PositiveInt -> this.value.hasProperty(name)
    is ImmunizationEvaluation.DoseNumber.String -> this.value.hasProperty(name)
    is ImmunizationEvaluation.SeriesDoses.PositiveInt -> this.value.hasProperty(name)
    is ImmunizationEvaluation.SeriesDoses.String -> this.value.hasProperty(name)
    is MedicationStatement.Medication.CodeableConcept -> this.value.hasProperty(name)
    is MedicationStatement.Medication.Reference -> this.value.hasProperty(name)
    is MedicationStatement.Effective.DateTime -> this.value.hasProperty(name)
    is MedicationStatement.Effective.Period -> this.value.hasProperty(name)
    is AllergyIntolerance.Onset.DateTime -> this.value.hasProperty(name)
    is AllergyIntolerance.Onset.Age -> this.value.hasProperty(name)
    is AllergyIntolerance.Onset.Period -> this.value.hasProperty(name)
    is AllergyIntolerance.Onset.Range -> this.value.hasProperty(name)
    is AllergyIntolerance.Onset.String -> this.value.hasProperty(name)
    is PlanDefinition.Subject.CodeableConcept -> this.value.hasProperty(name)
    is PlanDefinition.Subject.Reference -> this.value.hasProperty(name)
    is PlanDefinition.Goal.Target.Detail.Quantity -> this.value.hasProperty(name)
    is PlanDefinition.Goal.Target.Detail.Range -> this.value.hasProperty(name)
    is PlanDefinition.Goal.Target.Detail.CodeableConcept -> this.value.hasProperty(name)
    is PlanDefinition.Action.Subject.CodeableConcept -> this.value.hasProperty(name)
    is PlanDefinition.Action.Subject.Reference -> this.value.hasProperty(name)
    is PlanDefinition.Action.RelatedAction.Offset.Duration -> this.value.hasProperty(name)
    is PlanDefinition.Action.RelatedAction.Offset.Range -> this.value.hasProperty(name)
    is PlanDefinition.Action.Timing.DateTime -> this.value.hasProperty(name)
    is PlanDefinition.Action.Timing.Age -> this.value.hasProperty(name)
    is PlanDefinition.Action.Timing.Period -> this.value.hasProperty(name)
    is PlanDefinition.Action.Timing.Duration -> this.value.hasProperty(name)
    is PlanDefinition.Action.Timing.Range -> this.value.hasProperty(name)
    is PlanDefinition.Action.Timing.Timing -> this.value.hasProperty(name)
    is PlanDefinition.Action.Definition.Canonical -> this.value.hasProperty(name)
    is PlanDefinition.Action.Definition.Uri -> this.value.hasProperty(name)
    is ClinicalImpression.Effective.DateTime -> this.value.hasProperty(name)
    is ClinicalImpression.Effective.Period -> this.value.hasProperty(name)
    is Consent.Source.Attachment -> this.value.hasProperty(name)
    is Consent.Source.Reference -> this.value.hasProperty(name)
    is Communication.Payload.Content.String -> this.value.hasProperty(name)
    is Communication.Payload.Content.Attachment -> this.value.hasProperty(name)
    is Communication.Payload.Content.Reference -> this.value.hasProperty(name)
    is Library.Subject.CodeableConcept -> this.value.hasProperty(name)
    is Library.Subject.Reference -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Base64Binary -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Boolean -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Canonical -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Code -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Date -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.DateTime -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Decimal -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Id -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Instant -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Integer -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Markdown -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Oid -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.PositiveInt -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.String -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Time -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.UnsignedInt -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Uri -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Url -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Uuid -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Address -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Age -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Annotation -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Attachment -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.CodeableConcept -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Coding -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.ContactPoint -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Count -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Distance -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Duration -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.HumanName -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Identifier -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Money -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Period -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Quantity -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Range -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Ratio -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Reference -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.SampledData -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Signature -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Timing -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.ContactDetail -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Contributor -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.DataRequirement -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Expression -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.ParameterDefinition ->
      this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.RelatedArtifact -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.TriggerDefinition -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.UsageContext -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Dosage -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Source.DefaultValue.Meta -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Id -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.String -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Boolean -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Integer -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Decimal -> this.value.hasProperty(name)
    is Task.Input.Value.Base64Binary -> this.value.hasProperty(name)
    is Task.Input.Value.Boolean -> this.value.hasProperty(name)
    is Task.Input.Value.Canonical -> this.value.hasProperty(name)
    is Task.Input.Value.Code -> this.value.hasProperty(name)
    is Task.Input.Value.Date -> this.value.hasProperty(name)
    is Task.Input.Value.DateTime -> this.value.hasProperty(name)
    is Task.Input.Value.Decimal -> this.value.hasProperty(name)
    is Task.Input.Value.Id -> this.value.hasProperty(name)
    is Task.Input.Value.Instant -> this.value.hasProperty(name)
    is Task.Input.Value.Integer -> this.value.hasProperty(name)
    is Task.Input.Value.Markdown -> this.value.hasProperty(name)
    is Task.Input.Value.Oid -> this.value.hasProperty(name)
    is Task.Input.Value.PositiveInt -> this.value.hasProperty(name)
    is Task.Input.Value.String -> this.value.hasProperty(name)
    is Task.Input.Value.Time -> this.value.hasProperty(name)
    is Task.Input.Value.UnsignedInt -> this.value.hasProperty(name)
    is Task.Input.Value.Uri -> this.value.hasProperty(name)
    is Task.Input.Value.Url -> this.value.hasProperty(name)
    is Task.Input.Value.Uuid -> this.value.hasProperty(name)
    is Task.Input.Value.Address -> this.value.hasProperty(name)
    is Task.Input.Value.Age -> this.value.hasProperty(name)
    is Task.Input.Value.Annotation -> this.value.hasProperty(name)
    is Task.Input.Value.Attachment -> this.value.hasProperty(name)
    is Task.Input.Value.CodeableConcept -> this.value.hasProperty(name)
    is Task.Input.Value.Coding -> this.value.hasProperty(name)
    is Task.Input.Value.ContactPoint -> this.value.hasProperty(name)
    is Task.Input.Value.Count -> this.value.hasProperty(name)
    is Task.Input.Value.Distance -> this.value.hasProperty(name)
    is Task.Input.Value.Duration -> this.value.hasProperty(name)
    is Task.Input.Value.HumanName -> this.value.hasProperty(name)
    is Task.Input.Value.Identifier -> this.value.hasProperty(name)
    is Task.Input.Value.Money -> this.value.hasProperty(name)
    is Task.Input.Value.Period -> this.value.hasProperty(name)
    is Task.Input.Value.Quantity -> this.value.hasProperty(name)
    is Task.Input.Value.Range -> this.value.hasProperty(name)
    is Task.Input.Value.Ratio -> this.value.hasProperty(name)
    is Task.Input.Value.Reference -> this.value.hasProperty(name)
    is Task.Input.Value.SampledData -> this.value.hasProperty(name)
    is Task.Input.Value.Signature -> this.value.hasProperty(name)
    is Task.Input.Value.Timing -> this.value.hasProperty(name)
    is Task.Input.Value.ContactDetail -> this.value.hasProperty(name)
    is Task.Input.Value.Contributor -> this.value.hasProperty(name)
    is Task.Input.Value.DataRequirement -> this.value.hasProperty(name)
    is Task.Input.Value.Expression -> this.value.hasProperty(name)
    is Task.Input.Value.ParameterDefinition -> this.value.hasProperty(name)
    is Task.Input.Value.RelatedArtifact -> this.value.hasProperty(name)
    is Task.Input.Value.TriggerDefinition -> this.value.hasProperty(name)
    is Task.Input.Value.UsageContext -> this.value.hasProperty(name)
    is Task.Input.Value.Dosage -> this.value.hasProperty(name)
    is Task.Input.Value.Meta -> this.value.hasProperty(name)
    else -> false
  }

private fun Any.hasPropertyInChoiceValue4(name: String): Boolean =
  when (this) {
    is Task.Output.Value.Base64Binary -> this.value.hasProperty(name)
    is Task.Output.Value.Boolean -> this.value.hasProperty(name)
    is Task.Output.Value.Canonical -> this.value.hasProperty(name)
    is Task.Output.Value.Code -> this.value.hasProperty(name)
    is Task.Output.Value.Date -> this.value.hasProperty(name)
    is Task.Output.Value.DateTime -> this.value.hasProperty(name)
    is Task.Output.Value.Decimal -> this.value.hasProperty(name)
    is Task.Output.Value.Id -> this.value.hasProperty(name)
    is Task.Output.Value.Instant -> this.value.hasProperty(name)
    is Task.Output.Value.Integer -> this.value.hasProperty(name)
    is Task.Output.Value.Markdown -> this.value.hasProperty(name)
    is Task.Output.Value.Oid -> this.value.hasProperty(name)
    is Task.Output.Value.PositiveInt -> this.value.hasProperty(name)
    is Task.Output.Value.String -> this.value.hasProperty(name)
    is Task.Output.Value.Time -> this.value.hasProperty(name)
    is Task.Output.Value.UnsignedInt -> this.value.hasProperty(name)
    is Task.Output.Value.Uri -> this.value.hasProperty(name)
    is Task.Output.Value.Url -> this.value.hasProperty(name)
    is Task.Output.Value.Uuid -> this.value.hasProperty(name)
    is Task.Output.Value.Address -> this.value.hasProperty(name)
    is Task.Output.Value.Age -> this.value.hasProperty(name)
    is Task.Output.Value.Annotation -> this.value.hasProperty(name)
    is Task.Output.Value.Attachment -> this.value.hasProperty(name)
    is Task.Output.Value.CodeableConcept -> this.value.hasProperty(name)
    is Task.Output.Value.Coding -> this.value.hasProperty(name)
    is Task.Output.Value.ContactPoint -> this.value.hasProperty(name)
    is Task.Output.Value.Count -> this.value.hasProperty(name)
    is Task.Output.Value.Distance -> this.value.hasProperty(name)
    is Task.Output.Value.Duration -> this.value.hasProperty(name)
    is Task.Output.Value.HumanName -> this.value.hasProperty(name)
    is Task.Output.Value.Identifier -> this.value.hasProperty(name)
    is Task.Output.Value.Money -> this.value.hasProperty(name)
    is Task.Output.Value.Period -> this.value.hasProperty(name)
    is Task.Output.Value.Quantity -> this.value.hasProperty(name)
    is Task.Output.Value.Range -> this.value.hasProperty(name)
    is Task.Output.Value.Ratio -> this.value.hasProperty(name)
    is Task.Output.Value.Reference -> this.value.hasProperty(name)
    is Task.Output.Value.SampledData -> this.value.hasProperty(name)
    is Task.Output.Value.Signature -> this.value.hasProperty(name)
    is Task.Output.Value.Timing -> this.value.hasProperty(name)
    is Task.Output.Value.ContactDetail -> this.value.hasProperty(name)
    is Task.Output.Value.Contributor -> this.value.hasProperty(name)
    is Task.Output.Value.DataRequirement -> this.value.hasProperty(name)
    is Task.Output.Value.Expression -> this.value.hasProperty(name)
    is Task.Output.Value.ParameterDefinition -> this.value.hasProperty(name)
    is Task.Output.Value.RelatedArtifact -> this.value.hasProperty(name)
    is Task.Output.Value.TriggerDefinition -> this.value.hasProperty(name)
    is Task.Output.Value.UsageContext -> this.value.hasProperty(name)
    is Task.Output.Value.Dosage -> this.value.hasProperty(name)
    is Task.Output.Value.Meta -> this.value.hasProperty(name)
    is MedicinalProductContraindication.OtherTherapy.Medication.CodeableConcept ->
      this.value.hasProperty(name)
    is MedicinalProductContraindication.OtherTherapy.Medication.Reference ->
      this.value.hasProperty(name)
    is Observation.Effective.DateTime -> this.value.hasProperty(name)
    is Observation.Effective.Period -> this.value.hasProperty(name)
    is Observation.Effective.Timing -> this.value.hasProperty(name)
    is Observation.Effective.Instant -> this.value.hasProperty(name)
    is Observation.Value.Quantity -> this.value.hasProperty(name)
    is Observation.Value.CodeableConcept -> this.value.hasProperty(name)
    is Observation.Value.String -> this.value.hasProperty(name)
    is Observation.Value.Boolean -> this.value.hasProperty(name)
    is Observation.Value.Integer -> this.value.hasProperty(name)
    is Observation.Value.Range -> this.value.hasProperty(name)
    is Observation.Value.Ratio -> this.value.hasProperty(name)
    is Observation.Value.SampledData -> this.value.hasProperty(name)
    is Observation.Value.Time -> this.value.hasProperty(name)
    is Observation.Value.DateTime -> this.value.hasProperty(name)
    is Observation.Value.Period -> this.value.hasProperty(name)
    is Observation.Component.Value.Quantity -> this.value.hasProperty(name)
    is Observation.Component.Value.CodeableConcept -> this.value.hasProperty(name)
    is Observation.Component.Value.String -> this.value.hasProperty(name)
    is Observation.Component.Value.Boolean -> this.value.hasProperty(name)
    is Observation.Component.Value.Integer -> this.value.hasProperty(name)
    is Observation.Component.Value.Range -> this.value.hasProperty(name)
    is Observation.Component.Value.Ratio -> this.value.hasProperty(name)
    is Observation.Component.Value.SampledData -> this.value.hasProperty(name)
    is Observation.Component.Value.Time -> this.value.hasProperty(name)
    is Observation.Component.Value.DateTime -> this.value.hasProperty(name)
    is Observation.Component.Value.Period -> this.value.hasProperty(name)
    is MedicationDispense.StatusReason.CodeableConcept -> this.value.hasProperty(name)
    is MedicationDispense.StatusReason.Reference -> this.value.hasProperty(name)
    is MedicationDispense.Medication.CodeableConcept -> this.value.hasProperty(name)
    is MedicationDispense.Medication.Reference -> this.value.hasProperty(name)
    is Procedure.Performed.DateTime -> this.value.hasProperty(name)
    is Procedure.Performed.Period -> this.value.hasProperty(name)
    is Procedure.Performed.String -> this.value.hasProperty(name)
    is Procedure.Performed.Age -> this.value.hasProperty(name)
    is Procedure.Performed.Range -> this.value.hasProperty(name)
    is MedicinalProductAuthorization.Procedure.Date.Period -> this.value.hasProperty(name)
    is MedicinalProductAuthorization.Procedure.Date.DateTime -> this.value.hasProperty(name)
    else -> false
  }

internal fun Any.hasPropertyInChoiceValue(name: String): Boolean {
  if (hasPropertyInChoiceValue0(name)) return true
  if (hasPropertyInChoiceValue1(name)) return true
  if (hasPropertyInChoiceValue2(name)) return true
  if (hasPropertyInChoiceValue3(name)) return true
  if (hasPropertyInChoiceValue4(name)) return true
  return false
}

private fun Any.unwrapChoiceValue0(): Any? =
  when (this) {
    is SubstanceSpecification.Moiety.Amount.Quantity -> this.value
    is SubstanceSpecification.Moiety.Amount.String -> this.value
    is SubstanceSpecification.Property.DefiningSubstance.Reference -> this.value
    is SubstanceSpecification.Property.DefiningSubstance.CodeableConcept -> this.value
    is SubstanceSpecification.Property.Amount.Quantity -> this.value
    is SubstanceSpecification.Property.Amount.String -> this.value
    is SubstanceSpecification.Relationship.Substance.Reference -> this.value
    is SubstanceSpecification.Relationship.Substance.CodeableConcept -> this.value
    is SubstanceSpecification.Relationship.Amount.Quantity -> this.value
    is SubstanceSpecification.Relationship.Amount.Range -> this.value
    is SubstanceSpecification.Relationship.Amount.Ratio -> this.value
    is SubstanceSpecification.Relationship.Amount.String -> this.value
    is DeviceUseStatement.Timing.Timing -> this.value
    is DeviceUseStatement.Timing.Period -> this.value
    is DeviceUseStatement.Timing.DateTime -> this.value
    is Condition.Onset.DateTime -> this.value
    is Condition.Onset.Age -> this.value
    is Condition.Onset.Period -> this.value
    is Condition.Onset.Range -> this.value
    is Condition.Onset.String -> this.value
    is Condition.Abatement.DateTime -> this.value
    is Condition.Abatement.Age -> this.value
    is Condition.Abatement.Period -> this.value
    is Condition.Abatement.Range -> this.value
    is Condition.Abatement.String -> this.value
    is ChargeItem.Occurrence.DateTime -> this.value
    is ChargeItem.Occurrence.Period -> this.value
    is ChargeItem.Occurrence.Timing -> this.value
    is ChargeItem.Product.Reference -> this.value
    is ChargeItem.Product.CodeableConcept -> this.value
    is Media.Created.DateTime -> this.value
    is Media.Created.Period -> this.value
    is SupplyDelivery.SuppliedItem.Item.CodeableConcept -> this.value
    is SupplyDelivery.SuppliedItem.Item.Reference -> this.value
    is SupplyDelivery.Occurrence.DateTime -> this.value
    is SupplyDelivery.Occurrence.Period -> this.value
    is SupplyDelivery.Occurrence.Timing -> this.value
    is Composition.RelatesTo.Target.Identifier -> this.value
    is Composition.RelatesTo.Target.Reference -> this.value
    is MedicationAdministration.Medication.CodeableConcept -> this.value
    is MedicationAdministration.Medication.Reference -> this.value
    is MedicationAdministration.Effective.DateTime -> this.value
    is MedicationAdministration.Effective.Period -> this.value
    is MedicationAdministration.Dosage.Rate.Ratio -> this.value
    is MedicationAdministration.Dosage.Rate.Quantity -> this.value
    is Claim.SupportingInfo.Timing.Date -> this.value
    is Claim.SupportingInfo.Timing.Period -> this.value
    is Claim.SupportingInfo.Value.Boolean -> this.value
    is Claim.SupportingInfo.Value.String -> this.value
    is Claim.SupportingInfo.Value.Quantity -> this.value
    is Claim.SupportingInfo.Value.Attachment -> this.value
    is Claim.SupportingInfo.Value.Reference -> this.value
    is Claim.Diagnosis.Diagnosis.CodeableConcept -> this.value
    is Claim.Diagnosis.Diagnosis.Reference -> this.value
    is Claim.Procedure.Procedure.CodeableConcept -> this.value
    is Claim.Procedure.Procedure.Reference -> this.value
    is Claim.Accident.Location.Address -> this.value
    is Claim.Accident.Location.Reference -> this.value
    is Claim.Item.Serviced.Date -> this.value
    is Claim.Item.Serviced.Period -> this.value
    is Claim.Item.Location.CodeableConcept -> this.value
    is Claim.Item.Location.Address -> this.value
    is Claim.Item.Location.Reference -> this.value
    is AuditEvent.Entity.Detail.Value.String -> this.value
    is AuditEvent.Entity.Detail.Value.Base64Binary -> this.value
    is ServiceRequest.Quantity.Quantity -> this.value
    is ServiceRequest.Quantity.Ratio -> this.value
    is ServiceRequest.Quantity.Range -> this.value
    is ServiceRequest.Occurrence.DateTime -> this.value
    is ServiceRequest.Occurrence.Period -> this.value
    is ServiceRequest.Occurrence.Timing -> this.value
    is ServiceRequest.AsNeeded.Boolean -> this.value
    is ServiceRequest.AsNeeded.CodeableConcept -> this.value
    is EventDefinition.Subject.CodeableConcept -> this.value
    is EventDefinition.Subject.Reference -> this.value
    is CarePlan.Activity.Detail.Scheduled.Timing -> this.value
    is CarePlan.Activity.Detail.Scheduled.Period -> this.value
    is CarePlan.Activity.Detail.Scheduled.String -> this.value
    is CarePlan.Activity.Detail.Product.CodeableConcept -> this.value
    is CarePlan.Activity.Detail.Product.Reference -> this.value
    is CoverageEligibilityResponse.Serviced.Date -> this.value
    is CoverageEligibilityResponse.Serviced.Period -> this.value
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed.UnsignedInt -> this.value
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed.String -> this.value
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Allowed.Money -> this.value
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Used.UnsignedInt -> this.value
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Used.String -> this.value
    is CoverageEligibilityResponse.Insurance.Item.Benefit.Used.Money -> this.value
    is QuestionnaireResponse.Item.Answer.Value.Boolean -> this.value
    is QuestionnaireResponse.Item.Answer.Value.Decimal -> this.value
    is QuestionnaireResponse.Item.Answer.Value.Integer -> this.value
    is QuestionnaireResponse.Item.Answer.Value.Date -> this.value
    is QuestionnaireResponse.Item.Answer.Value.DateTime -> this.value
    is QuestionnaireResponse.Item.Answer.Value.Time -> this.value
    is QuestionnaireResponse.Item.Answer.Value.String -> this.value
    is QuestionnaireResponse.Item.Answer.Value.Uri -> this.value
    is QuestionnaireResponse.Item.Answer.Value.Attachment -> this.value
    is QuestionnaireResponse.Item.Answer.Value.Coding -> this.value
    is QuestionnaireResponse.Item.Answer.Value.Quantity -> this.value
    is QuestionnaireResponse.Item.Answer.Value.Reference -> this.value
    is Measure.Subject.CodeableConcept -> this.value
    is Measure.Subject.Reference -> this.value
    is ActivityDefinition.Subject.CodeableConcept -> this.value
    is ActivityDefinition.Subject.Reference -> this.value
    is ActivityDefinition.Timing.Timing -> this.value
    is ActivityDefinition.Timing.DateTime -> this.value
    is ActivityDefinition.Timing.Age -> this.value
    is ActivityDefinition.Timing.Period -> this.value
    is ActivityDefinition.Timing.Range -> this.value
    is ActivityDefinition.Timing.Duration -> this.value
    is ActivityDefinition.Product.Reference -> this.value
    is ActivityDefinition.Product.CodeableConcept -> this.value
    is DeviceRequest.Code.Reference -> this.value
    is DeviceRequest.Code.CodeableConcept -> this.value
    is DeviceRequest.Parameter.Value.CodeableConcept -> this.value
    is DeviceRequest.Parameter.Value.Quantity -> this.value
    is DeviceRequest.Parameter.Value.Range -> this.value
    is DeviceRequest.Parameter.Value.Boolean -> this.value
    is DeviceRequest.Occurrence.DateTime -> this.value
    is DeviceRequest.Occurrence.Period -> this.value
    is DeviceRequest.Occurrence.Timing -> this.value
    is Substance.Ingredient.Substance.CodeableConcept -> this.value
    is Substance.Ingredient.Substance.Reference -> this.value
    is Group.Characteristic.Value.CodeableConcept -> this.value
    is Group.Characteristic.Value.Boolean -> this.value
    is Group.Characteristic.Value.Quantity -> this.value
    is Group.Characteristic.Value.Range -> this.value
    is Group.Characteristic.Value.Reference -> this.value
    is Questionnaire.Item.EnableWhen.Answer.Boolean -> this.value
    is Questionnaire.Item.EnableWhen.Answer.Decimal -> this.value
    is Questionnaire.Item.EnableWhen.Answer.Integer -> this.value
    is Questionnaire.Item.EnableWhen.Answer.Date -> this.value
    is Questionnaire.Item.EnableWhen.Answer.DateTime -> this.value
    is Questionnaire.Item.EnableWhen.Answer.Time -> this.value
    is Questionnaire.Item.EnableWhen.Answer.String -> this.value
    is Questionnaire.Item.EnableWhen.Answer.Coding -> this.value
    is Questionnaire.Item.EnableWhen.Answer.Quantity -> this.value
    is Questionnaire.Item.EnableWhen.Answer.Reference -> this.value
    is Questionnaire.Item.AnswerOption.Value.Integer -> this.value
    is Questionnaire.Item.AnswerOption.Value.Date -> this.value
    is Questionnaire.Item.AnswerOption.Value.Time -> this.value
    is Questionnaire.Item.AnswerOption.Value.String -> this.value
    is Questionnaire.Item.AnswerOption.Value.Coding -> this.value
    is Questionnaire.Item.AnswerOption.Value.Reference -> this.value
    is Questionnaire.Item.Initial.Value.Boolean -> this.value
    is Questionnaire.Item.Initial.Value.Decimal -> this.value
    is Questionnaire.Item.Initial.Value.Integer -> this.value
    is Questionnaire.Item.Initial.Value.Date -> this.value
    is Questionnaire.Item.Initial.Value.DateTime -> this.value
    is Questionnaire.Item.Initial.Value.Time -> this.value
    else -> null
  }

private fun Any.unwrapChoiceValue1(): Any? =
  when (this) {
    is Questionnaire.Item.Initial.Value.String -> this.value
    is Questionnaire.Item.Initial.Value.Uri -> this.value
    is Questionnaire.Item.Initial.Value.Attachment -> this.value
    is Questionnaire.Item.Initial.Value.Coding -> this.value
    is Questionnaire.Item.Initial.Value.Quantity -> this.value
    is Questionnaire.Item.Initial.Value.Reference -> this.value
    is SupplyRequest.Item.CodeableConcept -> this.value
    is SupplyRequest.Item.Reference -> this.value
    is SupplyRequest.Parameter.Value.CodeableConcept -> this.value
    is SupplyRequest.Parameter.Value.Quantity -> this.value
    is SupplyRequest.Parameter.Value.Range -> this.value
    is SupplyRequest.Parameter.Value.Boolean -> this.value
    is SupplyRequest.Occurrence.DateTime -> this.value
    is SupplyRequest.Occurrence.Period -> this.value
    is SupplyRequest.Occurrence.Timing -> this.value
    is Provenance.Occurred.Period -> this.value
    is Provenance.Occurred.DateTime -> this.value
    is RiskAssessment.Occurrence.DateTime -> this.value
    is RiskAssessment.Occurrence.Period -> this.value
    is RiskAssessment.Prediction.Probability.Decimal -> this.value
    is RiskAssessment.Prediction.Probability.Range -> this.value
    is RiskAssessment.Prediction.When.Period -> this.value
    is RiskAssessment.Prediction.When.Range -> this.value
    is Parameters.Parameter.Value.Base64Binary -> this.value
    is Parameters.Parameter.Value.Boolean -> this.value
    is Parameters.Parameter.Value.Canonical -> this.value
    is Parameters.Parameter.Value.Code -> this.value
    is Parameters.Parameter.Value.Date -> this.value
    is Parameters.Parameter.Value.DateTime -> this.value
    is Parameters.Parameter.Value.Decimal -> this.value
    is Parameters.Parameter.Value.Id -> this.value
    is Parameters.Parameter.Value.Instant -> this.value
    is Parameters.Parameter.Value.Integer -> this.value
    is Parameters.Parameter.Value.Markdown -> this.value
    is Parameters.Parameter.Value.Oid -> this.value
    is Parameters.Parameter.Value.PositiveInt -> this.value
    is Parameters.Parameter.Value.String -> this.value
    is Parameters.Parameter.Value.Time -> this.value
    is Parameters.Parameter.Value.UnsignedInt -> this.value
    is Parameters.Parameter.Value.Uri -> this.value
    is Parameters.Parameter.Value.Url -> this.value
    is Parameters.Parameter.Value.Uuid -> this.value
    is Parameters.Parameter.Value.Address -> this.value
    is Parameters.Parameter.Value.Age -> this.value
    is Parameters.Parameter.Value.Annotation -> this.value
    is Parameters.Parameter.Value.Attachment -> this.value
    is Parameters.Parameter.Value.CodeableConcept -> this.value
    is Parameters.Parameter.Value.Coding -> this.value
    is Parameters.Parameter.Value.ContactPoint -> this.value
    is Parameters.Parameter.Value.Count -> this.value
    is Parameters.Parameter.Value.Distance -> this.value
    is Parameters.Parameter.Value.Duration -> this.value
    is Parameters.Parameter.Value.HumanName -> this.value
    is Parameters.Parameter.Value.Identifier -> this.value
    is Parameters.Parameter.Value.Money -> this.value
    is Parameters.Parameter.Value.Period -> this.value
    is Parameters.Parameter.Value.Quantity -> this.value
    is Parameters.Parameter.Value.Range -> this.value
    is Parameters.Parameter.Value.Ratio -> this.value
    is Parameters.Parameter.Value.Reference -> this.value
    is Parameters.Parameter.Value.SampledData -> this.value
    is Parameters.Parameter.Value.Signature -> this.value
    is Parameters.Parameter.Value.Timing -> this.value
    is Parameters.Parameter.Value.ContactDetail -> this.value
    is Parameters.Parameter.Value.Contributor -> this.value
    is Parameters.Parameter.Value.DataRequirement -> this.value
    is Parameters.Parameter.Value.Expression -> this.value
    is Parameters.Parameter.Value.ParameterDefinition -> this.value
    is Parameters.Parameter.Value.RelatedArtifact -> this.value
    is Parameters.Parameter.Value.TriggerDefinition -> this.value
    is Parameters.Parameter.Value.UsageContext -> this.value
    is Parameters.Parameter.Value.Dosage -> this.value
    is Parameters.Parameter.Value.Meta -> this.value
    is ExplanationOfBenefit.SupportingInfo.Timing.Date -> this.value
    is ExplanationOfBenefit.SupportingInfo.Timing.Period -> this.value
    is ExplanationOfBenefit.SupportingInfo.Value.Boolean -> this.value
    is ExplanationOfBenefit.SupportingInfo.Value.String -> this.value
    is ExplanationOfBenefit.SupportingInfo.Value.Quantity -> this.value
    is ExplanationOfBenefit.SupportingInfo.Value.Attachment -> this.value
    is ExplanationOfBenefit.SupportingInfo.Value.Reference -> this.value
    is ExplanationOfBenefit.Diagnosis.Diagnosis.CodeableConcept -> this.value
    is ExplanationOfBenefit.Diagnosis.Diagnosis.Reference -> this.value
    is ExplanationOfBenefit.Procedure.Procedure.CodeableConcept -> this.value
    is ExplanationOfBenefit.Procedure.Procedure.Reference -> this.value
    is ExplanationOfBenefit.Accident.Location.Address -> this.value
    is ExplanationOfBenefit.Accident.Location.Reference -> this.value
    is ExplanationOfBenefit.Item.Serviced.Date -> this.value
    is ExplanationOfBenefit.Item.Serviced.Period -> this.value
    is ExplanationOfBenefit.Item.Location.CodeableConcept -> this.value
    is ExplanationOfBenefit.Item.Location.Address -> this.value
    is ExplanationOfBenefit.Item.Location.Reference -> this.value
    is ExplanationOfBenefit.AddItem.Serviced.Date -> this.value
    is ExplanationOfBenefit.AddItem.Serviced.Period -> this.value
    is ExplanationOfBenefit.AddItem.Location.CodeableConcept -> this.value
    is ExplanationOfBenefit.AddItem.Location.Address -> this.value
    is ExplanationOfBenefit.AddItem.Location.Reference -> this.value
    is ExplanationOfBenefit.BenefitBalance.Financial.Allowed.UnsignedInt -> this.value
    is ExplanationOfBenefit.BenefitBalance.Financial.Allowed.String -> this.value
    is ExplanationOfBenefit.BenefitBalance.Financial.Allowed.Money -> this.value
    is ExplanationOfBenefit.BenefitBalance.Financial.Used.UnsignedInt -> this.value
    is ExplanationOfBenefit.BenefitBalance.Financial.Used.Money -> this.value
    is Patient.Deceased.Boolean -> this.value
    is Patient.Deceased.DateTime -> this.value
    is Patient.MultipleBirth.Boolean -> this.value
    is Patient.MultipleBirth.Integer -> this.value
    is MedicinalProduct.SpecialDesignation.Indication.CodeableConcept -> this.value
    is MedicinalProduct.SpecialDesignation.Indication.Reference -> this.value
    is Specimen.Collection.Collected.DateTime -> this.value
    is Specimen.Collection.Collected.Period -> this.value
    is Specimen.Collection.FastingStatus.CodeableConcept -> this.value
    is Specimen.Collection.FastingStatus.Duration -> this.value
    is Specimen.Processing.Time.DateTime -> this.value
    is Specimen.Processing.Time.Period -> this.value
    is Specimen.Container.Additive.CodeableConcept -> this.value
    is Specimen.Container.Additive.Reference -> this.value
    is FamilyMemberHistory.Born.Period -> this.value
    is FamilyMemberHistory.Born.Date -> this.value
    is FamilyMemberHistory.Born.String -> this.value
    is FamilyMemberHistory.Age.Age -> this.value
    is FamilyMemberHistory.Age.Range -> this.value
    is FamilyMemberHistory.Age.String -> this.value
    is FamilyMemberHistory.Deceased.Boolean -> this.value
    is FamilyMemberHistory.Deceased.Age -> this.value
    is FamilyMemberHistory.Deceased.Range -> this.value
    is FamilyMemberHistory.Deceased.Date -> this.value
    is FamilyMemberHistory.Deceased.String -> this.value
    is FamilyMemberHistory.Condition.Onset.Age -> this.value
    is FamilyMemberHistory.Condition.Onset.Range -> this.value
    is FamilyMemberHistory.Condition.Onset.Period -> this.value
    is FamilyMemberHistory.Condition.Onset.String -> this.value
    is ResearchElementDefinition.Subject.CodeableConcept -> this.value
    is ResearchElementDefinition.Subject.Reference -> this.value
    is ResearchElementDefinition.Characteristic.Definition.CodeableConcept -> this.value
    is ResearchElementDefinition.Characteristic.Definition.Canonical -> this.value
    is ResearchElementDefinition.Characteristic.Definition.Expression -> this.value
    is ResearchElementDefinition.Characteristic.Definition.DataRequirement -> this.value
    is ResearchElementDefinition.Characteristic.StudyEffective.DateTime -> this.value
    is ResearchElementDefinition.Characteristic.StudyEffective.Period -> this.value
    is ResearchElementDefinition.Characteristic.StudyEffective.Duration -> this.value
    is ResearchElementDefinition.Characteristic.StudyEffective.Timing -> this.value
    is ResearchElementDefinition.Characteristic.ParticipantEffective.DateTime -> this.value
    is ResearchElementDefinition.Characteristic.ParticipantEffective.Period -> this.value
    is ResearchElementDefinition.Characteristic.ParticipantEffective.Duration -> this.value
    is ResearchElementDefinition.Characteristic.ParticipantEffective.Timing -> this.value
    is MedicinalProductIndication.OtherTherapy.Medication.CodeableConcept -> this.value
    is MedicinalProductIndication.OtherTherapy.Medication.Reference -> this.value
    is Medication.Ingredient.Item.CodeableConcept -> this.value
    is Medication.Ingredient.Item.Reference -> this.value
    is DiagnosticReport.Effective.DateTime -> this.value
    is DiagnosticReport.Effective.Period -> this.value
    else -> null
  }

private fun Any.unwrapChoiceValue2(): Any? =
  when (this) {
    is RequestGroup.Action.RelatedAction.Offset.Duration -> this.value
    is RequestGroup.Action.RelatedAction.Offset.Range -> this.value
    is RequestGroup.Action.Timing.DateTime -> this.value
    is RequestGroup.Action.Timing.Age -> this.value
    is RequestGroup.Action.Timing.Period -> this.value
    is RequestGroup.Action.Timing.Duration -> this.value
    is RequestGroup.Action.Timing.Range -> this.value
    is RequestGroup.Action.Timing.Timing -> this.value
    is MessageHeader.Event.Coding -> this.value
    is MessageHeader.Event.Uri -> this.value
    is DeviceDefinition.Manufacturer.String -> this.value
    is DeviceDefinition.Manufacturer.Reference -> this.value
    is Goal.Start.Date -> this.value
    is Goal.Start.CodeableConcept -> this.value
    is Goal.Target.Detail.Quantity -> this.value
    is Goal.Target.Detail.Range -> this.value
    is Goal.Target.Detail.CodeableConcept -> this.value
    is Goal.Target.Detail.String -> this.value
    is Goal.Target.Detail.Boolean -> this.value
    is Goal.Target.Detail.Integer -> this.value
    is Goal.Target.Detail.Ratio -> this.value
    is Goal.Target.Due.Date -> this.value
    is Goal.Target.Due.Duration -> this.value
    is Immunization.Occurrence.DateTime -> this.value
    is Immunization.Occurrence.String -> this.value
    is Immunization.ProtocolApplied.DoseNumber.PositiveInt -> this.value
    is Immunization.ProtocolApplied.DoseNumber.String -> this.value
    is Immunization.ProtocolApplied.SeriesDoses.PositiveInt -> this.value
    is Immunization.ProtocolApplied.SeriesDoses.String -> this.value
    is ValueSet.Expansion.Parameter.Value.String -> this.value
    is ValueSet.Expansion.Parameter.Value.Boolean -> this.value
    is ValueSet.Expansion.Parameter.Value.Integer -> this.value
    is ValueSet.Expansion.Parameter.Value.Decimal -> this.value
    is ValueSet.Expansion.Parameter.Value.Uri -> this.value
    is ValueSet.Expansion.Parameter.Value.Code -> this.value
    is ValueSet.Expansion.Parameter.Value.DateTime -> this.value
    is ClaimResponse.AddItem.Serviced.Date -> this.value
    is ClaimResponse.AddItem.Serviced.Period -> this.value
    is ClaimResponse.AddItem.Location.CodeableConcept -> this.value
    is ClaimResponse.AddItem.Location.Address -> this.value
    is ClaimResponse.AddItem.Location.Reference -> this.value
    is Contract.Topic.CodeableConcept -> this.value
    is Contract.Topic.Reference -> this.value
    is Contract.Term.Topic.CodeableConcept -> this.value
    is Contract.Term.Topic.Reference -> this.value
    is Contract.Term.Offer.Answer.Value.Boolean -> this.value
    is Contract.Term.Offer.Answer.Value.Decimal -> this.value
    is Contract.Term.Offer.Answer.Value.Integer -> this.value
    is Contract.Term.Offer.Answer.Value.Date -> this.value
    is Contract.Term.Offer.Answer.Value.DateTime -> this.value
    is Contract.Term.Offer.Answer.Value.Time -> this.value
    is Contract.Term.Offer.Answer.Value.String -> this.value
    is Contract.Term.Offer.Answer.Value.Uri -> this.value
    is Contract.Term.Offer.Answer.Value.Attachment -> this.value
    is Contract.Term.Offer.Answer.Value.Coding -> this.value
    is Contract.Term.Offer.Answer.Value.Quantity -> this.value
    is Contract.Term.Offer.Answer.Value.Reference -> this.value
    is Contract.Term.Asset.ValuedItem.Entity.CodeableConcept -> this.value
    is Contract.Term.Asset.ValuedItem.Entity.Reference -> this.value
    is Contract.Term.Action.Occurrence.DateTime -> this.value
    is Contract.Term.Action.Occurrence.Period -> this.value
    is Contract.Term.Action.Occurrence.Timing -> this.value
    is Contract.Friendly.Content.Attachment -> this.value
    is Contract.Friendly.Content.Reference -> this.value
    is Contract.Legal.Content.Attachment -> this.value
    is Contract.Legal.Content.Reference -> this.value
    is Contract.Rule.Content.Attachment -> this.value
    is Contract.Rule.Content.Reference -> this.value
    is Contract.LegallyBinding.Attachment -> this.value
    is Contract.LegallyBinding.Reference -> this.value
    is BiologicallyDerivedProduct.Collection.Collected.DateTime -> this.value
    is BiologicallyDerivedProduct.Collection.Collected.Period -> this.value
    is BiologicallyDerivedProduct.Processing.Time.DateTime -> this.value
    is BiologicallyDerivedProduct.Processing.Time.Period -> this.value
    is BiologicallyDerivedProduct.Manipulation.Time.DateTime -> this.value
    is BiologicallyDerivedProduct.Manipulation.Time.Period -> this.value
    is SpecimenDefinition.TypeTested.Container.MinimumVolume.Quantity -> this.value
    is SpecimenDefinition.TypeTested.Container.MinimumVolume.String -> this.value
    is SpecimenDefinition.TypeTested.Container.Additive.Additive.CodeableConcept -> this.value
    is SpecimenDefinition.TypeTested.Container.Additive.Additive.Reference -> this.value
    is ConceptMap.Source.Uri -> this.value
    is ConceptMap.Source.Canonical -> this.value
    is ConceptMap.Target.Uri -> this.value
    is ConceptMap.Target.Canonical -> this.value
    is Invoice.LineItem.ChargeItem.Reference -> this.value
    is Invoice.LineItem.ChargeItem.CodeableConcept -> this.value
    is CommunicationRequest.Payload.Content.String -> this.value
    is CommunicationRequest.Payload.Content.Attachment -> this.value
    is CommunicationRequest.Payload.Content.Reference -> this.value
    is CommunicationRequest.Occurrence.DateTime -> this.value
    is CommunicationRequest.Occurrence.Period -> this.value
    is MedicinalProductInteraction.Interactant.Item.Reference -> this.value
    is MedicinalProductInteraction.Interactant.Item.CodeableConcept -> this.value
    is GuidanceResponse.Module.Uri -> this.value
    is GuidanceResponse.Module.Canonical -> this.value
    is GuidanceResponse.Module.CodeableConcept -> this.value
    is DetectedIssue.Identified.DateTime -> this.value
    is DetectedIssue.Identified.Period -> this.value
    is ResearchDefinition.Subject.CodeableConcept -> this.value
    is ResearchDefinition.Subject.Reference -> this.value
    is EvidenceVariable.Characteristic.Definition.Reference -> this.value
    is EvidenceVariable.Characteristic.Definition.Canonical -> this.value
    is EvidenceVariable.Characteristic.Definition.CodeableConcept -> this.value
    is EvidenceVariable.Characteristic.Definition.Expression -> this.value
    is EvidenceVariable.Characteristic.Definition.DataRequirement -> this.value
    is EvidenceVariable.Characteristic.Definition.TriggerDefinition -> this.value
    is EvidenceVariable.Characteristic.ParticipantEffective.DateTime -> this.value
    is EvidenceVariable.Characteristic.ParticipantEffective.Period -> this.value
    is EvidenceVariable.Characteristic.ParticipantEffective.Duration -> this.value
    is EvidenceVariable.Characteristic.ParticipantEffective.Timing -> this.value
    is MessageDefinition.Event.Coding -> this.value
    is MessageDefinition.Event.Uri -> this.value
    is ImplementationGuide.Definition.Resource.Example.Boolean -> this.value
    is ImplementationGuide.Definition.Resource.Example.Canonical -> this.value
    is ImplementationGuide.Definition.Page.Name.Url -> this.value
    is ImplementationGuide.Definition.Page.Name.Reference -> this.value
    is ImplementationGuide.Manifest.Resource.Example.Boolean -> this.value
    is ImplementationGuide.Manifest.Resource.Example.Canonical -> this.value
    is NutritionOrder.EnteralFormula.Administration.Rate.Quantity -> this.value
    is NutritionOrder.EnteralFormula.Administration.Rate.Ratio -> this.value
    is CoverageEligibilityRequest.Serviced.Date -> this.value
    is CoverageEligibilityRequest.Serviced.Period -> this.value
    is CoverageEligibilityRequest.Item.Diagnosis.Diagnosis.CodeableConcept -> this.value
    is CoverageEligibilityRequest.Item.Diagnosis.Diagnosis.Reference -> this.value
    is CodeSystem.Concept.Property.Value.Code -> this.value
    is CodeSystem.Concept.Property.Value.Coding -> this.value
    is CodeSystem.Concept.Property.Value.String -> this.value
    is CodeSystem.Concept.Property.Value.Integer -> this.value
    is CodeSystem.Concept.Property.Value.Boolean -> this.value
    is CodeSystem.Concept.Property.Value.DateTime -> this.value
    is CodeSystem.Concept.Property.Value.Decimal -> this.value
    is MedicationRequest.Reported.Boolean -> this.value
    is MedicationRequest.Reported.Reference -> this.value
    is MedicationRequest.Medication.CodeableConcept -> this.value
    is MedicationRequest.Medication.Reference -> this.value
    is MedicationRequest.Substitution.Allowed.Boolean -> this.value
    is MedicationRequest.Substitution.Allowed.CodeableConcept -> this.value
    is ImmunizationRecommendation.Recommendation.DoseNumber.PositiveInt -> this.value
    is ImmunizationRecommendation.Recommendation.DoseNumber.String -> this.value
    is ImmunizationRecommendation.Recommendation.SeriesDoses.PositiveInt -> this.value
    is ImmunizationRecommendation.Recommendation.SeriesDoses.String -> this.value
    is Coverage.CostToBeneficiary.Value.Quantity -> this.value
    is Coverage.CostToBeneficiary.Value.Money -> this.value
    is MedicationKnowledge.Ingredient.Item.CodeableConcept -> this.value
    is MedicationKnowledge.Ingredient.Item.Reference -> this.value
    is MedicationKnowledge.AdministrationGuidelines.Indication.CodeableConcept -> this.value
    is MedicationKnowledge.AdministrationGuidelines.Indication.Reference -> this.value
    is MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics.Characteristic.CodeableConcept ->
      this.value
    is MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics.Characteristic.Quantity ->
      this.value
    is MedicationKnowledge.DrugCharacteristic.Value.CodeableConcept -> this.value
    else -> null
  }

private fun Any.unwrapChoiceValue3(): Any? =
  when (this) {
    is MedicationKnowledge.DrugCharacteristic.Value.String -> this.value
    is MedicationKnowledge.DrugCharacteristic.Value.Quantity -> this.value
    is MedicationKnowledge.DrugCharacteristic.Value.Base64Binary -> this.value
    is SubstanceReferenceInformation.Target.Amount.Quantity -> this.value
    is SubstanceReferenceInformation.Target.Amount.Range -> this.value
    is SubstanceReferenceInformation.Target.Amount.String -> this.value
    is ImmunizationEvaluation.DoseNumber.PositiveInt -> this.value
    is ImmunizationEvaluation.DoseNumber.String -> this.value
    is ImmunizationEvaluation.SeriesDoses.PositiveInt -> this.value
    is ImmunizationEvaluation.SeriesDoses.String -> this.value
    is MedicationStatement.Medication.CodeableConcept -> this.value
    is MedicationStatement.Medication.Reference -> this.value
    is MedicationStatement.Effective.DateTime -> this.value
    is MedicationStatement.Effective.Period -> this.value
    is AllergyIntolerance.Onset.DateTime -> this.value
    is AllergyIntolerance.Onset.Age -> this.value
    is AllergyIntolerance.Onset.Period -> this.value
    is AllergyIntolerance.Onset.Range -> this.value
    is AllergyIntolerance.Onset.String -> this.value
    is PlanDefinition.Subject.CodeableConcept -> this.value
    is PlanDefinition.Subject.Reference -> this.value
    is PlanDefinition.Goal.Target.Detail.Quantity -> this.value
    is PlanDefinition.Goal.Target.Detail.Range -> this.value
    is PlanDefinition.Goal.Target.Detail.CodeableConcept -> this.value
    is PlanDefinition.Action.Subject.CodeableConcept -> this.value
    is PlanDefinition.Action.Subject.Reference -> this.value
    is PlanDefinition.Action.RelatedAction.Offset.Duration -> this.value
    is PlanDefinition.Action.RelatedAction.Offset.Range -> this.value
    is PlanDefinition.Action.Timing.DateTime -> this.value
    is PlanDefinition.Action.Timing.Age -> this.value
    is PlanDefinition.Action.Timing.Period -> this.value
    is PlanDefinition.Action.Timing.Duration -> this.value
    is PlanDefinition.Action.Timing.Range -> this.value
    is PlanDefinition.Action.Timing.Timing -> this.value
    is PlanDefinition.Action.Definition.Canonical -> this.value
    is PlanDefinition.Action.Definition.Uri -> this.value
    is ClinicalImpression.Effective.DateTime -> this.value
    is ClinicalImpression.Effective.Period -> this.value
    is Consent.Source.Attachment -> this.value
    is Consent.Source.Reference -> this.value
    is Communication.Payload.Content.String -> this.value
    is Communication.Payload.Content.Attachment -> this.value
    is Communication.Payload.Content.Reference -> this.value
    is Library.Subject.CodeableConcept -> this.value
    is Library.Subject.Reference -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Base64Binary -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Boolean -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Canonical -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Code -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Date -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.DateTime -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Decimal -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Id -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Instant -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Integer -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Markdown -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Oid -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.PositiveInt -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.String -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Time -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.UnsignedInt -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Uri -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Url -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Uuid -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Address -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Age -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Annotation -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Attachment -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.CodeableConcept -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Coding -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.ContactPoint -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Count -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Distance -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Duration -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.HumanName -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Identifier -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Money -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Period -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Quantity -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Range -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Ratio -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Reference -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.SampledData -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Signature -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Timing -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.ContactDetail -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Contributor -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.DataRequirement -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Expression -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.ParameterDefinition -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.RelatedArtifact -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.TriggerDefinition -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.UsageContext -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Dosage -> this.value
    is StructureMap.Group.Rule.Source.DefaultValue.Meta -> this.value
    is StructureMap.Group.Rule.Target.Parameter.Value.Id -> this.value
    is StructureMap.Group.Rule.Target.Parameter.Value.String -> this.value
    is StructureMap.Group.Rule.Target.Parameter.Value.Boolean -> this.value
    is StructureMap.Group.Rule.Target.Parameter.Value.Integer -> this.value
    is StructureMap.Group.Rule.Target.Parameter.Value.Decimal -> this.value
    is Task.Input.Value.Base64Binary -> this.value
    is Task.Input.Value.Boolean -> this.value
    is Task.Input.Value.Canonical -> this.value
    is Task.Input.Value.Code -> this.value
    is Task.Input.Value.Date -> this.value
    is Task.Input.Value.DateTime -> this.value
    is Task.Input.Value.Decimal -> this.value
    is Task.Input.Value.Id -> this.value
    is Task.Input.Value.Instant -> this.value
    is Task.Input.Value.Integer -> this.value
    is Task.Input.Value.Markdown -> this.value
    is Task.Input.Value.Oid -> this.value
    is Task.Input.Value.PositiveInt -> this.value
    is Task.Input.Value.String -> this.value
    is Task.Input.Value.Time -> this.value
    is Task.Input.Value.UnsignedInt -> this.value
    is Task.Input.Value.Uri -> this.value
    is Task.Input.Value.Url -> this.value
    is Task.Input.Value.Uuid -> this.value
    is Task.Input.Value.Address -> this.value
    is Task.Input.Value.Age -> this.value
    is Task.Input.Value.Annotation -> this.value
    is Task.Input.Value.Attachment -> this.value
    is Task.Input.Value.CodeableConcept -> this.value
    is Task.Input.Value.Coding -> this.value
    is Task.Input.Value.ContactPoint -> this.value
    is Task.Input.Value.Count -> this.value
    is Task.Input.Value.Distance -> this.value
    is Task.Input.Value.Duration -> this.value
    is Task.Input.Value.HumanName -> this.value
    is Task.Input.Value.Identifier -> this.value
    is Task.Input.Value.Money -> this.value
    is Task.Input.Value.Period -> this.value
    is Task.Input.Value.Quantity -> this.value
    is Task.Input.Value.Range -> this.value
    is Task.Input.Value.Ratio -> this.value
    is Task.Input.Value.Reference -> this.value
    is Task.Input.Value.SampledData -> this.value
    is Task.Input.Value.Signature -> this.value
    is Task.Input.Value.Timing -> this.value
    is Task.Input.Value.ContactDetail -> this.value
    is Task.Input.Value.Contributor -> this.value
    is Task.Input.Value.DataRequirement -> this.value
    is Task.Input.Value.Expression -> this.value
    is Task.Input.Value.ParameterDefinition -> this.value
    is Task.Input.Value.RelatedArtifact -> this.value
    is Task.Input.Value.TriggerDefinition -> this.value
    is Task.Input.Value.UsageContext -> this.value
    is Task.Input.Value.Dosage -> this.value
    is Task.Input.Value.Meta -> this.value
    else -> null
  }

private fun Any.unwrapChoiceValue4(): Any? =
  when (this) {
    is Task.Output.Value.Base64Binary -> this.value
    is Task.Output.Value.Boolean -> this.value
    is Task.Output.Value.Canonical -> this.value
    is Task.Output.Value.Code -> this.value
    is Task.Output.Value.Date -> this.value
    is Task.Output.Value.DateTime -> this.value
    is Task.Output.Value.Decimal -> this.value
    is Task.Output.Value.Id -> this.value
    is Task.Output.Value.Instant -> this.value
    is Task.Output.Value.Integer -> this.value
    is Task.Output.Value.Markdown -> this.value
    is Task.Output.Value.Oid -> this.value
    is Task.Output.Value.PositiveInt -> this.value
    is Task.Output.Value.String -> this.value
    is Task.Output.Value.Time -> this.value
    is Task.Output.Value.UnsignedInt -> this.value
    is Task.Output.Value.Uri -> this.value
    is Task.Output.Value.Url -> this.value
    is Task.Output.Value.Uuid -> this.value
    is Task.Output.Value.Address -> this.value
    is Task.Output.Value.Age -> this.value
    is Task.Output.Value.Annotation -> this.value
    is Task.Output.Value.Attachment -> this.value
    is Task.Output.Value.CodeableConcept -> this.value
    is Task.Output.Value.Coding -> this.value
    is Task.Output.Value.ContactPoint -> this.value
    is Task.Output.Value.Count -> this.value
    is Task.Output.Value.Distance -> this.value
    is Task.Output.Value.Duration -> this.value
    is Task.Output.Value.HumanName -> this.value
    is Task.Output.Value.Identifier -> this.value
    is Task.Output.Value.Money -> this.value
    is Task.Output.Value.Period -> this.value
    is Task.Output.Value.Quantity -> this.value
    is Task.Output.Value.Range -> this.value
    is Task.Output.Value.Ratio -> this.value
    is Task.Output.Value.Reference -> this.value
    is Task.Output.Value.SampledData -> this.value
    is Task.Output.Value.Signature -> this.value
    is Task.Output.Value.Timing -> this.value
    is Task.Output.Value.ContactDetail -> this.value
    is Task.Output.Value.Contributor -> this.value
    is Task.Output.Value.DataRequirement -> this.value
    is Task.Output.Value.Expression -> this.value
    is Task.Output.Value.ParameterDefinition -> this.value
    is Task.Output.Value.RelatedArtifact -> this.value
    is Task.Output.Value.TriggerDefinition -> this.value
    is Task.Output.Value.UsageContext -> this.value
    is Task.Output.Value.Dosage -> this.value
    is Task.Output.Value.Meta -> this.value
    is MedicinalProductContraindication.OtherTherapy.Medication.CodeableConcept -> this.value
    is MedicinalProductContraindication.OtherTherapy.Medication.Reference -> this.value
    is Observation.Effective.DateTime -> this.value
    is Observation.Effective.Period -> this.value
    is Observation.Effective.Timing -> this.value
    is Observation.Effective.Instant -> this.value
    is Observation.Value.Quantity -> this.value
    is Observation.Value.CodeableConcept -> this.value
    is Observation.Value.String -> this.value
    is Observation.Value.Boolean -> this.value
    is Observation.Value.Integer -> this.value
    is Observation.Value.Range -> this.value
    is Observation.Value.Ratio -> this.value
    is Observation.Value.SampledData -> this.value
    is Observation.Value.Time -> this.value
    is Observation.Value.DateTime -> this.value
    is Observation.Value.Period -> this.value
    is Observation.Component.Value.Quantity -> this.value
    is Observation.Component.Value.CodeableConcept -> this.value
    is Observation.Component.Value.String -> this.value
    is Observation.Component.Value.Boolean -> this.value
    is Observation.Component.Value.Integer -> this.value
    is Observation.Component.Value.Range -> this.value
    is Observation.Component.Value.Ratio -> this.value
    is Observation.Component.Value.SampledData -> this.value
    is Observation.Component.Value.Time -> this.value
    is Observation.Component.Value.DateTime -> this.value
    is Observation.Component.Value.Period -> this.value
    is MedicationDispense.StatusReason.CodeableConcept -> this.value
    is MedicationDispense.StatusReason.Reference -> this.value
    is MedicationDispense.Medication.CodeableConcept -> this.value
    is MedicationDispense.Medication.Reference -> this.value
    is Procedure.Performed.DateTime -> this.value
    is Procedure.Performed.Period -> this.value
    is Procedure.Performed.String -> this.value
    is Procedure.Performed.Age -> this.value
    is Procedure.Performed.Range -> this.value
    is MedicinalProductAuthorization.Procedure.Date.Period -> this.value
    is MedicinalProductAuthorization.Procedure.Date.DateTime -> this.value
    else -> null
  }

internal fun Any.unwrapChoiceValue(): Any? {
  unwrapChoiceValue0()?.let {
    return it
  }
  unwrapChoiceValue1()?.let {
    return it
  }
  unwrapChoiceValue2()?.let {
    return it
  }
  unwrapChoiceValue3()?.let {
    return it
  }
  unwrapChoiceValue4()?.let {
    return it
  }
  return null
}
