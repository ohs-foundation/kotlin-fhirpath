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

package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.fhirpath.types.FhirR4BResourceType
import dev.ohs.fhir.fhirpath.types.FhirR4BType
import dev.ohs.fhir.model.r4b.Account
import dev.ohs.fhir.model.r4b.ActivityDefinition
import dev.ohs.fhir.model.r4b.AdministrableProductDefinition
import dev.ohs.fhir.model.r4b.AdverseEvent
import dev.ohs.fhir.model.r4b.AllergyIntolerance
import dev.ohs.fhir.model.r4b.Appointment
import dev.ohs.fhir.model.r4b.AppointmentResponse
import dev.ohs.fhir.model.r4b.AuditEvent
import dev.ohs.fhir.model.r4b.Basic
import dev.ohs.fhir.model.r4b.Binary
import dev.ohs.fhir.model.r4b.BiologicallyDerivedProduct
import dev.ohs.fhir.model.r4b.BodyStructure
import dev.ohs.fhir.model.r4b.Bundle
import dev.ohs.fhir.model.r4b.CapabilityStatement
import dev.ohs.fhir.model.r4b.CarePlan
import dev.ohs.fhir.model.r4b.CareTeam
import dev.ohs.fhir.model.r4b.CatalogEntry
import dev.ohs.fhir.model.r4b.ChargeItem
import dev.ohs.fhir.model.r4b.ChargeItemDefinition
import dev.ohs.fhir.model.r4b.Citation
import dev.ohs.fhir.model.r4b.Claim
import dev.ohs.fhir.model.r4b.ClaimResponse
import dev.ohs.fhir.model.r4b.ClinicalImpression
import dev.ohs.fhir.model.r4b.ClinicalUseDefinition
import dev.ohs.fhir.model.r4b.CodeSystem
import dev.ohs.fhir.model.r4b.Communication
import dev.ohs.fhir.model.r4b.CommunicationRequest
import dev.ohs.fhir.model.r4b.CompartmentDefinition
import dev.ohs.fhir.model.r4b.Composition
import dev.ohs.fhir.model.r4b.ConceptMap
import dev.ohs.fhir.model.r4b.Condition
import dev.ohs.fhir.model.r4b.Consent
import dev.ohs.fhir.model.r4b.Contract
import dev.ohs.fhir.model.r4b.Coverage
import dev.ohs.fhir.model.r4b.CoverageEligibilityRequest
import dev.ohs.fhir.model.r4b.CoverageEligibilityResponse
import dev.ohs.fhir.model.r4b.DetectedIssue
import dev.ohs.fhir.model.r4b.Device
import dev.ohs.fhir.model.r4b.DeviceDefinition
import dev.ohs.fhir.model.r4b.DeviceMetric
import dev.ohs.fhir.model.r4b.DeviceRequest
import dev.ohs.fhir.model.r4b.DeviceUseStatement
import dev.ohs.fhir.model.r4b.DiagnosticReport
import dev.ohs.fhir.model.r4b.DocumentManifest
import dev.ohs.fhir.model.r4b.DocumentReference
import dev.ohs.fhir.model.r4b.Encounter
import dev.ohs.fhir.model.r4b.Endpoint
import dev.ohs.fhir.model.r4b.EnrollmentRequest
import dev.ohs.fhir.model.r4b.EnrollmentResponse
import dev.ohs.fhir.model.r4b.EpisodeOfCare
import dev.ohs.fhir.model.r4b.EventDefinition
import dev.ohs.fhir.model.r4b.Evidence
import dev.ohs.fhir.model.r4b.EvidenceReport
import dev.ohs.fhir.model.r4b.EvidenceVariable
import dev.ohs.fhir.model.r4b.ExampleScenario
import dev.ohs.fhir.model.r4b.ExplanationOfBenefit
import dev.ohs.fhir.model.r4b.FamilyMemberHistory
import dev.ohs.fhir.model.r4b.Flag
import dev.ohs.fhir.model.r4b.Goal
import dev.ohs.fhir.model.r4b.GraphDefinition
import dev.ohs.fhir.model.r4b.Group
import dev.ohs.fhir.model.r4b.GuidanceResponse
import dev.ohs.fhir.model.r4b.HealthcareService
import dev.ohs.fhir.model.r4b.ImagingStudy
import dev.ohs.fhir.model.r4b.Immunization
import dev.ohs.fhir.model.r4b.ImmunizationEvaluation
import dev.ohs.fhir.model.r4b.ImmunizationRecommendation
import dev.ohs.fhir.model.r4b.ImplementationGuide
import dev.ohs.fhir.model.r4b.Ingredient
import dev.ohs.fhir.model.r4b.InsurancePlan
import dev.ohs.fhir.model.r4b.Invoice
import dev.ohs.fhir.model.r4b.Library
import dev.ohs.fhir.model.r4b.Linkage
import dev.ohs.fhir.model.r4b.List as R4bList
import dev.ohs.fhir.model.r4b.Location
import dev.ohs.fhir.model.r4b.ManufacturedItemDefinition
import dev.ohs.fhir.model.r4b.Measure
import dev.ohs.fhir.model.r4b.MeasureReport
import dev.ohs.fhir.model.r4b.Media
import dev.ohs.fhir.model.r4b.Medication
import dev.ohs.fhir.model.r4b.MedicationAdministration
import dev.ohs.fhir.model.r4b.MedicationDispense
import dev.ohs.fhir.model.r4b.MedicationKnowledge
import dev.ohs.fhir.model.r4b.MedicationRequest
import dev.ohs.fhir.model.r4b.MedicationStatement
import dev.ohs.fhir.model.r4b.MedicinalProductDefinition
import dev.ohs.fhir.model.r4b.MessageDefinition
import dev.ohs.fhir.model.r4b.MessageHeader
import dev.ohs.fhir.model.r4b.MolecularSequence
import dev.ohs.fhir.model.r4b.NamingSystem
import dev.ohs.fhir.model.r4b.NutritionOrder
import dev.ohs.fhir.model.r4b.NutritionProduct
import dev.ohs.fhir.model.r4b.Observation
import dev.ohs.fhir.model.r4b.ObservationDefinition
import dev.ohs.fhir.model.r4b.OperationDefinition
import dev.ohs.fhir.model.r4b.OperationOutcome
import dev.ohs.fhir.model.r4b.Organization
import dev.ohs.fhir.model.r4b.OrganizationAffiliation
import dev.ohs.fhir.model.r4b.PackagedProductDefinition
import dev.ohs.fhir.model.r4b.Parameters
import dev.ohs.fhir.model.r4b.Patient
import dev.ohs.fhir.model.r4b.PaymentNotice
import dev.ohs.fhir.model.r4b.PaymentReconciliation
import dev.ohs.fhir.model.r4b.Person
import dev.ohs.fhir.model.r4b.PlanDefinition
import dev.ohs.fhir.model.r4b.Practitioner
import dev.ohs.fhir.model.r4b.PractitionerRole
import dev.ohs.fhir.model.r4b.Procedure
import dev.ohs.fhir.model.r4b.Provenance
import dev.ohs.fhir.model.r4b.Questionnaire
import dev.ohs.fhir.model.r4b.QuestionnaireResponse
import dev.ohs.fhir.model.r4b.RegulatedAuthorization
import dev.ohs.fhir.model.r4b.RelatedPerson
import dev.ohs.fhir.model.r4b.RequestGroup
import dev.ohs.fhir.model.r4b.ResearchDefinition
import dev.ohs.fhir.model.r4b.ResearchElementDefinition
import dev.ohs.fhir.model.r4b.ResearchStudy
import dev.ohs.fhir.model.r4b.ResearchSubject
import dev.ohs.fhir.model.r4b.Resource
import dev.ohs.fhir.model.r4b.RiskAssessment
import dev.ohs.fhir.model.r4b.Schedule
import dev.ohs.fhir.model.r4b.SearchParameter
import dev.ohs.fhir.model.r4b.ServiceRequest
import dev.ohs.fhir.model.r4b.Slot
import dev.ohs.fhir.model.r4b.Specimen
import dev.ohs.fhir.model.r4b.SpecimenDefinition
import dev.ohs.fhir.model.r4b.StructureDefinition
import dev.ohs.fhir.model.r4b.StructureMap
import dev.ohs.fhir.model.r4b.Subscription
import dev.ohs.fhir.model.r4b.SubscriptionStatus
import dev.ohs.fhir.model.r4b.SubscriptionTopic
import dev.ohs.fhir.model.r4b.Substance
import dev.ohs.fhir.model.r4b.SubstanceDefinition
import dev.ohs.fhir.model.r4b.SupplyDelivery
import dev.ohs.fhir.model.r4b.SupplyRequest
import dev.ohs.fhir.model.r4b.Task
import dev.ohs.fhir.model.r4b.TerminologyCapabilities
import dev.ohs.fhir.model.r4b.TestReport
import dev.ohs.fhir.model.r4b.TestScript
import dev.ohs.fhir.model.r4b.ValueSet
import dev.ohs.fhir.model.r4b.VerificationResult
import dev.ohs.fhir.model.r4b.VisionPrescription
import dev.ohs.fhir.model.r4b.terminologies.ResourceType
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List as CollectionsList

