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

package dev.ohs.fhir.model.r5.ext

import dev.ohs.fhir.model.r5.ActivityDefinition
import dev.ohs.fhir.model.r5.ActorDefinition
import dev.ohs.fhir.model.r5.AdministrableProductDefinition
import dev.ohs.fhir.model.r5.AdverseEvent
import dev.ohs.fhir.model.r5.AllergyIntolerance
import dev.ohs.fhir.model.r5.ArtifactAssessment
import dev.ohs.fhir.model.r5.AuditEvent
import dev.ohs.fhir.model.r5.BiologicallyDerivedProduct
import dev.ohs.fhir.model.r5.CapabilityStatement
import dev.ohs.fhir.model.r5.CareTeam
import dev.ohs.fhir.model.r5.ChargeItem
import dev.ohs.fhir.model.r5.ChargeItemDefinition
import dev.ohs.fhir.model.r5.Citation
import dev.ohs.fhir.model.r5.Claim
import dev.ohs.fhir.model.r5.ClaimResponse
import dev.ohs.fhir.model.r5.ClinicalImpression
import dev.ohs.fhir.model.r5.ClinicalUseDefinition
import dev.ohs.fhir.model.r5.CodeSystem
import dev.ohs.fhir.model.r5.Communication
import dev.ohs.fhir.model.r5.CommunicationRequest
import dev.ohs.fhir.model.r5.CompartmentDefinition
import dev.ohs.fhir.model.r5.ConceptMap
import dev.ohs.fhir.model.r5.Condition
import dev.ohs.fhir.model.r5.ConditionDefinition
import dev.ohs.fhir.model.r5.Contract
import dev.ohs.fhir.model.r5.Coverage
import dev.ohs.fhir.model.r5.CoverageEligibilityRequest
import dev.ohs.fhir.model.r5.CoverageEligibilityResponse
import dev.ohs.fhir.model.r5.DetectedIssue
import dev.ohs.fhir.model.r5.Device
import dev.ohs.fhir.model.r5.DeviceDefinition
import dev.ohs.fhir.model.r5.DeviceRequest
import dev.ohs.fhir.model.r5.DeviceUsage
import dev.ohs.fhir.model.r5.DiagnosticReport
import dev.ohs.fhir.model.r5.DocumentReference
import dev.ohs.fhir.model.r5.EventDefinition
import dev.ohs.fhir.model.r5.Evidence
import dev.ohs.fhir.model.r5.EvidenceReport
import dev.ohs.fhir.model.r5.EvidenceVariable
import dev.ohs.fhir.model.r5.ExampleScenario
import dev.ohs.fhir.model.r5.ExplanationOfBenefit
import dev.ohs.fhir.model.r5.FamilyMemberHistory
import dev.ohs.fhir.model.r5.GenomicStudy
import dev.ohs.fhir.model.r5.Goal
import dev.ohs.fhir.model.r5.GraphDefinition
import dev.ohs.fhir.model.r5.Group
import dev.ohs.fhir.model.r5.GuidanceResponse
import dev.ohs.fhir.model.r5.Immunization
import dev.ohs.fhir.model.r5.ImplementationGuide
import dev.ohs.fhir.model.r5.Ingredient
import dev.ohs.fhir.model.r5.InventoryItem
import dev.ohs.fhir.model.r5.Invoice
import dev.ohs.fhir.model.r5.Library
import dev.ohs.fhir.model.r5.ManufacturedItemDefinition
import dev.ohs.fhir.model.r5.Measure
import dev.ohs.fhir.model.r5.MeasureReport
import dev.ohs.fhir.model.r5.Medication
import dev.ohs.fhir.model.r5.MedicationAdministration
import dev.ohs.fhir.model.r5.MedicationKnowledge
import dev.ohs.fhir.model.r5.MedicationRequest
import dev.ohs.fhir.model.r5.MedicationStatement
import dev.ohs.fhir.model.r5.MedicinalProductDefinition
import dev.ohs.fhir.model.r5.MessageDefinition
import dev.ohs.fhir.model.r5.MessageHeader
import dev.ohs.fhir.model.r5.MolecularSequence
import dev.ohs.fhir.model.r5.NamingSystem
import dev.ohs.fhir.model.r5.NutritionIntake
import dev.ohs.fhir.model.r5.NutritionOrder
import dev.ohs.fhir.model.r5.NutritionProduct
import dev.ohs.fhir.model.r5.Observation
import dev.ohs.fhir.model.r5.ObservationDefinition
import dev.ohs.fhir.model.r5.OperationDefinition
import dev.ohs.fhir.model.r5.PackagedProductDefinition
import dev.ohs.fhir.model.r5.Parameters
import dev.ohs.fhir.model.r5.Patient
import dev.ohs.fhir.model.r5.PaymentReconciliation
import dev.ohs.fhir.model.r5.Person
import dev.ohs.fhir.model.r5.PlanDefinition
import dev.ohs.fhir.model.r5.Practitioner
import dev.ohs.fhir.model.r5.Procedure
import dev.ohs.fhir.model.r5.Provenance
import dev.ohs.fhir.model.r5.Questionnaire
import dev.ohs.fhir.model.r5.QuestionnaireResponse
import dev.ohs.fhir.model.r5.RegulatedAuthorization
import dev.ohs.fhir.model.r5.RequestOrchestration
import dev.ohs.fhir.model.r5.Requirements
import dev.ohs.fhir.model.r5.RiskAssessment
import dev.ohs.fhir.model.r5.SearchParameter
import dev.ohs.fhir.model.r5.ServiceRequest
import dev.ohs.fhir.model.r5.Specimen
import dev.ohs.fhir.model.r5.SpecimenDefinition
import dev.ohs.fhir.model.r5.StructureDefinition
import dev.ohs.fhir.model.r5.StructureMap
import dev.ohs.fhir.model.r5.SubscriptionTopic
import dev.ohs.fhir.model.r5.Substance
import dev.ohs.fhir.model.r5.SubstanceDefinition
import dev.ohs.fhir.model.r5.SubstanceReferenceInformation
import dev.ohs.fhir.model.r5.SupplyDelivery
import dev.ohs.fhir.model.r5.SupplyRequest
import dev.ohs.fhir.model.r5.Task
import dev.ohs.fhir.model.r5.TerminologyCapabilities
import dev.ohs.fhir.model.r5.TestPlan
import dev.ohs.fhir.model.r5.TestReport
import dev.ohs.fhir.model.r5.TestScript
import dev.ohs.fhir.model.r5.Transport
import dev.ohs.fhir.model.r5.ValueSet
import kotlin.Any
import kotlin.Boolean
import kotlin.String

private fun Any.getPropertyInChoiceValue0(name: String): Any? =
  when (this) {
    is SubscriptionTopic.VersionAlgorithm.String -> this.value.getProperty(name)
    is SubscriptionTopic.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is RequestOrchestration.Action.RelatedAction.Offset.Duration -> this.value.getProperty(name)
    is RequestOrchestration.Action.RelatedAction.Offset.Range -> this.value.getProperty(name)
    is RequestOrchestration.Action.Timing.DateTime -> this.value.getProperty(name)
    is RequestOrchestration.Action.Timing.Age -> this.value.getProperty(name)
    is RequestOrchestration.Action.Timing.Period -> this.value.getProperty(name)
    is RequestOrchestration.Action.Timing.Duration -> this.value.getProperty(name)
    is RequestOrchestration.Action.Timing.Range -> this.value.getProperty(name)
    is RequestOrchestration.Action.Timing.Timing -> this.value.getProperty(name)
    is RequestOrchestration.Action.Participant.Actor.Canonical -> this.value.getProperty(name)
    is RequestOrchestration.Action.Participant.Actor.Reference -> this.value.getProperty(name)
    is RequestOrchestration.Action.Definition.Canonical -> this.value.getProperty(name)
    is RequestOrchestration.Action.Definition.Uri -> this.value.getProperty(name)
    is ArtifactAssessment.CiteAs.Reference -> this.value.getProperty(name)
    is ArtifactAssessment.CiteAs.Markdown -> this.value.getProperty(name)
    is ArtifactAssessment.Artifact.Reference -> this.value.getProperty(name)
    is ArtifactAssessment.Artifact.Canonical -> this.value.getProperty(name)
    is ArtifactAssessment.Artifact.Uri -> this.value.getProperty(name)
    is ExampleScenario.VersionAlgorithm.String -> this.value.getProperty(name)
    is ExampleScenario.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is ExampleScenario.Instance.StructureProfile.Canonical -> this.value.getProperty(name)
    is ExampleScenario.Instance.StructureProfile.Uri -> this.value.getProperty(name)
    is ActorDefinition.VersionAlgorithm.String -> this.value.getProperty(name)
    is ActorDefinition.VersionAlgorithm.Coding -> this.value.getProperty(name)
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
    is SupplyDelivery.SuppliedItem.Item.CodeableConcept -> this.value.getProperty(name)
    is SupplyDelivery.SuppliedItem.Item.Reference -> this.value.getProperty(name)
    is SupplyDelivery.Occurrence.DateTime -> this.value.getProperty(name)
    is SupplyDelivery.Occurrence.Period -> this.value.getProperty(name)
    is SupplyDelivery.Occurrence.Timing -> this.value.getProperty(name)
    is MedicationAdministration.Occurence.DateTime -> this.value.getProperty(name)
    is MedicationAdministration.Occurence.Period -> this.value.getProperty(name)
    is MedicationAdministration.Occurence.Timing -> this.value.getProperty(name)
    is MedicationAdministration.Dosage.Rate.Ratio -> this.value.getProperty(name)
    is MedicationAdministration.Dosage.Rate.Quantity -> this.value.getProperty(name)
    is Claim.Event.When.DateTime -> this.value.getProperty(name)
    is Claim.Event.When.Period -> this.value.getProperty(name)
    is Claim.SupportingInfo.Timing.Date -> this.value.getProperty(name)
    is Claim.SupportingInfo.Timing.Period -> this.value.getProperty(name)
    is Claim.SupportingInfo.Value.Boolean -> this.value.getProperty(name)
    is Claim.SupportingInfo.Value.String -> this.value.getProperty(name)
    is Claim.SupportingInfo.Value.Quantity -> this.value.getProperty(name)
    is Claim.SupportingInfo.Value.Attachment -> this.value.getProperty(name)
    is Claim.SupportingInfo.Value.Reference -> this.value.getProperty(name)
    is Claim.SupportingInfo.Value.Identifier -> this.value.getProperty(name)
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
    is AuditEvent.Occurred.Period -> this.value.getProperty(name)
    is AuditEvent.Occurred.DateTime -> this.value.getProperty(name)
    is AuditEvent.Agent.Network.Reference -> this.value.getProperty(name)
    is AuditEvent.Agent.Network.Uri -> this.value.getProperty(name)
    is AuditEvent.Agent.Network.String -> this.value.getProperty(name)
    is AuditEvent.Entity.Detail.Value.Quantity -> this.value.getProperty(name)
    is AuditEvent.Entity.Detail.Value.CodeableConcept -> this.value.getProperty(name)
    is AuditEvent.Entity.Detail.Value.String -> this.value.getProperty(name)
    is AuditEvent.Entity.Detail.Value.Boolean -> this.value.getProperty(name)
    is AuditEvent.Entity.Detail.Value.Integer -> this.value.getProperty(name)
    is AuditEvent.Entity.Detail.Value.Range -> this.value.getProperty(name)
    is AuditEvent.Entity.Detail.Value.Ratio -> this.value.getProperty(name)
    is AuditEvent.Entity.Detail.Value.Time -> this.value.getProperty(name)
    is AuditEvent.Entity.Detail.Value.DateTime -> this.value.getProperty(name)
    is AuditEvent.Entity.Detail.Value.Period -> this.value.getProperty(name)
    is AuditEvent.Entity.Detail.Value.Base64Binary -> this.value.getProperty(name)
    is ServiceRequest.OrderDetail.Parameter.Value.Quantity -> this.value.getProperty(name)
    is ServiceRequest.OrderDetail.Parameter.Value.Ratio -> this.value.getProperty(name)
    is ServiceRequest.OrderDetail.Parameter.Value.Range -> this.value.getProperty(name)
    is ServiceRequest.OrderDetail.Parameter.Value.Boolean -> this.value.getProperty(name)
    is ServiceRequest.OrderDetail.Parameter.Value.CodeableConcept -> this.value.getProperty(name)
    is ServiceRequest.OrderDetail.Parameter.Value.String -> this.value.getProperty(name)
    is ServiceRequest.OrderDetail.Parameter.Value.Period -> this.value.getProperty(name)
    is ServiceRequest.Quantity.Quantity -> this.value.getProperty(name)
    is ServiceRequest.Quantity.Ratio -> this.value.getProperty(name)
    is ServiceRequest.Quantity.Range -> this.value.getProperty(name)
    is ServiceRequest.Occurrence.DateTime -> this.value.getProperty(name)
    is ServiceRequest.Occurrence.Period -> this.value.getProperty(name)
    is ServiceRequest.Occurrence.Timing -> this.value.getProperty(name)
    is ServiceRequest.AsNeeded.Boolean -> this.value.getProperty(name)
    is ServiceRequest.AsNeeded.CodeableConcept -> this.value.getProperty(name)
    is ServiceRequest.PatientInstruction.Instruction.Markdown -> this.value.getProperty(name)
    is ServiceRequest.PatientInstruction.Instruction.Reference -> this.value.getProperty(name)
    is NutritionIntake.Occurrence.DateTime -> this.value.getProperty(name)
    is NutritionIntake.Occurrence.Period -> this.value.getProperty(name)
    is NutritionIntake.Reported.Boolean -> this.value.getProperty(name)
    is NutritionIntake.Reported.Reference -> this.value.getProperty(name)
    is EventDefinition.VersionAlgorithm.String -> this.value.getProperty(name)
    is EventDefinition.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is EventDefinition.Subject.CodeableConcept -> this.value.getProperty(name)
    is EventDefinition.Subject.Reference -> this.value.getProperty(name)
    is CoverageEligibilityResponse.Event.When.DateTime -> this.value.getProperty(name)
    is CoverageEligibilityResponse.Event.When.Period -> this.value.getProperty(name)
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
    is Citation.VersionAlgorithm.String -> this.value.getProperty(name)
    is Citation.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is Measure.VersionAlgorithm.String -> this.value.getProperty(name)
    is Measure.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is Measure.Subject.CodeableConcept -> this.value.getProperty(name)
    is Measure.Subject.Reference -> this.value.getProperty(name)
    is Measure.Group.Subject.CodeableConcept -> this.value.getProperty(name)
    is Measure.Group.Subject.Reference -> this.value.getProperty(name)
    is ActivityDefinition.VersionAlgorithm.String -> this.value.getProperty(name)
    is ActivityDefinition.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is ActivityDefinition.Subject.CodeableConcept -> this.value.getProperty(name)
    is ActivityDefinition.Subject.Reference -> this.value.getProperty(name)
    is ActivityDefinition.Subject.Canonical -> this.value.getProperty(name)
    is ActivityDefinition.Timing.Timing -> this.value.getProperty(name)
    is ActivityDefinition.Timing.Age -> this.value.getProperty(name)
    is ActivityDefinition.Timing.Range -> this.value.getProperty(name)
    is ActivityDefinition.Timing.Duration -> this.value.getProperty(name)
    is ActivityDefinition.AsNeeded.Boolean -> this.value.getProperty(name)
    else -> null
  }

private fun Any.getPropertyInChoiceValue1(name: String): Any? =
  when (this) {
    is ActivityDefinition.AsNeeded.CodeableConcept -> this.value.getProperty(name)
    is ActivityDefinition.Product.Reference -> this.value.getProperty(name)
    is ActivityDefinition.Product.CodeableConcept -> this.value.getProperty(name)
    is DeviceRequest.Parameter.Value.CodeableConcept -> this.value.getProperty(name)
    is DeviceRequest.Parameter.Value.Quantity -> this.value.getProperty(name)
    is DeviceRequest.Parameter.Value.Range -> this.value.getProperty(name)
    is DeviceRequest.Parameter.Value.Boolean -> this.value.getProperty(name)
    is DeviceRequest.Occurrence.DateTime -> this.value.getProperty(name)
    is DeviceRequest.Occurrence.Period -> this.value.getProperty(name)
    is DeviceRequest.Occurrence.Timing -> this.value.getProperty(name)
    is CapabilityStatement.VersionAlgorithm.String -> this.value.getProperty(name)
    is CapabilityStatement.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is Substance.Ingredient.Substance.CodeableConcept -> this.value.getProperty(name)
    is Substance.Ingredient.Substance.Reference -> this.value.getProperty(name)
    is Group.Characteristic.Value.CodeableConcept -> this.value.getProperty(name)
    is Group.Characteristic.Value.Boolean -> this.value.getProperty(name)
    is Group.Characteristic.Value.Quantity -> this.value.getProperty(name)
    is Group.Characteristic.Value.Range -> this.value.getProperty(name)
    is Group.Characteristic.Value.Reference -> this.value.getProperty(name)
    is MolecularSequence.Relative.StartingSequence.Sequence.CodeableConcept ->
      this.value.getProperty(name)
    is MolecularSequence.Relative.StartingSequence.Sequence.String -> this.value.getProperty(name)
    is MolecularSequence.Relative.StartingSequence.Sequence.Reference ->
      this.value.getProperty(name)
    is RegulatedAuthorization.Case.Date.Period -> this.value.getProperty(name)
    is RegulatedAuthorization.Case.Date.DateTime -> this.value.getProperty(name)
    is ChargeItemDefinition.VersionAlgorithm.String -> this.value.getProperty(name)
    is ChargeItemDefinition.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is Questionnaire.VersionAlgorithm.String -> this.value.getProperty(name)
    is Questionnaire.VersionAlgorithm.Coding -> this.value.getProperty(name)
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
    is Questionnaire.Item.Initial.Value.String -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.Uri -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.Attachment -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.Coding -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.Quantity -> this.value.getProperty(name)
    is Questionnaire.Item.Initial.Value.Reference -> this.value.getProperty(name)
    is TestScript.VersionAlgorithm.String -> this.value.getProperty(name)
    is TestScript.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is TestScript.Setup.Action.Assert.Requirement.Link.Uri -> this.value.getProperty(name)
    is TestScript.Setup.Action.Assert.Requirement.Link.Canonical -> this.value.getProperty(name)
    is TestReport.Setup.Action.Assert.Requirement.Link.Uri -> this.value.getProperty(name)
    is TestReport.Setup.Action.Assert.Requirement.Link.Canonical -> this.value.getProperty(name)
    is DeviceUsage.Timing.Timing -> this.value.getProperty(name)
    is DeviceUsage.Timing.Period -> this.value.getProperty(name)
    is DeviceUsage.Timing.DateTime -> this.value.getProperty(name)
    is MeasureReport.Group.MeasureScore.Quantity -> this.value.getProperty(name)
    is MeasureReport.Group.MeasureScore.DateTime -> this.value.getProperty(name)
    is MeasureReport.Group.MeasureScore.CodeableConcept -> this.value.getProperty(name)
    is MeasureReport.Group.MeasureScore.Period -> this.value.getProperty(name)
    is MeasureReport.Group.MeasureScore.Range -> this.value.getProperty(name)
    is MeasureReport.Group.MeasureScore.Duration -> this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Value.CodeableConcept -> this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Value.Boolean -> this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Value.Quantity -> this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Value.Range -> this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Value.Reference -> this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Component.Value.CodeableConcept ->
      this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Component.Value.Boolean ->
      this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Component.Value.Quantity ->
      this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Component.Value.Range -> this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Component.Value.Reference ->
      this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.Quantity -> this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.DateTime -> this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.CodeableConcept ->
      this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.Period -> this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.Range -> this.value.getProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.Duration -> this.value.getProperty(name)
    is SubstanceDefinition.Moiety.Amount.Quantity -> this.value.getProperty(name)
    is SubstanceDefinition.Moiety.Amount.String -> this.value.getProperty(name)
    is SubstanceDefinition.Property.Value.CodeableConcept -> this.value.getProperty(name)
    is SubstanceDefinition.Property.Value.Quantity -> this.value.getProperty(name)
    is SubstanceDefinition.Property.Value.Date -> this.value.getProperty(name)
    is SubstanceDefinition.Property.Value.Boolean -> this.value.getProperty(name)
    is SubstanceDefinition.Property.Value.Attachment -> this.value.getProperty(name)
    is SubstanceDefinition.Relationship.SubstanceDefinition.Reference ->
      this.value.getProperty(name)
    is SubstanceDefinition.Relationship.SubstanceDefinition.CodeableConcept ->
      this.value.getProperty(name)
    is SubstanceDefinition.Relationship.Amount.Quantity -> this.value.getProperty(name)
    is SubstanceDefinition.Relationship.Amount.Ratio -> this.value.getProperty(name)
    is SubstanceDefinition.Relationship.Amount.String -> this.value.getProperty(name)
    is SupplyRequest.Parameter.Value.CodeableConcept -> this.value.getProperty(name)
    is SupplyRequest.Parameter.Value.Quantity -> this.value.getProperty(name)
    is SupplyRequest.Parameter.Value.Range -> this.value.getProperty(name)
    is SupplyRequest.Parameter.Value.Boolean -> this.value.getProperty(name)
    is SupplyRequest.Occurrence.DateTime -> this.value.getProperty(name)
    is SupplyRequest.Occurrence.Period -> this.value.getProperty(name)
    is SupplyRequest.Occurrence.Timing -> this.value.getProperty(name)
    is GenomicStudy.Analysis.Input.GeneratedBy.Identifier -> this.value.getProperty(name)
    is GenomicStudy.Analysis.Input.GeneratedBy.Reference -> this.value.getProperty(name)
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
    is Parameters.Parameter.Value.Integer64 -> this.value.getProperty(name)
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
    is Parameters.Parameter.Value.CodeableReference -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Coding -> this.value.getProperty(name)
    is Parameters.Parameter.Value.ContactPoint -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Count -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Distance -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Duration -> this.value.getProperty(name)
    is Parameters.Parameter.Value.HumanName -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Identifier -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Money -> this.value.getProperty(name)
    else -> null
  }

