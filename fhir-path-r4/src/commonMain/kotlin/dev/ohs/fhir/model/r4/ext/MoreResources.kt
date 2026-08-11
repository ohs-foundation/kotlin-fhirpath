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

import dev.ohs.fhir.fhirpath.types.FhirR4ResourceType
import dev.ohs.fhir.fhirpath.types.FhirR4Type
import dev.ohs.fhir.model.r4.Account
import dev.ohs.fhir.model.r4.ActivityDefinition
import dev.ohs.fhir.model.r4.AdverseEvent
import dev.ohs.fhir.model.r4.AllergyIntolerance
import dev.ohs.fhir.model.r4.Appointment
import dev.ohs.fhir.model.r4.AppointmentResponse
import dev.ohs.fhir.model.r4.AuditEvent
import dev.ohs.fhir.model.r4.Basic
import dev.ohs.fhir.model.r4.Binary
import dev.ohs.fhir.model.r4.BiologicallyDerivedProduct
import dev.ohs.fhir.model.r4.BodyStructure
import dev.ohs.fhir.model.r4.Bundle
import dev.ohs.fhir.model.r4.CapabilityStatement
import dev.ohs.fhir.model.r4.CarePlan
import dev.ohs.fhir.model.r4.CareTeam
import dev.ohs.fhir.model.r4.CatalogEntry
import dev.ohs.fhir.model.r4.ChargeItem
import dev.ohs.fhir.model.r4.ChargeItemDefinition
import dev.ohs.fhir.model.r4.Claim
import dev.ohs.fhir.model.r4.ClaimResponse
import dev.ohs.fhir.model.r4.ClinicalImpression
import dev.ohs.fhir.model.r4.CodeSystem
import dev.ohs.fhir.model.r4.Communication
import dev.ohs.fhir.model.r4.CommunicationRequest
import dev.ohs.fhir.model.r4.CompartmentDefinition
import dev.ohs.fhir.model.r4.Composition
import dev.ohs.fhir.model.r4.ConceptMap
import dev.ohs.fhir.model.r4.Condition
import dev.ohs.fhir.model.r4.Consent
import dev.ohs.fhir.model.r4.Contract
import dev.ohs.fhir.model.r4.Coverage
import dev.ohs.fhir.model.r4.CoverageEligibilityRequest
import dev.ohs.fhir.model.r4.CoverageEligibilityResponse
import dev.ohs.fhir.model.r4.DetectedIssue
import dev.ohs.fhir.model.r4.Device
import dev.ohs.fhir.model.r4.DeviceDefinition
import dev.ohs.fhir.model.r4.DeviceMetric
import dev.ohs.fhir.model.r4.DeviceRequest
import dev.ohs.fhir.model.r4.DeviceUseStatement
import dev.ohs.fhir.model.r4.DiagnosticReport
import dev.ohs.fhir.model.r4.DocumentManifest
import dev.ohs.fhir.model.r4.DocumentReference
import dev.ohs.fhir.model.r4.EffectEvidenceSynthesis
import dev.ohs.fhir.model.r4.Encounter
import dev.ohs.fhir.model.r4.Endpoint
import dev.ohs.fhir.model.r4.EnrollmentRequest
import dev.ohs.fhir.model.r4.EnrollmentResponse
import dev.ohs.fhir.model.r4.EpisodeOfCare
import dev.ohs.fhir.model.r4.EventDefinition
import dev.ohs.fhir.model.r4.Evidence
import dev.ohs.fhir.model.r4.EvidenceVariable
import dev.ohs.fhir.model.r4.ExampleScenario
import dev.ohs.fhir.model.r4.ExplanationOfBenefit
import dev.ohs.fhir.model.r4.FamilyMemberHistory
import dev.ohs.fhir.model.r4.Flag
import dev.ohs.fhir.model.r4.Goal
import dev.ohs.fhir.model.r4.GraphDefinition
import dev.ohs.fhir.model.r4.Group
import dev.ohs.fhir.model.r4.GuidanceResponse
import dev.ohs.fhir.model.r4.HealthcareService
import dev.ohs.fhir.model.r4.ImagingStudy
import dev.ohs.fhir.model.r4.Immunization
import dev.ohs.fhir.model.r4.ImmunizationEvaluation
import dev.ohs.fhir.model.r4.ImmunizationRecommendation
import dev.ohs.fhir.model.r4.ImplementationGuide
import dev.ohs.fhir.model.r4.InsurancePlan
import dev.ohs.fhir.model.r4.Invoice
import dev.ohs.fhir.model.r4.Library
import dev.ohs.fhir.model.r4.Linkage
import dev.ohs.fhir.model.r4.List as R4List
import dev.ohs.fhir.model.r4.Location
import dev.ohs.fhir.model.r4.Measure
import dev.ohs.fhir.model.r4.MeasureReport
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
import dev.ohs.fhir.model.r4.MedicinalProductIngredient
import dev.ohs.fhir.model.r4.MedicinalProductInteraction
import dev.ohs.fhir.model.r4.MedicinalProductManufactured
import dev.ohs.fhir.model.r4.MedicinalProductPackaged
import dev.ohs.fhir.model.r4.MedicinalProductPharmaceutical
import dev.ohs.fhir.model.r4.MedicinalProductUndesirableEffect
import dev.ohs.fhir.model.r4.MessageDefinition
import dev.ohs.fhir.model.r4.MessageHeader
import dev.ohs.fhir.model.r4.MolecularSequence
import dev.ohs.fhir.model.r4.NamingSystem
import dev.ohs.fhir.model.r4.NutritionOrder
import dev.ohs.fhir.model.r4.Observation
import dev.ohs.fhir.model.r4.ObservationDefinition
import dev.ohs.fhir.model.r4.OperationDefinition
import dev.ohs.fhir.model.r4.OperationOutcome
import dev.ohs.fhir.model.r4.Organization
import dev.ohs.fhir.model.r4.OrganizationAffiliation
import dev.ohs.fhir.model.r4.Parameters
import dev.ohs.fhir.model.r4.Patient
import dev.ohs.fhir.model.r4.PaymentNotice
import dev.ohs.fhir.model.r4.PaymentReconciliation
import dev.ohs.fhir.model.r4.Person
import dev.ohs.fhir.model.r4.PlanDefinition
import dev.ohs.fhir.model.r4.Practitioner
import dev.ohs.fhir.model.r4.PractitionerRole
import dev.ohs.fhir.model.r4.Procedure
import dev.ohs.fhir.model.r4.Provenance
import dev.ohs.fhir.model.r4.Questionnaire
import dev.ohs.fhir.model.r4.QuestionnaireResponse
import dev.ohs.fhir.model.r4.RelatedPerson
import dev.ohs.fhir.model.r4.RequestGroup
import dev.ohs.fhir.model.r4.ResearchDefinition
import dev.ohs.fhir.model.r4.ResearchElementDefinition
import dev.ohs.fhir.model.r4.ResearchStudy
import dev.ohs.fhir.model.r4.ResearchSubject
import dev.ohs.fhir.model.r4.Resource
import dev.ohs.fhir.model.r4.RiskAssessment
import dev.ohs.fhir.model.r4.RiskEvidenceSynthesis
import dev.ohs.fhir.model.r4.Schedule
import dev.ohs.fhir.model.r4.SearchParameter
import dev.ohs.fhir.model.r4.ServiceRequest
import dev.ohs.fhir.model.r4.Slot
import dev.ohs.fhir.model.r4.Specimen
import dev.ohs.fhir.model.r4.SpecimenDefinition
import dev.ohs.fhir.model.r4.StructureDefinition
import dev.ohs.fhir.model.r4.StructureMap
import dev.ohs.fhir.model.r4.Subscription
import dev.ohs.fhir.model.r4.Substance
import dev.ohs.fhir.model.r4.SubstanceNucleicAcid
import dev.ohs.fhir.model.r4.SubstancePolymer
import dev.ohs.fhir.model.r4.SubstanceProtein
import dev.ohs.fhir.model.r4.SubstanceReferenceInformation
import dev.ohs.fhir.model.r4.SubstanceSourceMaterial
import dev.ohs.fhir.model.r4.SubstanceSpecification
import dev.ohs.fhir.model.r4.SupplyDelivery
import dev.ohs.fhir.model.r4.SupplyRequest
import dev.ohs.fhir.model.r4.Task
import dev.ohs.fhir.model.r4.TerminologyCapabilities
import dev.ohs.fhir.model.r4.TestReport
import dev.ohs.fhir.model.r4.TestScript
import dev.ohs.fhir.model.r4.ValueSet
import dev.ohs.fhir.model.r4.VerificationResult
import dev.ohs.fhir.model.r4.VisionPrescription
import dev.ohs.fhir.model.r4.terminologies.ResourceType
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List as CollectionsList