internal fun Resource.getFhirType(): FhirR4BType? =
  when (this) {
    is SubscriptionTopic -> FhirR4BResourceType(ResourceType.SubscriptionTopic)
    is DeviceUseStatement -> FhirR4BResourceType(ResourceType.DeviceUseStatement)
    is BodyStructure -> FhirR4BResourceType(ResourceType.BodyStructure)
    is ExampleScenario -> FhirR4BResourceType(ResourceType.ExampleScenario)
    is Appointment -> FhirR4BResourceType(ResourceType.Appointment)
    is Condition -> FhirR4BResourceType(ResourceType.Condition)
    is R4bList -> FhirR4BResourceType(ResourceType.List)
    is ChargeItem -> FhirR4BResourceType(ResourceType.ChargeItem)
    is VerificationResult -> FhirR4BResourceType(ResourceType.VerificationResult)
    is Media -> FhirR4BResourceType(ResourceType.Media)
    is SupplyDelivery -> FhirR4BResourceType(ResourceType.SupplyDelivery)
    is Composition -> FhirR4BResourceType(ResourceType.Composition)
    is Encounter -> FhirR4BResourceType(ResourceType.Encounter)
    is MedicationAdministration -> FhirR4BResourceType(ResourceType.MedicationAdministration)
    is DocumentManifest -> FhirR4BResourceType(ResourceType.DocumentManifest)
    is Claim -> FhirR4BResourceType(ResourceType.Claim)
    is DeviceMetric -> FhirR4BResourceType(ResourceType.DeviceMetric)
    is AuditEvent -> FhirR4BResourceType(ResourceType.AuditEvent)
    is ServiceRequest -> FhirR4BResourceType(ResourceType.ServiceRequest)
    is EventDefinition -> FhirR4BResourceType(ResourceType.EventDefinition)
    is CarePlan -> FhirR4BResourceType(ResourceType.CarePlan)
    is Linkage -> FhirR4BResourceType(ResourceType.Linkage)
    is CoverageEligibilityResponse -> FhirR4BResourceType(ResourceType.CoverageEligibilityResponse)
    is QuestionnaireResponse -> FhirR4BResourceType(ResourceType.QuestionnaireResponse)
    is Location -> FhirR4BResourceType(ResourceType.Location)
    is InsurancePlan -> FhirR4BResourceType(ResourceType.InsurancePlan)
    is Citation -> FhirR4BResourceType(ResourceType.Citation)
    is SubscriptionStatus -> FhirR4BResourceType(ResourceType.SubscriptionStatus)
    is Measure -> FhirR4BResourceType(ResourceType.Measure)
    is ActivityDefinition -> FhirR4BResourceType(ResourceType.ActivityDefinition)
    is OrganizationAffiliation -> FhirR4BResourceType(ResourceType.OrganizationAffiliation)
    is EpisodeOfCare -> FhirR4BResourceType(ResourceType.EpisodeOfCare)
    is DeviceRequest -> FhirR4BResourceType(ResourceType.DeviceRequest)
    is CapabilityStatement -> FhirR4BResourceType(ResourceType.CapabilityStatement)
    is Endpoint -> FhirR4BResourceType(ResourceType.Endpoint)
    is Substance -> FhirR4BResourceType(ResourceType.Substance)
    is CatalogEntry -> FhirR4BResourceType(ResourceType.CatalogEntry)
    is Group -> FhirR4BResourceType(ResourceType.Group)
    is ImagingStudy -> FhirR4BResourceType(ResourceType.ImagingStudy)
    is Organization -> FhirR4BResourceType(ResourceType.Organization)
    is MolecularSequence -> FhirR4BResourceType(ResourceType.MolecularSequence)
    is RegulatedAuthorization -> FhirR4BResourceType(ResourceType.RegulatedAuthorization)
    is ChargeItemDefinition -> FhirR4BResourceType(ResourceType.ChargeItemDefinition)
    is Questionnaire -> FhirR4BResourceType(ResourceType.Questionnaire)
    is TestScript -> FhirR4BResourceType(ResourceType.TestScript)
    is ResearchStudy -> FhirR4BResourceType(ResourceType.ResearchStudy)
    is PractitionerRole -> FhirR4BResourceType(ResourceType.PractitionerRole)
    is TestReport -> FhirR4BResourceType(ResourceType.TestReport)
    is MeasureReport -> FhirR4BResourceType(ResourceType.MeasureReport)
    is SubstanceDefinition -> FhirR4BResourceType(ResourceType.SubstanceDefinition)
    is SupplyRequest -> FhirR4BResourceType(ResourceType.SupplyRequest)
    is Provenance -> FhirR4BResourceType(ResourceType.Provenance)
    is Binary -> FhirR4BResourceType(ResourceType.Binary)
    is RiskAssessment -> FhirR4BResourceType(ResourceType.RiskAssessment)
    is Parameters -> FhirR4BResourceType(ResourceType.Parameters)
    is HealthcareService -> FhirR4BResourceType(ResourceType.HealthcareService)
    is RelatedPerson -> FhirR4BResourceType(ResourceType.RelatedPerson)
    is Evidence -> FhirR4BResourceType(ResourceType.Evidence)
    is Basic -> FhirR4BResourceType(ResourceType.Basic)
    is NamingSystem -> FhirR4BResourceType(ResourceType.NamingSystem)
    is VisionPrescription -> FhirR4BResourceType(ResourceType.VisionPrescription)
    is EnrollmentRequest -> FhirR4BResourceType(ResourceType.EnrollmentRequest)
    is Flag -> FhirR4BResourceType(ResourceType.Flag)
    is ExplanationOfBenefit -> FhirR4BResourceType(ResourceType.ExplanationOfBenefit)
    is PackagedProductDefinition -> FhirR4BResourceType(ResourceType.PackagedProductDefinition)
    is Patient -> FhirR4BResourceType(ResourceType.Patient)
    is ManufacturedItemDefinition -> FhirR4BResourceType(ResourceType.ManufacturedItemDefinition)
    is Specimen -> FhirR4BResourceType(ResourceType.Specimen)
    is FamilyMemberHistory -> FhirR4BResourceType(ResourceType.FamilyMemberHistory)
    is ResearchElementDefinition -> FhirR4BResourceType(ResourceType.ResearchElementDefinition)
    is OperationDefinition -> FhirR4BResourceType(ResourceType.OperationDefinition)
    is GraphDefinition -> FhirR4BResourceType(ResourceType.GraphDefinition)
    is Medication -> FhirR4BResourceType(ResourceType.Medication)
    is DiagnosticReport -> FhirR4BResourceType(ResourceType.DiagnosticReport)
    is AppointmentResponse -> FhirR4BResourceType(ResourceType.AppointmentResponse)
    is RequestGroup -> FhirR4BResourceType(ResourceType.RequestGroup)
    is MessageHeader -> FhirR4BResourceType(ResourceType.MessageHeader)
    is DeviceDefinition -> FhirR4BResourceType(ResourceType.DeviceDefinition)
    is Goal -> FhirR4BResourceType(ResourceType.Goal)
    is ObservationDefinition -> FhirR4BResourceType(ResourceType.ObservationDefinition)
    is Immunization -> FhirR4BResourceType(ResourceType.Immunization)
    is ValueSet -> FhirR4BResourceType(ResourceType.ValueSet)
    is ClaimResponse -> FhirR4BResourceType(ResourceType.ClaimResponse)
    is Contract -> FhirR4BResourceType(ResourceType.Contract)
    is BiologicallyDerivedProduct -> FhirR4BResourceType(ResourceType.BiologicallyDerivedProduct)
    is TerminologyCapabilities -> FhirR4BResourceType(ResourceType.TerminologyCapabilities)
    is ClinicalUseDefinition -> FhirR4BResourceType(ResourceType.ClinicalUseDefinition)
    is SpecimenDefinition -> FhirR4BResourceType(ResourceType.SpecimenDefinition)
    is ConceptMap -> FhirR4BResourceType(ResourceType.ConceptMap)
    is Invoice -> FhirR4BResourceType(ResourceType.Invoice)
    is StructureDefinition -> FhirR4BResourceType(ResourceType.StructureDefinition)
    is CommunicationRequest -> FhirR4BResourceType(ResourceType.CommunicationRequest)
    is PaymentNotice -> FhirR4BResourceType(ResourceType.PaymentNotice)
    is GuidanceResponse -> FhirR4BResourceType(ResourceType.GuidanceResponse)
    is DetectedIssue -> FhirR4BResourceType(ResourceType.DetectedIssue)
    is ResearchDefinition -> FhirR4BResourceType(ResourceType.ResearchDefinition)
    is EvidenceVariable -> FhirR4BResourceType(ResourceType.EvidenceVariable)
    is Bundle -> FhirR4BResourceType(ResourceType.Bundle)
    is MessageDefinition -> FhirR4BResourceType(ResourceType.MessageDefinition)
    is ImplementationGuide -> FhirR4BResourceType(ResourceType.ImplementationGuide)
    is NutritionOrder -> FhirR4BResourceType(ResourceType.NutritionOrder)
    is EnrollmentResponse -> FhirR4BResourceType(ResourceType.EnrollmentResponse)
    is CoverageEligibilityRequest -> FhirR4BResourceType(ResourceType.CoverageEligibilityRequest)
    is CodeSystem -> FhirR4BResourceType(ResourceType.CodeSystem)
    is MedicationRequest -> FhirR4BResourceType(ResourceType.MedicationRequest)
    is ImmunizationRecommendation -> FhirR4BResourceType(ResourceType.ImmunizationRecommendation)
    is Slot -> FhirR4BResourceType(ResourceType.Slot)
    is CompartmentDefinition -> FhirR4BResourceType(ResourceType.CompartmentDefinition)
    is Coverage -> FhirR4BResourceType(ResourceType.Coverage)
    is PaymentReconciliation -> FhirR4BResourceType(ResourceType.PaymentReconciliation)
    is MedicationKnowledge -> FhirR4BResourceType(ResourceType.MedicationKnowledge)
    is ImmunizationEvaluation -> FhirR4BResourceType(ResourceType.ImmunizationEvaluation)
    is SearchParameter -> FhirR4BResourceType(ResourceType.SearchParameter)
    is MedicationStatement -> FhirR4BResourceType(ResourceType.MedicationStatement)
    is Schedule -> FhirR4BResourceType(ResourceType.Schedule)
    is Person -> FhirR4BResourceType(ResourceType.Person)
    is AdministrableProductDefinition ->
      FhirR4BResourceType(ResourceType.AdministrableProductDefinition)
    is AllergyIntolerance -> FhirR4BResourceType(ResourceType.AllergyIntolerance)
    is PlanDefinition -> FhirR4BResourceType(ResourceType.PlanDefinition)
    is ResearchSubject -> FhirR4BResourceType(ResourceType.ResearchSubject)
    is ClinicalImpression -> FhirR4BResourceType(ResourceType.ClinicalImpression)
    is Subscription -> FhirR4BResourceType(ResourceType.Subscription)
    is CareTeam -> FhirR4BResourceType(ResourceType.CareTeam)
    is Device -> FhirR4BResourceType(ResourceType.Device)
    is NutritionProduct -> FhirR4BResourceType(ResourceType.NutritionProduct)
    is Consent -> FhirR4BResourceType(ResourceType.Consent)
    is MedicinalProductDefinition -> FhirR4BResourceType(ResourceType.MedicinalProductDefinition)
    is Communication -> FhirR4BResourceType(ResourceType.Communication)
    is Library -> FhirR4BResourceType(ResourceType.Library)
    is StructureMap -> FhirR4BResourceType(ResourceType.StructureMap)
    is Task -> FhirR4BResourceType(ResourceType.Task)
    is EvidenceReport -> FhirR4BResourceType(ResourceType.EvidenceReport)
    is Practitioner -> FhirR4BResourceType(ResourceType.Practitioner)
    is Ingredient -> FhirR4BResourceType(ResourceType.Ingredient)
    is Observation -> FhirR4BResourceType(ResourceType.Observation)
    is DocumentReference -> FhirR4BResourceType(ResourceType.DocumentReference)
    is OperationOutcome -> FhirR4BResourceType(ResourceType.OperationOutcome)
    is MedicationDispense -> FhirR4BResourceType(ResourceType.MedicationDispense)
    is Account -> FhirR4BResourceType(ResourceType.Account)
    is Procedure -> FhirR4BResourceType(ResourceType.Procedure)
    is AdverseEvent -> FhirR4BResourceType(ResourceType.AdverseEvent)
    else -> null
  }