private fun Any.getPropertyInChoiceValue2(name: String): Any? =
  when (this) {
    is Parameters.Parameter.Value.Period -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Quantity -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Range -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Ratio -> this.value.getProperty(name)
    is Parameters.Parameter.Value.RatioRange -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Reference -> this.value.getProperty(name)
    is Parameters.Parameter.Value.SampledData -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Signature -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Timing -> this.value.getProperty(name)
    is Parameters.Parameter.Value.ContactDetail -> this.value.getProperty(name)
    is Parameters.Parameter.Value.DataRequirement -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Expression -> this.value.getProperty(name)
    is Parameters.Parameter.Value.ParameterDefinition -> this.value.getProperty(name)
    is Parameters.Parameter.Value.RelatedArtifact -> this.value.getProperty(name)
    is Parameters.Parameter.Value.TriggerDefinition -> this.value.getProperty(name)
    is Parameters.Parameter.Value.UsageContext -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Availability -> this.value.getProperty(name)
    is Parameters.Parameter.Value.ExtendedContactDetail -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Dosage -> this.value.getProperty(name)
    is Parameters.Parameter.Value.Meta -> this.value.getProperty(name)
    is Evidence.VersionAlgorithm.String -> this.value.getProperty(name)
    is Evidence.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is Evidence.CiteAs.Reference -> this.value.getProperty(name)
    is Evidence.CiteAs.Markdown -> this.value.getProperty(name)
    is NamingSystem.VersionAlgorithm.String -> this.value.getProperty(name)
    is NamingSystem.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is ExplanationOfBenefit.Event.When.DateTime -> this.value.getProperty(name)
    is ExplanationOfBenefit.Event.When.Period -> this.value.getProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Timing.Date -> this.value.getProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Timing.Period -> this.value.getProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Boolean -> this.value.getProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.String -> this.value.getProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Quantity -> this.value.getProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Attachment -> this.value.getProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Reference -> this.value.getProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Identifier -> this.value.getProperty(name)
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
    is PackagedProductDefinition.Packaging.Property.Value.CodeableConcept ->
      this.value.getProperty(name)
    is PackagedProductDefinition.Packaging.Property.Value.Quantity -> this.value.getProperty(name)
    is PackagedProductDefinition.Packaging.Property.Value.Date -> this.value.getProperty(name)
    is PackagedProductDefinition.Packaging.Property.Value.Boolean -> this.value.getProperty(name)
    is PackagedProductDefinition.Packaging.Property.Value.Attachment -> this.value.getProperty(name)
    is Patient.Deceased.Boolean -> this.value.getProperty(name)
    is Patient.Deceased.DateTime -> this.value.getProperty(name)
    is Patient.MultipleBirth.Boolean -> this.value.getProperty(name)
    is Patient.MultipleBirth.Integer -> this.value.getProperty(name)
    is ManufacturedItemDefinition.Property.Value.CodeableConcept -> this.value.getProperty(name)
    is ManufacturedItemDefinition.Property.Value.Quantity -> this.value.getProperty(name)
    is ManufacturedItemDefinition.Property.Value.Date -> this.value.getProperty(name)
    is ManufacturedItemDefinition.Property.Value.Boolean -> this.value.getProperty(name)
    is ManufacturedItemDefinition.Property.Value.Markdown -> this.value.getProperty(name)
    is ManufacturedItemDefinition.Property.Value.Attachment -> this.value.getProperty(name)
    is ManufacturedItemDefinition.Property.Value.Reference -> this.value.getProperty(name)
    is Specimen.Collection.Collected.DateTime -> this.value.getProperty(name)
    is Specimen.Collection.Collected.Period -> this.value.getProperty(name)
    is Specimen.Collection.FastingStatus.CodeableConcept -> this.value.getProperty(name)
    is Specimen.Collection.FastingStatus.Duration -> this.value.getProperty(name)
    is Specimen.Processing.Time.DateTime -> this.value.getProperty(name)
    is Specimen.Processing.Time.Period -> this.value.getProperty(name)
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
    is FamilyMemberHistory.Procedure.Performed.Age -> this.value.getProperty(name)
    is FamilyMemberHistory.Procedure.Performed.Range -> this.value.getProperty(name)
    is FamilyMemberHistory.Procedure.Performed.Period -> this.value.getProperty(name)
    is FamilyMemberHistory.Procedure.Performed.String -> this.value.getProperty(name)
    is FamilyMemberHistory.Procedure.Performed.DateTime -> this.value.getProperty(name)
    is OperationDefinition.VersionAlgorithm.String -> this.value.getProperty(name)
    is OperationDefinition.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is GraphDefinition.VersionAlgorithm.String -> this.value.getProperty(name)
    is GraphDefinition.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is Medication.Ingredient.Strength.Ratio -> this.value.getProperty(name)
    is Medication.Ingredient.Strength.CodeableConcept -> this.value.getProperty(name)
    is Medication.Ingredient.Strength.Quantity -> this.value.getProperty(name)
    is DiagnosticReport.Effective.DateTime -> this.value.getProperty(name)
    is DiagnosticReport.Effective.Period -> this.value.getProperty(name)
    is MessageHeader.Event.Coding -> this.value.getProperty(name)
    is MessageHeader.Event.Canonical -> this.value.getProperty(name)
    is MessageHeader.Destination.Endpoint.Url -> this.value.getProperty(name)
    is MessageHeader.Destination.Endpoint.Reference -> this.value.getProperty(name)
    is MessageHeader.Source.Endpoint.Url -> this.value.getProperty(name)
    is MessageHeader.Source.Endpoint.Reference -> this.value.getProperty(name)
    is DeviceDefinition.Property.Value.Quantity -> this.value.getProperty(name)
    is DeviceDefinition.Property.Value.CodeableConcept -> this.value.getProperty(name)
    is DeviceDefinition.Property.Value.String -> this.value.getProperty(name)
    is DeviceDefinition.Property.Value.Boolean -> this.value.getProperty(name)
    is DeviceDefinition.Property.Value.Integer -> this.value.getProperty(name)
    is DeviceDefinition.Property.Value.Range -> this.value.getProperty(name)
    is DeviceDefinition.Property.Value.Attachment -> this.value.getProperty(name)
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
    is ObservationDefinition.VersionAlgorithm.String -> this.value.getProperty(name)
    is ObservationDefinition.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is Immunization.Occurrence.DateTime -> this.value.getProperty(name)
    is Immunization.Occurrence.String -> this.value.getProperty(name)
    is ValueSet.VersionAlgorithm.String -> this.value.getProperty(name)
    is ValueSet.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is ValueSet.Expansion.Parameter.Value.String -> this.value.getProperty(name)
    is ValueSet.Expansion.Parameter.Value.Boolean -> this.value.getProperty(name)
    is ValueSet.Expansion.Parameter.Value.Integer -> this.value.getProperty(name)
    is ValueSet.Expansion.Parameter.Value.Decimal -> this.value.getProperty(name)
    is ValueSet.Expansion.Parameter.Value.Uri -> this.value.getProperty(name)
    is ValueSet.Expansion.Parameter.Value.Code -> this.value.getProperty(name)
    is ValueSet.Expansion.Parameter.Value.DateTime -> this.value.getProperty(name)
    is ValueSet.Expansion.Contains.Property.Value.Code -> this.value.getProperty(name)
    is ValueSet.Expansion.Contains.Property.Value.Coding -> this.value.getProperty(name)
    is ValueSet.Expansion.Contains.Property.Value.String -> this.value.getProperty(name)
    is ValueSet.Expansion.Contains.Property.Value.Integer -> this.value.getProperty(name)
    is ValueSet.Expansion.Contains.Property.Value.Boolean -> this.value.getProperty(name)
    else -> null
  }

private fun Any.getPropertyInChoiceValue3(name: String): Any? =
  when (this) {
    is ValueSet.Expansion.Contains.Property.Value.DateTime -> this.value.getProperty(name)
    is ValueSet.Expansion.Contains.Property.Value.Decimal -> this.value.getProperty(name)
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.Code -> this.value.getProperty(name)
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.Coding -> this.value.getProperty(name)
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.String -> this.value.getProperty(name)
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.Integer ->
      this.value.getProperty(name)
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.Boolean ->
      this.value.getProperty(name)
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.DateTime ->
      this.value.getProperty(name)
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.Decimal ->
      this.value.getProperty(name)
    is ClaimResponse.Event.When.DateTime -> this.value.getProperty(name)
    is ClaimResponse.Event.When.Period -> this.value.getProperty(name)
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
    is BiologicallyDerivedProduct.Property.Value.Boolean -> this.value.getProperty(name)
    is BiologicallyDerivedProduct.Property.Value.Integer -> this.value.getProperty(name)
    is BiologicallyDerivedProduct.Property.Value.CodeableConcept -> this.value.getProperty(name)
    is BiologicallyDerivedProduct.Property.Value.Period -> this.value.getProperty(name)
    is BiologicallyDerivedProduct.Property.Value.Quantity -> this.value.getProperty(name)
    is BiologicallyDerivedProduct.Property.Value.Range -> this.value.getProperty(name)
    is BiologicallyDerivedProduct.Property.Value.Ratio -> this.value.getProperty(name)
    is BiologicallyDerivedProduct.Property.Value.String -> this.value.getProperty(name)
    is BiologicallyDerivedProduct.Property.Value.Attachment -> this.value.getProperty(name)
    is InventoryItem.Characteristic.Value.String -> this.value.getProperty(name)
    is InventoryItem.Characteristic.Value.Integer -> this.value.getProperty(name)
    is InventoryItem.Characteristic.Value.Decimal -> this.value.getProperty(name)
    is InventoryItem.Characteristic.Value.Boolean -> this.value.getProperty(name)
    is InventoryItem.Characteristic.Value.Url -> this.value.getProperty(name)
    is InventoryItem.Characteristic.Value.DateTime -> this.value.getProperty(name)
    is InventoryItem.Characteristic.Value.Quantity -> this.value.getProperty(name)
    is InventoryItem.Characteristic.Value.Range -> this.value.getProperty(name)
    is InventoryItem.Characteristic.Value.Ratio -> this.value.getProperty(name)
    is InventoryItem.Characteristic.Value.Annotation -> this.value.getProperty(name)
    is InventoryItem.Characteristic.Value.Address -> this.value.getProperty(name)
    is InventoryItem.Characteristic.Value.Duration -> this.value.getProperty(name)
    is InventoryItem.Characteristic.Value.CodeableConcept -> this.value.getProperty(name)
    is TestPlan.VersionAlgorithm.String -> this.value.getProperty(name)
    is TestPlan.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is TestPlan.TestCase.TestRun.Script.Source.String -> this.value.getProperty(name)
    is TestPlan.TestCase.TestRun.Script.Source.Reference -> this.value.getProperty(name)
    is TestPlan.TestCase.TestData.Source.String -> this.value.getProperty(name)
    is TestPlan.TestCase.TestData.Source.Reference -> this.value.getProperty(name)
    is TerminologyCapabilities.VersionAlgorithm.String -> this.value.getProperty(name)
    is TerminologyCapabilities.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is ClinicalUseDefinition.Indication.Duration.Range -> this.value.getProperty(name)
    is ClinicalUseDefinition.Indication.Duration.String -> this.value.getProperty(name)
    is ClinicalUseDefinition.Interaction.Interactant.Item.Reference -> this.value.getProperty(name)
    is ClinicalUseDefinition.Interaction.Interactant.Item.CodeableConcept ->
      this.value.getProperty(name)
    is SpecimenDefinition.VersionAlgorithm.String -> this.value.getProperty(name)
    is SpecimenDefinition.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is SpecimenDefinition.Subject.CodeableConcept -> this.value.getProperty(name)
    is SpecimenDefinition.Subject.Reference -> this.value.getProperty(name)
    is SpecimenDefinition.TypeTested.Container.MinimumVolume.Quantity ->
      this.value.getProperty(name)
    is SpecimenDefinition.TypeTested.Container.MinimumVolume.String -> this.value.getProperty(name)
    is SpecimenDefinition.TypeTested.Container.Additive.Additive.CodeableConcept ->
      this.value.getProperty(name)
    is SpecimenDefinition.TypeTested.Container.Additive.Additive.Reference ->
      this.value.getProperty(name)
    is ConceptMap.VersionAlgorithm.String -> this.value.getProperty(name)
    is ConceptMap.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is ConceptMap.SourceScope.Uri -> this.value.getProperty(name)
    is ConceptMap.SourceScope.Canonical -> this.value.getProperty(name)
    is ConceptMap.TargetScope.Uri -> this.value.getProperty(name)
    is ConceptMap.TargetScope.Canonical -> this.value.getProperty(name)
    is ConceptMap.Group.Element.Target.Property.Value.Coding -> this.value.getProperty(name)
    is ConceptMap.Group.Element.Target.Property.Value.String -> this.value.getProperty(name)
    is ConceptMap.Group.Element.Target.Property.Value.Integer -> this.value.getProperty(name)
    is ConceptMap.Group.Element.Target.Property.Value.Boolean -> this.value.getProperty(name)
    is ConceptMap.Group.Element.Target.Property.Value.DateTime -> this.value.getProperty(name)
    is ConceptMap.Group.Element.Target.Property.Value.Decimal -> this.value.getProperty(name)
    is ConceptMap.Group.Element.Target.Property.Value.Code -> this.value.getProperty(name)
    is ConceptMap.Group.Element.Target.DependsOn.Value.Code -> this.value.getProperty(name)
    is ConceptMap.Group.Element.Target.DependsOn.Value.Coding -> this.value.getProperty(name)
    is ConceptMap.Group.Element.Target.DependsOn.Value.String -> this.value.getProperty(name)
    is ConceptMap.Group.Element.Target.DependsOn.Value.Boolean -> this.value.getProperty(name)
    is ConceptMap.Group.Element.Target.DependsOn.Value.Quantity -> this.value.getProperty(name)
    is Invoice.Period.Date -> this.value.getProperty(name)
    is Invoice.Period.Period -> this.value.getProperty(name)
    is Invoice.LineItem.Serviced.Date -> this.value.getProperty(name)
    is Invoice.LineItem.Serviced.Period -> this.value.getProperty(name)
    is Invoice.LineItem.ChargeItem.Reference -> this.value.getProperty(name)
    is Invoice.LineItem.ChargeItem.CodeableConcept -> this.value.getProperty(name)
    is StructureDefinition.VersionAlgorithm.String -> this.value.getProperty(name)
    is StructureDefinition.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is ConditionDefinition.VersionAlgorithm.String -> this.value.getProperty(name)
    is ConditionDefinition.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is ConditionDefinition.Precondition.Value.CodeableConcept -> this.value.getProperty(name)
    is ConditionDefinition.Precondition.Value.Quantity -> this.value.getProperty(name)
    is CommunicationRequest.Payload.Content.Attachment -> this.value.getProperty(name)
    is CommunicationRequest.Payload.Content.Reference -> this.value.getProperty(name)
    is CommunicationRequest.Payload.Content.CodeableConcept -> this.value.getProperty(name)
    is CommunicationRequest.Occurrence.DateTime -> this.value.getProperty(name)
    is CommunicationRequest.Occurrence.Period -> this.value.getProperty(name)
    is GuidanceResponse.Module.Uri -> this.value.getProperty(name)
    is GuidanceResponse.Module.Canonical -> this.value.getProperty(name)
    is GuidanceResponse.Module.CodeableConcept -> this.value.getProperty(name)
    is DetectedIssue.Identified.DateTime -> this.value.getProperty(name)
    is DetectedIssue.Identified.Period -> this.value.getProperty(name)
    is EvidenceVariable.VersionAlgorithm.String -> this.value.getProperty(name)
    is EvidenceVariable.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.CodeableConcept ->
      this.value.getProperty(name)
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Boolean ->
      this.value.getProperty(name)
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Quantity ->
      this.value.getProperty(name)
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Range ->
      this.value.getProperty(name)
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Reference ->
      this.value.getProperty(name)
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Id ->
      this.value.getProperty(name)
    is EvidenceVariable.Characteristic.Instances.Quantity -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.Instances.Range -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.Duration.Quantity -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.Duration.Range -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.TimeFromEvent.Event.CodeableConcept ->
      this.value.getProperty(name)
    is EvidenceVariable.Characteristic.TimeFromEvent.Event.Reference -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.TimeFromEvent.Event.DateTime -> this.value.getProperty(name)
    is EvidenceVariable.Characteristic.TimeFromEvent.Event.Id -> this.value.getProperty(name)
    is EvidenceVariable.Category.Value.CodeableConcept -> this.value.getProperty(name)
    is EvidenceVariable.Category.Value.Quantity -> this.value.getProperty(name)
    is EvidenceVariable.Category.Value.Range -> this.value.getProperty(name)
    is MessageDefinition.VersionAlgorithm.String -> this.value.getProperty(name)
    is MessageDefinition.VersionAlgorithm.Coding -> this.value.getProperty(name)
    else -> null
  }