internal fun Resource.getFhirType(): FhirR4Type? =
  when (this) {
    is SubstanceSpecification -> FhirR4ResourceType(ResourceType.SubstanceSpecification)
    is DeviceUseStatement -> FhirR4ResourceType(ResourceType.DeviceUseStatement)
    is BodyStructure -> FhirR4ResourceType(ResourceType.BodyStructure)
    is ExampleScenario -> FhirR4ResourceType(ResourceType.ExampleScenario)
    is Appointment -> FhirR4ResourceType(ResourceType.Appointment)
    is Condition -> FhirR4ResourceType(ResourceType.Condition)
    is R4List -> FhirR4ResourceType(ResourceType.List)
    is ChargeItem -> FhirR4ResourceType(ResourceType.ChargeItem)
    is VerificationResult -> FhirR4ResourceType(ResourceType.VerificationResult)
    is MedicinalProductUndesirableEffect ->
      FhirR4ResourceType(ResourceType.MedicinalProductUndesirableEffect)
    is Media -> FhirR4ResourceType(ResourceType.Media)
    is SupplyDelivery -> FhirR4ResourceType(ResourceType.SupplyDelivery)
    is Composition -> FhirR4ResourceType(ResourceType.Composition)
    is Encounter -> FhirR4ResourceType(ResourceType.Encounter)
    is MedicationAdministration -> FhirR4ResourceType(ResourceType.MedicationAdministration)
    is DocumentManifest -> FhirR4ResourceType(ResourceType.DocumentManifest)
    is Claim -> FhirR4ResourceType(ResourceType.Claim)
    is DeviceMetric -> FhirR4ResourceType(ResourceType.DeviceMetric)
    is AuditEvent -> FhirR4ResourceType(ResourceType.AuditEvent)
    is ServiceRequest -> FhirR4ResourceType(ResourceType.ServiceRequest)
    is EventDefinition -> FhirR4ResourceType(ResourceType.EventDefinition)
    is CarePlan -> FhirR4ResourceType(ResourceType.CarePlan)
    is Linkage -> FhirR4ResourceType(ResourceType.Linkage)
    is CoverageEligibilityResponse -> FhirR4ResourceType(ResourceType.CoverageEligibilityResponse)
    is QuestionnaireResponse -> FhirR4ResourceType(ResourceType.QuestionnaireResponse)
    is Location -> FhirR4ResourceType(ResourceType.Location)
    is InsurancePlan -> FhirR4ResourceType(ResourceType.InsurancePlan)
    is Measure -> FhirR4ResourceType(ResourceType.Measure)
    is EffectEvidenceSynthesis -> FhirR4ResourceType(ResourceType.EffectEvidenceSynthesis)
    is ActivityDefinition -> FhirR4ResourceType(ResourceType.ActivityDefinition)
    is OrganizationAffiliation -> FhirR4ResourceType(ResourceType.OrganizationAffiliation)
    is EpisodeOfCare -> FhirR4ResourceType(ResourceType.EpisodeOfCare)
    is DeviceRequest -> FhirR4ResourceType(ResourceType.DeviceRequest)
    is MedicinalProductManufactured -> FhirR4ResourceType(ResourceType.MedicinalProductManufactured)
    is CapabilityStatement -> FhirR4ResourceType(ResourceType.CapabilityStatement)
    is Endpoint -> FhirR4ResourceType(ResourceType.Endpoint)
    is SubstancePolymer -> FhirR4ResourceType(ResourceType.SubstancePolymer)
    is Substance -> FhirR4ResourceType(ResourceType.Substance)
    is CatalogEntry -> FhirR4ResourceType(ResourceType.CatalogEntry)
    is Group -> FhirR4ResourceType(ResourceType.Group)
    is ImagingStudy -> FhirR4ResourceType(ResourceType.ImagingStudy)
    is SubstanceNucleicAcid -> FhirR4ResourceType(ResourceType.SubstanceNucleicAcid)
    is Organization -> FhirR4ResourceType(ResourceType.Organization)
    is MolecularSequence -> FhirR4ResourceType(ResourceType.MolecularSequence)
    is ChargeItemDefinition -> FhirR4ResourceType(ResourceType.ChargeItemDefinition)
    is Questionnaire -> FhirR4ResourceType(ResourceType.Questionnaire)
    is TestScript -> FhirR4ResourceType(ResourceType.TestScript)
    is ResearchStudy -> FhirR4ResourceType(ResourceType.ResearchStudy)
    is PractitionerRole -> FhirR4ResourceType(ResourceType.PractitionerRole)
    is TestReport -> FhirR4ResourceType(ResourceType.TestReport)
    is MeasureReport -> FhirR4ResourceType(ResourceType.MeasureReport)
    is SubstanceSourceMaterial -> FhirR4ResourceType(ResourceType.SubstanceSourceMaterial)
    is SupplyRequest -> FhirR4ResourceType(ResourceType.SupplyRequest)
    is Provenance -> FhirR4ResourceType(ResourceType.Provenance)
    is Binary -> FhirR4ResourceType(ResourceType.Binary)
    is RiskAssessment -> FhirR4ResourceType(ResourceType.RiskAssessment)
    is Parameters -> FhirR4ResourceType(ResourceType.Parameters)
    is HealthcareService -> FhirR4ResourceType(ResourceType.HealthcareService)
    is RelatedPerson -> FhirR4ResourceType(ResourceType.RelatedPerson)
    is Evidence -> FhirR4ResourceType(ResourceType.Evidence)
    is Basic -> FhirR4ResourceType(ResourceType.Basic)
    is NamingSystem -> FhirR4ResourceType(ResourceType.NamingSystem)
    is VisionPrescription -> FhirR4ResourceType(ResourceType.VisionPrescription)
    is EnrollmentRequest -> FhirR4ResourceType(ResourceType.EnrollmentRequest)
    is Flag -> FhirR4ResourceType(ResourceType.Flag)
    is ExplanationOfBenefit -> FhirR4ResourceType(ResourceType.ExplanationOfBenefit)
    is Patient -> FhirR4ResourceType(ResourceType.Patient)
    is MedicinalProduct -> FhirR4ResourceType(ResourceType.MedicinalProduct)
    is Specimen -> FhirR4ResourceType(ResourceType.Specimen)
    is FamilyMemberHistory -> FhirR4ResourceType(ResourceType.FamilyMemberHistory)
    is ResearchElementDefinition -> FhirR4ResourceType(ResourceType.ResearchElementDefinition)
    is OperationDefinition -> FhirR4ResourceType(ResourceType.OperationDefinition)
    is MedicinalProductIndication -> FhirR4ResourceType(ResourceType.MedicinalProductIndication)
    is GraphDefinition -> FhirR4ResourceType(ResourceType.GraphDefinition)
    is Medication -> FhirR4ResourceType(ResourceType.Medication)
    is DiagnosticReport -> FhirR4ResourceType(ResourceType.DiagnosticReport)
    is AppointmentResponse -> FhirR4ResourceType(ResourceType.AppointmentResponse)
    is RequestGroup -> FhirR4ResourceType(ResourceType.RequestGroup)
    is MessageHeader -> FhirR4ResourceType(ResourceType.MessageHeader)
    is DeviceDefinition -> FhirR4ResourceType(ResourceType.DeviceDefinition)
    is Goal -> FhirR4ResourceType(ResourceType.Goal)
    is ObservationDefinition -> FhirR4ResourceType(ResourceType.ObservationDefinition)
    is Immunization -> FhirR4ResourceType(ResourceType.Immunization)
    is ValueSet -> FhirR4ResourceType(ResourceType.ValueSet)
    is ClaimResponse -> FhirR4ResourceType(ResourceType.ClaimResponse)
    is Contract -> FhirR4ResourceType(ResourceType.Contract)
    is BiologicallyDerivedProduct -> FhirR4ResourceType(ResourceType.BiologicallyDerivedProduct)
    is TerminologyCapabilities -> FhirR4ResourceType(ResourceType.TerminologyCapabilities)
    is SpecimenDefinition -> FhirR4ResourceType(ResourceType.SpecimenDefinition)
    is MedicinalProductIngredient -> FhirR4ResourceType(ResourceType.MedicinalProductIngredient)
    is ConceptMap -> FhirR4ResourceType(ResourceType.ConceptMap)
    is Invoice -> FhirR4ResourceType(ResourceType.Invoice)
    is StructureDefinition -> FhirR4ResourceType(ResourceType.StructureDefinition)
    is CommunicationRequest -> FhirR4ResourceType(ResourceType.CommunicationRequest)
    is MedicinalProductInteraction -> FhirR4ResourceType(ResourceType.MedicinalProductInteraction)
    is PaymentNotice -> FhirR4ResourceType(ResourceType.PaymentNotice)
    is GuidanceResponse -> FhirR4ResourceType(ResourceType.GuidanceResponse)
    is RiskEvidenceSynthesis -> FhirR4ResourceType(ResourceType.RiskEvidenceSynthesis)
    is MedicinalProductPackaged -> FhirR4ResourceType(ResourceType.MedicinalProductPackaged)
    is DetectedIssue -> FhirR4ResourceType(ResourceType.DetectedIssue)
    is ResearchDefinition -> FhirR4ResourceType(ResourceType.ResearchDefinition)
    is MedicinalProductPharmaceutical ->
      FhirR4ResourceType(ResourceType.MedicinalProductPharmaceutical)
    is EvidenceVariable -> FhirR4ResourceType(ResourceType.EvidenceVariable)
    is Bundle -> FhirR4ResourceType(ResourceType.Bundle)
    is MessageDefinition -> FhirR4ResourceType(ResourceType.MessageDefinition)
    is ImplementationGuide -> FhirR4ResourceType(ResourceType.ImplementationGuide)
    is NutritionOrder -> FhirR4ResourceType(ResourceType.NutritionOrder)
    is EnrollmentResponse -> FhirR4ResourceType(ResourceType.EnrollmentResponse)
    is CoverageEligibilityRequest -> FhirR4ResourceType(ResourceType.CoverageEligibilityRequest)
    is CodeSystem -> FhirR4ResourceType(ResourceType.CodeSystem)
    is MedicationRequest -> FhirR4ResourceType(ResourceType.MedicationRequest)
    is ImmunizationRecommendation -> FhirR4ResourceType(ResourceType.ImmunizationRecommendation)
    is Slot -> FhirR4ResourceType(ResourceType.Slot)
    is CompartmentDefinition -> FhirR4ResourceType(ResourceType.CompartmentDefinition)
    is Coverage -> FhirR4ResourceType(ResourceType.Coverage)
    is PaymentReconciliation -> FhirR4ResourceType(ResourceType.PaymentReconciliation)
    is MedicationKnowledge -> FhirR4ResourceType(ResourceType.MedicationKnowledge)
    is SubstanceReferenceInformation ->
      FhirR4ResourceType(ResourceType.SubstanceReferenceInformation)
    is ImmunizationEvaluation -> FhirR4ResourceType(ResourceType.ImmunizationEvaluation)
    is SearchParameter -> FhirR4ResourceType(ResourceType.SearchParameter)
    is MedicationStatement -> FhirR4ResourceType(ResourceType.MedicationStatement)
    is Schedule -> FhirR4ResourceType(ResourceType.Schedule)
    is Person -> FhirR4ResourceType(ResourceType.Person)
    is AllergyIntolerance -> FhirR4ResourceType(ResourceType.AllergyIntolerance)
    is PlanDefinition -> FhirR4ResourceType(ResourceType.PlanDefinition)
    is ResearchSubject -> FhirR4ResourceType(ResourceType.ResearchSubject)
    is ClinicalImpression -> FhirR4ResourceType(ResourceType.ClinicalImpression)
    is Subscription -> FhirR4ResourceType(ResourceType.Subscription)
    is CareTeam -> FhirR4ResourceType(ResourceType.CareTeam)
    is Device -> FhirR4ResourceType(ResourceType.Device)
    is Consent -> FhirR4ResourceType(ResourceType.Consent)
    is Communication -> FhirR4ResourceType(ResourceType.Communication)
    is Library -> FhirR4ResourceType(ResourceType.Library)
    is StructureMap -> FhirR4ResourceType(ResourceType.StructureMap)
    is Task -> FhirR4ResourceType(ResourceType.Task)
    is Practitioner -> FhirR4ResourceType(ResourceType.Practitioner)
    is MedicinalProductContraindication ->
      FhirR4ResourceType(ResourceType.MedicinalProductContraindication)
    is Observation -> FhirR4ResourceType(ResourceType.Observation)
    is DocumentReference -> FhirR4ResourceType(ResourceType.DocumentReference)
    is OperationOutcome -> FhirR4ResourceType(ResourceType.OperationOutcome)
    is MedicationDispense -> FhirR4ResourceType(ResourceType.MedicationDispense)
    is Account -> FhirR4ResourceType(ResourceType.Account)
    is Procedure -> FhirR4ResourceType(ResourceType.Procedure)
    is SubstanceProtein -> FhirR4ResourceType(ResourceType.SubstanceProtein)
    is MedicinalProductAuthorization ->
      FhirR4ResourceType(ResourceType.MedicinalProductAuthorization)
    is AdverseEvent -> FhirR4ResourceType(ResourceType.AdverseEvent)
    else -> null
  }