internal fun Resource.getProperty(name: String): Any? =
  when (this) {
    is SubscriptionTopic -> getProperty(name)
    is DeviceUseStatement -> getProperty(name)
    is BodyStructure -> getProperty(name)
    is ExampleScenario -> getProperty(name)
    is Appointment -> getProperty(name)
    is Condition -> getProperty(name)
    is R4bList -> getProperty(name)
    is ChargeItem -> getProperty(name)
    is VerificationResult -> getProperty(name)
    is Media -> getProperty(name)
    is SupplyDelivery -> getProperty(name)
    is Composition -> getProperty(name)
    is Encounter -> getProperty(name)
    is MedicationAdministration -> getProperty(name)
    is DocumentManifest -> getProperty(name)
    is Claim -> getProperty(name)
    is DeviceMetric -> getProperty(name)
    is AuditEvent -> getProperty(name)
    is ServiceRequest -> getProperty(name)
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
    is DeviceRequest -> getProperty(name)
    is CapabilityStatement -> getProperty(name)
    is Endpoint -> getProperty(name)
    is Substance -> getProperty(name)
    is CatalogEntry -> getProperty(name)
    is Group -> getProperty(name)
    is ImagingStudy -> getProperty(name)
    is Organization -> getProperty(name)
    is MolecularSequence -> getProperty(name)
    is RegulatedAuthorization -> getProperty(name)
    is ChargeItemDefinition -> getProperty(name)
    is Questionnaire -> getProperty(name)
    is TestScript -> getProperty(name)
    is ResearchStudy -> getProperty(name)
    is PractitionerRole -> getProperty(name)
    is TestReport -> getProperty(name)
    is MeasureReport -> getProperty(name)
    is SubstanceDefinition -> getProperty(name)
    is SupplyRequest -> getProperty(name)
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
    is Specimen -> getProperty(name)
    is FamilyMemberHistory -> getProperty(name)
    is ResearchElementDefinition -> getProperty(name)
    is OperationDefinition -> getProperty(name)
    is GraphDefinition -> getProperty(name)
    is Medication -> getProperty(name)
    is DiagnosticReport -> getProperty(name)
    is AppointmentResponse -> getProperty(name)
    is RequestGroup -> getProperty(name)
    is MessageHeader -> getProperty(name)
    is DeviceDefinition -> getProperty(name)
    is Goal -> getProperty(name)
    is ObservationDefinition -> getProperty(name)
    is Immunization -> getProperty(name)
    is ValueSet -> getProperty(name)
    is ClaimResponse -> getProperty(name)
    is Contract -> getProperty(name)
    is BiologicallyDerivedProduct -> getProperty(name)
    is TerminologyCapabilities -> getProperty(name)
    is ClinicalUseDefinition -> getProperty(name)
    is SpecimenDefinition -> getProperty(name)
    is ConceptMap -> getProperty(name)
    is Invoice -> getProperty(name)
    is StructureDefinition -> getProperty(name)
    is CommunicationRequest -> getProperty(name)
    is PaymentNotice -> getProperty(name)
    is GuidanceResponse -> getProperty(name)
    is DetectedIssue -> getProperty(name)
    is ResearchDefinition -> getProperty(name)
    is EvidenceVariable -> getProperty(name)
    is Bundle -> getProperty(name)
    is MessageDefinition -> getProperty(name)
    is ImplementationGuide -> getProperty(name)
    is NutritionOrder -> getProperty(name)
    is EnrollmentResponse -> getProperty(name)
    is CoverageEligibilityRequest -> getProperty(name)
    is CodeSystem -> getProperty(name)
    is MedicationRequest -> getProperty(name)
    is ImmunizationRecommendation -> getProperty(name)
    is Slot -> getProperty(name)
    is CompartmentDefinition -> getProperty(name)
    is Coverage -> getProperty(name)
    is PaymentReconciliation -> getProperty(name)
    is MedicationKnowledge -> getProperty(name)
    is ImmunizationEvaluation -> getProperty(name)
    is SearchParameter -> getProperty(name)
    is MedicationStatement -> getProperty(name)
    is Schedule -> getProperty(name)
    is Person -> getProperty(name)
    is AdministrableProductDefinition -> getProperty(name)
    is AllergyIntolerance -> getProperty(name)
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
    is Practitioner -> getProperty(name)
    is Ingredient -> getProperty(name)
    is Observation -> getProperty(name)
    is DocumentReference -> getProperty(name)
    is OperationOutcome -> getProperty(name)
    is MedicationDispense -> getProperty(name)
    is Account -> getProperty(name)
    is Procedure -> getProperty(name)
    is AdverseEvent -> getProperty(name)
    else -> null
  }