private fun Any.getPropertyInChoiceValue4(name: String): Any? =
  when (this) {
    is MessageDefinition.Event.Coding -> this.value.getProperty(name)
    is MessageDefinition.Event.Uri -> this.value.getProperty(name)
    is ImplementationGuide.VersionAlgorithm.String -> this.value.getProperty(name)
    is ImplementationGuide.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is ImplementationGuide.Definition.Page.Source.Url -> this.value.getProperty(name)
    is ImplementationGuide.Definition.Page.Source.String -> this.value.getProperty(name)
    is ImplementationGuide.Definition.Page.Source.Markdown -> this.value.getProperty(name)
    is NutritionOrder.EnteralFormula.Administration.Rate.Quantity -> this.value.getProperty(name)
    is NutritionOrder.EnteralFormula.Administration.Rate.Ratio -> this.value.getProperty(name)
    is CoverageEligibilityRequest.Event.When.DateTime -> this.value.getProperty(name)
    is CoverageEligibilityRequest.Event.When.Period -> this.value.getProperty(name)
    is CoverageEligibilityRequest.Serviced.Date -> this.value.getProperty(name)
    is CoverageEligibilityRequest.Serviced.Period -> this.value.getProperty(name)
    is CoverageEligibilityRequest.Item.Diagnosis.Diagnosis.CodeableConcept ->
      this.value.getProperty(name)
    is CoverageEligibilityRequest.Item.Diagnosis.Diagnosis.Reference -> this.value.getProperty(name)
    is CodeSystem.VersionAlgorithm.String -> this.value.getProperty(name)
    is CodeSystem.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is CodeSystem.Concept.Property.Value.Code -> this.value.getProperty(name)
    is CodeSystem.Concept.Property.Value.Coding -> this.value.getProperty(name)
    is CodeSystem.Concept.Property.Value.String -> this.value.getProperty(name)
    is CodeSystem.Concept.Property.Value.Integer -> this.value.getProperty(name)
    is CodeSystem.Concept.Property.Value.Boolean -> this.value.getProperty(name)
    is CodeSystem.Concept.Property.Value.DateTime -> this.value.getProperty(name)
    is CodeSystem.Concept.Property.Value.Decimal -> this.value.getProperty(name)
    is MedicationRequest.Substitution.Allowed.Boolean -> this.value.getProperty(name)
    is MedicationRequest.Substitution.Allowed.CodeableConcept -> this.value.getProperty(name)
    is CompartmentDefinition.VersionAlgorithm.String -> this.value.getProperty(name)
    is CompartmentDefinition.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is Coverage.CostToBeneficiary.Value.Quantity -> this.value.getProperty(name)
    is Coverage.CostToBeneficiary.Value.Money -> this.value.getProperty(name)
    is PaymentReconciliation.Allocation.TargetItem.String -> this.value.getProperty(name)
    is PaymentReconciliation.Allocation.TargetItem.Identifier -> this.value.getProperty(name)
    is PaymentReconciliation.Allocation.TargetItem.PositiveInt -> this.value.getProperty(name)
    is MedicationKnowledge.Cost.Cost.Money -> this.value.getProperty(name)
    is MedicationKnowledge.Cost.Cost.CodeableConcept -> this.value.getProperty(name)
    is MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value.CodeableConcept ->
      this.value.getProperty(name)
    is MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value.Quantity ->
      this.value.getProperty(name)
    is MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value.Range ->
      this.value.getProperty(name)
    is MedicationKnowledge.MedicineClassification.Source.String -> this.value.getProperty(name)
    is MedicationKnowledge.MedicineClassification.Source.Uri -> this.value.getProperty(name)
    is MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value.Quantity ->
      this.value.getProperty(name)
    is MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value.Range ->
      this.value.getProperty(name)
    is MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value.CodeableConcept ->
      this.value.getProperty(name)
    is MedicationKnowledge.Definitional.Ingredient.Strength.Ratio -> this.value.getProperty(name)
    is MedicationKnowledge.Definitional.Ingredient.Strength.CodeableConcept ->
      this.value.getProperty(name)
    is MedicationKnowledge.Definitional.Ingredient.Strength.Quantity -> this.value.getProperty(name)
    is MedicationKnowledge.Definitional.DrugCharacteristic.Value.CodeableConcept ->
      this.value.getProperty(name)
    is MedicationKnowledge.Definitional.DrugCharacteristic.Value.String ->
      this.value.getProperty(name)
    is MedicationKnowledge.Definitional.DrugCharacteristic.Value.Quantity ->
      this.value.getProperty(name)
    is MedicationKnowledge.Definitional.DrugCharacteristic.Value.Base64Binary ->
      this.value.getProperty(name)
    is MedicationKnowledge.Definitional.DrugCharacteristic.Value.Attachment ->
      this.value.getProperty(name)
    is SubstanceReferenceInformation.Target.Amount.Quantity -> this.value.getProperty(name)
    is SubstanceReferenceInformation.Target.Amount.Range -> this.value.getProperty(name)
    is SubstanceReferenceInformation.Target.Amount.String -> this.value.getProperty(name)
    is SearchParameter.VersionAlgorithm.String -> this.value.getProperty(name)
    is SearchParameter.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is MedicationStatement.Effective.DateTime -> this.value.getProperty(name)
    is MedicationStatement.Effective.Period -> this.value.getProperty(name)
    is MedicationStatement.Effective.Timing -> this.value.getProperty(name)
    is Person.Deceased.Boolean -> this.value.getProperty(name)
    is Person.Deceased.DateTime -> this.value.getProperty(name)
    is AdministrableProductDefinition.Property.Value.CodeableConcept -> this.value.getProperty(name)
    is AdministrableProductDefinition.Property.Value.Quantity -> this.value.getProperty(name)
    is AdministrableProductDefinition.Property.Value.Date -> this.value.getProperty(name)
    is AdministrableProductDefinition.Property.Value.Boolean -> this.value.getProperty(name)
    is AdministrableProductDefinition.Property.Value.Markdown -> this.value.getProperty(name)
    is AdministrableProductDefinition.Property.Value.Attachment -> this.value.getProperty(name)
    is AdministrableProductDefinition.Property.Value.Reference -> this.value.getProperty(name)
    is AllergyIntolerance.Onset.DateTime -> this.value.getProperty(name)
    is AllergyIntolerance.Onset.Age -> this.value.getProperty(name)
    is AllergyIntolerance.Onset.Period -> this.value.getProperty(name)
    is AllergyIntolerance.Onset.Range -> this.value.getProperty(name)
    is AllergyIntolerance.Onset.String -> this.value.getProperty(name)
    is Transport.Input.Value.Base64Binary -> this.value.getProperty(name)
    is Transport.Input.Value.Boolean -> this.value.getProperty(name)
    is Transport.Input.Value.Canonical -> this.value.getProperty(name)
    is Transport.Input.Value.Code -> this.value.getProperty(name)
    is Transport.Input.Value.Date -> this.value.getProperty(name)
    is Transport.Input.Value.DateTime -> this.value.getProperty(name)
    is Transport.Input.Value.Decimal -> this.value.getProperty(name)
    is Transport.Input.Value.Id -> this.value.getProperty(name)
    is Transport.Input.Value.Instant -> this.value.getProperty(name)
    is Transport.Input.Value.Integer -> this.value.getProperty(name)
    is Transport.Input.Value.Integer64 -> this.value.getProperty(name)
    is Transport.Input.Value.Markdown -> this.value.getProperty(name)
    is Transport.Input.Value.Oid -> this.value.getProperty(name)
    is Transport.Input.Value.PositiveInt -> this.value.getProperty(name)
    is Transport.Input.Value.String -> this.value.getProperty(name)
    is Transport.Input.Value.Time -> this.value.getProperty(name)
    is Transport.Input.Value.UnsignedInt -> this.value.getProperty(name)
    is Transport.Input.Value.Uri -> this.value.getProperty(name)
    is Transport.Input.Value.Url -> this.value.getProperty(name)
    is Transport.Input.Value.Uuid -> this.value.getProperty(name)
    is Transport.Input.Value.Address -> this.value.getProperty(name)
    is Transport.Input.Value.Age -> this.value.getProperty(name)
    is Transport.Input.Value.Annotation -> this.value.getProperty(name)
    is Transport.Input.Value.Attachment -> this.value.getProperty(name)
    is Transport.Input.Value.CodeableConcept -> this.value.getProperty(name)
    is Transport.Input.Value.CodeableReference -> this.value.getProperty(name)
    is Transport.Input.Value.Coding -> this.value.getProperty(name)
    is Transport.Input.Value.ContactPoint -> this.value.getProperty(name)
    is Transport.Input.Value.Count -> this.value.getProperty(name)
    is Transport.Input.Value.Distance -> this.value.getProperty(name)
    is Transport.Input.Value.Duration -> this.value.getProperty(name)
    is Transport.Input.Value.HumanName -> this.value.getProperty(name)
    is Transport.Input.Value.Identifier -> this.value.getProperty(name)
    is Transport.Input.Value.Money -> this.value.getProperty(name)
    is Transport.Input.Value.Period -> this.value.getProperty(name)
    is Transport.Input.Value.Quantity -> this.value.getProperty(name)
    is Transport.Input.Value.Range -> this.value.getProperty(name)
    is Transport.Input.Value.Ratio -> this.value.getProperty(name)
    is Transport.Input.Value.RatioRange -> this.value.getProperty(name)
    is Transport.Input.Value.Reference -> this.value.getProperty(name)
    is Transport.Input.Value.SampledData -> this.value.getProperty(name)
    is Transport.Input.Value.Signature -> this.value.getProperty(name)
    is Transport.Input.Value.Timing -> this.value.getProperty(name)
    is Transport.Input.Value.ContactDetail -> this.value.getProperty(name)
    is Transport.Input.Value.DataRequirement -> this.value.getProperty(name)
    is Transport.Input.Value.Expression -> this.value.getProperty(name)
    is Transport.Input.Value.ParameterDefinition -> this.value.getProperty(name)
    is Transport.Input.Value.RelatedArtifact -> this.value.getProperty(name)
    is Transport.Input.Value.TriggerDefinition -> this.value.getProperty(name)
    is Transport.Input.Value.UsageContext -> this.value.getProperty(name)
    is Transport.Input.Value.Availability -> this.value.getProperty(name)
    is Transport.Input.Value.ExtendedContactDetail -> this.value.getProperty(name)
    is Transport.Input.Value.Dosage -> this.value.getProperty(name)
    is Transport.Input.Value.Meta -> this.value.getProperty(name)
    is Transport.Output.Value.Base64Binary -> this.value.getProperty(name)
    is Transport.Output.Value.Boolean -> this.value.getProperty(name)
    is Transport.Output.Value.Canonical -> this.value.getProperty(name)
    is Transport.Output.Value.Code -> this.value.getProperty(name)
    is Transport.Output.Value.Date -> this.value.getProperty(name)
    is Transport.Output.Value.DateTime -> this.value.getProperty(name)
    is Transport.Output.Value.Decimal -> this.value.getProperty(name)
    is Transport.Output.Value.Id -> this.value.getProperty(name)
    is Transport.Output.Value.Instant -> this.value.getProperty(name)
    is Transport.Output.Value.Integer -> this.value.getProperty(name)
    is Transport.Output.Value.Integer64 -> this.value.getProperty(name)
    is Transport.Output.Value.Markdown -> this.value.getProperty(name)
    is Transport.Output.Value.Oid -> this.value.getProperty(name)
    is Transport.Output.Value.PositiveInt -> this.value.getProperty(name)
    is Transport.Output.Value.String -> this.value.getProperty(name)
    is Transport.Output.Value.Time -> this.value.getProperty(name)
    is Transport.Output.Value.UnsignedInt -> this.value.getProperty(name)
    is Transport.Output.Value.Uri -> this.value.getProperty(name)
    is Transport.Output.Value.Url -> this.value.getProperty(name)
    is Transport.Output.Value.Uuid -> this.value.getProperty(name)
    is Transport.Output.Value.Address -> this.value.getProperty(name)
    is Transport.Output.Value.Age -> this.value.getProperty(name)
    is Transport.Output.Value.Annotation -> this.value.getProperty(name)
    else -> null
  }

private fun Any.getPropertyInChoiceValue5(name: String): Any? =
  when (this) {
    is Transport.Output.Value.Attachment -> this.value.getProperty(name)
    is Transport.Output.Value.CodeableConcept -> this.value.getProperty(name)
    is Transport.Output.Value.CodeableReference -> this.value.getProperty(name)
    is Transport.Output.Value.Coding -> this.value.getProperty(name)
    is Transport.Output.Value.ContactPoint -> this.value.getProperty(name)
    is Transport.Output.Value.Count -> this.value.getProperty(name)
    is Transport.Output.Value.Distance -> this.value.getProperty(name)
    is Transport.Output.Value.Duration -> this.value.getProperty(name)
    is Transport.Output.Value.HumanName -> this.value.getProperty(name)
    is Transport.Output.Value.Identifier -> this.value.getProperty(name)
    is Transport.Output.Value.Money -> this.value.getProperty(name)
    is Transport.Output.Value.Period -> this.value.getProperty(name)
    is Transport.Output.Value.Quantity -> this.value.getProperty(name)
    is Transport.Output.Value.Range -> this.value.getProperty(name)
    is Transport.Output.Value.Ratio -> this.value.getProperty(name)
    is Transport.Output.Value.RatioRange -> this.value.getProperty(name)
    is Transport.Output.Value.Reference -> this.value.getProperty(name)
    is Transport.Output.Value.SampledData -> this.value.getProperty(name)
    is Transport.Output.Value.Signature -> this.value.getProperty(name)
    is Transport.Output.Value.Timing -> this.value.getProperty(name)
    is Transport.Output.Value.ContactDetail -> this.value.getProperty(name)
    is Transport.Output.Value.DataRequirement -> this.value.getProperty(name)
    is Transport.Output.Value.Expression -> this.value.getProperty(name)
    is Transport.Output.Value.ParameterDefinition -> this.value.getProperty(name)
    is Transport.Output.Value.RelatedArtifact -> this.value.getProperty(name)
    is Transport.Output.Value.TriggerDefinition -> this.value.getProperty(name)
    is Transport.Output.Value.UsageContext -> this.value.getProperty(name)
    is Transport.Output.Value.Availability -> this.value.getProperty(name)
    is Transport.Output.Value.ExtendedContactDetail -> this.value.getProperty(name)
    is Transport.Output.Value.Dosage -> this.value.getProperty(name)
    is Transport.Output.Value.Meta -> this.value.getProperty(name)
    is PlanDefinition.VersionAlgorithm.String -> this.value.getProperty(name)
    is PlanDefinition.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is PlanDefinition.Subject.CodeableConcept -> this.value.getProperty(name)
    is PlanDefinition.Subject.Reference -> this.value.getProperty(name)
    is PlanDefinition.Subject.Canonical -> this.value.getProperty(name)
    is PlanDefinition.Goal.Target.Detail.Quantity -> this.value.getProperty(name)
    is PlanDefinition.Goal.Target.Detail.Range -> this.value.getProperty(name)
    is PlanDefinition.Goal.Target.Detail.CodeableConcept -> this.value.getProperty(name)
    is PlanDefinition.Goal.Target.Detail.String -> this.value.getProperty(name)
    is PlanDefinition.Goal.Target.Detail.Boolean -> this.value.getProperty(name)
    is PlanDefinition.Goal.Target.Detail.Integer -> this.value.getProperty(name)
    is PlanDefinition.Goal.Target.Detail.Ratio -> this.value.getProperty(name)
    is PlanDefinition.Action.Subject.CodeableConcept -> this.value.getProperty(name)
    is PlanDefinition.Action.Subject.Reference -> this.value.getProperty(name)
    is PlanDefinition.Action.Subject.Canonical -> this.value.getProperty(name)
    is PlanDefinition.Action.RelatedAction.Offset.Duration -> this.value.getProperty(name)
    is PlanDefinition.Action.RelatedAction.Offset.Range -> this.value.getProperty(name)
    is PlanDefinition.Action.Timing.Age -> this.value.getProperty(name)
    is PlanDefinition.Action.Timing.Duration -> this.value.getProperty(name)
    is PlanDefinition.Action.Timing.Range -> this.value.getProperty(name)
    is PlanDefinition.Action.Timing.Timing -> this.value.getProperty(name)
    is PlanDefinition.Action.Definition.Canonical -> this.value.getProperty(name)
    is PlanDefinition.Action.Definition.Uri -> this.value.getProperty(name)
    is PlanDefinition.AsNeeded.Boolean -> this.value.getProperty(name)
    is PlanDefinition.AsNeeded.CodeableConcept -> this.value.getProperty(name)
    is ClinicalImpression.Effective.DateTime -> this.value.getProperty(name)
    is ClinicalImpression.Effective.Period -> this.value.getProperty(name)
    is CareTeam.Participant.Coverage.Period -> this.value.getProperty(name)
    is CareTeam.Participant.Coverage.Timing -> this.value.getProperty(name)
    is Device.Property.Value.Quantity -> this.value.getProperty(name)
    is Device.Property.Value.CodeableConcept -> this.value.getProperty(name)
    is Device.Property.Value.String -> this.value.getProperty(name)
    is Device.Property.Value.Boolean -> this.value.getProperty(name)
    is Device.Property.Value.Integer -> this.value.getProperty(name)
    is Device.Property.Value.Range -> this.value.getProperty(name)
    is Device.Property.Value.Attachment -> this.value.getProperty(name)
    is NutritionProduct.Characteristic.Value.CodeableConcept -> this.value.getProperty(name)
    is NutritionProduct.Characteristic.Value.String -> this.value.getProperty(name)
    is NutritionProduct.Characteristic.Value.Quantity -> this.value.getProperty(name)
    is NutritionProduct.Characteristic.Value.Base64Binary -> this.value.getProperty(name)
    is NutritionProduct.Characteristic.Value.Attachment -> this.value.getProperty(name)
    is NutritionProduct.Characteristic.Value.Boolean -> this.value.getProperty(name)
    is MedicinalProductDefinition.Characteristic.Value.CodeableConcept ->
      this.value.getProperty(name)
    is MedicinalProductDefinition.Characteristic.Value.Markdown -> this.value.getProperty(name)
    is MedicinalProductDefinition.Characteristic.Value.Quantity -> this.value.getProperty(name)
    is MedicinalProductDefinition.Characteristic.Value.Integer -> this.value.getProperty(name)
    is MedicinalProductDefinition.Characteristic.Value.Date -> this.value.getProperty(name)
    is MedicinalProductDefinition.Characteristic.Value.Boolean -> this.value.getProperty(name)
    is MedicinalProductDefinition.Characteristic.Value.Attachment -> this.value.getProperty(name)
    is Communication.Payload.Content.Attachment -> this.value.getProperty(name)
    is Communication.Payload.Content.Reference -> this.value.getProperty(name)
    is Communication.Payload.Content.CodeableConcept -> this.value.getProperty(name)
    is Library.VersionAlgorithm.String -> this.value.getProperty(name)
    is Library.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is Library.Subject.CodeableConcept -> this.value.getProperty(name)
    is Library.Subject.Reference -> this.value.getProperty(name)
    is StructureMap.VersionAlgorithm.String -> this.value.getProperty(name)
    is StructureMap.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Id -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.String -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Boolean -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Integer -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Decimal -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Date -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Time -> this.value.getProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.DateTime -> this.value.getProperty(name)
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
    is Task.Input.Value.Integer64 -> this.value.getProperty(name)
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
    is Task.Input.Value.CodeableReference -> this.value.getProperty(name)
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
    is Task.Input.Value.RatioRange -> this.value.getProperty(name)
    is Task.Input.Value.Reference -> this.value.getProperty(name)
    is Task.Input.Value.SampledData -> this.value.getProperty(name)
    is Task.Input.Value.Signature -> this.value.getProperty(name)
    is Task.Input.Value.Timing -> this.value.getProperty(name)
    is Task.Input.Value.ContactDetail -> this.value.getProperty(name)
    is Task.Input.Value.DataRequirement -> this.value.getProperty(name)
    is Task.Input.Value.Expression -> this.value.getProperty(name)
    is Task.Input.Value.ParameterDefinition -> this.value.getProperty(name)
    is Task.Input.Value.RelatedArtifact -> this.value.getProperty(name)
    is Task.Input.Value.TriggerDefinition -> this.value.getProperty(name)
    is Task.Input.Value.UsageContext -> this.value.getProperty(name)
    is Task.Input.Value.Availability -> this.value.getProperty(name)
    is Task.Input.Value.ExtendedContactDetail -> this.value.getProperty(name)
    is Task.Input.Value.Dosage -> this.value.getProperty(name)
    else -> null
  }

private fun Any.getPropertyInChoiceValue6(name: String): Any? =
  when (this) {
    is Task.Input.Value.Meta -> this.value.getProperty(name)
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
    is Task.Output.Value.Integer64 -> this.value.getProperty(name)
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
    is Task.Output.Value.CodeableReference -> this.value.getProperty(name)
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
    is Task.Output.Value.RatioRange -> this.value.getProperty(name)
    is Task.Output.Value.Reference -> this.value.getProperty(name)
    is Task.Output.Value.SampledData -> this.value.getProperty(name)
    is Task.Output.Value.Signature -> this.value.getProperty(name)
    is Task.Output.Value.Timing -> this.value.getProperty(name)
    is Task.Output.Value.ContactDetail -> this.value.getProperty(name)
    is Task.Output.Value.DataRequirement -> this.value.getProperty(name)
    is Task.Output.Value.Expression -> this.value.getProperty(name)
    is Task.Output.Value.ParameterDefinition -> this.value.getProperty(name)
    is Task.Output.Value.RelatedArtifact -> this.value.getProperty(name)
    is Task.Output.Value.TriggerDefinition -> this.value.getProperty(name)
    is Task.Output.Value.UsageContext -> this.value.getProperty(name)
    is Task.Output.Value.Availability -> this.value.getProperty(name)
    is Task.Output.Value.ExtendedContactDetail -> this.value.getProperty(name)
    is Task.Output.Value.Dosage -> this.value.getProperty(name)
    is Task.Output.Value.Meta -> this.value.getProperty(name)
    is EvidenceReport.CiteAs.Reference -> this.value.getProperty(name)
    is EvidenceReport.CiteAs.Markdown -> this.value.getProperty(name)
    is EvidenceReport.Subject.Characteristic.Value.Reference -> this.value.getProperty(name)
    is EvidenceReport.Subject.Characteristic.Value.CodeableConcept -> this.value.getProperty(name)
    is EvidenceReport.Subject.Characteristic.Value.Boolean -> this.value.getProperty(name)
    is EvidenceReport.Subject.Characteristic.Value.Quantity -> this.value.getProperty(name)
    is EvidenceReport.Subject.Characteristic.Value.Range -> this.value.getProperty(name)
    is Requirements.VersionAlgorithm.String -> this.value.getProperty(name)
    is Requirements.VersionAlgorithm.Coding -> this.value.getProperty(name)
    is Practitioner.Deceased.Boolean -> this.value.getProperty(name)
    is Practitioner.Deceased.DateTime -> this.value.getProperty(name)
    is Ingredient.Substance.Strength.Presentation.Ratio -> this.value.getProperty(name)
    is Ingredient.Substance.Strength.Presentation.RatioRange -> this.value.getProperty(name)
    is Ingredient.Substance.Strength.Presentation.CodeableConcept -> this.value.getProperty(name)
    is Ingredient.Substance.Strength.Presentation.Quantity -> this.value.getProperty(name)
    is Ingredient.Substance.Strength.Concentration.Ratio -> this.value.getProperty(name)
    is Ingredient.Substance.Strength.Concentration.RatioRange -> this.value.getProperty(name)
    is Ingredient.Substance.Strength.Concentration.CodeableConcept -> this.value.getProperty(name)
    is Ingredient.Substance.Strength.Concentration.Quantity -> this.value.getProperty(name)
    is Ingredient.Substance.Strength.ReferenceStrength.Strength.Ratio ->
      this.value.getProperty(name)
    is Ingredient.Substance.Strength.ReferenceStrength.Strength.RatioRange ->
      this.value.getProperty(name)
    is Ingredient.Substance.Strength.ReferenceStrength.Strength.Quantity ->
      this.value.getProperty(name)
    is Observation.Instantiates.Canonical -> this.value.getProperty(name)
    is Observation.Instantiates.Reference -> this.value.getProperty(name)
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
    is Observation.Value.Attachment -> this.value.getProperty(name)
    is Observation.Value.Reference -> this.value.getProperty(name)
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
    is Observation.Component.Value.Attachment -> this.value.getProperty(name)
    is Observation.Component.Value.Reference -> this.value.getProperty(name)
    is DocumentReference.Content.Profile.Value.Coding -> this.value.getProperty(name)
    is DocumentReference.Content.Profile.Value.Uri -> this.value.getProperty(name)
    is DocumentReference.Content.Profile.Value.Canonical -> this.value.getProperty(name)
    is Procedure.Occurrence.DateTime -> this.value.getProperty(name)
    is Procedure.Occurrence.Period -> this.value.getProperty(name)
    is Procedure.Occurrence.String -> this.value.getProperty(name)
    is Procedure.Occurrence.Age -> this.value.getProperty(name)
    is Procedure.Occurrence.Range -> this.value.getProperty(name)
    is Procedure.Occurrence.Timing -> this.value.getProperty(name)
    is Procedure.Reported.Boolean -> this.value.getProperty(name)
    is Procedure.Reported.Reference -> this.value.getProperty(name)
    is AdverseEvent.Occurrence.DateTime -> this.value.getProperty(name)
    is AdverseEvent.Occurrence.Period -> this.value.getProperty(name)
    is AdverseEvent.Occurrence.Timing -> this.value.getProperty(name)
    is AdverseEvent.SuspectEntity.Instance.CodeableConcept -> this.value.getProperty(name)
    is AdverseEvent.SuspectEntity.Instance.Reference -> this.value.getProperty(name)
    is AdverseEvent.ContributingFactor.Item.Reference -> this.value.getProperty(name)
    is AdverseEvent.ContributingFactor.Item.CodeableConcept -> this.value.getProperty(name)
    is AdverseEvent.PreventiveAction.Item.Reference -> this.value.getProperty(name)
    is AdverseEvent.PreventiveAction.Item.CodeableConcept -> this.value.getProperty(name)
    is AdverseEvent.MitigatingAction.Item.Reference -> this.value.getProperty(name)
    is AdverseEvent.MitigatingAction.Item.CodeableConcept -> this.value.getProperty(name)
    is AdverseEvent.SupportingInfo.Item.Reference -> this.value.getProperty(name)
    is AdverseEvent.SupportingInfo.Item.CodeableConcept -> this.value.getProperty(name)
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
  getPropertyInChoiceValue5(name)?.let {
    return it
  }
  getPropertyInChoiceValue6(name)?.let {
    return it
  }
  return null
}

