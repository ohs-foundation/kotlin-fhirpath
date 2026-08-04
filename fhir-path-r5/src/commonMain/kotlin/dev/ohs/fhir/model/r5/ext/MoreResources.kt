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

import dev.ohs.fhir.fhirpath.types.FhirR5ResourceType
import dev.ohs.fhir.fhirpath.types.FhirR5Type
import dev.ohs.fhir.model.r5.Account
import dev.ohs.fhir.model.r5.ActivityDefinition
import dev.ohs.fhir.model.r5.ActorDefinition
import dev.ohs.fhir.model.r5.AdministrableProductDefinition
import dev.ohs.fhir.model.r5.AdverseEvent
import dev.ohs.fhir.model.r5.AllergyIntolerance
import dev.ohs.fhir.model.r5.Appointment
import dev.ohs.fhir.model.r5.AppointmentResponse
import dev.ohs.fhir.model.r5.ArtifactAssessment
import dev.ohs.fhir.model.r5.AuditEvent
import dev.ohs.fhir.model.r5.Basic
import dev.ohs.fhir.model.r5.Binary
import dev.ohs.fhir.model.r5.BiologicallyDerivedProduct
import dev.ohs.fhir.model.r5.BiologicallyDerivedProductDispense
import dev.ohs.fhir.model.r5.BodyStructure
import dev.ohs.fhir.model.r5.Bundle
import dev.ohs.fhir.model.r5.CapabilityStatement
import dev.ohs.fhir.model.r5.CarePlan
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
import dev.ohs.fhir.model.r5.Composition
import dev.ohs.fhir.model.r5.ConceptMap
import dev.ohs.fhir.model.r5.Condition
import dev.ohs.fhir.model.r5.ConditionDefinition
import dev.ohs.fhir.model.r5.Consent
import dev.ohs.fhir.model.r5.Contract
import dev.ohs.fhir.model.r5.Coverage
import dev.ohs.fhir.model.r5.CoverageEligibilityRequest
import dev.ohs.fhir.model.r5.CoverageEligibilityResponse
import dev.ohs.fhir.model.r5.DetectedIssue
import dev.ohs.fhir.model.r5.Device
import dev.ohs.fhir.model.r5.DeviceAssociation
import dev.ohs.fhir.model.r5.DeviceDefinition
import dev.ohs.fhir.model.r5.DeviceDispense
import dev.ohs.fhir.model.r5.DeviceMetric
import dev.ohs.fhir.model.r5.DeviceRequest
import dev.ohs.fhir.model.r5.DeviceUsage
import dev.ohs.fhir.model.r5.DiagnosticReport
import dev.ohs.fhir.model.r5.DocumentReference
import dev.ohs.fhir.model.r5.Encounter
import dev.ohs.fhir.model.r5.EncounterHistory
import dev.ohs.fhir.model.r5.Endpoint
import dev.ohs.fhir.model.r5.EnrollmentRequest
import dev.ohs.fhir.model.r5.EnrollmentResponse
import dev.ohs.fhir.model.r5.EpisodeOfCare
import dev.ohs.fhir.model.r5.EventDefinition
import dev.ohs.fhir.model.r5.Evidence
import dev.ohs.fhir.model.r5.EvidenceReport
import dev.ohs.fhir.model.r5.EvidenceVariable
import dev.ohs.fhir.model.r5.ExampleScenario
import dev.ohs.fhir.model.r5.ExplanationOfBenefit
import dev.ohs.fhir.model.r5.FamilyMemberHistory
import dev.ohs.fhir.model.r5.Flag
import dev.ohs.fhir.model.r5.FormularyItem
import dev.ohs.fhir.model.r5.GenomicStudy
import dev.ohs.fhir.model.r5.Goal
import dev.ohs.fhir.model.r5.GraphDefinition
import dev.ohs.fhir.model.r5.Group
import dev.ohs.fhir.model.r5.GuidanceResponse
import dev.ohs.fhir.model.r5.HealthcareService
import dev.ohs.fhir.model.r5.ImagingSelection
import dev.ohs.fhir.model.r5.ImagingStudy
import dev.ohs.fhir.model.r5.Immunization
import dev.ohs.fhir.model.r5.ImmunizationEvaluation
import dev.ohs.fhir.model.r5.ImmunizationRecommendation
import dev.ohs.fhir.model.r5.ImplementationGuide
import dev.ohs.fhir.model.r5.Ingredient
import dev.ohs.fhir.model.r5.InsurancePlan
import dev.ohs.fhir.model.r5.InventoryItem
import dev.ohs.fhir.model.r5.InventoryReport
import dev.ohs.fhir.model.r5.Invoice
import dev.ohs.fhir.model.r5.Library
import dev.ohs.fhir.model.r5.Linkage
import dev.ohs.fhir.model.r5.List as R5List
import dev.ohs.fhir.model.r5.Location
import dev.ohs.fhir.model.r5.ManufacturedItemDefinition
import dev.ohs.fhir.model.r5.Measure
import dev.ohs.fhir.model.r5.MeasureReport
import dev.ohs.fhir.model.r5.Medication
import dev.ohs.fhir.model.r5.MedicationAdministration
import dev.ohs.fhir.model.r5.MedicationDispense
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
import dev.ohs.fhir.model.r5.OperationOutcome
import dev.ohs.fhir.model.r5.Organization
import dev.ohs.fhir.model.r5.OrganizationAffiliation
import dev.ohs.fhir.model.r5.PackagedProductDefinition
import dev.ohs.fhir.model.r5.Parameters
import dev.ohs.fhir.model.r5.Patient
import dev.ohs.fhir.model.r5.PaymentNotice
import dev.ohs.fhir.model.r5.PaymentReconciliation
import dev.ohs.fhir.model.r5.Permission
import dev.ohs.fhir.model.r5.Person
import dev.ohs.fhir.model.r5.PlanDefinition
import dev.ohs.fhir.model.r5.Practitioner
import dev.ohs.fhir.model.r5.PractitionerRole
import dev.ohs.fhir.model.r5.Procedure
import dev.ohs.fhir.model.r5.Provenance
import dev.ohs.fhir.model.r5.Questionnaire
import dev.ohs.fhir.model.r5.QuestionnaireResponse
import dev.ohs.fhir.model.r5.RegulatedAuthorization
import dev.ohs.fhir.model.r5.RelatedPerson
import dev.ohs.fhir.model.r5.RequestOrchestration
import dev.ohs.fhir.model.r5.Requirements
import dev.ohs.fhir.model.r5.ResearchStudy
import dev.ohs.fhir.model.r5.ResearchSubject
import dev.ohs.fhir.model.r5.Resource
import dev.ohs.fhir.model.r5.RiskAssessment
import dev.ohs.fhir.model.r5.Schedule
import dev.ohs.fhir.model.r5.SearchParameter
import dev.ohs.fhir.model.r5.ServiceRequest
import dev.ohs.fhir.model.r5.Slot
import dev.ohs.fhir.model.r5.Specimen
import dev.ohs.fhir.model.r5.SpecimenDefinition
import dev.ohs.fhir.model.r5.StructureDefinition
import dev.ohs.fhir.model.r5.StructureMap
import dev.ohs.fhir.model.r5.Subscription
import dev.ohs.fhir.model.r5.SubscriptionStatus
import dev.ohs.fhir.model.r5.SubscriptionTopic
import dev.ohs.fhir.model.r5.Substance
import dev.ohs.fhir.model.r5.SubstanceDefinition
import dev.ohs.fhir.model.r5.SubstanceNucleicAcid
import dev.ohs.fhir.model.r5.SubstancePolymer
import dev.ohs.fhir.model.r5.SubstanceProtein
import dev.ohs.fhir.model.r5.SubstanceReferenceInformation
import dev.ohs.fhir.model.r5.SubstanceSourceMaterial
import dev.ohs.fhir.model.r5.SupplyDelivery
import dev.ohs.fhir.model.r5.SupplyRequest
import dev.ohs.fhir.model.r5.Task
import dev.ohs.fhir.model.r5.TerminologyCapabilities
import dev.ohs.fhir.model.r5.TestPlan
import dev.ohs.fhir.model.r5.TestReport
import dev.ohs.fhir.model.r5.TestScript
import dev.ohs.fhir.model.r5.Transport
import dev.ohs.fhir.model.r5.ValueSet
import dev.ohs.fhir.model.r5.VerificationResult
import dev.ohs.fhir.model.r5.VisionPrescription
import dev.ohs.fhir.model.r5.terminologies.ResourceType
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List as CollectionsList