internal fun Resource.hasProperty(name: String): Boolean =
  when (this) {
    is SubscriptionTopic -> hasProperty(name)
    is DeviceUseStatement -> hasProperty(name)
    is BodyStructure -> hasProperty(name)
    is ExampleScenario -> hasProperty(name)
    is Appointment -> hasProperty(name)
    is Condition -> hasProperty(name)
    is R4bList -> hasProperty(name)
    is ChargeItem -> hasProperty(name)
    is VerificationResult -> hasProperty(name)
    is Media -> hasProperty(name)
    is SupplyDelivery -> hasProperty(name)
    is Composition -> hasProperty(name)
    is Encounter -> hasProperty(name)
    is MedicationAdministration -> hasProperty(name)
    is DocumentManifest -> hasProperty(name)
    is Claim -> hasProperty(name)
    is DeviceMetric -> hasProperty(name)
    is AuditEvent -> hasProperty(name)
    is ServiceRequest -> hasProperty(name)
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
    is DeviceRequest -> hasProperty(name)
    is CapabilityStatement -> hasProperty(name)
    is Endpoint -> hasProperty(name)
    is Substance -> hasProperty(name)
    is CatalogEntry -> hasProperty(name)
    is Group -> hasProperty(name)
    is ImagingStudy -> hasProperty(name)
    is Organization -> hasProperty(name)
    is MolecularSequence -> hasProperty(name)
    is RegulatedAuthorization -> hasProperty(name)
    is ChargeItemDefinition -> hasProperty(name)
    is Questionnaire -> hasProperty(name)
    is TestScript -> hasProperty(name)
    is ResearchStudy -> hasProperty(name)
    is PractitionerRole -> hasProperty(name)
    is TestReport -> hasProperty(name)
    is MeasureReport -> hasProperty(name)
    is SubstanceDefinition -> hasProperty(name)
    is SupplyRequest -> hasProperty(name)
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
    is Specimen -> hasProperty(name)
    is FamilyMemberHistory -> hasProperty(name)
    is ResearchElementDefinition -> hasProperty(name)
    is OperationDefinition -> hasProperty(name)
    is GraphDefinition -> hasProperty(name)
    is Medication -> hasProperty(name)
    is DiagnosticReport -> hasProperty(name)
    is AppointmentResponse -> hasProperty(name)
    is RequestGroup -> hasProperty(name)
    is MessageHeader -> hasProperty(name)
    is DeviceDefinition -> hasProperty(name)
    is Goal -> hasProperty(name)
    is ObservationDefinition -> hasProperty(name)
    is Immunization -> hasProperty(name)
    is ValueSet -> hasProperty(name)
    is ClaimResponse -> hasProperty(name)
    is Contract -> hasProperty(name)
    is BiologicallyDerivedProduct -> hasProperty(name)
    is TerminologyCapabilities -> hasProperty(name)
    is ClinicalUseDefinition -> hasProperty(name)
    is SpecimenDefinition -> hasProperty(name)
    is ConceptMap -> hasProperty(name)
    is Invoice -> hasProperty(name)
    is StructureDefinition -> hasProperty(name)
    is CommunicationRequest -> hasProperty(name)
    is PaymentNotice -> hasProperty(name)
    is GuidanceResponse -> hasProperty(name)
    is DetectedIssue -> hasProperty(name)
    is ResearchDefinition -> hasProperty(name)
    is EvidenceVariable -> hasProperty(name)
    is Bundle -> hasProperty(name)
    is MessageDefinition -> hasProperty(name)
    is ImplementationGuide -> hasProperty(name)
    is NutritionOrder -> hasProperty(name)
    is EnrollmentResponse -> hasProperty(name)
    is CoverageEligibilityRequest -> hasProperty(name)
    is CodeSystem -> hasProperty(name)
    is MedicationRequest -> hasProperty(name)
    is ImmunizationRecommendation -> hasProperty(name)
    is Slot -> hasProperty(name)
    is CompartmentDefinition -> hasProperty(name)
    is Coverage -> hasProperty(name)
    is PaymentReconciliation -> hasProperty(name)
    is MedicationKnowledge -> hasProperty(name)
    is ImmunizationEvaluation -> hasProperty(name)
    is SearchParameter -> hasProperty(name)
    is MedicationStatement -> hasProperty(name)
    is Schedule -> hasProperty(name)
    is Person -> hasProperty(name)
    is AdministrableProductDefinition -> hasProperty(name)
    is AllergyIntolerance -> hasProperty(name)
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
    is Practitioner -> hasProperty(name)
    is Ingredient -> hasProperty(name)
    is Observation -> hasProperty(name)
    is DocumentReference -> hasProperty(name)
    is OperationOutcome -> hasProperty(name)
    is MedicationDispense -> hasProperty(name)
    is Account -> hasProperty(name)
    is Procedure -> hasProperty(name)
    is AdverseEvent -> hasProperty(name)
    else -> false
  }