private fun Any.hasPropertyInChoiceValue0(name: String): Boolean =
  when (this) {
    is SubscriptionTopic.VersionAlgorithm.String -> this.value.hasProperty(name)
    is SubscriptionTopic.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is RequestOrchestration.Action.RelatedAction.Offset.Duration -> this.value.hasProperty(name)
    is RequestOrchestration.Action.RelatedAction.Offset.Range -> this.value.hasProperty(name)
    is RequestOrchestration.Action.Timing.DateTime -> this.value.hasProperty(name)
    is RequestOrchestration.Action.Timing.Age -> this.value.hasProperty(name)
    is RequestOrchestration.Action.Timing.Period -> this.value.hasProperty(name)
    is RequestOrchestration.Action.Timing.Duration -> this.value.hasProperty(name)
    is RequestOrchestration.Action.Timing.Range -> this.value.hasProperty(name)
    is RequestOrchestration.Action.Timing.Timing -> this.value.hasProperty(name)
    is RequestOrchestration.Action.Participant.Actor.Canonical -> this.value.hasProperty(name)
    is RequestOrchestration.Action.Participant.Actor.Reference -> this.value.hasProperty(name)
    is RequestOrchestration.Action.Definition.Canonical -> this.value.hasProperty(name)
    is RequestOrchestration.Action.Definition.Uri -> this.value.hasProperty(name)
    is ArtifactAssessment.CiteAs.Reference -> this.value.hasProperty(name)
    is ArtifactAssessment.CiteAs.Markdown -> this.value.hasProperty(name)
    is ArtifactAssessment.Artifact.Reference -> this.value.hasProperty(name)
    is ArtifactAssessment.Artifact.Canonical -> this.value.hasProperty(name)
    is ArtifactAssessment.Artifact.Uri -> this.value.hasProperty(name)
    is ExampleScenario.VersionAlgorithm.String -> this.value.hasProperty(name)
    is ExampleScenario.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is ExampleScenario.Instance.StructureProfile.Canonical -> this.value.hasProperty(name)
    is ExampleScenario.Instance.StructureProfile.Uri -> this.value.hasProperty(name)
    is ActorDefinition.VersionAlgorithm.String -> this.value.hasProperty(name)
    is ActorDefinition.VersionAlgorithm.Coding -> this.value.hasProperty(name)
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
    is SupplyDelivery.SuppliedItem.Item.CodeableConcept -> this.value.hasProperty(name)
    is SupplyDelivery.SuppliedItem.Item.Reference -> this.value.hasProperty(name)
    is SupplyDelivery.Occurrence.DateTime -> this.value.hasProperty(name)
    is SupplyDelivery.Occurrence.Period -> this.value.hasProperty(name)
    is SupplyDelivery.Occurrence.Timing -> this.value.hasProperty(name)
    is MedicationAdministration.Occurence.DateTime -> this.value.hasProperty(name)
    is MedicationAdministration.Occurence.Period -> this.value.hasProperty(name)
    is MedicationAdministration.Occurence.Timing -> this.value.hasProperty(name)
    is MedicationAdministration.Dosage.Rate.Ratio -> this.value.hasProperty(name)
    is MedicationAdministration.Dosage.Rate.Quantity -> this.value.hasProperty(name)
    is Claim.Event.When.DateTime -> this.value.hasProperty(name)
    is Claim.Event.When.Period -> this.value.hasProperty(name)
    is Claim.SupportingInfo.Timing.Date -> this.value.hasProperty(name)
    is Claim.SupportingInfo.Timing.Period -> this.value.hasProperty(name)
    is Claim.SupportingInfo.Value.Boolean -> this.value.hasProperty(name)
    is Claim.SupportingInfo.Value.String -> this.value.hasProperty(name)
    is Claim.SupportingInfo.Value.Quantity -> this.value.hasProperty(name)
    is Claim.SupportingInfo.Value.Attachment -> this.value.hasProperty(name)
    is Claim.SupportingInfo.Value.Reference -> this.value.hasProperty(name)
    is Claim.SupportingInfo.Value.Identifier -> this.value.hasProperty(name)
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
    is AuditEvent.Occurred.Period -> this.value.hasProperty(name)
    is AuditEvent.Occurred.DateTime -> this.value.hasProperty(name)
    is AuditEvent.Agent.Network.Reference -> this.value.hasProperty(name)
    is AuditEvent.Agent.Network.Uri -> this.value.hasProperty(name)
    is AuditEvent.Agent.Network.String -> this.value.hasProperty(name)
    is AuditEvent.Entity.Detail.Value.Quantity -> this.value.hasProperty(name)
    is AuditEvent.Entity.Detail.Value.CodeableConcept -> this.value.hasProperty(name)
    is AuditEvent.Entity.Detail.Value.String -> this.value.hasProperty(name)
    is AuditEvent.Entity.Detail.Value.Boolean -> this.value.hasProperty(name)
    is AuditEvent.Entity.Detail.Value.Integer -> this.value.hasProperty(name)
    is AuditEvent.Entity.Detail.Value.Range -> this.value.hasProperty(name)
    is AuditEvent.Entity.Detail.Value.Ratio -> this.value.hasProperty(name)
    is AuditEvent.Entity.Detail.Value.Time -> this.value.hasProperty(name)
    is AuditEvent.Entity.Detail.Value.DateTime -> this.value.hasProperty(name)
    is AuditEvent.Entity.Detail.Value.Period -> this.value.hasProperty(name)
    is AuditEvent.Entity.Detail.Value.Base64Binary -> this.value.hasProperty(name)
    is ServiceRequest.OrderDetail.Parameter.Value.Quantity -> this.value.hasProperty(name)
    is ServiceRequest.OrderDetail.Parameter.Value.Ratio -> this.value.hasProperty(name)
    is ServiceRequest.OrderDetail.Parameter.Value.Range -> this.value.hasProperty(name)
    is ServiceRequest.OrderDetail.Parameter.Value.Boolean -> this.value.hasProperty(name)
    is ServiceRequest.OrderDetail.Parameter.Value.CodeableConcept -> this.value.hasProperty(name)
    is ServiceRequest.OrderDetail.Parameter.Value.String -> this.value.hasProperty(name)
    is ServiceRequest.OrderDetail.Parameter.Value.Period -> this.value.hasProperty(name)
    is ServiceRequest.Quantity.Quantity -> this.value.hasProperty(name)
    is ServiceRequest.Quantity.Ratio -> this.value.hasProperty(name)
    is ServiceRequest.Quantity.Range -> this.value.hasProperty(name)
    is ServiceRequest.Occurrence.DateTime -> this.value.hasProperty(name)
    is ServiceRequest.Occurrence.Period -> this.value.hasProperty(name)
    is ServiceRequest.Occurrence.Timing -> this.value.hasProperty(name)
    is ServiceRequest.AsNeeded.Boolean -> this.value.hasProperty(name)
    is ServiceRequest.AsNeeded.CodeableConcept -> this.value.hasProperty(name)
    is ServiceRequest.PatientInstruction.Instruction.Markdown -> this.value.hasProperty(name)
    is ServiceRequest.PatientInstruction.Instruction.Reference -> this.value.hasProperty(name)
    is NutritionIntake.Occurrence.DateTime -> this.value.hasProperty(name)
    is NutritionIntake.Occurrence.Period -> this.value.hasProperty(name)
    is NutritionIntake.Reported.Boolean -> this.value.hasProperty(name)
    is NutritionIntake.Reported.Reference -> this.value.hasProperty(name)
    is EventDefinition.VersionAlgorithm.String -> this.value.hasProperty(name)
    is EventDefinition.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is EventDefinition.Subject.CodeableConcept -> this.value.hasProperty(name)
    is EventDefinition.Subject.Reference -> this.value.hasProperty(name)
    is CoverageEligibilityResponse.Event.When.DateTime -> this.value.hasProperty(name)
    is CoverageEligibilityResponse.Event.When.Period -> this.value.hasProperty(name)
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
    is Citation.VersionAlgorithm.String -> this.value.hasProperty(name)
    is Citation.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is Measure.VersionAlgorithm.String -> this.value.hasProperty(name)
    is Measure.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is Measure.Subject.CodeableConcept -> this.value.hasProperty(name)
    is Measure.Subject.Reference -> this.value.hasProperty(name)
    is Measure.Group.Subject.CodeableConcept -> this.value.hasProperty(name)
    is Measure.Group.Subject.Reference -> this.value.hasProperty(name)
    is ActivityDefinition.VersionAlgorithm.String -> this.value.hasProperty(name)
    is ActivityDefinition.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is ActivityDefinition.Subject.CodeableConcept -> this.value.hasProperty(name)
    is ActivityDefinition.Subject.Reference -> this.value.hasProperty(name)
    is ActivityDefinition.Subject.Canonical -> this.value.hasProperty(name)
    is ActivityDefinition.Timing.Timing -> this.value.hasProperty(name)
    is ActivityDefinition.Timing.Age -> this.value.hasProperty(name)
    is ActivityDefinition.Timing.Range -> this.value.hasProperty(name)
    is ActivityDefinition.Timing.Duration -> this.value.hasProperty(name)
    is ActivityDefinition.AsNeeded.Boolean -> this.value.hasProperty(name)
    else -> false
  }

private fun Any.hasPropertyInChoiceValue1(name: String): Boolean =
  when (this) {
    is ActivityDefinition.AsNeeded.CodeableConcept -> this.value.hasProperty(name)
    is ActivityDefinition.Product.Reference -> this.value.hasProperty(name)
    is ActivityDefinition.Product.CodeableConcept -> this.value.hasProperty(name)
    is DeviceRequest.Parameter.Value.CodeableConcept -> this.value.hasProperty(name)
    is DeviceRequest.Parameter.Value.Quantity -> this.value.hasProperty(name)
    is DeviceRequest.Parameter.Value.Range -> this.value.hasProperty(name)
    is DeviceRequest.Parameter.Value.Boolean -> this.value.hasProperty(name)
    is DeviceRequest.Occurrence.DateTime -> this.value.hasProperty(name)
    is DeviceRequest.Occurrence.Period -> this.value.hasProperty(name)
    is DeviceRequest.Occurrence.Timing -> this.value.hasProperty(name)
    is CapabilityStatement.VersionAlgorithm.String -> this.value.hasProperty(name)
    is CapabilityStatement.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is Substance.Ingredient.Substance.CodeableConcept -> this.value.hasProperty(name)
    is Substance.Ingredient.Substance.Reference -> this.value.hasProperty(name)
    is Group.Characteristic.Value.CodeableConcept -> this.value.hasProperty(name)
    is Group.Characteristic.Value.Boolean -> this.value.hasProperty(name)
    is Group.Characteristic.Value.Quantity -> this.value.hasProperty(name)
    is Group.Characteristic.Value.Range -> this.value.hasProperty(name)
    is Group.Characteristic.Value.Reference -> this.value.hasProperty(name)
    is MolecularSequence.Relative.StartingSequence.Sequence.CodeableConcept ->
      this.value.hasProperty(name)
    is MolecularSequence.Relative.StartingSequence.Sequence.String -> this.value.hasProperty(name)
    is MolecularSequence.Relative.StartingSequence.Sequence.Reference ->
      this.value.hasProperty(name)
    is RegulatedAuthorization.Case.Date.Period -> this.value.hasProperty(name)
    is RegulatedAuthorization.Case.Date.DateTime -> this.value.hasProperty(name)
    is ChargeItemDefinition.VersionAlgorithm.String -> this.value.hasProperty(name)
    is ChargeItemDefinition.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is Questionnaire.VersionAlgorithm.String -> this.value.hasProperty(name)
    is Questionnaire.VersionAlgorithm.Coding -> this.value.hasProperty(name)
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
    is Questionnaire.Item.Initial.Value.String -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.Uri -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.Attachment -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.Coding -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.Quantity -> this.value.hasProperty(name)
    is Questionnaire.Item.Initial.Value.Reference -> this.value.hasProperty(name)
    is TestScript.VersionAlgorithm.String -> this.value.hasProperty(name)
    is TestScript.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is TestScript.Setup.Action.Assert.Requirement.Link.Uri -> this.value.hasProperty(name)
    is TestScript.Setup.Action.Assert.Requirement.Link.Canonical -> this.value.hasProperty(name)
    is TestReport.Setup.Action.Assert.Requirement.Link.Uri -> this.value.hasProperty(name)
    is TestReport.Setup.Action.Assert.Requirement.Link.Canonical -> this.value.hasProperty(name)
    is DeviceUsage.Timing.Timing -> this.value.hasProperty(name)
    is DeviceUsage.Timing.Period -> this.value.hasProperty(name)
    is DeviceUsage.Timing.DateTime -> this.value.hasProperty(name)
    is MeasureReport.Group.MeasureScore.Quantity -> this.value.hasProperty(name)
    is MeasureReport.Group.MeasureScore.DateTime -> this.value.hasProperty(name)
    is MeasureReport.Group.MeasureScore.CodeableConcept -> this.value.hasProperty(name)
    is MeasureReport.Group.MeasureScore.Period -> this.value.hasProperty(name)
    is MeasureReport.Group.MeasureScore.Range -> this.value.hasProperty(name)
    is MeasureReport.Group.MeasureScore.Duration -> this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Value.CodeableConcept -> this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Value.Boolean -> this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Value.Quantity -> this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Value.Range -> this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Value.Reference -> this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Component.Value.CodeableConcept ->
      this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Component.Value.Boolean ->
      this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Component.Value.Quantity ->
      this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Component.Value.Range -> this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.Component.Value.Reference ->
      this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.Quantity -> this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.DateTime -> this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.CodeableConcept ->
      this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.Period -> this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.Range -> this.value.hasProperty(name)
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.Duration -> this.value.hasProperty(name)
    is SubstanceDefinition.Moiety.Amount.Quantity -> this.value.hasProperty(name)
    is SubstanceDefinition.Moiety.Amount.String -> this.value.hasProperty(name)
    is SubstanceDefinition.Property.Value.CodeableConcept -> this.value.hasProperty(name)
    is SubstanceDefinition.Property.Value.Quantity -> this.value.hasProperty(name)
    is SubstanceDefinition.Property.Value.Date -> this.value.hasProperty(name)
    is SubstanceDefinition.Property.Value.Boolean -> this.value.hasProperty(name)
    is SubstanceDefinition.Property.Value.Attachment -> this.value.hasProperty(name)
    is SubstanceDefinition.Relationship.SubstanceDefinition.Reference ->
      this.value.hasProperty(name)
    is SubstanceDefinition.Relationship.SubstanceDefinition.CodeableConcept ->
      this.value.hasProperty(name)
    is SubstanceDefinition.Relationship.Amount.Quantity -> this.value.hasProperty(name)
    is SubstanceDefinition.Relationship.Amount.Ratio -> this.value.hasProperty(name)
    is SubstanceDefinition.Relationship.Amount.String -> this.value.hasProperty(name)
    is SupplyRequest.Parameter.Value.CodeableConcept -> this.value.hasProperty(name)
    is SupplyRequest.Parameter.Value.Quantity -> this.value.hasProperty(name)
    is SupplyRequest.Parameter.Value.Range -> this.value.hasProperty(name)
    is SupplyRequest.Parameter.Value.Boolean -> this.value.hasProperty(name)
    is SupplyRequest.Occurrence.DateTime -> this.value.hasProperty(name)
    is SupplyRequest.Occurrence.Period -> this.value.hasProperty(name)
    is SupplyRequest.Occurrence.Timing -> this.value.hasProperty(name)
    is GenomicStudy.Analysis.Input.GeneratedBy.Identifier -> this.value.hasProperty(name)
    is GenomicStudy.Analysis.Input.GeneratedBy.Reference -> this.value.hasProperty(name)
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
    is Parameters.Parameter.Value.Integer64 -> this.value.hasProperty(name)
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
    is Parameters.Parameter.Value.CodeableReference -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Coding -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.ContactPoint -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Count -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Distance -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Duration -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.HumanName -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Identifier -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Money -> this.value.hasProperty(name)
    else -> false
  }

private fun Any.hasPropertyInChoiceValue2(name: String): Boolean =
  when (this) {
    is Parameters.Parameter.Value.Period -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Quantity -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Range -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Ratio -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.RatioRange -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Reference -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.SampledData -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Signature -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Timing -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.ContactDetail -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.DataRequirement -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Expression -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.ParameterDefinition -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.RelatedArtifact -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.TriggerDefinition -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.UsageContext -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Availability -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.ExtendedContactDetail -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Dosage -> this.value.hasProperty(name)
    is Parameters.Parameter.Value.Meta -> this.value.hasProperty(name)
    is Evidence.VersionAlgorithm.String -> this.value.hasProperty(name)
    is Evidence.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is Evidence.CiteAs.Reference -> this.value.hasProperty(name)
    is Evidence.CiteAs.Markdown -> this.value.hasProperty(name)
    is NamingSystem.VersionAlgorithm.String -> this.value.hasProperty(name)
    is NamingSystem.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is ExplanationOfBenefit.Event.When.DateTime -> this.value.hasProperty(name)
    is ExplanationOfBenefit.Event.When.Period -> this.value.hasProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Timing.Date -> this.value.hasProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Timing.Period -> this.value.hasProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Boolean -> this.value.hasProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.String -> this.value.hasProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Quantity -> this.value.hasProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Attachment -> this.value.hasProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Reference -> this.value.hasProperty(name)
    is ExplanationOfBenefit.SupportingInfo.Value.Identifier -> this.value.hasProperty(name)
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
    is PackagedProductDefinition.Packaging.Property.Value.CodeableConcept ->
      this.value.hasProperty(name)
    is PackagedProductDefinition.Packaging.Property.Value.Quantity -> this.value.hasProperty(name)
    is PackagedProductDefinition.Packaging.Property.Value.Date -> this.value.hasProperty(name)
    is PackagedProductDefinition.Packaging.Property.Value.Boolean -> this.value.hasProperty(name)
    is PackagedProductDefinition.Packaging.Property.Value.Attachment -> this.value.hasProperty(name)
    is Patient.Deceased.Boolean -> this.value.hasProperty(name)
    is Patient.Deceased.DateTime -> this.value.hasProperty(name)
    is Patient.MultipleBirth.Boolean -> this.value.hasProperty(name)
    is Patient.MultipleBirth.Integer -> this.value.hasProperty(name)
    is ManufacturedItemDefinition.Property.Value.CodeableConcept -> this.value.hasProperty(name)
    is ManufacturedItemDefinition.Property.Value.Quantity -> this.value.hasProperty(name)
    is ManufacturedItemDefinition.Property.Value.Date -> this.value.hasProperty(name)
    is ManufacturedItemDefinition.Property.Value.Boolean -> this.value.hasProperty(name)
    is ManufacturedItemDefinition.Property.Value.Markdown -> this.value.hasProperty(name)
    is ManufacturedItemDefinition.Property.Value.Attachment -> this.value.hasProperty(name)
    is ManufacturedItemDefinition.Property.Value.Reference -> this.value.hasProperty(name)
    is Specimen.Collection.Collected.DateTime -> this.value.hasProperty(name)
    is Specimen.Collection.Collected.Period -> this.value.hasProperty(name)
    is Specimen.Collection.FastingStatus.CodeableConcept -> this.value.hasProperty(name)
    is Specimen.Collection.FastingStatus.Duration -> this.value.hasProperty(name)
    is Specimen.Processing.Time.DateTime -> this.value.hasProperty(name)
    is Specimen.Processing.Time.Period -> this.value.hasProperty(name)
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
    is FamilyMemberHistory.Procedure.Performed.Age -> this.value.hasProperty(name)
    is FamilyMemberHistory.Procedure.Performed.Range -> this.value.hasProperty(name)
    is FamilyMemberHistory.Procedure.Performed.Period -> this.value.hasProperty(name)
    is FamilyMemberHistory.Procedure.Performed.String -> this.value.hasProperty(name)
    is FamilyMemberHistory.Procedure.Performed.DateTime -> this.value.hasProperty(name)
    is OperationDefinition.VersionAlgorithm.String -> this.value.hasProperty(name)
    is OperationDefinition.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is GraphDefinition.VersionAlgorithm.String -> this.value.hasProperty(name)
    is GraphDefinition.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is Medication.Ingredient.Strength.Ratio -> this.value.hasProperty(name)
    is Medication.Ingredient.Strength.CodeableConcept -> this.value.hasProperty(name)
    is Medication.Ingredient.Strength.Quantity -> this.value.hasProperty(name)
    is DiagnosticReport.Effective.DateTime -> this.value.hasProperty(name)
    is DiagnosticReport.Effective.Period -> this.value.hasProperty(name)
    is MessageHeader.Event.Coding -> this.value.hasProperty(name)
    is MessageHeader.Event.Canonical -> this.value.hasProperty(name)
    is MessageHeader.Destination.Endpoint.Url -> this.value.hasProperty(name)
    is MessageHeader.Destination.Endpoint.Reference -> this.value.hasProperty(name)
    is MessageHeader.Source.Endpoint.Url -> this.value.hasProperty(name)
    is MessageHeader.Source.Endpoint.Reference -> this.value.hasProperty(name)
    is DeviceDefinition.Property.Value.Quantity -> this.value.hasProperty(name)
    is DeviceDefinition.Property.Value.CodeableConcept -> this.value.hasProperty(name)
    is DeviceDefinition.Property.Value.String -> this.value.hasProperty(name)
    is DeviceDefinition.Property.Value.Boolean -> this.value.hasProperty(name)
    is DeviceDefinition.Property.Value.Integer -> this.value.hasProperty(name)
    is DeviceDefinition.Property.Value.Range -> this.value.hasProperty(name)
    is DeviceDefinition.Property.Value.Attachment -> this.value.hasProperty(name)
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
    is ObservationDefinition.VersionAlgorithm.String -> this.value.hasProperty(name)
    is ObservationDefinition.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is Immunization.Occurrence.DateTime -> this.value.hasProperty(name)
    is Immunization.Occurrence.String -> this.value.hasProperty(name)
    is ValueSet.VersionAlgorithm.String -> this.value.hasProperty(name)
    is ValueSet.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is ValueSet.Expansion.Parameter.Value.String -> this.value.hasProperty(name)
    is ValueSet.Expansion.Parameter.Value.Boolean -> this.value.hasProperty(name)
    is ValueSet.Expansion.Parameter.Value.Integer -> this.value.hasProperty(name)
    is ValueSet.Expansion.Parameter.Value.Decimal -> this.value.hasProperty(name)
    is ValueSet.Expansion.Parameter.Value.Uri -> this.value.hasProperty(name)
    is ValueSet.Expansion.Parameter.Value.Code -> this.value.hasProperty(name)
    is ValueSet.Expansion.Parameter.Value.DateTime -> this.value.hasProperty(name)
    is ValueSet.Expansion.Contains.Property.Value.Code -> this.value.hasProperty(name)
    is ValueSet.Expansion.Contains.Property.Value.Coding -> this.value.hasProperty(name)
    is ValueSet.Expansion.Contains.Property.Value.String -> this.value.hasProperty(name)
    is ValueSet.Expansion.Contains.Property.Value.Integer -> this.value.hasProperty(name)
    is ValueSet.Expansion.Contains.Property.Value.Boolean -> this.value.hasProperty(name)
    else -> false
  }

