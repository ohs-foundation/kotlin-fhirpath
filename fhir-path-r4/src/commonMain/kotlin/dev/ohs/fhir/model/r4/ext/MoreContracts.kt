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

import dev.ohs.fhir.model.r4.Contract
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Contract.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "url" -> this.url
    "version" -> this.version
    "status" -> this.status
    "legalState" -> this.legalState
    "instantiatesCanonical" -> this.instantiatesCanonical
    "instantiatesUri" -> this.instantiatesUri
    "contentDerivative" -> this.contentDerivative
    "issued" -> this.issued
    "applies" -> this.applies
    "expirationType" -> this.expirationType
    "subject" -> this.subject
    "authority" -> this.authority
    "domain" -> this.domain
    "site" -> this.site
    "name" -> this.name
    "title" -> this.title
    "subtitle" -> this.subtitle
    "alias" -> this.alias
    "author" -> this.author
    "scope" -> this.scope
    "topic" -> this.topic
    "type" -> this.type
    "subType" -> this.subType
    "contentDefinition" -> this.contentDefinition
    "term" -> this.term
    "supportingInfo" -> this.supportingInfo
    "relevantHistory" -> this.relevantHistory
    "signer" -> this.signer
    "friendly" -> this.friendly
    "legal" -> this.legal
    "rule" -> this.rule
    "legallyBinding" -> this.legallyBinding
    else -> error("$name is not a valid property name")
  }

internal fun Contract.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "url" -> true
    "version" -> true
    "status" -> true
    "legalState" -> true
    "instantiatesCanonical" -> true
    "instantiatesUri" -> true
    "contentDerivative" -> true
    "issued" -> true
    "applies" -> true
    "expirationType" -> true
    "subject" -> true
    "authority" -> true
    "domain" -> true
    "site" -> true
    "name" -> true
    "title" -> true
    "subtitle" -> true
    "alias" -> true
    "author" -> true
    "scope" -> true
    "topic" -> true
    "type" -> true
    "subType" -> true
    "contentDefinition" -> true
    "term" -> true
    "supportingInfo" -> true
    "relevantHistory" -> true
    "signer" -> true
    "friendly" -> true
    "legal" -> true
    "rule" -> true
    "legallyBinding" -> true
    else -> false
  }

internal fun Contract.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.url?.let { add(it) }
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.legalState?.let { add(it) }
  this@getAllChildren.instantiatesCanonical?.let { add(it) }
  this@getAllChildren.instantiatesUri?.let { add(it) }
  this@getAllChildren.contentDerivative?.let { add(it) }
  this@getAllChildren.issued?.let { add(it) }
  this@getAllChildren.applies?.let { add(it) }
  this@getAllChildren.expirationType?.let { add(it) }
  addAll(this@getAllChildren.subject)
  addAll(this@getAllChildren.authority)
  addAll(this@getAllChildren.domain)
  addAll(this@getAllChildren.site)
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.subtitle?.let { add(it) }
  addAll(this@getAllChildren.alias)
  this@getAllChildren.author?.let { add(it) }
  this@getAllChildren.scope?.let { add(it) }
  this@getAllChildren.topic?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.subType)
  this@getAllChildren.contentDefinition?.let { add(it) }
  addAll(this@getAllChildren.term)
  addAll(this@getAllChildren.supportingInfo)
  addAll(this@getAllChildren.relevantHistory)
  addAll(this@getAllChildren.signer)
  addAll(this@getAllChildren.friendly)
  addAll(this@getAllChildren.legal)
  addAll(this@getAllChildren.rule)
  this@getAllChildren.legallyBinding?.let { add(it) }
}

internal fun Contract.ContentDefinition.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "subType" -> this.subType
    "publisher" -> this.publisher
    "publicationDate" -> this.publicationDate
    "publicationStatus" -> this.publicationStatus
    "copyright" -> this.copyright
    else -> error("$name is not a valid property name")
  }

internal fun Contract.ContentDefinition.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "subType" -> true
    "publisher" -> true
    "publicationDate" -> true
    "publicationStatus" -> true
    "copyright" -> true
    else -> false
  }

internal fun Contract.ContentDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.subType?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  this@getAllChildren.publicationDate?.let { add(it) }
  add(this@getAllChildren.publicationStatus)
  this@getAllChildren.copyright?.let { add(it) }
}

internal fun Contract.Term.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "issued" -> this.issued
    "applies" -> this.applies
    "topic" -> this.topic
    "type" -> this.type
    "subType" -> this.subType
    "text" -> this.text
    "securityLabel" -> this.securityLabel
    "offer" -> this.offer
    "asset" -> this.asset
    "action" -> this.action
    "group" -> this.group
    else -> error("$name is not a valid property name")
  }

internal fun Contract.Term.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "issued" -> true
    "applies" -> true
    "topic" -> true
    "type" -> true
    "subType" -> true
    "text" -> true
    "securityLabel" -> true
    "offer" -> true
    "asset" -> true
    "action" -> true
    "group" -> true
    else -> false
  }