internal fun Resource.getFhirType(): FhirR5Type? =
  when (this) {
    is SubscriptionTopic -> FhirR5ResourceType(ResourceType.SubscriptionTopic)
    is RequestOrchestration -> FhirR5ResourceType(ResourceType.RequestOrchestration)
    is BodyStructure -> FhirR5ResourceType(ResourceType.BodyStructure)
    is ArtifactAssessment -> FhirR5ResourceType(ResourceType.ArtifactAssessment)
    is ExampleScenario -> FhirR5ResourceType(ResourceType.ExampleScenario)
    is Appointment -> FhirR5ResourceType(ResourceType.Appointment)
    is ActorDefinition -> FhirR5ResourceType(ResourceType.ActorDefinition)
    is Condition -> FhirR5ResourceType(ResourceType.Condition)
    is R5List -> FhirR5ResourceType(ResourceType.List)
    is ChargeItem -> FhirR5ResourceType(ResourceType.ChargeItem)
    is Permission -> FhirR5ResourceType(ResourceType.Permission)
    is BiologicallyDerivedProductDispense ->
      FhirR5ResourceType(ResourceType.BiologicallyDerivedProductDispense)
    is VerificationResult -> FhirR5ResourceType(ResourceType.VerificationResult)
    is SupplyDelivery -> FhirR5ResourceType(ResourceType.SupplyDelivery)
    is Composition -> FhirR5ResourceType(ResourceType.Composition)
    is Encounter -> FhirR5ResourceType(ResourceType.Encounter)
    is MedicationAdministration -> FhirR5ResourceType(ResourceType.MedicationAdministration)
    is Claim -> FhirR5ResourceType(ResourceType.Claim)
    is DeviceMetric -> FhirR5ResourceType(ResourceType.DeviceMetric)
    is AuditEvent -> FhirR5ResourceType(ResourceType.AuditEvent)
    is ServiceRequest -> FhirR5ResourceType(ResourceType.ServiceRequest)
    is NutritionIntake -> FhirR5ResourceType(ResourceType.NutritionIntake)
    is EventDefinition -> FhirR5ResourceType(ResourceType.EventDefinition)
    is CarePlan -> FhirR5ResourceType(ResourceType.CarePlan)
    is Linkage -> FhirR5ResourceType(ResourceType.Linkage)
    is CoverageEligibilityResponse -> FhirR5ResourceType(ResourceType.CoverageEligibilityResponse)
    is QuestionnaireResponse -> FhirR5ResourceType(ResourceType.QuestionnaireResponse)
    is Location -> FhirR5ResourceType(ResourceType.Location)
    is InsurancePlan -> FhirR5ResourceType(ResourceType.InsurancePlan)
    is Citation -> FhirR5ResourceType(ResourceType.Citation)
    is SubscriptionStatus -> FhirR5ResourceType(ResourceType.SubscriptionStatus)
    is Measure -> FhirR5ResourceType(ResourceType.Measure)
    is ActivityDefinition -> FhirR5ResourceType(ResourceType.ActivityDefinition)
    is OrganizationAffiliation -> FhirR5ResourceType(ResourceType.OrganizationAffiliation)
    is EpisodeOfCare -> FhirR5ResourceType(ResourceType.EpisodeOfCare)
    is InventoryReport -> FhirR5ResourceType(ResourceType.InventoryReport)
    is DeviceRequest -> FhirR5ResourceType(ResourceType.DeviceRequest)
    is CapabilityStatement -> FhirR5ResourceType(ResourceType.CapabilityStatement)
    is Endpoint -> FhirR5ResourceType(ResourceType.Endpoint)
    is DeviceDispense -> FhirR5ResourceType(ResourceType.DeviceDispense)
    is SubstancePolymer -> FhirR5ResourceType(ResourceType.SubstancePolymer)
    is Substance -> FhirR5ResourceType(ResourceType.Substance)
    is Group -> FhirR5ResourceType(ResourceType.Group)
    is ImagingStudy -> FhirR5ResourceType(ResourceType.ImagingStudy)
    is SubstanceNucleicAcid -> FhirR5ResourceType(ResourceType.SubstanceNucleicAcid)
    is Organization -> FhirR5ResourceType(ResourceType.Organization)
    is MolecularSequence -> FhirR5ResourceType(ResourceType.MolecularSequence)
    is RegulatedAuthorization -> FhirR5ResourceType(ResourceType.RegulatedAuthorization)
    is ChargeItemDefinition -> FhirR5ResourceType(ResourceType.ChargeItemDefinition)
    is Questionnaire -> FhirR5ResourceType(ResourceType.Questionnaire)
    is TestScript -> FhirR5ResourceType(ResourceType.TestScript)
    is ResearchStudy -> FhirR5ResourceType(ResourceType.ResearchStudy)
    is PractitionerRole -> FhirR5ResourceType(ResourceType.PractitionerRole)
    is TestReport -> FhirR5ResourceType(ResourceType.TestReport)
    is DeviceUsage -> FhirR5ResourceType(ResourceType.DeviceUsage)
    is MeasureReport -> FhirR5ResourceType(ResourceType.MeasureReport)
    is SubstanceSourceMaterial -> FhirR5ResourceType(ResourceType.SubstanceSourceMaterial)
    is SubstanceDefinition -> FhirR5ResourceType(ResourceType.SubstanceDefinition)
    is SupplyRequest -> FhirR5ResourceType(ResourceType.SupplyRequest)
    is ImagingSelection -> FhirR5ResourceType(ResourceType.ImagingSelection)
    is GenomicStudy -> FhirR5ResourceType(ResourceType.GenomicStudy)
    is Provenance -> FhirR5ResourceType(ResourceType.Provenance)
    is Binary -> FhirR5ResourceType(ResourceType.Binary)
    is RiskAssessment -> FhirR5ResourceType(ResourceType.RiskAssessment)
    is Parameters -> FhirR5ResourceType(ResourceType.Parameters)
    is HealthcareService -> FhirR5ResourceType(ResourceType.HealthcareService)
    is RelatedPerson -> FhirR5ResourceType(ResourceType.RelatedPerson)
    is Evidence -> FhirR5ResourceType(ResourceType.Evidence)
    is Basic -> FhirR5ResourceType(ResourceType.Basic)
    is NamingSystem -> FhirR5ResourceType(ResourceType.NamingSystem)
    is VisionPrescription -> FhirR5ResourceType(ResourceType.VisionPrescription)
    is EnrollmentRequest -> FhirR5ResourceType(ResourceType.EnrollmentRequest)
    is Flag -> FhirR5ResourceType(ResourceType.Flag)
    is ExplanationOfBenefit -> FhirR5ResourceType(ResourceType.ExplanationOfBenefit)
    is PackagedProductDefinition -> FhirR5ResourceType(ResourceType.PackagedProductDefinition)
    is Patient -> FhirR5ResourceType(ResourceType.Patient)
    is ManufacturedItemDefinition -> FhirR5ResourceType(ResourceType.ManufacturedItemDefinition)
    is DeviceAssociation -> FhirR5ResourceType(ResourceType.DeviceAssociation)
    is Specimen -> FhirR5ResourceType(ResourceType.Specimen)
    is FamilyMemberHistory -> FhirR5ResourceType(ResourceType.FamilyMemberHistory)
    is OperationDefinition -> FhirR5ResourceType(ResourceType.OperationDefinition)
    is GraphDefinition -> FhirR5ResourceType(ResourceType.GraphDefinition)
    is Medication -> FhirR5ResourceType(ResourceType.Medication)
    is DiagnosticReport -> FhirR5ResourceType(ResourceType.DiagnosticReport)
    is AppointmentResponse -> FhirR5ResourceType(ResourceType.AppointmentResponse)
    is MessageHeader -> FhirR5ResourceType(ResourceType.MessageHeader)
    is DeviceDefinition -> FhirR5ResourceType(ResourceType.DeviceDefinition)
    is Goal -> FhirR5ResourceType(ResourceType.Goal)
    is ObservationDefinition -> FhirR5ResourceType(ResourceType.ObservationDefinition)
    is Immunization -> FhirR5ResourceType(ResourceType.Immunization)
    is ValueSet -> FhirR5ResourceType(ResourceType.ValueSet)
    is ClaimResponse -> FhirR5ResourceType(ResourceType.ClaimResponse)
    is Contract -> FhirR5ResourceType(ResourceType.Contract)
    is BiologicallyDerivedProduct -> FhirR5ResourceType(ResourceType.BiologicallyDerivedProduct)
    is InventoryItem -> FhirR5ResourceType(ResourceType.InventoryItem)
    is TestPlan -> FhirR5ResourceType(ResourceType.TestPlan)
    is TerminologyCapabilities -> FhirR5ResourceType(ResourceType.TerminologyCapabilities)
    is ClinicalUseDefinition -> FhirR5ResourceType(ResourceType.ClinicalUseDefinition)
    is SpecimenDefinition -> FhirR5ResourceType(ResourceType.SpecimenDefinition)
    is EncounterHistory -> FhirR5ResourceType(ResourceType.EncounterHistory)
    is ConceptMap -> FhirR5ResourceType(ResourceType.ConceptMap)
    is Invoice -> FhirR5ResourceType(ResourceType.Invoice)
    is StructureDefinition -> FhirR5ResourceType(ResourceType.StructureDefinition)
    is ConditionDefinition -> FhirR5ResourceType(ResourceType.ConditionDefinition)
    is CommunicationRequest -> FhirR5ResourceType(ResourceType.CommunicationRequest)
    is PaymentNotice -> FhirR5ResourceType(ResourceType.PaymentNotice)
    is GuidanceResponse -> FhirR5ResourceType(ResourceType.GuidanceResponse)
    is DetectedIssue -> FhirR5ResourceType(ResourceType.DetectedIssue)
    is EvidenceVariable -> FhirR5ResourceType(ResourceType.EvidenceVariable)
    is Bundle -> FhirR5ResourceType(ResourceType.Bundle)
    is MessageDefinition -> FhirR5ResourceType(ResourceType.MessageDefinition)
    is ImplementationGuide -> FhirR5ResourceType(ResourceType.ImplementationGuide)
    is NutritionOrder -> FhirR5ResourceType(ResourceType.NutritionOrder)
    is EnrollmentResponse -> FhirR5ResourceType(ResourceType.EnrollmentResponse)
    is CoverageEligibilityRequest -> FhirR5ResourceType(ResourceType.CoverageEligibilityRequest)
    is FormularyItem -> FhirR5ResourceType(ResourceType.FormularyItem)
    is CodeSystem -> FhirR5ResourceType(ResourceType.CodeSystem)
    is MedicationRequest -> FhirR5ResourceType(ResourceType.MedicationRequest)
    is ImmunizationRecommendation -> FhirR5ResourceType(ResourceType.ImmunizationRecommendation)
    is Slot -> FhirR5ResourceType(ResourceType.Slot)
    is CompartmentDefinition -> FhirR5ResourceType(ResourceType.CompartmentDefinition)
    is Coverage -> FhirR5ResourceType(ResourceType.Coverage)
    is PaymentReconciliation -> FhirR5ResourceType(ResourceType.PaymentReconciliation)
    is MedicationKnowledge -> FhirR5ResourceType(ResourceType.MedicationKnowledge)
    is SubstanceReferenceInformation ->
      FhirR5ResourceType(ResourceType.SubstanceReferenceInformation)
    is ImmunizationEvaluation -> FhirR5ResourceType(ResourceType.ImmunizationEvaluation)
    is SearchParameter -> FhirR5ResourceType(ResourceType.SearchParameter)
    is MedicationStatement -> FhirR5ResourceType(ResourceType.MedicationStatement)
    is Schedule -> FhirR5ResourceType(ResourceType.Schedule)
    is Person -> FhirR5ResourceType(ResourceType.Person)
    is AdministrableProductDefinition ->
      FhirR5ResourceType(ResourceType.AdministrableProductDefinition)
    is AllergyIntolerance -> FhirR5ResourceType(ResourceType.AllergyIntolerance)
    is Transport -> FhirR5ResourceType(ResourceType.Transport)
    is PlanDefinition -> FhirR5ResourceType(ResourceType.PlanDefinition)
    is ResearchSubject -> FhirR5ResourceType(ResourceType.ResearchSubject)
    is ClinicalImpression -> FhirR5ResourceType(ResourceType.ClinicalImpression)
    is Subscription -> FhirR5ResourceType(ResourceType.Subscription)
    is CareTeam -> FhirR5ResourceType(ResourceType.CareTeam)
    is Device -> FhirR5ResourceType(ResourceType.Device)
    is NutritionProduct -> FhirR5ResourceType(ResourceType.NutritionProduct)
    is Consent -> FhirR5ResourceType(ResourceType.Consent)
    is MedicinalProductDefinition -> FhirR5ResourceType(ResourceType.MedicinalProductDefinition)
    is Communication -> FhirR5ResourceType(ResourceType.Communication)
    is Library -> FhirR5ResourceType(ResourceType.Library)
    is StructureMap -> FhirR5ResourceType(ResourceType.StructureMap)
    is Task -> FhirR5ResourceType(ResourceType.Task)
    is EvidenceReport -> FhirR5ResourceType(ResourceType.EvidenceReport)
    is Requirements -> FhirR5ResourceType(ResourceType.Requirements)
    is Practitioner -> FhirR5ResourceType(ResourceType.Practitioner)
    is Ingredient -> FhirR5ResourceType(ResourceType.Ingredient)
    is Observation -> FhirR5ResourceType(ResourceType.Observation)
    is DocumentReference -> FhirR5ResourceType(ResourceType.DocumentReference)
    is OperationOutcome -> FhirR5ResourceType(ResourceType.OperationOutcome)
    is MedicationDispense -> FhirR5ResourceType(ResourceType.MedicationDispense)
    is Account -> FhirR5ResourceType(ResourceType.Account)
    is Procedure -> FhirR5ResourceType(ResourceType.Procedure)
    is SubstanceProtein -> FhirR5ResourceType(ResourceType.SubstanceProtein)
    is AdverseEvent -> FhirR5ResourceType(ResourceType.AdverseEvent)
    else -> null
  }