internal fun Resource.getProperty(name: String): Any? =
  when (this) {
    is SubstanceSpecification -> getProperty(name)
    is DeviceUseStatement -> getProperty(name)
    is BodyStructure -> getProperty(name)
    is ExampleScenario -> getProperty(name)
    is Appointment -> getProperty(name)
    is Condition -> getProperty(name)
    is R4List -> getProperty(name)
    is ChargeItem -> getProperty(name)
    is VerificationResult -> getProperty(name)
    is MedicinalProductUndesirableEffect -> getProperty(name)
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
    is Measure -> getProperty(name)
    is EffectEvidenceSynthesis -> getProperty(name)
    is ActivityDefinition -> getProperty(name)
    is OrganizationAffiliation -> getProperty(name)
    is EpisodeOfCare -> getProperty(name)
    is DeviceRequest -> getProperty(name)
    is MedicinalProductManufactured -> getProperty(name)
    is CapabilityStatement -> getProperty(name)
    is Endpoint -> getProperty(name)
    is SubstancePolymer -> getProperty(name)
    is Substance -> getProperty(name)
    is CatalogEntry -> getProperty(name)
    is Group -> getProperty(name)
    is ImagingStudy -> getProperty(name)
    is SubstanceNucleicAcid -> getProperty(name)
    is Organization -> getProperty(name)
    is MolecularSequence -> getProperty(name)
    is ChargeItemDefinition -> getProperty(name)
    is Questionnaire -> getProperty(name)
    is TestScript -> getProperty(name)
    is ResearchStudy -> getProperty(name)
    is PractitionerRole -> getProperty(name)
    is TestReport -> getProperty(name)
    is MeasureReport -> getProperty(name)
    is SubstanceSourceMaterial -> getProperty(name)
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
    is Patient -> getProperty(name)
    is MedicinalProduct -> getProperty(name)
    is Specimen -> getProperty(name)
    is FamilyMemberHistory -> getProperty(name)
    is ResearchElementDefinition -> getProperty(name)
    is OperationDefinition -> getProperty(name)
    is MedicinalProductIndication -> getProperty(name)
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
    is SpecimenDefinition -> getProperty(name)
    is MedicinalProductIngredient -> getProperty(name)
    is ConceptMap -> getProperty(name)
    is Invoice -> getProperty(name)
    is StructureDefinition -> getProperty(name)
    is CommunicationRequest -> getProperty(name)
    is MedicinalProductInteraction -> getProperty(name)
    is PaymentNotice -> getProperty(name)
    is GuidanceResponse -> getProperty(name)
    is RiskEvidenceSynthesis -> getProperty(name)
    is MedicinalProductPackaged -> getProperty(name)
    is DetectedIssue -> getProperty(name)
    is ResearchDefinition -> getProperty(name)
    is MedicinalProductPharmaceutical -> getProperty(name)
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
    is SubstanceReferenceInformation -> getProperty(name)
    is ImmunizationEvaluation -> getProperty(name)
    is SearchParameter -> getProperty(name)
    is MedicationStatement -> getProperty(name)
    is Schedule -> getProperty(name)
    is Person -> getProperty(name)
    is AllergyIntolerance -> getProperty(name)
    is PlanDefinition -> getProperty(name)
    is ResearchSubject -> getProperty(name)
    is ClinicalImpression -> getProperty(name)
    is Subscription -> getProperty(name)
    is CareTeam -> getProperty(name)
    is Device -> getProperty(name)
    is Consent -> getProperty(name)
    is Communication -> getProperty(name)
    is Library -> getProperty(name)
    is StructureMap -> getProperty(name)
    is Task -> getProperty(name)
    is Practitioner -> getProperty(name)
    is MedicinalProductContraindication -> getProperty(name)
    is Observation -> getProperty(name)
    is DocumentReference -> getProperty(name)
    is OperationOutcome -> getProperty(name)
    is MedicationDispense -> getProperty(name)
    is Account -> getProperty(name)
    is Procedure -> getProperty(name)
    is SubstanceProtein -> getProperty(name)
    is MedicinalProductAuthorization -> getProperty(name)
    is AdverseEvent -> getProperty(name)
    else -> null
  }