internal fun Contract.Term.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.issued?.let { add(it) }
  this@getAllChildren.applies?.let { add(it) }
  this@getAllChildren.topic?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.subType?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.securityLabel)
  add(this@getAllChildren.offer)
  addAll(this@getAllChildren.asset)
  addAll(this@getAllChildren.action)
  addAll(this@getAllChildren.group)
}

internal fun Contract.Term.SecurityLabel.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "number" -> this.number
    "classification" -> this.classification
    "category" -> this.category
    "control" -> this.control
    else -> error("$name is not a valid property name")
  }

internal fun Contract.Term.SecurityLabel.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "number" -> true
    "classification" -> true
    "category" -> true
    "control" -> true
    else -> false
  }

internal fun Contract.Term.SecurityLabel.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.number)
  add(this@getAllChildren.classification)
  addAll(this@getAllChildren.category)
  addAll(this@getAllChildren.control)
}

internal fun Contract.Term.Offer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "party" -> this.party
    "topic" -> this.topic
    "type" -> this.type
    "decision" -> this.decision
    "decisionMode" -> this.decisionMode
    "answer" -> this.answer
    "text" -> this.text
    "linkId" -> this.linkId
    "securityLabelNumber" -> this.securityLabelNumber
    else -> error("$name is not a valid property name")
  }

internal fun Contract.Term.Offer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "party" -> true
    "topic" -> true
    "type" -> true
    "decision" -> true
    "decisionMode" -> true
    "answer" -> true
    "text" -> true
    "linkId" -> true
    "securityLabelNumber" -> true
    else -> false
  }

internal fun Contract.Term.Offer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.party)
  this@getAllChildren.topic?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.decision?.let { add(it) }
  addAll(this@getAllChildren.decisionMode)
  addAll(this@getAllChildren.answer)
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.linkId)
  addAll(this@getAllChildren.securityLabelNumber)
}

internal fun Contract.Term.Offer.Party.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "reference" -> this.reference
    "role" -> this.role
    else -> error("$name is not a valid property name")
  }

internal fun Contract.Term.Offer.Party.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "reference" -> true
    "role" -> true
    else -> false
  }

internal fun Contract.Term.Offer.Party.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.reference)
  add(this@getAllChildren.role)
}

internal fun Contract.Term.Offer.Answer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun Contract.Term.Offer.Answer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "value" -> true
    else -> false
  }

internal fun Contract.Term.Offer.Answer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.`value`)
}

internal fun Contract.Term.Asset.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "scope" -> this.scope
    "type" -> this.type
    "typeReference" -> this.typeReference
    "subtype" -> this.subtype
    "relationship" -> this.relationship
    "context" -> this.context
    "condition" -> this.condition
    "periodType" -> this.periodType
    "period" -> this.period
    "usePeriod" -> this.usePeriod
    "text" -> this.text
    "linkId" -> this.linkId
    "answer" -> this.answer
    "securityLabelNumber" -> this.securityLabelNumber
    "valuedItem" -> this.valuedItem
    else -> error("$name is not a valid property name")
  }

internal fun Contract.Term.Asset.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "scope" -> true
    "type" -> true
    "typeReference" -> true
    "subtype" -> true
    "relationship" -> true
    "context" -> true
    "condition" -> true
    "periodType" -> true
    "period" -> true
    "usePeriod" -> true
    "text" -> true
    "linkId" -> true
    "answer" -> true
    "securityLabelNumber" -> true
    "valuedItem" -> true
    else -> false
  }

internal fun Contract.Term.Asset.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.scope?.let { add(it) }
  addAll(this@getAllChildren.type)
  addAll(this@getAllChildren.typeReference)
  addAll(this@getAllChildren.subtype)
  this@getAllChildren.relationship?.let { add(it) }
  addAll(this@getAllChildren.context)
  this@getAllChildren.condition?.let { add(it) }
  addAll(this@getAllChildren.periodType)
  addAll(this@getAllChildren.period)
  addAll(this@getAllChildren.usePeriod)
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.linkId)
  addAll(this@getAllChildren.answer)
  addAll(this@getAllChildren.securityLabelNumber)
  addAll(this@getAllChildren.valuedItem)
}

internal fun Contract.Term.Asset.Context.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "reference" -> this.reference
    "code" -> this.code
    "text" -> this.text
    else -> error("$name is not a valid property name")
  }

internal fun Contract.Term.Asset.Context.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "reference" -> true
    "code" -> true
    "text" -> true
    else -> false
  }

internal fun Contract.Term.Asset.Context.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.reference?.let { add(it) }
  addAll(this@getAllChildren.code)
  this@getAllChildren.text?.let { add(it) }
}

internal fun Contract.Term.Asset.ValuedItem.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "entity" -> this.entity
    "identifier" -> this.identifier
    "effectiveTime" -> this.effectiveTime
    "quantity" -> this.quantity
    "unitPrice" -> this.unitPrice
    "factor" -> this.factor
    "points" -> this.points
    "net" -> this.net
    "payment" -> this.payment
    "paymentDate" -> this.paymentDate
    "responsible" -> this.responsible
    "recipient" -> this.recipient
    "linkId" -> this.linkId
    "securityLabelNumber" -> this.securityLabelNumber
    else -> error("$name is not a valid property name")
  }