internal fun Resource.getProperty(name: String): Any? =
  when (this) {
    is SubscriptionTopic -> getProperty(name)
    is RequestOrchestration -> getProperty(name)
    is BodyStructure -> getProperty(name)
    is ArtifactAssessment -> getProperty(name)
    is ExampleScenario -> getProperty(name)
    is Appointment -> getProperty(name)
    is ActorDefinition -> getProperty(name)
    is Condition -> getProperty(name)
    is R5List -> getProperty(name)
    is ChargeItem -> getProperty(name)
    is Permission -> getProperty(name)
    is BiologicallyDerivedProductDispense -> getProperty(name)
    is VerificationResult -> getProperty(name)
    is SupplyDelivery -> getProperty(name)
    is Composition -> getProperty(name)
    is Encounter -> getProperty(name)
    is MedicationAdministration -> getProperty(name)
    is Claim -> getProperty(name)
    is DeviceMetric -> getProperty(name)
    is AuditEvent -> getProperty(name)
    is ServiceRequest -> getProperty(name)
    is NutritionIntake -> getProperty(name)
    is EventDefinition -> getProperty(name)
    is CarePlan -> getProperty(name)
    is Linkage -> getProperty(name)
    is CoverageEligibilityResponse -> getProperty(name)
    is QuestionnaireResponse -> getProperty(name)
    is Location -> getProperty(name)
    is InsurancePlan -> getProperty(name)
    is Citation -> getProperty(name)
    is SubscriptionStatus -> getProperty(name)
    is Measure -> getProperty(name)
    is ActivityDefinition -> getProperty(name)
    is OrganizationAffiliation -> getProperty(name)
    is EpisodeOfCare -> getProperty(name)
    is InventoryReport -> getProperty(name)
    is DeviceRequest -> getProperty(name)
    is CapabilityStatement -> getProperty(name)
    is Endpoint -> getProperty(name)
    is DeviceDispense -> getProperty(name)
    is SubstancePolymer -> getProperty(name)
    is Substance -> getProperty(name)
    is Group -> getProperty(name)
    is ImagingStudy -> getProperty(name)
    is SubstanceNucleicAcid -> getProperty(name)
    is Organization -> getProperty(name)
    is MolecularSequence -> getProperty(name)
    is RegulatedAuthorization -> getProperty(name)
    is ChargeItemDefinition -> getProperty(name)
    is Questionnaire -> getProperty(name)
    is TestScript -> getProperty(name)
    is ResearchStudy -> getProperty(name)
    is PractitionerRole -> getProperty(name)
    is TestReport -> getProperty(name)
    is DeviceUsage -> getProperty(name)
    is MeasureReport -> getProperty(name)
    is SubstanceSourceMaterial -> getProperty(name)
    is SubstanceDefinition -> getProperty(name)
    is SupplyRequest -> getProperty(name)
    is ImagingSelection -> getProperty(name)
    is GenomicStudy -> getProperty(name)
    is Provenance -> getProperty(name)
    is Binary -> getProperty(name)
    is RiskAssessment -> getProperty(name)
    is Parameters -> getProperty(name)
    is HealthcareService -> getProperty(name)
    is RelatedPerson -> getProperty(name)
    is Evidence -> getProperty(name)
    is Basic -> getProperty(name)
    is NamingSystem -> getProperty(name)
    is VisionPrescription -> getProperty(name)
    is EnrollmentRequest -> getProperty(name)
    is Flag -> getProperty(name)
    is ExplanationOfBenefit -> getProperty(name)
    is PackagedProductDefinition -> getProperty(name)
    is Patient -> getProperty(name)
    is ManufacturedItemDefinition -> getProperty(name)
    is DeviceAssociation -> getProperty(name)
    is Specimen -> getProperty(name)
    is FamilyMemberHistory -> getProperty(name)
    is OperationDefinition -> getProperty(name)
    is GraphDefinition -> getProperty(name)
    is Medication -> getProperty(name)
    is DiagnosticReport -> getProperty(name)
    is AppointmentResponse -> getProperty(name)
    is MessageHeader -> getProperty(name)
    is DeviceDefinition -> getProperty(name)
    is Goal -> getProperty(name)
    is ObservationDefinition -> getProperty(name)
    is Immunization -> getProperty(name)
    is ValueSet -> getProperty(name)
    is ClaimResponse -> getProperty(name)
    is Contract -> getProperty(name)
    is BiologicallyDerivedProduct -> getProperty(name)
    is InventoryItem -> getProperty(name)
    is TestPlan -> getProperty(name)
    is TerminologyCapabilities -> getProperty(name)
    is ClinicalUseDefinition -> getProperty(name)
    is SpecimenDefinition -> getProperty(name)
    is EncounterHistory -> getProperty(name)
    is ConceptMap -> getProperty(name)
    is Invoice -> getProperty(name)
    is StructureDefinition -> getProperty(name)
    is ConditionDefinition -> getProperty(name)
    is CommunicationRequest -> getProperty(name)
    is PaymentNotice -> getProperty(name)
    is GuidanceResponse -> getProperty(name)
    is DetectedIssue -> getProperty(name)
    is EvidenceVariable -> getProperty(name)
    is Bundle -> getProperty(name)
    is MessageDefinition -> getProperty(name)
    is ImplementationGuide -> getProperty(name)
    is NutritionOrder -> getProperty(name)
    is EnrollmentResponse -> getProperty(name)
    is CoverageEligibilityRequest -> getProperty(name)
    is FormularyItem -> getProperty(name)
    is CodeSystem -> getProperty(name)
    is MedicationRequest -> getProperty(name)
    is ImmunizationRecommendation -> getProperty(name)
    is Slot -> getProperty(name)
    is CompartmentDefinition -> getProperty(name)
    is Coverage -> getProperty(name)
    is PaymentReconciliation -> getProperty(name)
    is MedicationKnowledge -> getProperty(name)
    is SubstanceReferenceInformation -> getProperty(name)
    is ImmunizationEvaluation -> getProperty(name)
    is SearchParameter -> getProperty(name)
    is MedicationStatement -> getProperty(name)
    is Schedule -> getProperty(name)
    is Person -> getProperty(name)
    is AdministrableProductDefinition -> getProperty(name)
    is AllergyIntolerance -> getProperty(name)
    is Transport -> getProperty(name)
    is PlanDefinition -> getProperty(name)
    is ResearchSubject -> getProperty(name)
    is ClinicalImpression -> getProperty(name)
    is Subscription -> getProperty(name)
    is CareTeam -> getProperty(name)
    is Device -> getProperty(name)
    is NutritionProduct -> getProperty(name)
    is Consent -> getProperty(name)
    is MedicinalProductDefinition -> getProperty(name)
    is Communication -> getProperty(name)
    is Library -> getProperty(name)
    is StructureMap -> getProperty(name)
    is Task -> getProperty(name)
    is EvidenceReport -> getProperty(name)
    is Requirements -> getProperty(name)
    is Practitioner -> getProperty(name)
    is Ingredient -> getProperty(name)
    is Observation -> getProperty(name)
    is DocumentReference -> getProperty(name)
    is OperationOutcome -> getProperty(name)
    is MedicationDispense -> getProperty(name)
    is Account -> getProperty(name)
    is Procedure -> getProperty(name)
    is SubstanceProtein -> getProperty(name)
    is AdverseEvent -> getProperty(name)
    else -> null
  }