private fun Any.hasPropertyInChoiceValue3(name: String): Boolean =
  when (this) {
    is ValueSet.Expansion.Contains.Property.Value.DateTime -> this.value.hasProperty(name)
    is ValueSet.Expansion.Contains.Property.Value.Decimal -> this.value.hasProperty(name)
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.Code -> this.value.hasProperty(name)
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.Coding -> this.value.hasProperty(name)
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.String -> this.value.hasProperty(name)
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.Integer ->
      this.value.hasProperty(name)
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.Boolean ->
      this.value.hasProperty(name)
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.DateTime ->
      this.value.hasProperty(name)
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.Decimal ->
      this.value.hasProperty(name)
    is ClaimResponse.Event.When.DateTime -> this.value.hasProperty(name)
    is ClaimResponse.Event.When.Period -> this.value.hasProperty(name)
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
    is BiologicallyDerivedProduct.Property.Value.Boolean -> this.value.hasProperty(name)
    is BiologicallyDerivedProduct.Property.Value.Integer -> this.value.hasProperty(name)
    is BiologicallyDerivedProduct.Property.Value.CodeableConcept -> this.value.hasProperty(name)
    is BiologicallyDerivedProduct.Property.Value.Period -> this.value.hasProperty(name)
    is BiologicallyDerivedProduct.Property.Value.Quantity -> this.value.hasProperty(name)
    is BiologicallyDerivedProduct.Property.Value.Range -> this.value.hasProperty(name)
    is BiologicallyDerivedProduct.Property.Value.Ratio -> this.value.hasProperty(name)
    is BiologicallyDerivedProduct.Property.Value.String -> this.value.hasProperty(name)
    is BiologicallyDerivedProduct.Property.Value.Attachment -> this.value.hasProperty(name)
    is InventoryItem.Characteristic.Value.String -> this.value.hasProperty(name)
    is InventoryItem.Characteristic.Value.Integer -> this.value.hasProperty(name)
    is InventoryItem.Characteristic.Value.Decimal -> this.value.hasProperty(name)
    is InventoryItem.Characteristic.Value.Boolean -> this.value.hasProperty(name)
    is InventoryItem.Characteristic.Value.Url -> this.value.hasProperty(name)
    is InventoryItem.Characteristic.Value.DateTime -> this.value.hasProperty(name)
    is InventoryItem.Characteristic.Value.Quantity -> this.value.hasProperty(name)
    is InventoryItem.Characteristic.Value.Range -> this.value.hasProperty(name)
    is InventoryItem.Characteristic.Value.Ratio -> this.value.hasProperty(name)
    is InventoryItem.Characteristic.Value.Annotation -> this.value.hasProperty(name)
    is InventoryItem.Characteristic.Value.Address -> this.value.hasProperty(name)
    is InventoryItem.Characteristic.Value.Duration -> this.value.hasProperty(name)
    is InventoryItem.Characteristic.Value.CodeableConcept -> this.value.hasProperty(name)
    is TestPlan.VersionAlgorithm.String -> this.value.hasProperty(name)
    is TestPlan.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is TestPlan.TestCase.TestRun.Script.Source.String -> this.value.hasProperty(name)
    is TestPlan.TestCase.TestRun.Script.Source.Reference -> this.value.hasProperty(name)
    is TestPlan.TestCase.TestData.Source.String -> this.value.hasProperty(name)
    is TestPlan.TestCase.TestData.Source.Reference -> this.value.hasProperty(name)
    is TerminologyCapabilities.VersionAlgorithm.String -> this.value.hasProperty(name)
    is TerminologyCapabilities.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is ClinicalUseDefinition.Indication.Duration.Range -> this.value.hasProperty(name)
    is ClinicalUseDefinition.Indication.Duration.String -> this.value.hasProperty(name)
    is ClinicalUseDefinition.Interaction.Interactant.Item.Reference -> this.value.hasProperty(name)
    is ClinicalUseDefinition.Interaction.Interactant.Item.CodeableConcept ->
      this.value.hasProperty(name)
    is SpecimenDefinition.VersionAlgorithm.String -> this.value.hasProperty(name)
    is SpecimenDefinition.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is SpecimenDefinition.Subject.CodeableConcept -> this.value.hasProperty(name)
    is SpecimenDefinition.Subject.Reference -> this.value.hasProperty(name)
    is SpecimenDefinition.TypeTested.Container.MinimumVolume.Quantity ->
      this.value.hasProperty(name)
    is SpecimenDefinition.TypeTested.Container.MinimumVolume.String -> this.value.hasProperty(name)
    is SpecimenDefinition.TypeTested.Container.Additive.Additive.CodeableConcept ->
      this.value.hasProperty(name)
    is SpecimenDefinition.TypeTested.Container.Additive.Additive.Reference ->
      this.value.hasProperty(name)
    is ConceptMap.VersionAlgorithm.String -> this.value.hasProperty(name)
    is ConceptMap.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is ConceptMap.SourceScope.Uri -> this.value.hasProperty(name)
    is ConceptMap.SourceScope.Canonical -> this.value.hasProperty(name)
    is ConceptMap.TargetScope.Uri -> this.value.hasProperty(name)
    is ConceptMap.TargetScope.Canonical -> this.value.hasProperty(name)
    is ConceptMap.Group.Element.Target.Property.Value.Coding -> this.value.hasProperty(name)
    is ConceptMap.Group.Element.Target.Property.Value.String -> this.value.hasProperty(name)
    is ConceptMap.Group.Element.Target.Property.Value.Integer -> this.value.hasProperty(name)
    is ConceptMap.Group.Element.Target.Property.Value.Boolean -> this.value.hasProperty(name)
    is ConceptMap.Group.Element.Target.Property.Value.DateTime -> this.value.hasProperty(name)
    is ConceptMap.Group.Element.Target.Property.Value.Decimal -> this.value.hasProperty(name)
    is ConceptMap.Group.Element.Target.Property.Value.Code -> this.value.hasProperty(name)
    is ConceptMap.Group.Element.Target.DependsOn.Value.Code -> this.value.hasProperty(name)
    is ConceptMap.Group.Element.Target.DependsOn.Value.Coding -> this.value.hasProperty(name)
    is ConceptMap.Group.Element.Target.DependsOn.Value.String -> this.value.hasProperty(name)
    is ConceptMap.Group.Element.Target.DependsOn.Value.Boolean -> this.value.hasProperty(name)
    is ConceptMap.Group.Element.Target.DependsOn.Value.Quantity -> this.value.hasProperty(name)
    is Invoice.Period.Date -> this.value.hasProperty(name)
    is Invoice.Period.Period -> this.value.hasProperty(name)
    is Invoice.LineItem.Serviced.Date -> this.value.hasProperty(name)
    is Invoice.LineItem.Serviced.Period -> this.value.hasProperty(name)
    is Invoice.LineItem.ChargeItem.Reference -> this.value.hasProperty(name)
    is Invoice.LineItem.ChargeItem.CodeableConcept -> this.value.hasProperty(name)
    is StructureDefinition.VersionAlgorithm.String -> this.value.hasProperty(name)
    is StructureDefinition.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is ConditionDefinition.VersionAlgorithm.String -> this.value.hasProperty(name)
    is ConditionDefinition.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is ConditionDefinition.Precondition.Value.CodeableConcept -> this.value.hasProperty(name)
    is ConditionDefinition.Precondition.Value.Quantity -> this.value.hasProperty(name)
    is CommunicationRequest.Payload.Content.Attachment -> this.value.hasProperty(name)
    is CommunicationRequest.Payload.Content.Reference -> this.value.hasProperty(name)
    is CommunicationRequest.Payload.Content.CodeableConcept -> this.value.hasProperty(name)
    is CommunicationRequest.Occurrence.DateTime -> this.value.hasProperty(name)
    is CommunicationRequest.Occurrence.Period -> this.value.hasProperty(name)
    is GuidanceResponse.Module.Uri -> this.value.hasProperty(name)
    is GuidanceResponse.Module.Canonical -> this.value.hasProperty(name)
    is GuidanceResponse.Module.CodeableConcept -> this.value.hasProperty(name)
    is DetectedIssue.Identified.DateTime -> this.value.hasProperty(name)
    is DetectedIssue.Identified.Period -> this.value.hasProperty(name)
    is EvidenceVariable.VersionAlgorithm.String -> this.value.hasProperty(name)
    is EvidenceVariable.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.CodeableConcept ->
      this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Boolean ->
      this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Quantity ->
      this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Range ->
      this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Reference ->
      this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Id ->
      this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.Instances.Quantity -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.Instances.Range -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.Duration.Quantity -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.Duration.Range -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.TimeFromEvent.Event.CodeableConcept ->
      this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.TimeFromEvent.Event.Reference -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.TimeFromEvent.Event.DateTime -> this.value.hasProperty(name)
    is EvidenceVariable.Characteristic.TimeFromEvent.Event.Id -> this.value.hasProperty(name)
    is EvidenceVariable.Category.Value.CodeableConcept -> this.value.hasProperty(name)
    is EvidenceVariable.Category.Value.Quantity -> this.value.hasProperty(name)
    is EvidenceVariable.Category.Value.Range -> this.value.hasProperty(name)
    is MessageDefinition.VersionAlgorithm.String -> this.value.hasProperty(name)
    is MessageDefinition.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    else -> false
  }

private fun Any.hasPropertyInChoiceValue4(name: String): Boolean =
  when (this) {
    is MessageDefinition.Event.Coding -> this.value.hasProperty(name)
    is MessageDefinition.Event.Uri -> this.value.hasProperty(name)
    is ImplementationGuide.VersionAlgorithm.String -> this.value.hasProperty(name)
    is ImplementationGuide.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is ImplementationGuide.Definition.Page.Source.Url -> this.value.hasProperty(name)
    is ImplementationGuide.Definition.Page.Source.String -> this.value.hasProperty(name)
    is ImplementationGuide.Definition.Page.Source.Markdown -> this.value.hasProperty(name)
    is NutritionOrder.EnteralFormula.Administration.Rate.Quantity -> this.value.hasProperty(name)
    is NutritionOrder.EnteralFormula.Administration.Rate.Ratio -> this.value.hasProperty(name)
    is CoverageEligibilityRequest.Event.When.DateTime -> this.value.hasProperty(name)
    is CoverageEligibilityRequest.Event.When.Period -> this.value.hasProperty(name)
    is CoverageEligibilityRequest.Serviced.Date -> this.value.hasProperty(name)
    is CoverageEligibilityRequest.Serviced.Period -> this.value.hasProperty(name)
    is CoverageEligibilityRequest.Item.Diagnosis.Diagnosis.CodeableConcept ->
      this.value.hasProperty(name)
    is CoverageEligibilityRequest.Item.Diagnosis.Diagnosis.Reference -> this.value.hasProperty(name)
    is CodeSystem.VersionAlgorithm.String -> this.value.hasProperty(name)
    is CodeSystem.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is CodeSystem.Concept.Property.Value.Code -> this.value.hasProperty(name)
    is CodeSystem.Concept.Property.Value.Coding -> this.value.hasProperty(name)
    is CodeSystem.Concept.Property.Value.String -> this.value.hasProperty(name)
    is CodeSystem.Concept.Property.Value.Integer -> this.value.hasProperty(name)
    is CodeSystem.Concept.Property.Value.Boolean -> this.value.hasProperty(name)
    is CodeSystem.Concept.Property.Value.DateTime -> this.value.hasProperty(name)
    is CodeSystem.Concept.Property.Value.Decimal -> this.value.hasProperty(name)
    is MedicationRequest.Substitution.Allowed.Boolean -> this.value.hasProperty(name)
    is MedicationRequest.Substitution.Allowed.CodeableConcept -> this.value.hasProperty(name)
    is CompartmentDefinition.VersionAlgorithm.String -> this.value.hasProperty(name)
    is CompartmentDefinition.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is Coverage.CostToBeneficiary.Value.Quantity -> this.value.hasProperty(name)
    is Coverage.CostToBeneficiary.Value.Money -> this.value.hasProperty(name)
    is PaymentReconciliation.Allocation.TargetItem.String -> this.value.hasProperty(name)
    is PaymentReconciliation.Allocation.TargetItem.Identifier -> this.value.hasProperty(name)
    is PaymentReconciliation.Allocation.TargetItem.PositiveInt -> this.value.hasProperty(name)
    is MedicationKnowledge.Cost.Cost.Money -> this.value.hasProperty(name)
    is MedicationKnowledge.Cost.Cost.CodeableConcept -> this.value.hasProperty(name)
    is MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value.CodeableConcept ->
      this.value.hasProperty(name)
    is MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value.Quantity ->
      this.value.hasProperty(name)
    is MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value.Range ->
      this.value.hasProperty(name)
    is MedicationKnowledge.MedicineClassification.Source.String -> this.value.hasProperty(name)
    is MedicationKnowledge.MedicineClassification.Source.Uri -> this.value.hasProperty(name)
    is MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value.Quantity ->
      this.value.hasProperty(name)
    is MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value.Range ->
      this.value.hasProperty(name)
    is MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value.CodeableConcept ->
      this.value.hasProperty(name)
    is MedicationKnowledge.Definitional.Ingredient.Strength.Ratio -> this.value.hasProperty(name)
    is MedicationKnowledge.Definitional.Ingredient.Strength.CodeableConcept ->
      this.value.hasProperty(name)
    is MedicationKnowledge.Definitional.Ingredient.Strength.Quantity -> this.value.hasProperty(name)
    is MedicationKnowledge.Definitional.DrugCharacteristic.Value.CodeableConcept ->
      this.value.hasProperty(name)
    is MedicationKnowledge.Definitional.DrugCharacteristic.Value.String ->
      this.value.hasProperty(name)
    is MedicationKnowledge.Definitional.DrugCharacteristic.Value.Quantity ->
      this.value.hasProperty(name)
    is MedicationKnowledge.Definitional.DrugCharacteristic.Value.Base64Binary ->
      this.value.hasProperty(name)
    is MedicationKnowledge.Definitional.DrugCharacteristic.Value.Attachment ->
      this.value.hasProperty(name)
    is SubstanceReferenceInformation.Target.Amount.Quantity -> this.value.hasProperty(name)
    is SubstanceReferenceInformation.Target.Amount.Range -> this.value.hasProperty(name)
    is SubstanceReferenceInformation.Target.Amount.String -> this.value.hasProperty(name)
    is SearchParameter.VersionAlgorithm.String -> this.value.hasProperty(name)
    is SearchParameter.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is MedicationStatement.Effective.DateTime -> this.value.hasProperty(name)
    is MedicationStatement.Effective.Period -> this.value.hasProperty(name)
    is MedicationStatement.Effective.Timing -> this.value.hasProperty(name)
    is Person.Deceased.Boolean -> this.value.hasProperty(name)
    is Person.Deceased.DateTime -> this.value.hasProperty(name)
    is AdministrableProductDefinition.Property.Value.CodeableConcept -> this.value.hasProperty(name)
    is AdministrableProductDefinition.Property.Value.Quantity -> this.value.hasProperty(name)
    is AdministrableProductDefinition.Property.Value.Date -> this.value.hasProperty(name)
    is AdministrableProductDefinition.Property.Value.Boolean -> this.value.hasProperty(name)
    is AdministrableProductDefinition.Property.Value.Markdown -> this.value.hasProperty(name)
    is AdministrableProductDefinition.Property.Value.Attachment -> this.value.hasProperty(name)
    is AdministrableProductDefinition.Property.Value.Reference -> this.value.hasProperty(name)
    is AllergyIntolerance.Onset.DateTime -> this.value.hasProperty(name)
    is AllergyIntolerance.Onset.Age -> this.value.hasProperty(name)
    is AllergyIntolerance.Onset.Period -> this.value.hasProperty(name)
    is AllergyIntolerance.Onset.Range -> this.value.hasProperty(name)
    is AllergyIntolerance.Onset.String -> this.value.hasProperty(name)
    is Transport.Input.Value.Base64Binary -> this.value.hasProperty(name)
    is Transport.Input.Value.Boolean -> this.value.hasProperty(name)
    is Transport.Input.Value.Canonical -> this.value.hasProperty(name)
    is Transport.Input.Value.Code -> this.value.hasProperty(name)
    is Transport.Input.Value.Date -> this.value.hasProperty(name)
    is Transport.Input.Value.DateTime -> this.value.hasProperty(name)
    is Transport.Input.Value.Decimal -> this.value.hasProperty(name)
    is Transport.Input.Value.Id -> this.value.hasProperty(name)
    is Transport.Input.Value.Instant -> this.value.hasProperty(name)
    is Transport.Input.Value.Integer -> this.value.hasProperty(name)
    is Transport.Input.Value.Integer64 -> this.value.hasProperty(name)
    is Transport.Input.Value.Markdown -> this.value.hasProperty(name)
    is Transport.Input.Value.Oid -> this.value.hasProperty(name)
    is Transport.Input.Value.PositiveInt -> this.value.hasProperty(name)
    is Transport.Input.Value.String -> this.value.hasProperty(name)
    is Transport.Input.Value.Time -> this.value.hasProperty(name)
    is Transport.Input.Value.UnsignedInt -> this.value.hasProperty(name)
    is Transport.Input.Value.Uri -> this.value.hasProperty(name)
    is Transport.Input.Value.Url -> this.value.hasProperty(name)
    is Transport.Input.Value.Uuid -> this.value.hasProperty(name)
    is Transport.Input.Value.Address -> this.value.hasProperty(name)
    is Transport.Input.Value.Age -> this.value.hasProperty(name)
    is Transport.Input.Value.Annotation -> this.value.hasProperty(name)
    is Transport.Input.Value.Attachment -> this.value.hasProperty(name)
    is Transport.Input.Value.CodeableConcept -> this.value.hasProperty(name)
    is Transport.Input.Value.CodeableReference -> this.value.hasProperty(name)
    is Transport.Input.Value.Coding -> this.value.hasProperty(name)
    is Transport.Input.Value.ContactPoint -> this.value.hasProperty(name)
    is Transport.Input.Value.Count -> this.value.hasProperty(name)
    is Transport.Input.Value.Distance -> this.value.hasProperty(name)
    is Transport.Input.Value.Duration -> this.value.hasProperty(name)
    is Transport.Input.Value.HumanName -> this.value.hasProperty(name)
    is Transport.Input.Value.Identifier -> this.value.hasProperty(name)
    is Transport.Input.Value.Money -> this.value.hasProperty(name)
    is Transport.Input.Value.Period -> this.value.hasProperty(name)
    is Transport.Input.Value.Quantity -> this.value.hasProperty(name)
    is Transport.Input.Value.Range -> this.value.hasProperty(name)
    is Transport.Input.Value.Ratio -> this.value.hasProperty(name)
    is Transport.Input.Value.RatioRange -> this.value.hasProperty(name)
    is Transport.Input.Value.Reference -> this.value.hasProperty(name)
    is Transport.Input.Value.SampledData -> this.value.hasProperty(name)
    is Transport.Input.Value.Signature -> this.value.hasProperty(name)
    is Transport.Input.Value.Timing -> this.value.hasProperty(name)
    is Transport.Input.Value.ContactDetail -> this.value.hasProperty(name)
    is Transport.Input.Value.DataRequirement -> this.value.hasProperty(name)
    is Transport.Input.Value.Expression -> this.value.hasProperty(name)
    is Transport.Input.Value.ParameterDefinition -> this.value.hasProperty(name)
    is Transport.Input.Value.RelatedArtifact -> this.value.hasProperty(name)
    is Transport.Input.Value.TriggerDefinition -> this.value.hasProperty(name)
    is Transport.Input.Value.UsageContext -> this.value.hasProperty(name)
    is Transport.Input.Value.Availability -> this.value.hasProperty(name)
    is Transport.Input.Value.ExtendedContactDetail -> this.value.hasProperty(name)
    is Transport.Input.Value.Dosage -> this.value.hasProperty(name)
    is Transport.Input.Value.Meta -> this.value.hasProperty(name)
    is Transport.Output.Value.Base64Binary -> this.value.hasProperty(name)
    is Transport.Output.Value.Boolean -> this.value.hasProperty(name)
    is Transport.Output.Value.Canonical -> this.value.hasProperty(name)
    is Transport.Output.Value.Code -> this.value.hasProperty(name)
    is Transport.Output.Value.Date -> this.value.hasProperty(name)
    is Transport.Output.Value.DateTime -> this.value.hasProperty(name)
    is Transport.Output.Value.Decimal -> this.value.hasProperty(name)
    is Transport.Output.Value.Id -> this.value.hasProperty(name)
    is Transport.Output.Value.Instant -> this.value.hasProperty(name)
    is Transport.Output.Value.Integer -> this.value.hasProperty(name)
    is Transport.Output.Value.Integer64 -> this.value.hasProperty(name)
    is Transport.Output.Value.Markdown -> this.value.hasProperty(name)
    is Transport.Output.Value.Oid -> this.value.hasProperty(name)
    is Transport.Output.Value.PositiveInt -> this.value.hasProperty(name)
    is Transport.Output.Value.String -> this.value.hasProperty(name)
    is Transport.Output.Value.Time -> this.value.hasProperty(name)
    is Transport.Output.Value.UnsignedInt -> this.value.hasProperty(name)
    is Transport.Output.Value.Uri -> this.value.hasProperty(name)
    is Transport.Output.Value.Url -> this.value.hasProperty(name)
    is Transport.Output.Value.Uuid -> this.value.hasProperty(name)
    is Transport.Output.Value.Address -> this.value.hasProperty(name)
    is Transport.Output.Value.Age -> this.value.hasProperty(name)
    is Transport.Output.Value.Annotation -> this.value.hasProperty(name)
    else -> false
  }