internal fun Resource.hasProperty(name: String): Boolean =
  when (this) {
    is SubstanceSpecification -> hasProperty(name)
    is DeviceUseStatement -> hasProperty(name)
    is BodyStructure -> hasProperty(name)
    is ExampleScenario -> hasProperty(name)
    is Appointment -> hasProperty(name)
    is Condition -> hasProperty(name)
    is R4List -> hasProperty(name)
    is ChargeItem -> hasProperty(name)
    is VerificationResult -> hasProperty(name)
    is MedicinalProductUndesirableEffect -> hasProperty(name)
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
    is Measure -> hasProperty(name)
    is EffectEvidenceSynthesis -> hasProperty(name)
    is ActivityDefinition -> hasProperty(name)
    is OrganizationAffiliation -> hasProperty(name)
    is EpisodeOfCare -> hasProperty(name)
    is DeviceRequest -> hasProperty(name)
    is MedicinalProductManufactured -> hasProperty(name)
    is CapabilityStatement -> hasProperty(name)
    is Endpoint -> hasProperty(name)
    is SubstancePolymer -> hasProperty(name)
    is Substance -> hasProperty(name)
    is CatalogEntry -> hasProperty(name)
    is Group -> hasProperty(name)
    is ImagingStudy -> hasProperty(name)
    is SubstanceNucleicAcid -> hasProperty(name)
    is Organization -> hasProperty(name)
    is MolecularSequence -> hasProperty(name)
    is ChargeItemDefinition -> hasProperty(name)
    is Questionnaire -> hasProperty(name)
    is TestScript -> hasProperty(name)
    is ResearchStudy -> hasProperty(name)
    is PractitionerRole -> hasProperty(name)
    is TestReport -> hasProperty(name)
    is MeasureReport -> hasProperty(name)
    is SubstanceSourceMaterial -> hasProperty(name)
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
    is Patient -> hasProperty(name)
    is MedicinalProduct -> hasProperty(name)
    is Specimen -> hasProperty(name)
    is FamilyMemberHistory -> hasProperty(name)
    is ResearchElementDefinition -> hasProperty(name)
    is OperationDefinition -> hasProperty(name)
    is MedicinalProductIndication -> hasProperty(name)
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
    is SpecimenDefinition -> hasProperty(name)
    is MedicinalProductIngredient -> hasProperty(name)
    is ConceptMap -> hasProperty(name)
    is Invoice -> hasProperty(name)
    is StructureDefinition -> hasProperty(name)
    is CommunicationRequest -> hasProperty(name)
    is MedicinalProductInteraction -> hasProperty(name)
    is PaymentNotice -> hasProperty(name)
    is GuidanceResponse -> hasProperty(name)
    is RiskEvidenceSynthesis -> hasProperty(name)
    is MedicinalProductPackaged -> hasProperty(name)
    is DetectedIssue -> hasProperty(name)
    is ResearchDefinition -> hasProperty(name)
    is MedicinalProductPharmaceutical -> hasProperty(name)
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
    is SubstanceReferenceInformation -> hasProperty(name)
    is ImmunizationEvaluation -> hasProperty(name)
    is SearchParameter -> hasProperty(name)
    is MedicationStatement -> hasProperty(name)
    is Schedule -> hasProperty(name)
    is Person -> hasProperty(name)
    is AllergyIntolerance -> hasProperty(name)
    is PlanDefinition -> hasProperty(name)
    is ResearchSubject -> hasProperty(name)
    is ClinicalImpression -> hasProperty(name)
    is Subscription -> hasProperty(name)
    is CareTeam -> hasProperty(name)
    is Device -> hasProperty(name)
    is Consent -> hasProperty(name)
    is Communication -> hasProperty(name)
    is Library -> hasProperty(name)
    is StructureMap -> hasProperty(name)
    is Task -> hasProperty(name)
    is Practitioner -> hasProperty(name)
    is MedicinalProductContraindication -> hasProperty(name)
    is Observation -> hasProperty(name)
    is DocumentReference -> hasProperty(name)
    is OperationOutcome -> hasProperty(name)
    is MedicationDispense -> hasProperty(name)
    is Account -> hasProperty(name)
    is Procedure -> hasProperty(name)
    is SubstanceProtein -> hasProperty(name)
    is MedicinalProductAuthorization -> hasProperty(name)
    is AdverseEvent -> hasProperty(name)
    else -> false
  }