internal fun Resource.hasProperty(name: String): Boolean =
  when (this) {
    is SubscriptionTopic -> hasProperty(name)
    is RequestOrchestration -> hasProperty(name)
    is BodyStructure -> hasProperty(name)
    is ArtifactAssessment -> hasProperty(name)
    is ExampleScenario -> hasProperty(name)
    is Appointment -> hasProperty(name)
    is ActorDefinition -> hasProperty(name)
    is Condition -> hasProperty(name)
    is R5List -> hasProperty(name)
    is ChargeItem -> hasProperty(name)
    is Permission -> hasProperty(name)
    is BiologicallyDerivedProductDispense -> hasProperty(name)
    is VerificationResult -> hasProperty(name)
    is SupplyDelivery -> hasProperty(name)
    is Composition -> hasProperty(name)
    is Encounter -> hasProperty(name)
    is MedicationAdministration -> hasProperty(name)
    is Claim -> hasProperty(name)
    is DeviceMetric -> hasProperty(name)
    is AuditEvent -> hasProperty(name)
    is ServiceRequest -> hasProperty(name)
    is NutritionIntake -> hasProperty(name)
    is EventDefinition -> hasProperty(name)
    is CarePlan -> hasProperty(name)
    is Linkage -> hasProperty(name)
    is CoverageEligibilityResponse -> hasProperty(name)
    is QuestionnaireResponse -> hasProperty(name)
    is Location -> hasProperty(name)
    is InsurancePlan -> hasProperty(name)
    is Citation -> hasProperty(name)
    is SubscriptionStatus -> hasProperty(name)
    is Measure -> hasProperty(name)
    is ActivityDefinition -> hasProperty(name)
    is OrganizationAffiliation -> hasProperty(name)
    is EpisodeOfCare -> hasProperty(name)
    is InventoryReport -> hasProperty(name)
    is DeviceRequest -> hasProperty(name)
    is CapabilityStatement -> hasProperty(name)
    is Endpoint -> hasProperty(name)
    is DeviceDispense -> hasProperty(name)
    is SubstancePolymer -> hasProperty(name)
    is Substance -> hasProperty(name)
    is Group -> hasProperty(name)
    is ImagingStudy -> hasProperty(name)
    is SubstanceNucleicAcid -> hasProperty(name)
    is Organization -> hasProperty(name)
    is MolecularSequence -> hasProperty(name)
    is RegulatedAuthorization -> hasProperty(name)
    is ChargeItemDefinition -> hasProperty(name)
    is Questionnaire -> hasProperty(name)
    is TestScript -> hasProperty(name)
    is ResearchStudy -> hasProperty(name)
    is PractitionerRole -> hasProperty(name)
    is TestReport -> hasProperty(name)
    is DeviceUsage -> hasProperty(name)
    is MeasureReport -> hasProperty(name)
    is SubstanceSourceMaterial -> hasProperty(name)
    is SubstanceDefinition -> hasProperty(name)
    is SupplyRequest -> hasProperty(name)
    is ImagingSelection -> hasProperty(name)
    is GenomicStudy -> hasProperty(name)
    is Provenance -> hasProperty(name)
    is Binary -> hasProperty(name)
    is RiskAssessment -> hasProperty(name)
    is Parameters -> hasProperty(name)
    is HealthcareService -> hasProperty(name)
    is RelatedPerson -> hasProperty(name)
    is Evidence -> hasProperty(name)
    is Basic -> hasProperty(name)
    is NamingSystem -> hasProperty(name)
    is VisionPrescription -> hasProperty(name)
    is EnrollmentRequest -> hasProperty(name)
    is Flag -> hasProperty(name)
    is ExplanationOfBenefit -> hasProperty(name)
    is PackagedProductDefinition -> hasProperty(name)
    is Patient -> hasProperty(name)
    is ManufacturedItemDefinition -> hasProperty(name)
    is DeviceAssociation -> hasProperty(name)
    is Specimen -> hasProperty(name)
    is FamilyMemberHistory -> hasProperty(name)
    is OperationDefinition -> hasProperty(name)
    is GraphDefinition -> hasProperty(name)
    is Medication -> hasProperty(name)
    is DiagnosticReport -> hasProperty(name)
    is AppointmentResponse -> hasProperty(name)
    is MessageHeader -> hasProperty(name)
    is DeviceDefinition -> hasProperty(name)
    is Goal -> hasProperty(name)
    is ObservationDefinition -> hasProperty(name)
    is Immunization -> hasProperty(name)
    is ValueSet -> hasProperty(name)
    is ClaimResponse -> hasProperty(name)
    is Contract -> hasProperty(name)
    is BiologicallyDerivedProduct -> hasProperty(name)
    is InventoryItem -> hasProperty(name)
    is TestPlan -> hasProperty(name)
    is TerminologyCapabilities -> hasProperty(name)
    is ClinicalUseDefinition -> hasProperty(name)
    is SpecimenDefinition -> hasProperty(name)
    is EncounterHistory -> hasProperty(name)
    is ConceptMap -> hasProperty(name)
    is Invoice -> hasProperty(name)
    is StructureDefinition -> hasProperty(name)
    is ConditionDefinition -> hasProperty(name)
    is CommunicationRequest -> hasProperty(name)
    is PaymentNotice -> hasProperty(name)
    is GuidanceResponse -> hasProperty(name)
    is DetectedIssue -> hasProperty(name)
    is EvidenceVariable -> hasProperty(name)
    is Bundle -> hasProperty(name)
    is MessageDefinition -> hasProperty(name)
    is ImplementationGuide -> hasProperty(name)
    is NutritionOrder -> hasProperty(name)
    is EnrollmentResponse -> hasProperty(name)
    is CoverageEligibilityRequest -> hasProperty(name)
    is FormularyItem -> hasProperty(name)
    is CodeSystem -> hasProperty(name)
    is MedicationRequest -> hasProperty(name)
    is ImmunizationRecommendation -> hasProperty(name)
    is Slot -> hasProperty(name)
    is CompartmentDefinition -> hasProperty(name)
    is Coverage -> hasProperty(name)
    is PaymentReconciliation -> hasProperty(name)
    is MedicationKnowledge -> hasProperty(name)
    is SubstanceReferenceInformation -> hasProperty(name)
    is ImmunizationEvaluation -> hasProperty(name)
    is SearchParameter -> hasProperty(name)
    is MedicationStatement -> hasProperty(name)
    is Schedule -> hasProperty(name)
    is Person -> hasProperty(name)
    is AdministrableProductDefinition -> hasProperty(name)
    is AllergyIntolerance -> hasProperty(name)
    is Transport -> hasProperty(name)
    is PlanDefinition -> hasProperty(name)
    is ResearchSubject -> hasProperty(name)
    is ClinicalImpression -> hasProperty(name)
    is Subscription -> hasProperty(name)
    is CareTeam -> hasProperty(name)
    is Device -> hasProperty(name)
    is NutritionProduct -> hasProperty(name)
    is Consent -> hasProperty(name)
    is MedicinalProductDefinition -> hasProperty(name)
    is Communication -> hasProperty(name)
    is Library -> hasProperty(name)
    is StructureMap -> hasProperty(name)
    is Task -> hasProperty(name)
    is EvidenceReport -> hasProperty(name)
    is Requirements -> hasProperty(name)
    is Practitioner -> hasProperty(name)
    is Ingredient -> hasProperty(name)
    is Observation -> hasProperty(name)
    is DocumentReference -> hasProperty(name)
    is OperationOutcome -> hasProperty(name)
    is MedicationDispense -> hasProperty(name)
    is Account -> hasProperty(name)
    is Procedure -> hasProperty(name)
    is SubstanceProtein -> hasProperty(name)
    is AdverseEvent -> hasProperty(name)
    else -> false
  }