internal fun Contract.Term.Asset.ValuedItem.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "entity" -> true
    "identifier" -> true
    "effectiveTime" -> true
    "quantity" -> true
    "unitPrice" -> true
    "factor" -> true
    "points" -> true
    "net" -> true
    "payment" -> true
    "paymentDate" -> true
    "responsible" -> true
    "recipient" -> true
    "linkId" -> true
    "securityLabelNumber" -> true
    else -> false
  }

internal fun Contract.Term.Asset.ValuedItem.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.entity?.let { add(it) }
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.effectiveTime?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.unitPrice?.let { add(it) }
  this@getAllChildren.factor?.let { add(it) }
  this@getAllChildren.points?.let { add(it) }
  this@getAllChildren.net?.let { add(it) }
  this@getAllChildren.payment?.let { add(it) }
  this@getAllChildren.paymentDate?.let { add(it) }
  this@getAllChildren.responsible?.let { add(it) }
  this@getAllChildren.recipient?.let { add(it) }
  addAll(this@getAllChildren.linkId)
  addAll(this@getAllChildren.securityLabelNumber)
}

internal fun Contract.Term.Action.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "doNotPerform" -> this.doNotPerform
    "type" -> this.type
    "subject" -> this.subject
    "intent" -> this.intent
    "linkId" -> this.linkId
    "status" -> this.status
    "context" -> this.context
    "contextLinkId" -> this.contextLinkId
    "occurrence" -> this.occurrence
    "requester" -> this.requester
    "requesterLinkId" -> this.requesterLinkId
    "performerType" -> this.performerType
    "performerRole" -> this.performerRole
    "performer" -> this.performer
    "performerLinkId" -> this.performerLinkId
    "reasonCode" -> this.reasonCode
    "reasonReference" -> this.reasonReference
    "reason" -> this.reason
    "reasonLinkId" -> this.reasonLinkId
    "note" -> this.note
    "securityLabelNumber" -> this.securityLabelNumber
    else -> error("$name is not a valid property name")
  }

internal fun Contract.Term.Action.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "doNotPerform" -> true
    "type" -> true
    "subject" -> true
    "intent" -> true
    "linkId" -> true
    "status" -> true
    "context" -> true
    "contextLinkId" -> true
    "occurrence" -> true
    "requester" -> true
    "requesterLinkId" -> true
    "performerType" -> true
    "performerRole" -> true
    "performer" -> true
    "performerLinkId" -> true
    "reasonCode" -> true
    "reasonReference" -> true
    "reason" -> true
    "reasonLinkId" -> true
    "note" -> true
    "securityLabelNumber" -> true
    else -> false
  }

internal fun Contract.Term.Action.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.doNotPerform?.let { add(it) }
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.subject)
  add(this@getAllChildren.intent)
  addAll(this@getAllChildren.linkId)
  add(this@getAllChildren.status)
  this@getAllChildren.context?.let { add(it) }
  addAll(this@getAllChildren.contextLinkId)
  this@getAllChildren.occurrence?.let { add(it) }
  addAll(this@getAllChildren.requester)
  addAll(this@getAllChildren.requesterLinkId)
  addAll(this@getAllChildren.performerType)
  this@getAllChildren.performerRole?.let { add(it) }
  this@getAllChildren.performer?.let { add(it) }
  addAll(this@getAllChildren.performerLinkId)
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  addAll(this@getAllChildren.reason)
  addAll(this@getAllChildren.reasonLinkId)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.securityLabelNumber)
}

internal fun Contract.Term.Action.Subject.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "reference" -> this.reference
    "role" -> this.role
    else -> error("$name is not a valid property name")
  }

internal fun Contract.Term.Action.Subject.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "reference" -> true
    "role" -> true
    else -> false
  }

internal fun Contract.Term.Action.Subject.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.reference)
  this@getAllChildren.role?.let { add(it) }
}

internal fun Contract.Signer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "party" -> this.party
    "signature" -> this.signature
    else -> error("$name is not a valid property name")
  }

internal fun Contract.Signer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "party" -> true
    "signature" -> true
    else -> false
  }

internal fun Contract.Signer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.party)
  addAll(this@getAllChildren.signature)
}

internal fun Contract.Friendly.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "content" -> this.content
    else -> error("$name is not a valid property name")
  }

internal fun Contract.Friendly.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "content" -> true
    else -> false
  }

internal fun Contract.Friendly.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.content)
}

internal fun Contract.Legal.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "content" -> this.content
    else -> error("$name is not a valid property name")
  }

internal fun Contract.Legal.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "content" -> true
    else -> false
  }

internal fun Contract.Legal.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.content)
}

internal fun Contract.Rule.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "content" -> this.content
    else -> error("$name is not a valid property name")
  }

internal fun Contract.Rule.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "content" -> true
    else -> false
  }

internal fun Contract.Rule.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.content)
}