private fun Any.hasPropertyInChoiceValue5(name: String): Boolean =
  when (this) {
    is Transport.Output.Value.Attachment -> this.value.hasProperty(name)
    is Transport.Output.Value.CodeableConcept -> this.value.hasProperty(name)
    is Transport.Output.Value.CodeableReference -> this.value.hasProperty(name)
    is Transport.Output.Value.Coding -> this.value.hasProperty(name)
    is Transport.Output.Value.ContactPoint -> this.value.hasProperty(name)
    is Transport.Output.Value.Count -> this.value.hasProperty(name)
    is Transport.Output.Value.Distance -> this.value.hasProperty(name)
    is Transport.Output.Value.Duration -> this.value.hasProperty(name)
    is Transport.Output.Value.HumanName -> this.value.hasProperty(name)
    is Transport.Output.Value.Identifier -> this.value.hasProperty(name)
    is Transport.Output.Value.Money -> this.value.hasProperty(name)
    is Transport.Output.Value.Period -> this.value.hasProperty(name)
    is Transport.Output.Value.Quantity -> this.value.hasProperty(name)
    is Transport.Output.Value.Range -> this.value.hasProperty(name)
    is Transport.Output.Value.Ratio -> this.value.hasProperty(name)
    is Transport.Output.Value.RatioRange -> this.value.hasProperty(name)
    is Transport.Output.Value.Reference -> this.value.hasProperty(name)
    is Transport.Output.Value.SampledData -> this.value.hasProperty(name)
    is Transport.Output.Value.Signature -> this.value.hasProperty(name)
    is Transport.Output.Value.Timing -> this.value.hasProperty(name)
    is Transport.Output.Value.ContactDetail -> this.value.hasProperty(name)
    is Transport.Output.Value.DataRequirement -> this.value.hasProperty(name)
    is Transport.Output.Value.Expression -> this.value.hasProperty(name)
    is Transport.Output.Value.ParameterDefinition -> this.value.hasProperty(name)
    is Transport.Output.Value.RelatedArtifact -> this.value.hasProperty(name)
    is Transport.Output.Value.TriggerDefinition -> this.value.hasProperty(name)
    is Transport.Output.Value.UsageContext -> this.value.hasProperty(name)
    is Transport.Output.Value.Availability -> this.value.hasProperty(name)
    is Transport.Output.Value.ExtendedContactDetail -> this.value.hasProperty(name)
    is Transport.Output.Value.Dosage -> this.value.hasProperty(name)
    is Transport.Output.Value.Meta -> this.value.hasProperty(name)
    is PlanDefinition.VersionAlgorithm.String -> this.value.hasProperty(name)
    is PlanDefinition.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is PlanDefinition.Subject.CodeableConcept -> this.value.hasProperty(name)
    is PlanDefinition.Subject.Reference -> this.value.hasProperty(name)
    is PlanDefinition.Subject.Canonical -> this.value.hasProperty(name)
    is PlanDefinition.Goal.Target.Detail.Quantity -> this.value.hasProperty(name)
    is PlanDefinition.Goal.Target.Detail.Range -> this.value.hasProperty(name)
    is PlanDefinition.Goal.Target.Detail.CodeableConcept -> this.value.hasProperty(name)
    is PlanDefinition.Goal.Target.Detail.String -> this.value.hasProperty(name)
    is PlanDefinition.Goal.Target.Detail.Boolean -> this.value.hasProperty(name)
    is PlanDefinition.Goal.Target.Detail.Integer -> this.value.hasProperty(name)
    is PlanDefinition.Goal.Target.Detail.Ratio -> this.value.hasProperty(name)
    is PlanDefinition.Action.Subject.CodeableConcept -> this.value.hasProperty(name)
    is PlanDefinition.Action.Subject.Reference -> this.value.hasProperty(name)
    is PlanDefinition.Action.Subject.Canonical -> this.value.hasProperty(name)
    is PlanDefinition.Action.RelatedAction.Offset.Duration -> this.value.hasProperty(name)
    is PlanDefinition.Action.RelatedAction.Offset.Range -> this.value.hasProperty(name)
    is PlanDefinition.Action.Timing.Age -> this.value.hasProperty(name)
    is PlanDefinition.Action.Timing.Duration -> this.value.hasProperty(name)
    is PlanDefinition.Action.Timing.Range -> this.value.hasProperty(name)
    is PlanDefinition.Action.Timing.Timing -> this.value.hasProperty(name)
    is PlanDefinition.Action.Definition.Canonical -> this.value.hasProperty(name)
    is PlanDefinition.Action.Definition.Uri -> this.value.hasProperty(name)
    is PlanDefinition.AsNeeded.Boolean -> this.value.hasProperty(name)
    is PlanDefinition.AsNeeded.CodeableConcept -> this.value.hasProperty(name)
    is ClinicalImpression.Effective.DateTime -> this.value.hasProperty(name)
    is ClinicalImpression.Effective.Period -> this.value.hasProperty(name)
    is CareTeam.Participant.Coverage.Period -> this.value.hasProperty(name)
    is CareTeam.Participant.Coverage.Timing -> this.value.hasProperty(name)
    is Device.Property.Value.Quantity -> this.value.hasProperty(name)
    is Device.Property.Value.CodeableConcept -> this.value.hasProperty(name)
    is Device.Property.Value.String -> this.value.hasProperty(name)
    is Device.Property.Value.Boolean -> this.value.hasProperty(name)
    is Device.Property.Value.Integer -> this.value.hasProperty(name)
    is Device.Property.Value.Range -> this.value.hasProperty(name)
    is Device.Property.Value.Attachment -> this.value.hasProperty(name)
    is NutritionProduct.Characteristic.Value.CodeableConcept -> this.value.hasProperty(name)
    is NutritionProduct.Characteristic.Value.String -> this.value.hasProperty(name)
    is NutritionProduct.Characteristic.Value.Quantity -> this.value.hasProperty(name)
    is NutritionProduct.Characteristic.Value.Base64Binary -> this.value.hasProperty(name)
    is NutritionProduct.Characteristic.Value.Attachment -> this.value.hasProperty(name)
    is NutritionProduct.Characteristic.Value.Boolean -> this.value.hasProperty(name)
    is MedicinalProductDefinition.Characteristic.Value.CodeableConcept ->
      this.value.hasProperty(name)
    is MedicinalProductDefinition.Characteristic.Value.Markdown -> this.value.hasProperty(name)
    is MedicinalProductDefinition.Characteristic.Value.Quantity -> this.value.hasProperty(name)
    is MedicinalProductDefinition.Characteristic.Value.Integer -> this.value.hasProperty(name)
    is MedicinalProductDefinition.Characteristic.Value.Date -> this.value.hasProperty(name)
    is MedicinalProductDefinition.Characteristic.Value.Boolean -> this.value.hasProperty(name)
    is MedicinalProductDefinition.Characteristic.Value.Attachment -> this.value.hasProperty(name)
    is Communication.Payload.Content.Attachment -> this.value.hasProperty(name)
    is Communication.Payload.Content.Reference -> this.value.hasProperty(name)
    is Communication.Payload.Content.CodeableConcept -> this.value.hasProperty(name)
    is Library.VersionAlgorithm.String -> this.value.hasProperty(name)
    is Library.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is Library.Subject.CodeableConcept -> this.value.hasProperty(name)
    is Library.Subject.Reference -> this.value.hasProperty(name)
    is StructureMap.VersionAlgorithm.String -> this.value.hasProperty(name)
    is StructureMap.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Id -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.String -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Boolean -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Integer -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Decimal -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Date -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.Time -> this.value.hasProperty(name)
    is StructureMap.Group.Rule.Target.Parameter.Value.DateTime -> this.value.hasProperty(name)
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
    is Task.Input.Value.Integer64 -> this.value.hasProperty(name)
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
    is Task.Input.Value.CodeableReference -> this.value.hasProperty(name)
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
    is Task.Input.Value.RatioRange -> this.value.hasProperty(name)
    is Task.Input.Value.Reference -> this.value.hasProperty(name)
    is Task.Input.Value.SampledData -> this.value.hasProperty(name)
    is Task.Input.Value.Signature -> this.value.hasProperty(name)
    is Task.Input.Value.Timing -> this.value.hasProperty(name)
    is Task.Input.Value.ContactDetail -> this.value.hasProperty(name)
    is Task.Input.Value.DataRequirement -> this.value.hasProperty(name)
    is Task.Input.Value.Expression -> this.value.hasProperty(name)
    is Task.Input.Value.ParameterDefinition -> this.value.hasProperty(name)
    is Task.Input.Value.RelatedArtifact -> this.value.hasProperty(name)
    is Task.Input.Value.TriggerDefinition -> this.value.hasProperty(name)
    is Task.Input.Value.UsageContext -> this.value.hasProperty(name)
    is Task.Input.Value.Availability -> this.value.hasProperty(name)
    is Task.Input.Value.ExtendedContactDetail -> this.value.hasProperty(name)
    is Task.Input.Value.Dosage -> this.value.hasProperty(name)
    else -> false
  }

private fun Any.hasPropertyInChoiceValue6(name: String): Boolean =
  when (this) {
    is Task.Input.Value.Meta -> this.value.hasProperty(name)
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
    is Task.Output.Value.Integer64 -> this.value.hasProperty(name)
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
    is Task.Output.Value.CodeableReference -> this.value.hasProperty(name)
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
    is Task.Output.Value.RatioRange -> this.value.hasProperty(name)
    is Task.Output.Value.Reference -> this.value.hasProperty(name)
    is Task.Output.Value.SampledData -> this.value.hasProperty(name)
    is Task.Output.Value.Signature -> this.value.hasProperty(name)
    is Task.Output.Value.Timing -> this.value.hasProperty(name)
    is Task.Output.Value.ContactDetail -> this.value.hasProperty(name)
    is Task.Output.Value.DataRequirement -> this.value.hasProperty(name)
    is Task.Output.Value.Expression -> this.value.hasProperty(name)
    is Task.Output.Value.ParameterDefinition -> this.value.hasProperty(name)
    is Task.Output.Value.RelatedArtifact -> this.value.hasProperty(name)
    is Task.Output.Value.TriggerDefinition -> this.value.hasProperty(name)
    is Task.Output.Value.UsageContext -> this.value.hasProperty(name)
    is Task.Output.Value.Availability -> this.value.hasProperty(name)
    is Task.Output.Value.ExtendedContactDetail -> this.value.hasProperty(name)
    is Task.Output.Value.Dosage -> this.value.hasProperty(name)
    is Task.Output.Value.Meta -> this.value.hasProperty(name)
    is EvidenceReport.CiteAs.Reference -> this.value.hasProperty(name)
    is EvidenceReport.CiteAs.Markdown -> this.value.hasProperty(name)
    is EvidenceReport.Subject.Characteristic.Value.Reference -> this.value.hasProperty(name)
    is EvidenceReport.Subject.Characteristic.Value.CodeableConcept -> this.value.hasProperty(name)
    is EvidenceReport.Subject.Characteristic.Value.Boolean -> this.value.hasProperty(name)
    is EvidenceReport.Subject.Characteristic.Value.Quantity -> this.value.hasProperty(name)
    is EvidenceReport.Subject.Characteristic.Value.Range -> this.value.hasProperty(name)
    is Requirements.VersionAlgorithm.String -> this.value.hasProperty(name)
    is Requirements.VersionAlgorithm.Coding -> this.value.hasProperty(name)
    is Practitioner.Deceased.Boolean -> this.value.hasProperty(name)
    is Practitioner.Deceased.DateTime -> this.value.hasProperty(name)
    is Ingredient.Substance.Strength.Presentation.Ratio -> this.value.hasProperty(name)
    is Ingredient.Substance.Strength.Presentation.RatioRange -> this.value.hasProperty(name)
    is Ingredient.Substance.Strength.Presentation.CodeableConcept -> this.value.hasProperty(name)
    is Ingredient.Substance.Strength.Presentation.Quantity -> this.value.hasProperty(name)
    is Ingredient.Substance.Strength.Concentration.Ratio -> this.value.hasProperty(name)
    is Ingredient.Substance.Strength.Concentration.RatioRange -> this.value.hasProperty(name)
    is Ingredient.Substance.Strength.Concentration.CodeableConcept -> this.value.hasProperty(name)
    is Ingredient.Substance.Strength.Concentration.Quantity -> this.value.hasProperty(name)
    is Ingredient.Substance.Strength.ReferenceStrength.Strength.Ratio ->
      this.value.hasProperty(name)
    is Ingredient.Substance.Strength.ReferenceStrength.Strength.RatioRange ->
      this.value.hasProperty(name)
    is Ingredient.Substance.Strength.ReferenceStrength.Strength.Quantity ->
      this.value.hasProperty(name)
    is Observation.Instantiates.Canonical -> this.value.hasProperty(name)
    is Observation.Instantiates.Reference -> this.value.hasProperty(name)
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
    is Observation.Value.Attachment -> this.value.hasProperty(name)
    is Observation.Value.Reference -> this.value.hasProperty(name)
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
    is Observation.Component.Value.Attachment -> this.value.hasProperty(name)
    is Observation.Component.Value.Reference -> this.value.hasProperty(name)
    is DocumentReference.Content.Profile.Value.Coding -> this.value.hasProperty(name)
    is DocumentReference.Content.Profile.Value.Uri -> this.value.hasProperty(name)
    is DocumentReference.Content.Profile.Value.Canonical -> this.value.hasProperty(name)
    is Procedure.Occurrence.DateTime -> this.value.hasProperty(name)
    is Procedure.Occurrence.Period -> this.value.hasProperty(name)
    is Procedure.Occurrence.String -> this.value.hasProperty(name)
    is Procedure.Occurrence.Age -> this.value.hasProperty(name)
    is Procedure.Occurrence.Range -> this.value.hasProperty(name)
    is Procedure.Occurrence.Timing -> this.value.hasProperty(name)
    is Procedure.Reported.Boolean -> this.value.hasProperty(name)
    is Procedure.Reported.Reference -> this.value.hasProperty(name)
    is AdverseEvent.Occurrence.DateTime -> this.value.hasProperty(name)
    is AdverseEvent.Occurrence.Period -> this.value.hasProperty(name)
    is AdverseEvent.Occurrence.Timing -> this.value.hasProperty(name)
    is AdverseEvent.SuspectEntity.Instance.CodeableConcept -> this.value.hasProperty(name)
    is AdverseEvent.SuspectEntity.Instance.Reference -> this.value.hasProperty(name)
    is AdverseEvent.ContributingFactor.Item.Reference -> this.value.hasProperty(name)
    is AdverseEvent.ContributingFactor.Item.CodeableConcept -> this.value.hasProperty(name)
    is AdverseEvent.PreventiveAction.Item.Reference -> this.value.hasProperty(name)
    is AdverseEvent.PreventiveAction.Item.CodeableConcept -> this.value.hasProperty(name)
    is AdverseEvent.MitigatingAction.Item.Reference -> this.value.hasProperty(name)
    is AdverseEvent.MitigatingAction.Item.CodeableConcept -> this.value.hasProperty(name)
    is AdverseEvent.SupportingInfo.Item.Reference -> this.value.hasProperty(name)
    is AdverseEvent.SupportingInfo.Item.CodeableConcept -> this.value.hasProperty(name)
    else -> false
  }

internal fun Any.hasPropertyInChoiceValue(name: String): Boolean {
  if (hasPropertyInChoiceValue0(name)) return true
  if (hasPropertyInChoiceValue1(name)) return true
  if (hasPropertyInChoiceValue2(name)) return true
  if (hasPropertyInChoiceValue3(name)) return true
  if (hasPropertyInChoiceValue4(name)) return true
  if (hasPropertyInChoiceValue5(name)) return true
  if (hasPropertyInChoiceValue6(name)) return true
  return false
}

private fun Any.unwrapChoiceValue0(): Any? =
  when (this) {
    is SubscriptionTopic.VersionAlgorithm.String -> this.value
    is SubscriptionTopic.VersionAlgorithm.Coding -> this.value
    is RequestOrchestration.Action.RelatedAction.Offset.Duration -> this.value
    is RequestOrchestration.Action.RelatedAction.Offset.Range -> this.value
    is RequestOrchestration.Action.Timing.DateTime -> this.value
    is RequestOrchestration.Action.Timing.Age -> this.value
    is RequestOrchestration.Action.Timing.Period -> this.value
    is RequestOrchestration.Action.Timing.Duration -> this.value
    is RequestOrchestration.Action.Timing.Range -> this.value
    is RequestOrchestration.Action.Timing.Timing -> this.value
    is RequestOrchestration.Action.Participant.Actor.Canonical -> this.value
    is RequestOrchestration.Action.Participant.Actor.Reference -> this.value
    is RequestOrchestration.Action.Definition.Canonical -> this.value
    is RequestOrchestration.Action.Definition.Uri -> this.value
    is ArtifactAssessment.CiteAs.Reference -> this.value
    is ArtifactAssessment.CiteAs.Markdown -> this.value
    is ArtifactAssessment.Artifact.Reference -> this.value
    is ArtifactAssessment.Artifact.Canonical -> this.value
    is ArtifactAssessment.Artifact.Uri -> this.value
    is ExampleScenario.VersionAlgorithm.String -> this.value
    is ExampleScenario.VersionAlgorithm.Coding -> this.value
    is ExampleScenario.Instance.StructureProfile.Canonical -> this.value
    is ExampleScenario.Instance.StructureProfile.Uri -> this.value
    is ActorDefinition.VersionAlgorithm.String -> this.value
    is ActorDefinition.VersionAlgorithm.Coding -> this.value
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
    is SupplyDelivery.SuppliedItem.Item.CodeableConcept -> this.value
    is SupplyDelivery.SuppliedItem.Item.Reference -> this.value
    is SupplyDelivery.Occurrence.DateTime -> this.value
    is SupplyDelivery.Occurrence.Period -> this.value
    is SupplyDelivery.Occurrence.Timing -> this.value
    is MedicationAdministration.Occurence.DateTime -> this.value
    is MedicationAdministration.Occurence.Period -> this.value
    is MedicationAdministration.Occurence.Timing -> this.value
    is MedicationAdministration.Dosage.Rate.Ratio -> this.value
    is MedicationAdministration.Dosage.Rate.Quantity -> this.value
    is Claim.Event.When.DateTime -> this.value
    is Claim.Event.When.Period -> this.value
    is Claim.SupportingInfo.Timing.Date -> this.value
    is Claim.SupportingInfo.Timing.Period -> this.value
    is Claim.SupportingInfo.Value.Boolean -> this.value
    is Claim.SupportingInfo.Value.String -> this.value
    is Claim.SupportingInfo.Value.Quantity -> this.value
    is Claim.SupportingInfo.Value.Attachment -> this.value
    is Claim.SupportingInfo.Value.Reference -> this.value
    is Claim.SupportingInfo.Value.Identifier -> this.value
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
    is AuditEvent.Occurred.Period -> this.value
    is AuditEvent.Occurred.DateTime -> this.value
    is AuditEvent.Agent.Network.Reference -> this.value
    is AuditEvent.Agent.Network.Uri -> this.value
    is AuditEvent.Agent.Network.String -> this.value
    is AuditEvent.Entity.Detail.Value.Quantity -> this.value
    is AuditEvent.Entity.Detail.Value.CodeableConcept -> this.value
    is AuditEvent.Entity.Detail.Value.String -> this.value
    is AuditEvent.Entity.Detail.Value.Boolean -> this.value
    is AuditEvent.Entity.Detail.Value.Integer -> this.value
    is AuditEvent.Entity.Detail.Value.Range -> this.value
    is AuditEvent.Entity.Detail.Value.Ratio -> this.value
    is AuditEvent.Entity.Detail.Value.Time -> this.value
    is AuditEvent.Entity.Detail.Value.DateTime -> this.value
    is AuditEvent.Entity.Detail.Value.Period -> this.value
    is AuditEvent.Entity.Detail.Value.Base64Binary -> this.value
    is ServiceRequest.OrderDetail.Parameter.Value.Quantity -> this.value
    is ServiceRequest.OrderDetail.Parameter.Value.Ratio -> this.value
    is ServiceRequest.OrderDetail.Parameter.Value.Range -> this.value
    is ServiceRequest.OrderDetail.Parameter.Value.Boolean -> this.value
    is ServiceRequest.OrderDetail.Parameter.Value.CodeableConcept -> this.value
    is ServiceRequest.OrderDetail.Parameter.Value.String -> this.value
    is ServiceRequest.OrderDetail.Parameter.Value.Period -> this.value
    is ServiceRequest.Quantity.Quantity -> this.value
    is ServiceRequest.Quantity.Ratio -> this.value
    is ServiceRequest.Quantity.Range -> this.value
    is ServiceRequest.Occurrence.DateTime -> this.value
    is ServiceRequest.Occurrence.Period -> this.value
    is ServiceRequest.Occurrence.Timing -> this.value
    is ServiceRequest.AsNeeded.Boolean -> this.value
    is ServiceRequest.AsNeeded.CodeableConcept -> this.value
    is ServiceRequest.PatientInstruction.Instruction.Markdown -> this.value
    is ServiceRequest.PatientInstruction.Instruction.Reference -> this.value
    is NutritionIntake.Occurrence.DateTime -> this.value
    is NutritionIntake.Occurrence.Period -> this.value
    is NutritionIntake.Reported.Boolean -> this.value
    is NutritionIntake.Reported.Reference -> this.value
    is EventDefinition.VersionAlgorithm.String -> this.value
    is EventDefinition.VersionAlgorithm.Coding -> this.value
    is EventDefinition.Subject.CodeableConcept -> this.value
    is EventDefinition.Subject.Reference -> this.value
    is CoverageEligibilityResponse.Event.When.DateTime -> this.value
    is CoverageEligibilityResponse.Event.When.Period -> this.value
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
    is Citation.VersionAlgorithm.String -> this.value
    is Citation.VersionAlgorithm.Coding -> this.value
    is Measure.VersionAlgorithm.String -> this.value
    is Measure.VersionAlgorithm.Coding -> this.value
    is Measure.Subject.CodeableConcept -> this.value
    is Measure.Subject.Reference -> this.value
    is Measure.Group.Subject.CodeableConcept -> this.value
    is Measure.Group.Subject.Reference -> this.value
    is ActivityDefinition.VersionAlgorithm.String -> this.value
    is ActivityDefinition.VersionAlgorithm.Coding -> this.value
    is ActivityDefinition.Subject.CodeableConcept -> this.value
    is ActivityDefinition.Subject.Reference -> this.value
    is ActivityDefinition.Subject.Canonical -> this.value
    is ActivityDefinition.Timing.Timing -> this.value
    is ActivityDefinition.Timing.Age -> this.value
    is ActivityDefinition.Timing.Range -> this.value
    is ActivityDefinition.Timing.Duration -> this.value
    is ActivityDefinition.AsNeeded.Boolean -> this.value
    else -> null
  }