internal fun Resource.getAllChildren(): CollectionsList<Any> =
  when (this) {
    is SubscriptionTopic -> getAllChildren()
    is RequestOrchestration -> getAllChildren()
    is BodyStructure -> getAllChildren()
    is ArtifactAssessment -> getAllChildren()
    is ExampleScenario -> getAllChildren()
    is Appointment -> getAllChildren()
    is ActorDefinition -> getAllChildren()
    is Condition -> getAllChildren()
    is R5List -> getAllChildren()
    is ChargeItem -> getAllChildren()
    is Permission -> getAllChildren()
    is BiologicallyDerivedProductDispense -> getAllChildren()
    is VerificationResult -> getAllChildren()
    is SupplyDelivery -> getAllChildren()
    is Composition -> getAllChildren()
    is Encounter -> getAllChildren()
    is MedicationAdministration -> getAllChildren()
    is Claim -> getAllChildren()
    is DeviceMetric -> getAllChildren()
    is AuditEvent -> getAllChildren()
    is ServiceRequest -> getAllChildren()
    is NutritionIntake -> getAllChildren()
    is EventDefinition -> getAllChildren()
    is CarePlan -> getAllChildren()
    is Linkage -> getAllChildren()
    is CoverageEligibilityResponse -> getAllChildren()
    is QuestionnaireResponse -> getAllChildren()
    is Location -> getAllChildren()
    is InsurancePlan -> getAllChildren()
    is Citation -> getAllChildren()
    is SubscriptionStatus -> getAllChildren()
    is Measure -> getAllChildren()
    is ActivityDefinition -> getAllChildren()
    is OrganizationAffiliation -> getAllChildren()
    is EpisodeOfCare -> getAllChildren()
    is InventoryReport -> getAllChildren()
    is DeviceRequest -> getAllChildren()
    is CapabilityStatement -> getAllChildren()
    is Endpoint -> getAllChildren()
    is DeviceDispense -> getAllChildren()
    is SubstancePolymer -> getAllChildren()
    is Substance -> getAllChildren()
    is Group -> getAllChildren()
    is ImagingStudy -> getAllChildren()
    is SubstanceNucleicAcid -> getAllChildren()
    is Organization -> getAllChildren()
    is MolecularSequence -> getAllChildren()
    is RegulatedAuthorization -> getAllChildren()
    is ChargeItemDefinition -> getAllChildren()
    is Questionnaire -> getAllChildren()
    is TestScript -> getAllChildren()
    is ResearchStudy -> getAllChildren()
    is PractitionerRole -> getAllChildren()
    is TestReport -> getAllChildren()
    is DeviceUsage -> getAllChildren()
    is MeasureReport -> getAllChildren()
    is SubstanceSourceMaterial -> getAllChildren()
    is SubstanceDefinition -> getAllChildren()
    is SupplyRequest -> getAllChildren()
    is ImagingSelection -> getAllChildren()
    is GenomicStudy -> getAllChildren()
    is Provenance -> getAllChildren()
    is Binary -> getAllChildren()
    is RiskAssessment -> getAllChildren()
    is Parameters -> getAllChildren()
    is HealthcareService -> getAllChildren()
    is RelatedPerson -> getAllChildren()
    is Evidence -> getAllChildren()
    is Basic -> getAllChildren()
    is NamingSystem -> getAllChildren()
    is VisionPrescription -> getAllChildren()
    is EnrollmentRequest -> getAllChildren()
    is Flag -> getAllChildren()
    is ExplanationOfBenefit -> getAllChildren()
    is PackagedProductDefinition -> getAllChildren()
    is Patient -> getAllChildren()
    is ManufacturedItemDefinition -> getAllChildren()
    is DeviceAssociation -> getAllChildren()
    is Specimen -> getAllChildren()
    is FamilyMemberHistory -> getAllChildren()
    is OperationDefinition -> getAllChildren()
    is GraphDefinition -> getAllChildren()
    is Medication -> getAllChildren()
    is DiagnosticReport -> getAllChildren()
    is AppointmentResponse -> getAllChildren()
    is MessageHeader -> getAllChildren()
    is DeviceDefinition -> getAllChildren()
    is Goal -> getAllChildren()
    is ObservationDefinition -> getAllChildren()
    is Immunization -> getAllChildren()
    is ValueSet -> getAllChildren()
    is ClaimResponse -> getAllChildren()
    is Contract -> getAllChildren()
    is BiologicallyDerivedProduct -> getAllChildren()
    is InventoryItem -> getAllChildren()
    is TestPlan -> getAllChildren()
    is TerminologyCapabilities -> getAllChildren()
    is ClinicalUseDefinition -> getAllChildren()
    is SpecimenDefinition -> getAllChildren()
    is EncounterHistory -> getAllChildren()
    is ConceptMap -> getAllChildren()
    is Invoice -> getAllChildren()
    is StructureDefinition -> getAllChildren()
    is ConditionDefinition -> getAllChildren()
    is CommunicationRequest -> getAllChildren()
    is PaymentNotice -> getAllChildren()
    is GuidanceResponse -> getAllChildren()
    is DetectedIssue -> getAllChildren()
    is EvidenceVariable -> getAllChildren()
    is Bundle -> getAllChildren()
    is MessageDefinition -> getAllChildren()
    is ImplementationGuide -> getAllChildren()
    is NutritionOrder -> getAllChildren()
    is EnrollmentResponse -> getAllChildren()
    is CoverageEligibilityRequest -> getAllChildren()
    is FormularyItem -> getAllChildren()
    is CodeSystem -> getAllChildren()
    is MedicationRequest -> getAllChildren()
    is ImmunizationRecommendation -> getAllChildren()
    is Slot -> getAllChildren()
    is CompartmentDefinition -> getAllChildren()
    is Coverage -> getAllChildren()
    is PaymentReconciliation -> getAllChildren()
    is MedicationKnowledge -> getAllChildren()
    is SubstanceReferenceInformation -> getAllChildren()
    is ImmunizationEvaluation -> getAllChildren()
    is SearchParameter -> getAllChildren()
    is MedicationStatement -> getAllChildren()
    is Schedule -> getAllChildren()
    is Person -> getAllChildren()
    is AdministrableProductDefinition -> getAllChildren()
    is AllergyIntolerance -> getAllChildren()
    is Transport -> getAllChildren()
    is PlanDefinition -> getAllChildren()
    is ResearchSubject -> getAllChildren()
    is ClinicalImpression -> getAllChildren()
    is Subscription -> getAllChildren()
    is CareTeam -> getAllChildren()
    is Device -> getAllChildren()
    is NutritionProduct -> getAllChildren()
    is Consent -> getAllChildren()
    is MedicinalProductDefinition -> getAllChildren()
    is Communication -> getAllChildren()
    is Library -> getAllChildren()
    is StructureMap -> getAllChildren()
    is Task -> getAllChildren()
    is EvidenceReport -> getAllChildren()
    is Requirements -> getAllChildren()
    is Practitioner -> getAllChildren()
    is Ingredient -> getAllChildren()
    is Observation -> getAllChildren()
    is DocumentReference -> getAllChildren()
    is OperationOutcome -> getAllChildren()
    is MedicationDispense -> getAllChildren()
    is Account -> getAllChildren()
    is Procedure -> getAllChildren()
    is SubstanceProtein -> getAllChildren()
    is AdverseEvent -> getAllChildren()
    else -> emptyList()
  }