internal fun Resource.getAllChildren(): CollectionsList<Any> =
  when (this) {
    is SubstanceSpecification -> getAllChildren()
    is DeviceUseStatement -> getAllChildren()
    is BodyStructure -> getAllChildren()
    is ExampleScenario -> getAllChildren()
    is Appointment -> getAllChildren()
    is Condition -> getAllChildren()
    is R4List -> getAllChildren()
    is ChargeItem -> getAllChildren()
    is VerificationResult -> getAllChildren()
    is MedicinalProductUndesirableEffect -> getAllChildren()
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
    is Measure -> getAllChildren()
    is EffectEvidenceSynthesis -> getAllChildren()
    is ActivityDefinition -> getAllChildren()
    is OrganizationAffiliation -> getAllChildren()
    is EpisodeOfCare -> getAllChildren()
    is DeviceRequest -> getAllChildren()
    is MedicinalProductManufactured -> getAllChildren()
    is CapabilityStatement -> getAllChildren()
    is Endpoint -> getAllChildren()
    is SubstancePolymer -> getAllChildren()
    is Substance -> getAllChildren()
    is CatalogEntry -> getAllChildren()
    is Group -> getAllChildren()
    is ImagingStudy -> getAllChildren()
    is SubstanceNucleicAcid -> getAllChildren()
    is Organization -> getAllChildren()
    is MolecularSequence -> getAllChildren()
    is ChargeItemDefinition -> getAllChildren()
    is Questionnaire -> getAllChildren()
    is TestScript -> getAllChildren()
    is ResearchStudy -> getAllChildren()
    is PractitionerRole -> getAllChildren()
    is TestReport -> getAllChildren()
    is MeasureReport -> getAllChildren()
    is SubstanceSourceMaterial -> getAllChildren()
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
    is Patient -> getAllChildren()
    is MedicinalProduct -> getAllChildren()
    is Specimen -> getAllChildren()
    is FamilyMemberHistory -> getAllChildren()
    is ResearchElementDefinition -> getAllChildren()
    is OperationDefinition -> getAllChildren()
    is MedicinalProductIndication -> getAllChildren()
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
    is SpecimenDefinition -> getAllChildren()
    is MedicinalProductIngredient -> getAllChildren()
    is ConceptMap -> getAllChildren()
    is Invoice -> getAllChildren()
    is StructureDefinition -> getAllChildren()
    is CommunicationRequest -> getAllChildren()
    is MedicinalProductInteraction -> getAllChildren()
    is PaymentNotice -> getAllChildren()
    is GuidanceResponse -> getAllChildren()
    is RiskEvidenceSynthesis -> getAllChildren()
    is MedicinalProductPackaged -> getAllChildren()
    is DetectedIssue -> getAllChildren()
    is ResearchDefinition -> getAllChildren()
    is MedicinalProductPharmaceutical -> getAllChildren()
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
    is SubstanceReferenceInformation -> getAllChildren()
    is ImmunizationEvaluation -> getAllChildren()
    is SearchParameter -> getAllChildren()
    is MedicationStatement -> getAllChildren()
    is Schedule -> getAllChildren()
    is Person -> getAllChildren()
    is AllergyIntolerance -> getAllChildren()
    is PlanDefinition -> getAllChildren()
    is ResearchSubject -> getAllChildren()
    is ClinicalImpression -> getAllChildren()
    is Subscription -> getAllChildren()
    is CareTeam -> getAllChildren()
    is Device -> getAllChildren()
    is Consent -> getAllChildren()
    is Communication -> getAllChildren()
    is Library -> getAllChildren()
    is StructureMap -> getAllChildren()
    is Task -> getAllChildren()
    is Practitioner -> getAllChildren()
    is MedicinalProductContraindication -> getAllChildren()
    is Observation -> getAllChildren()
    is DocumentReference -> getAllChildren()
    is OperationOutcome -> getAllChildren()
    is MedicationDispense -> getAllChildren()
    is Account -> getAllChildren()
    is Procedure -> getAllChildren()
    is SubstanceProtein -> getAllChildren()
    is MedicinalProductAuthorization -> getAllChildren()
    is AdverseEvent -> getAllChildren()
    else -> emptyList()
  }