private fun Any.unwrapChoiceValue1(): Any? =
  when (this) {
    is ActivityDefinition.AsNeeded.CodeableConcept -> this.value
    is ActivityDefinition.Product.Reference -> this.value
    is ActivityDefinition.Product.CodeableConcept -> this.value
    is DeviceRequest.Parameter.Value.CodeableConcept -> this.value
    is DeviceRequest.Parameter.Value.Quantity -> this.value
    is DeviceRequest.Parameter.Value.Range -> this.value
    is DeviceRequest.Parameter.Value.Boolean -> this.value
    is DeviceRequest.Occurrence.DateTime -> this.value
    is DeviceRequest.Occurrence.Period -> this.value
    is DeviceRequest.Occurrence.Timing -> this.value
    is CapabilityStatement.VersionAlgorithm.String -> this.value
    is CapabilityStatement.VersionAlgorithm.Coding -> this.value
    is Substance.Ingredient.Substance.CodeableConcept -> this.value
    is Substance.Ingredient.Substance.Reference -> this.value
    is Group.Characteristic.Value.CodeableConcept -> this.value
    is Group.Characteristic.Value.Boolean -> this.value
    is Group.Characteristic.Value.Quantity -> this.value
    is Group.Characteristic.Value.Range -> this.value
    is Group.Characteristic.Value.Reference -> this.value
    is MolecularSequence.Relative.StartingSequence.Sequence.CodeableConcept -> this.value
    is MolecularSequence.Relative.StartingSequence.Sequence.String -> this.value
    is MolecularSequence.Relative.StartingSequence.Sequence.Reference -> this.value
    is RegulatedAuthorization.Case.Date.Period -> this.value
    is RegulatedAuthorization.Case.Date.DateTime -> this.value
    is ChargeItemDefinition.VersionAlgorithm.String -> this.value
    is ChargeItemDefinition.VersionAlgorithm.Coding -> this.value
    is Questionnaire.VersionAlgorithm.String -> this.value
    is Questionnaire.VersionAlgorithm.Coding -> this.value
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
    is Questionnaire.Item.Initial.Value.String -> this.value
    is Questionnaire.Item.Initial.Value.Uri -> this.value
    is Questionnaire.Item.Initial.Value.Attachment -> this.value
    is Questionnaire.Item.Initial.Value.Coding -> this.value
    is Questionnaire.Item.Initial.Value.Quantity -> this.value
    is Questionnaire.Item.Initial.Value.Reference -> this.value
    is TestScript.VersionAlgorithm.String -> this.value
    is TestScript.VersionAlgorithm.Coding -> this.value
    is TestScript.Setup.Action.Assert.Requirement.Link.Uri -> this.value
    is TestScript.Setup.Action.Assert.Requirement.Link.Canonical -> this.value
    is TestReport.Setup.Action.Assert.Requirement.Link.Uri -> this.value
    is TestReport.Setup.Action.Assert.Requirement.Link.Canonical -> this.value
    is DeviceUsage.Timing.Timing -> this.value
    is DeviceUsage.Timing.Period -> this.value
    is DeviceUsage.Timing.DateTime -> this.value
    is MeasureReport.Group.MeasureScore.Quantity -> this.value
    is MeasureReport.Group.MeasureScore.DateTime -> this.value
    is MeasureReport.Group.MeasureScore.CodeableConcept -> this.value
    is MeasureReport.Group.MeasureScore.Period -> this.value
    is MeasureReport.Group.MeasureScore.Range -> this.value
    is MeasureReport.Group.MeasureScore.Duration -> this.value
    is MeasureReport.Group.Stratifier.Stratum.Value.CodeableConcept -> this.value
    is MeasureReport.Group.Stratifier.Stratum.Value.Boolean -> this.value
    is MeasureReport.Group.Stratifier.Stratum.Value.Quantity -> this.value
    is MeasureReport.Group.Stratifier.Stratum.Value.Range -> this.value
    is MeasureReport.Group.Stratifier.Stratum.Value.Reference -> this.value
    is MeasureReport.Group.Stratifier.Stratum.Component.Value.CodeableConcept -> this.value
    is MeasureReport.Group.Stratifier.Stratum.Component.Value.Boolean -> this.value
    is MeasureReport.Group.Stratifier.Stratum.Component.Value.Quantity -> this.value
    is MeasureReport.Group.Stratifier.Stratum.Component.Value.Range -> this.value
    is MeasureReport.Group.Stratifier.Stratum.Component.Value.Reference -> this.value
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.Quantity -> this.value
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.DateTime -> this.value
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.CodeableConcept -> this.value
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.Period -> this.value
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.Range -> this.value
    is MeasureReport.Group.Stratifier.Stratum.MeasureScore.Duration -> this.value
    is SubstanceDefinition.Moiety.Amount.Quantity -> this.value
    is SubstanceDefinition.Moiety.Amount.String -> this.value
    is SubstanceDefinition.Property.Value.CodeableConcept -> this.value
    is SubstanceDefinition.Property.Value.Quantity -> this.value
    is SubstanceDefinition.Property.Value.Date -> this.value
    is SubstanceDefinition.Property.Value.Boolean -> this.value
    is SubstanceDefinition.Property.Value.Attachment -> this.value
    is SubstanceDefinition.Relationship.SubstanceDefinition.Reference -> this.value
    is SubstanceDefinition.Relationship.SubstanceDefinition.CodeableConcept -> this.value
    is SubstanceDefinition.Relationship.Amount.Quantity -> this.value
    is SubstanceDefinition.Relationship.Amount.Ratio -> this.value
    is SubstanceDefinition.Relationship.Amount.String -> this.value
    is SupplyRequest.Parameter.Value.CodeableConcept -> this.value
    is SupplyRequest.Parameter.Value.Quantity -> this.value
    is SupplyRequest.Parameter.Value.Range -> this.value
    is SupplyRequest.Parameter.Value.Boolean -> this.value
    is SupplyRequest.Occurrence.DateTime -> this.value
    is SupplyRequest.Occurrence.Period -> this.value
    is SupplyRequest.Occurrence.Timing -> this.value
    is GenomicStudy.Analysis.Input.GeneratedBy.Identifier -> this.value
    is GenomicStudy.Analysis.Input.GeneratedBy.Reference -> this.value
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
    is Parameters.Parameter.Value.Integer64 -> this.value
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
    is Parameters.Parameter.Value.CodeableReference -> this.value
    is Parameters.Parameter.Value.Coding -> this.value
    is Parameters.Parameter.Value.ContactPoint -> this.value
    is Parameters.Parameter.Value.Count -> this.value
    is Parameters.Parameter.Value.Distance -> this.value
    is Parameters.Parameter.Value.Duration -> this.value
    is Parameters.Parameter.Value.HumanName -> this.value
    is Parameters.Parameter.Value.Identifier -> this.value
    is Parameters.Parameter.Value.Money -> this.value
    else -> null
  }

private fun Any.unwrapChoiceValue2(): Any? =
  when (this) {
    is Parameters.Parameter.Value.Period -> this.value
    is Parameters.Parameter.Value.Quantity -> this.value
    is Parameters.Parameter.Value.Range -> this.value
    is Parameters.Parameter.Value.Ratio -> this.value
    is Parameters.Parameter.Value.RatioRange -> this.value
    is Parameters.Parameter.Value.Reference -> this.value
    is Parameters.Parameter.Value.SampledData -> this.value
    is Parameters.Parameter.Value.Signature -> this.value
    is Parameters.Parameter.Value.Timing -> this.value
    is Parameters.Parameter.Value.ContactDetail -> this.value
    is Parameters.Parameter.Value.DataRequirement -> this.value
    is Parameters.Parameter.Value.Expression -> this.value
    is Parameters.Parameter.Value.ParameterDefinition -> this.value
    is Parameters.Parameter.Value.RelatedArtifact -> this.value
    is Parameters.Parameter.Value.TriggerDefinition -> this.value
    is Parameters.Parameter.Value.UsageContext -> this.value
    is Parameters.Parameter.Value.Availability -> this.value
    is Parameters.Parameter.Value.ExtendedContactDetail -> this.value
    is Parameters.Parameter.Value.Dosage -> this.value
    is Parameters.Parameter.Value.Meta -> this.value
    is Evidence.VersionAlgorithm.String -> this.value
    is Evidence.VersionAlgorithm.Coding -> this.value
    is Evidence.CiteAs.Reference -> this.value
    is Evidence.CiteAs.Markdown -> this.value
    is NamingSystem.VersionAlgorithm.String -> this.value
    is NamingSystem.VersionAlgorithm.Coding -> this.value
    is ExplanationOfBenefit.Event.When.DateTime -> this.value
    is ExplanationOfBenefit.Event.When.Period -> this.value
    is ExplanationOfBenefit.SupportingInfo.Timing.Date -> this.value
    is ExplanationOfBenefit.SupportingInfo.Timing.Period -> this.value
    is ExplanationOfBenefit.SupportingInfo.Value.Boolean -> this.value
    is ExplanationOfBenefit.SupportingInfo.Value.String -> this.value
    is ExplanationOfBenefit.SupportingInfo.Value.Quantity -> this.value
    is ExplanationOfBenefit.SupportingInfo.Value.Attachment -> this.value
    is ExplanationOfBenefit.SupportingInfo.Value.Reference -> this.value
    is ExplanationOfBenefit.SupportingInfo.Value.Identifier -> this.value
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
    is PackagedProductDefinition.Packaging.Property.Value.CodeableConcept -> this.value
    is PackagedProductDefinition.Packaging.Property.Value.Quantity -> this.value
    is PackagedProductDefinition.Packaging.Property.Value.Date -> this.value
    is PackagedProductDefinition.Packaging.Property.Value.Boolean -> this.value
    is PackagedProductDefinition.Packaging.Property.Value.Attachment -> this.value
    is Patient.Deceased.Boolean -> this.value
    is Patient.Deceased.DateTime -> this.value
    is Patient.MultipleBirth.Boolean -> this.value
    is Patient.MultipleBirth.Integer -> this.value
    is ManufacturedItemDefinition.Property.Value.CodeableConcept -> this.value
    is ManufacturedItemDefinition.Property.Value.Quantity -> this.value
    is ManufacturedItemDefinition.Property.Value.Date -> this.value
    is ManufacturedItemDefinition.Property.Value.Boolean -> this.value
    is ManufacturedItemDefinition.Property.Value.Markdown -> this.value
    is ManufacturedItemDefinition.Property.Value.Attachment -> this.value
    is ManufacturedItemDefinition.Property.Value.Reference -> this.value
    is Specimen.Collection.Collected.DateTime -> this.value
    is Specimen.Collection.Collected.Period -> this.value
    is Specimen.Collection.FastingStatus.CodeableConcept -> this.value
    is Specimen.Collection.FastingStatus.Duration -> this.value
    is Specimen.Processing.Time.DateTime -> this.value
    is Specimen.Processing.Time.Period -> this.value
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
    is FamilyMemberHistory.Procedure.Performed.Age -> this.value
    is FamilyMemberHistory.Procedure.Performed.Range -> this.value
    is FamilyMemberHistory.Procedure.Performed.Period -> this.value
    is FamilyMemberHistory.Procedure.Performed.String -> this.value
    is FamilyMemberHistory.Procedure.Performed.DateTime -> this.value
    is OperationDefinition.VersionAlgorithm.String -> this.value
    is OperationDefinition.VersionAlgorithm.Coding -> this.value
    is GraphDefinition.VersionAlgorithm.String -> this.value
    is GraphDefinition.VersionAlgorithm.Coding -> this.value
    is Medication.Ingredient.Strength.Ratio -> this.value
    is Medication.Ingredient.Strength.CodeableConcept -> this.value
    is Medication.Ingredient.Strength.Quantity -> this.value
    is DiagnosticReport.Effective.DateTime -> this.value
    is DiagnosticReport.Effective.Period -> this.value
    is MessageHeader.Event.Coding -> this.value
    is MessageHeader.Event.Canonical -> this.value
    is MessageHeader.Destination.Endpoint.Url -> this.value
    is MessageHeader.Destination.Endpoint.Reference -> this.value
    is MessageHeader.Source.Endpoint.Url -> this.value
    is MessageHeader.Source.Endpoint.Reference -> this.value
    is DeviceDefinition.Property.Value.Quantity -> this.value
    is DeviceDefinition.Property.Value.CodeableConcept -> this.value
    is DeviceDefinition.Property.Value.String -> this.value
    is DeviceDefinition.Property.Value.Boolean -> this.value
    is DeviceDefinition.Property.Value.Integer -> this.value
    is DeviceDefinition.Property.Value.Range -> this.value
    is DeviceDefinition.Property.Value.Attachment -> this.value
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
    is ObservationDefinition.VersionAlgorithm.String -> this.value
    is ObservationDefinition.VersionAlgorithm.Coding -> this.value
    is Immunization.Occurrence.DateTime -> this.value
    is Immunization.Occurrence.String -> this.value
    is ValueSet.VersionAlgorithm.String -> this.value
    is ValueSet.VersionAlgorithm.Coding -> this.value
    is ValueSet.Expansion.Parameter.Value.String -> this.value
    is ValueSet.Expansion.Parameter.Value.Boolean -> this.value
    is ValueSet.Expansion.Parameter.Value.Integer -> this.value
    is ValueSet.Expansion.Parameter.Value.Decimal -> this.value
    is ValueSet.Expansion.Parameter.Value.Uri -> this.value
    is ValueSet.Expansion.Parameter.Value.Code -> this.value
    is ValueSet.Expansion.Parameter.Value.DateTime -> this.value
    is ValueSet.Expansion.Contains.Property.Value.Code -> this.value
    is ValueSet.Expansion.Contains.Property.Value.Coding -> this.value
    is ValueSet.Expansion.Contains.Property.Value.String -> this.value
    is ValueSet.Expansion.Contains.Property.Value.Integer -> this.value
    is ValueSet.Expansion.Contains.Property.Value.Boolean -> this.value
    else -> null
  }

private fun Any.unwrapChoiceValue3(): Any? =
  when (this) {
    is ValueSet.Expansion.Contains.Property.Value.DateTime -> this.value
    is ValueSet.Expansion.Contains.Property.Value.Decimal -> this.value
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.Code -> this.value
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.Coding -> this.value
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.String -> this.value
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.Integer -> this.value
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.Boolean -> this.value
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.DateTime -> this.value
    is ValueSet.Expansion.Contains.Property.SubProperty.Value.Decimal -> this.value
    is ClaimResponse.Event.When.DateTime -> this.value
    is ClaimResponse.Event.When.Period -> this.value
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
    is BiologicallyDerivedProduct.Property.Value.Boolean -> this.value
    is BiologicallyDerivedProduct.Property.Value.Integer -> this.value
    is BiologicallyDerivedProduct.Property.Value.CodeableConcept -> this.value
    is BiologicallyDerivedProduct.Property.Value.Period -> this.value
    is BiologicallyDerivedProduct.Property.Value.Quantity -> this.value
    is BiologicallyDerivedProduct.Property.Value.Range -> this.value
    is BiologicallyDerivedProduct.Property.Value.Ratio -> this.value
    is BiologicallyDerivedProduct.Property.Value.String -> this.value
    is BiologicallyDerivedProduct.Property.Value.Attachment -> this.value
    is InventoryItem.Characteristic.Value.String -> this.value
    is InventoryItem.Characteristic.Value.Integer -> this.value
    is InventoryItem.Characteristic.Value.Decimal -> this.value
    is InventoryItem.Characteristic.Value.Boolean -> this.value
    is InventoryItem.Characteristic.Value.Url -> this.value
    is InventoryItem.Characteristic.Value.DateTime -> this.value
    is InventoryItem.Characteristic.Value.Quantity -> this.value
    is InventoryItem.Characteristic.Value.Range -> this.value
    is InventoryItem.Characteristic.Value.Ratio -> this.value
    is InventoryItem.Characteristic.Value.Annotation -> this.value
    is InventoryItem.Characteristic.Value.Address -> this.value
    is InventoryItem.Characteristic.Value.Duration -> this.value
    is InventoryItem.Characteristic.Value.CodeableConcept -> this.value
    is TestPlan.VersionAlgorithm.String -> this.value
    is TestPlan.VersionAlgorithm.Coding -> this.value
    is TestPlan.TestCase.TestRun.Script.Source.String -> this.value
    is TestPlan.TestCase.TestRun.Script.Source.Reference -> this.value
    is TestPlan.TestCase.TestData.Source.String -> this.value
    is TestPlan.TestCase.TestData.Source.Reference -> this.value
    is TerminologyCapabilities.VersionAlgorithm.String -> this.value
    is TerminologyCapabilities.VersionAlgorithm.Coding -> this.value
    is ClinicalUseDefinition.Indication.Duration.Range -> this.value
    is ClinicalUseDefinition.Indication.Duration.String -> this.value
    is ClinicalUseDefinition.Interaction.Interactant.Item.Reference -> this.value
    is ClinicalUseDefinition.Interaction.Interactant.Item.CodeableConcept -> this.value
    is SpecimenDefinition.VersionAlgorithm.String -> this.value
    is SpecimenDefinition.VersionAlgorithm.Coding -> this.value
    is SpecimenDefinition.Subject.CodeableConcept -> this.value
    is SpecimenDefinition.Subject.Reference -> this.value
    is SpecimenDefinition.TypeTested.Container.MinimumVolume.Quantity -> this.value
    is SpecimenDefinition.TypeTested.Container.MinimumVolume.String -> this.value
    is SpecimenDefinition.TypeTested.Container.Additive.Additive.CodeableConcept -> this.value
    is SpecimenDefinition.TypeTested.Container.Additive.Additive.Reference -> this.value
    is ConceptMap.VersionAlgorithm.String -> this.value
    is ConceptMap.VersionAlgorithm.Coding -> this.value
    is ConceptMap.SourceScope.Uri -> this.value
    is ConceptMap.SourceScope.Canonical -> this.value
    is ConceptMap.TargetScope.Uri -> this.value
    is ConceptMap.TargetScope.Canonical -> this.value
    is ConceptMap.Group.Element.Target.Property.Value.Coding -> this.value
    is ConceptMap.Group.Element.Target.Property.Value.String -> this.value
    is ConceptMap.Group.Element.Target.Property.Value.Integer -> this.value
    is ConceptMap.Group.Element.Target.Property.Value.Boolean -> this.value
    is ConceptMap.Group.Element.Target.Property.Value.DateTime -> this.value
    is ConceptMap.Group.Element.Target.Property.Value.Decimal -> this.value
    is ConceptMap.Group.Element.Target.Property.Value.Code -> this.value
    is ConceptMap.Group.Element.Target.DependsOn.Value.Code -> this.value
    is ConceptMap.Group.Element.Target.DependsOn.Value.Coding -> this.value
    is ConceptMap.Group.Element.Target.DependsOn.Value.String -> this.value
    is ConceptMap.Group.Element.Target.DependsOn.Value.Boolean -> this.value
    is ConceptMap.Group.Element.Target.DependsOn.Value.Quantity -> this.value
    is Invoice.Period.Date -> this.value
    is Invoice.Period.Period -> this.value
    is Invoice.LineItem.Serviced.Date -> this.value
    is Invoice.LineItem.Serviced.Period -> this.value
    is Invoice.LineItem.ChargeItem.Reference -> this.value
    is Invoice.LineItem.ChargeItem.CodeableConcept -> this.value
    is StructureDefinition.VersionAlgorithm.String -> this.value
    is StructureDefinition.VersionAlgorithm.Coding -> this.value
    is ConditionDefinition.VersionAlgorithm.String -> this.value
    is ConditionDefinition.VersionAlgorithm.Coding -> this.value
    is ConditionDefinition.Precondition.Value.CodeableConcept -> this.value
    is ConditionDefinition.Precondition.Value.Quantity -> this.value
    is CommunicationRequest.Payload.Content.Attachment -> this.value
    is CommunicationRequest.Payload.Content.Reference -> this.value
    is CommunicationRequest.Payload.Content.CodeableConcept -> this.value
    is CommunicationRequest.Occurrence.DateTime -> this.value
    is CommunicationRequest.Occurrence.Period -> this.value
    is GuidanceResponse.Module.Uri -> this.value
    is GuidanceResponse.Module.Canonical -> this.value
    is GuidanceResponse.Module.CodeableConcept -> this.value
    is DetectedIssue.Identified.DateTime -> this.value
    is DetectedIssue.Identified.Period -> this.value
    is EvidenceVariable.VersionAlgorithm.String -> this.value
    is EvidenceVariable.VersionAlgorithm.Coding -> this.value
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.CodeableConcept -> this.value
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Boolean -> this.value
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Quantity -> this.value
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Range -> this.value
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Reference -> this.value
    is EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Id -> this.value
    is EvidenceVariable.Characteristic.Instances.Quantity -> this.value
    is EvidenceVariable.Characteristic.Instances.Range -> this.value
    is EvidenceVariable.Characteristic.Duration.Quantity -> this.value
    is EvidenceVariable.Characteristic.Duration.Range -> this.value
    is EvidenceVariable.Characteristic.TimeFromEvent.Event.CodeableConcept -> this.value
    is EvidenceVariable.Characteristic.TimeFromEvent.Event.Reference -> this.value
    is EvidenceVariable.Characteristic.TimeFromEvent.Event.DateTime -> this.value
    is EvidenceVariable.Characteristic.TimeFromEvent.Event.Id -> this.value
    is EvidenceVariable.Category.Value.CodeableConcept -> this.value
    is EvidenceVariable.Category.Value.Quantity -> this.value
    is EvidenceVariable.Category.Value.Range -> this.value
    is MessageDefinition.VersionAlgorithm.String -> this.value
    is MessageDefinition.VersionAlgorithm.Coding -> this.value
    else -> null
  }