internal fun Resource.getAllChildren(): CollectionsList<Any> =
  when (this) {
    is SubscriptionTopic -> getAllChildren()
    is DeviceUseStatement -> getAllChildren()
    is BodyStructure -> getAllChildren()
    is ExampleScenario -> getAllChildren()
    is Appointment -> getAllChildren()
    is Condition -> getAllChildren()
    is R4bList -> getAllChildren()
    is ChargeItem -> getAllChildren()
    is VerificationResult -> getAllChildren()
    is Media -> getAllChildren()
    is SupplyDelivery -> getAllChildren()
    is Composition -> getAllChildren()
    is Encounter -> getAllChildren()
    is MedicationAdministration -> getAllChildren()
    is DocumentManifest -> getAllChildren()
    is Claim -> getAllChildren()
    is DeviceMetric -> getAllChildren()
    is AuditEvent -> getAllChildren()
    is ServiceRequest -> getAllChildren()
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
    is DeviceRequest -> getAllChildren()
    is CapabilityStatement -> getAllChildren()
    is Endpoint -> getAllChildren()
    is Substance -> getAllChildren()
    is CatalogEntry -> getAllChildren()
    is Group -> getAllChildren()
    is ImagingStudy -> getAllChildren()
    is Organization -> getAllChildren()
    is MolecularSequence -> getAllChildren()
    is RegulatedAuthorization -> getAllChildren()
    is ChargeItemDefinition -> getAllChildren()
    is Questionnaire -> getAllChildren()
    is TestScript -> getAllChildren()
    is ResearchStudy -> getAllChildren()
    is PractitionerRole -> getAllChildren()
    is TestReport -> getAllChildren()
    is MeasureReport -> getAllChildren()
    is SubstanceDefinition -> getAllChildren()
    is SupplyRequest -> getAllChildren()
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
    is Specimen -> getAllChildren()
    is FamilyMemberHistory -> getAllChildren()
    is ResearchElementDefinition -> getAllChildren()
    is OperationDefinition -> getAllChildren()
    is GraphDefinition -> getAllChildren()
    is Medication -> getAllChildren()
    is DiagnosticReport -> getAllChildren()
    is AppointmentResponse -> getAllChildren()
    is RequestGroup -> getAllChildren()
    is MessageHeader -> getAllChildren()
    is DeviceDefinition -> getAllChildren()
    is Goal -> getAllChildren()
    is ObservationDefinition -> getAllChildren()
    is Immunization -> getAllChildren()
    is ValueSet -> getAllChildren()
    is ClaimResponse -> getAllChildren()
    is Contract -> getAllChildren()
    is BiologicallyDerivedProduct -> getAllChildren()
    is TerminologyCapabilities -> getAllChildren()
    is ClinicalUseDefinition -> getAllChildren()
    is SpecimenDefinition -> getAllChildren()
    is ConceptMap -> getAllChildren()
    is Invoice -> getAllChildren()
    is StructureDefinition -> getAllChildren()
    is CommunicationRequest -> getAllChildren()
    is PaymentNotice -> getAllChildren()
    is GuidanceResponse -> getAllChildren()
    is DetectedIssue -> getAllChildren()
    is ResearchDefinition -> getAllChildren()
    is EvidenceVariable -> getAllChildren()
    is Bundle -> getAllChildren()
    is MessageDefinition -> getAllChildren()
    is ImplementationGuide -> getAllChildren()
    is NutritionOrder -> getAllChildren()
    is EnrollmentResponse -> getAllChildren()
    is CoverageEligibilityRequest -> getAllChildren()
    is CodeSystem -> getAllChildren()
    is MedicationRequest -> getAllChildren()
    is ImmunizationRecommendation -> getAllChildren()
    is Slot -> getAllChildren()
    is CompartmentDefinition -> getAllChildren()
    is Coverage -> getAllChildren()
    is PaymentReconciliation -> getAllChildren()
    is MedicationKnowledge -> getAllChildren()
    is ImmunizationEvaluation -> getAllChildren()
    is SearchParameter -> getAllChildren()
    is MedicationStatement -> getAllChildren()
    is Schedule -> getAllChildren()
    is Person -> getAllChildren()
    is AdministrableProductDefinition -> getAllChildren()
    is AllergyIntolerance -> getAllChildren()
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
    is Practitioner -> getAllChildren()
    is Ingredient -> getAllChildren()
    is Observation -> getAllChildren()
    is DocumentReference -> getAllChildren()
    is OperationOutcome -> getAllChildren()
    is MedicationDispense -> getAllChildren()
    is Account -> getAllChildren()
    is Procedure -> getAllChildren()
    is AdverseEvent -> getAllChildren()
    else -> emptyList()
  }