private fun Any.unwrapChoiceValue4(): Any? =
  when (this) {
    is MessageDefinition.Event.Coding -> this.value
    is MessageDefinition.Event.Uri -> this.value
    is ImplementationGuide.VersionAlgorithm.String -> this.value
    is ImplementationGuide.VersionAlgorithm.Coding -> this.value
    is ImplementationGuide.Definition.Page.Source.Url -> this.value
    is ImplementationGuide.Definition.Page.Source.String -> this.value
    is ImplementationGuide.Definition.Page.Source.Markdown -> this.value
    is NutritionOrder.EnteralFormula.Administration.Rate.Quantity -> this.value
    is NutritionOrder.EnteralFormula.Administration.Rate.Ratio -> this.value
    is CoverageEligibilityRequest.Event.When.DateTime -> this.value
    is CoverageEligibilityRequest.Event.When.Period -> this.value
    is CoverageEligibilityRequest.Serviced.Date -> this.value
    is CoverageEligibilityRequest.Serviced.Period -> this.value
    is CoverageEligibilityRequest.Item.Diagnosis.Diagnosis.CodeableConcept -> this.value
    is CoverageEligibilityRequest.Item.Diagnosis.Diagnosis.Reference -> this.value
    is CodeSystem.VersionAlgorithm.String -> this.value
    is CodeSystem.VersionAlgorithm.Coding -> this.value
    is CodeSystem.Concept.Property.Value.Code -> this.value
    is CodeSystem.Concept.Property.Value.Coding -> this.value
    is CodeSystem.Concept.Property.Value.String -> this.value
    is CodeSystem.Concept.Property.Value.Integer -> this.value
    is CodeSystem.Concept.Property.Value.Boolean -> this.value
    is CodeSystem.Concept.Property.Value.DateTime -> this.value
    is CodeSystem.Concept.Property.Value.Decimal -> this.value
    is MedicationRequest.Substitution.Allowed.Boolean -> this.value
    is MedicationRequest.Substitution.Allowed.CodeableConcept -> this.value
    is CompartmentDefinition.VersionAlgorithm.String -> this.value
    is CompartmentDefinition.VersionAlgorithm.Coding -> this.value
    is Coverage.CostToBeneficiary.Value.Quantity -> this.value
    is Coverage.CostToBeneficiary.Value.Money -> this.value
    is PaymentReconciliation.Allocation.TargetItem.String -> this.value
    is PaymentReconciliation.Allocation.TargetItem.Identifier -> this.value
    is PaymentReconciliation.Allocation.TargetItem.PositiveInt -> this.value
    is MedicationKnowledge.Cost.Cost.Money -> this.value
    is MedicationKnowledge.Cost.Cost.CodeableConcept -> this.value
    is MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value.CodeableConcept ->
      this.value
    is MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value.Quantity ->
      this.value
    is MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic.Value.Range ->
      this.value
    is MedicationKnowledge.MedicineClassification.Source.String -> this.value
    is MedicationKnowledge.MedicineClassification.Source.Uri -> this.value
    is MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value.Quantity -> this.value
    is MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value.Range -> this.value
    is MedicationKnowledge.StorageGuideline.EnvironmentalSetting.Value.CodeableConcept -> this.value
    is MedicationKnowledge.Definitional.Ingredient.Strength.Ratio -> this.value
    is MedicationKnowledge.Definitional.Ingredient.Strength.CodeableConcept -> this.value
    is MedicationKnowledge.Definitional.Ingredient.Strength.Quantity -> this.value
    is MedicationKnowledge.Definitional.DrugCharacteristic.Value.CodeableConcept -> this.value
    is MedicationKnowledge.Definitional.DrugCharacteristic.Value.String -> this.value
    is MedicationKnowledge.Definitional.DrugCharacteristic.Value.Quantity -> this.value
    is MedicationKnowledge.Definitional.DrugCharacteristic.Value.Base64Binary -> this.value
    is MedicationKnowledge.Definitional.DrugCharacteristic.Value.Attachment -> this.value
    is SubstanceReferenceInformation.Target.Amount.Quantity -> this.value
    is SubstanceReferenceInformation.Target.Amount.Range -> this.value
    is SubstanceReferenceInformation.Target.Amount.String -> this.value
    is SearchParameter.VersionAlgorithm.String -> this.value
    is SearchParameter.VersionAlgorithm.Coding -> this.value
    is MedicationStatement.Effective.DateTime -> this.value
    is MedicationStatement.Effective.Period -> this.value
    is MedicationStatement.Effective.Timing -> this.value
    is Person.Deceased.Boolean -> this.value
    is Person.Deceased.DateTime -> this.value
    is AdministrableProductDefinition.Property.Value.CodeableConcept -> this.value
    is AdministrableProductDefinition.Property.Value.Quantity -> this.value
    is AdministrableProductDefinition.Property.Value.Date -> this.value
    is AdministrableProductDefinition.Property.Value.Boolean -> this.value
    is AdministrableProductDefinition.Property.Value.Markdown -> this.value
    is AdministrableProductDefinition.Property.Value.Attachment -> this.value
    is AdministrableProductDefinition.Property.Value.Reference -> this.value
    is AllergyIntolerance.Onset.DateTime -> this.value
    is AllergyIntolerance.Onset.Age -> this.value
    is AllergyIntolerance.Onset.Period -> this.value
    is AllergyIntolerance.Onset.Range -> this.value
    is AllergyIntolerance.Onset.String -> this.value
    is Transport.Input.Value.Base64Binary -> this.value
    is Transport.Input.Value.Boolean -> this.value
    is Transport.Input.Value.Canonical -> this.value
    is Transport.Input.Value.Code -> this.value
    is Transport.Input.Value.Date -> this.value
    is Transport.Input.Value.DateTime -> this.value
    is Transport.Input.Value.Decimal -> this.value
    is Transport.Input.Value.Id -> this.value
    is Transport.Input.Value.Instant -> this.value
    is Transport.Input.Value.Integer -> this.value
    is Transport.Input.Value.Integer64 -> this.value
    is Transport.Input.Value.Markdown -> this.value
    is Transport.Input.Value.Oid -> this.value
    is Transport.Input.Value.PositiveInt -> this.value
    is Transport.Input.Value.String -> this.value
    is Transport.Input.Value.Time -> this.value
    is Transport.Input.Value.UnsignedInt -> this.value
    is Transport.Input.Value.Uri -> this.value
    is Transport.Input.Value.Url -> this.value
    is Transport.Input.Value.Uuid -> this.value
    is Transport.Input.Value.Address -> this.value
    is Transport.Input.Value.Age -> this.value
    is Transport.Input.Value.Annotation -> this.value
    is Transport.Input.Value.Attachment -> this.value
    is Transport.Input.Value.CodeableConcept -> this.value
    is Transport.Input.Value.CodeableReference -> this.value
    is Transport.Input.Value.Coding -> this.value
    is Transport.Input.Value.ContactPoint -> this.value
    is Transport.Input.Value.Count -> this.value
    is Transport.Input.Value.Distance -> this.value
    is Transport.Input.Value.Duration -> this.value
    is Transport.Input.Value.HumanName -> this.value
    is Transport.Input.Value.Identifier -> this.value
    is Transport.Input.Value.Money -> this.value
    is Transport.Input.Value.Period -> this.value
    is Transport.Input.Value.Quantity -> this.value
    is Transport.Input.Value.Range -> this.value
    is Transport.Input.Value.Ratio -> this.value
    is Transport.Input.Value.RatioRange -> this.value
    is Transport.Input.Value.Reference -> this.value
    is Transport.Input.Value.SampledData -> this.value
    is Transport.Input.Value.Signature -> this.value
    is Transport.Input.Value.Timing -> this.value
    is Transport.Input.Value.ContactDetail -> this.value
    is Transport.Input.Value.DataRequirement -> this.value
    is Transport.Input.Value.Expression -> this.value
    is Transport.Input.Value.ParameterDefinition -> this.value
    is Transport.Input.Value.RelatedArtifact -> this.value
    is Transport.Input.Value.TriggerDefinition -> this.value
    is Transport.Input.Value.UsageContext -> this.value
    is Transport.Input.Value.Availability -> this.value
    is Transport.Input.Value.ExtendedContactDetail -> this.value
    is Transport.Input.Value.Dosage -> this.value
    is Transport.Input.Value.Meta -> this.value
    is Transport.Output.Value.Base64Binary -> this.value
    is Transport.Output.Value.Boolean -> this.value
    is Transport.Output.Value.Canonical -> this.value
    is Transport.Output.Value.Code -> this.value
    is Transport.Output.Value.Date -> this.value
    is Transport.Output.Value.DateTime -> this.value
    is Transport.Output.Value.Decimal -> this.value
    is Transport.Output.Value.Id -> this.value
    is Transport.Output.Value.Instant -> this.value
    is Transport.Output.Value.Integer -> this.value
    is Transport.Output.Value.Integer64 -> this.value
    is Transport.Output.Value.Markdown -> this.value
    is Transport.Output.Value.Oid -> this.value
    is Transport.Output.Value.PositiveInt -> this.value
    is Transport.Output.Value.String -> this.value
    is Transport.Output.Value.Time -> this.value
    is Transport.Output.Value.UnsignedInt -> this.value
    is Transport.Output.Value.Uri -> this.value
    is Transport.Output.Value.Url -> this.value
    is Transport.Output.Value.Uuid -> this.value
    is Transport.Output.Value.Address -> this.value
    is Transport.Output.Value.Age -> this.value
    is Transport.Output.Value.Annotation -> this.value
    else -> null
  }

private fun Any.unwrapChoiceValue5(): Any? =
  when (this) {
    is Transport.Output.Value.Attachment -> this.value
    is Transport.Output.Value.CodeableConcept -> this.value
    is Transport.Output.Value.CodeableReference -> this.value
    is Transport.Output.Value.Coding -> this.value
    is Transport.Output.Value.ContactPoint -> this.value
    is Transport.Output.Value.Count -> this.value
    is Transport.Output.Value.Distance -> this.value
    is Transport.Output.Value.Duration -> this.value
    is Transport.Output.Value.HumanName -> this.value
    is Transport.Output.Value.Identifier -> this.value
    is Transport.Output.Value.Money -> this.value
    is Transport.Output.Value.Period -> this.value
    is Transport.Output.Value.Quantity -> this.value
    is Transport.Output.Value.Range -> this.value
    is Transport.Output.Value.Ratio -> this.value
    is Transport.Output.Value.RatioRange -> this.value
    is Transport.Output.Value.Reference -> this.value
    is Transport.Output.Value.SampledData -> this.value
    is Transport.Output.Value.Signature -> this.value
    is Transport.Output.Value.Timing -> this.value
    is Transport.Output.Value.ContactDetail -> this.value
    is Transport.Output.Value.DataRequirement -> this.value
    is Transport.Output.Value.Expression -> this.value
    is Transport.Output.Value.ParameterDefinition -> this.value
    is Transport.Output.Value.RelatedArtifact -> this.value
    is Transport.Output.Value.TriggerDefinition -> this.value
    is Transport.Output.Value.UsageContext -> this.value
    is Transport.Output.Value.Availability -> this.value
    is Transport.Output.Value.ExtendedContactDetail -> this.value
    is Transport.Output.Value.Dosage -> this.value
    is Transport.Output.Value.Meta -> this.value
    is PlanDefinition.VersionAlgorithm.String -> this.value
    is PlanDefinition.VersionAlgorithm.Coding -> this.value
    is PlanDefinition.Subject.CodeableConcept -> this.value
    is PlanDefinition.Subject.Reference -> this.value
    is PlanDefinition.Subject.Canonical -> this.value
    is PlanDefinition.Goal.Target.Detail.Quantity -> this.value
    is PlanDefinition.Goal.Target.Detail.Range -> this.value
    is PlanDefinition.Goal.Target.Detail.CodeableConcept -> this.value
    is PlanDefinition.Goal.Target.Detail.String -> this.value
    is PlanDefinition.Goal.Target.Detail.Boolean -> this.value
    is PlanDefinition.Goal.Target.Detail.Integer -> this.value
    is PlanDefinition.Goal.Target.Detail.Ratio -> this.value
    is PlanDefinition.Action.Subject.CodeableConcept -> this.value
    is PlanDefinition.Action.Subject.Reference -> this.value
    is PlanDefinition.Action.Subject.Canonical -> this.value
    is PlanDefinition.Action.RelatedAction.Offset.Duration -> this.value
    is PlanDefinition.Action.RelatedAction.Offset.Range -> this.value
    is PlanDefinition.Action.Timing.Age -> this.value
    is PlanDefinition.Action.Timing.Duration -> this.value
    is PlanDefinition.Action.Timing.Range -> this.value
    is PlanDefinition.Action.Timing.Timing -> this.value
    is PlanDefinition.Action.Definition.Canonical -> this.value
    is PlanDefinition.Action.Definition.Uri -> this.value
    is PlanDefinition.AsNeeded.Boolean -> this.value
    is PlanDefinition.AsNeeded.CodeableConcept -> this.value
    is ClinicalImpression.Effective.DateTime -> this.value
    is ClinicalImpression.Effective.Period -> this.value
    is CareTeam.Participant.Coverage.Period -> this.value
    is CareTeam.Participant.Coverage.Timing -> this.value
    is Device.Property.Value.Quantity -> this.value
    is Device.Property.Value.CodeableConcept -> this.value
    is Device.Property.Value.String -> this.value
    is Device.Property.Value.Boolean -> this.value
    is Device.Property.Value.Integer -> this.value
    is Device.Property.Value.Range -> this.value
    is Device.Property.Value.Attachment -> this.value
    is NutritionProduct.Characteristic.Value.CodeableConcept -> this.value
    is NutritionProduct.Characteristic.Value.String -> this.value
    is NutritionProduct.Characteristic.Value.Quantity -> this.value
    is NutritionProduct.Characteristic.Value.Base64Binary -> this.value
    is NutritionProduct.Characteristic.Value.Attachment -> this.value
    is NutritionProduct.Characteristic.Value.Boolean -> this.value
    is MedicinalProductDefinition.Characteristic.Value.CodeableConcept -> this.value
    is MedicinalProductDefinition.Characteristic.Value.Markdown -> this.value
    is MedicinalProductDefinition.Characteristic.Value.Quantity -> this.value
    is MedicinalProductDefinition.Characteristic.Value.Integer -> this.value
    is MedicinalProductDefinition.Characteristic.Value.Date -> this.value
    is MedicinalProductDefinition.Characteristic.Value.Boolean -> this.value
    is MedicinalProductDefinition.Characteristic.Value.Attachment -> this.value
    is Communication.Payload.Content.Attachment -> this.value
    is Communication.Payload.Content.Reference -> this.value
    is Communication.Payload.Content.CodeableConcept -> this.value
    is Library.VersionAlgorithm.String -> this.value
    is Library.VersionAlgorithm.Coding -> this.value
    is Library.Subject.CodeableConcept -> this.value
    is Library.Subject.Reference -> this.value
    is StructureMap.VersionAlgorithm.String -> this.value
    is StructureMap.VersionAlgorithm.Coding -> this.value
    is StructureMap.Group.Rule.Target.Parameter.Value.Id -> this.value
    is StructureMap.Group.Rule.Target.Parameter.Value.String -> this.value
    is StructureMap.Group.Rule.Target.Parameter.Value.Boolean -> this.value
    is StructureMap.Group.Rule.Target.Parameter.Value.Integer -> this.value
    is StructureMap.Group.Rule.Target.Parameter.Value.Decimal -> this.value
    is StructureMap.Group.Rule.Target.Parameter.Value.Date -> this.value
    is StructureMap.Group.Rule.Target.Parameter.Value.Time -> this.value
    is StructureMap.Group.Rule.Target.Parameter.Value.DateTime -> this.value
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
    is Task.Input.Value.Integer64 -> this.value
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
    is Task.Input.Value.CodeableReference -> this.value
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
    is Task.Input.Value.RatioRange -> this.value
    is Task.Input.Value.Reference -> this.value
    is Task.Input.Value.SampledData -> this.value
    is Task.Input.Value.Signature -> this.value
    is Task.Input.Value.Timing -> this.value
    is Task.Input.Value.ContactDetail -> this.value
    is Task.Input.Value.DataRequirement -> this.value
    is Task.Input.Value.Expression -> this.value
    is Task.Input.Value.ParameterDefinition -> this.value
    is Task.Input.Value.RelatedArtifact -> this.value
    is Task.Input.Value.TriggerDefinition -> this.value
    is Task.Input.Value.UsageContext -> this.value
    is Task.Input.Value.Availability -> this.value
    is Task.Input.Value.ExtendedContactDetail -> this.value
    is Task.Input.Value.Dosage -> this.value
    else -> null
  }

private fun Any.unwrapChoiceValue6(): Any? =
  when (this) {
    is Task.Input.Value.Meta -> this.value
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
    is Task.Output.Value.Integer64 -> this.value
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
    is Task.Output.Value.CodeableReference -> this.value
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
    is Task.Output.Value.RatioRange -> this.value
    is Task.Output.Value.Reference -> this.value
    is Task.Output.Value.SampledData -> this.value
    is Task.Output.Value.Signature -> this.value
    is Task.Output.Value.Timing -> this.value
    is Task.Output.Value.ContactDetail -> this.value
    is Task.Output.Value.DataRequirement -> this.value
    is Task.Output.Value.Expression -> this.value
    is Task.Output.Value.ParameterDefinition -> this.value
    is Task.Output.Value.RelatedArtifact -> this.value
    is Task.Output.Value.TriggerDefinition -> this.value
    is Task.Output.Value.UsageContext -> this.value
    is Task.Output.Value.Availability -> this.value
    is Task.Output.Value.ExtendedContactDetail -> this.value
    is Task.Output.Value.Dosage -> this.value
    is Task.Output.Value.Meta -> this.value
    is EvidenceReport.CiteAs.Reference -> this.value
    is EvidenceReport.CiteAs.Markdown -> this.value
    is EvidenceReport.Subject.Characteristic.Value.Reference -> this.value
    is EvidenceReport.Subject.Characteristic.Value.CodeableConcept -> this.value
    is EvidenceReport.Subject.Characteristic.Value.Boolean -> this.value
    is EvidenceReport.Subject.Characteristic.Value.Quantity -> this.value
    is EvidenceReport.Subject.Characteristic.Value.Range -> this.value
    is Requirements.VersionAlgorithm.String -> this.value
    is Requirements.VersionAlgorithm.Coding -> this.value
    is Practitioner.Deceased.Boolean -> this.value
    is Practitioner.Deceased.DateTime -> this.value
    is Ingredient.Substance.Strength.Presentation.Ratio -> this.value
    is Ingredient.Substance.Strength.Presentation.RatioRange -> this.value
    is Ingredient.Substance.Strength.Presentation.CodeableConcept -> this.value
    is Ingredient.Substance.Strength.Presentation.Quantity -> this.value
    is Ingredient.Substance.Strength.Concentration.Ratio -> this.value
    is Ingredient.Substance.Strength.Concentration.RatioRange -> this.value
    is Ingredient.Substance.Strength.Concentration.CodeableConcept -> this.value
    is Ingredient.Substance.Strength.Concentration.Quantity -> this.value
    is Ingredient.Substance.Strength.ReferenceStrength.Strength.Ratio -> this.value
    is Ingredient.Substance.Strength.ReferenceStrength.Strength.RatioRange -> this.value
    is Ingredient.Substance.Strength.ReferenceStrength.Strength.Quantity -> this.value
    is Observation.Instantiates.Canonical -> this.value
    is Observation.Instantiates.Reference -> this.value
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
    is Observation.Value.Attachment -> this.value
    is Observation.Value.Reference -> this.value
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
    is Observation.Component.Value.Attachment -> this.value
    is Observation.Component.Value.Reference -> this.value
    is DocumentReference.Content.Profile.Value.Coding -> this.value
    is DocumentReference.Content.Profile.Value.Uri -> this.value
    is DocumentReference.Content.Profile.Value.Canonical -> this.value
    is Procedure.Occurrence.DateTime -> this.value
    is Procedure.Occurrence.Period -> this.value
    is Procedure.Occurrence.String -> this.value
    is Procedure.Occurrence.Age -> this.value
    is Procedure.Occurrence.Range -> this.value
    is Procedure.Occurrence.Timing -> this.value
    is Procedure.Reported.Boolean -> this.value
    is Procedure.Reported.Reference -> this.value
    is AdverseEvent.Occurrence.DateTime -> this.value
    is AdverseEvent.Occurrence.Period -> this.value
    is AdverseEvent.Occurrence.Timing -> this.value
    is AdverseEvent.SuspectEntity.Instance.CodeableConcept -> this.value
    is AdverseEvent.SuspectEntity.Instance.Reference -> this.value
    is AdverseEvent.ContributingFactor.Item.Reference -> this.value
    is AdverseEvent.ContributingFactor.Item.CodeableConcept -> this.value
    is AdverseEvent.PreventiveAction.Item.Reference -> this.value
    is AdverseEvent.PreventiveAction.Item.CodeableConcept -> this.value
    is AdverseEvent.MitigatingAction.Item.Reference -> this.value
    is AdverseEvent.MitigatingAction.Item.CodeableConcept -> this.value
    is AdverseEvent.SupportingInfo.Item.Reference -> this.value
    is AdverseEvent.SupportingInfo.Item.CodeableConcept -> this.value
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
  unwrapChoiceValue5()?.let {
    return it
  }
  unwrapChoiceValue6()?.let {
    return it
  }
  return null
}
