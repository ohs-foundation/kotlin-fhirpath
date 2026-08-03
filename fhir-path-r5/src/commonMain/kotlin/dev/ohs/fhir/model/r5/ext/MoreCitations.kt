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

import dev.ohs.fhir.model.r5.Citation
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Citation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "url" -> this.url
    "identifier" -> this.identifier
    "version" -> this.version
    "versionAlgorithm" -> this.versionAlgorithm
    "name" -> this.name
    "title" -> this.title
    "status" -> this.status
    "experimental" -> this.experimental
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "purpose" -> this.purpose
    "copyright" -> this.copyright
    "copyrightLabel" -> this.copyrightLabel
    "approvalDate" -> this.approvalDate
    "lastReviewDate" -> this.lastReviewDate
    "effectivePeriod" -> this.effectivePeriod
    "author" -> this.author
    "editor" -> this.editor
    "reviewer" -> this.reviewer
    "endorser" -> this.endorser
    "summary" -> this.summary
    "classification" -> this.classification
    "note" -> this.note
    "currentState" -> this.currentState
    "statusDate" -> this.statusDate
    "relatedArtifact" -> this.relatedArtifact
    "citedArtifact" -> this.citedArtifact
    else -> error("$name is not a valid property name")
  }

internal fun Citation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "url" -> true
    "identifier" -> true
    "version" -> true
    "versionAlgorithm" -> true
    "name" -> true
    "title" -> true
    "status" -> true
    "experimental" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "purpose" -> true
    "copyright" -> true
    "copyrightLabel" -> true
    "approvalDate" -> true
    "lastReviewDate" -> true
    "effectivePeriod" -> true
    "author" -> true
    "editor" -> true
    "reviewer" -> true
    "endorser" -> true
    "summary" -> true
    "classification" -> true
    "note" -> true
    "currentState" -> true
    "statusDate" -> true
    "relatedArtifact" -> true
    "citedArtifact" -> true
    else -> false
  }

internal fun Citation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.url?.let { add(it) }
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.versionAlgorithm?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.purpose?.let { add(it) }
  this@getAllChildren.copyright?.let { add(it) }
  this@getAllChildren.copyrightLabel?.let { add(it) }
  this@getAllChildren.approvalDate?.let { add(it) }
  this@getAllChildren.lastReviewDate?.let { add(it) }
  this@getAllChildren.effectivePeriod?.let { add(it) }
  addAll(this@getAllChildren.author)
  addAll(this@getAllChildren.editor)
  addAll(this@getAllChildren.reviewer)
  addAll(this@getAllChildren.endorser)
  addAll(this@getAllChildren.summary)
  addAll(this@getAllChildren.classification)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.currentState)
  addAll(this@getAllChildren.statusDate)
  addAll(this@getAllChildren.relatedArtifact)
  this@getAllChildren.citedArtifact?.let { add(it) }
}

internal fun Citation.Summary.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "style" -> this.style
    "text" -> this.text
    else -> error("$name is not a valid property name")
  }

internal fun Citation.Summary.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "style" -> true
    "text" -> true
    else -> false
  }

internal fun Citation.Summary.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.style?.let { add(it) }
  add(this@getAllChildren.text)
}

internal fun Citation.Classification.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "classifier" -> this.classifier
    else -> error("$name is not a valid property name")
  }

internal fun Citation.Classification.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "classifier" -> true
    else -> false
  }

internal fun Citation.Classification.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.classifier)
}

internal fun Citation.StatusDate.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "activity" -> this.activity
    "actual" -> this.`actual`
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun Citation.StatusDate.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "activity" -> true
    "actual" -> true
    "period" -> true
    else -> false
  }

internal fun Citation.StatusDate.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.activity)
  this@getAllChildren.`actual`?.let { add(it) }
  add(this@getAllChildren.period)
}

internal fun Citation.CitedArtifact.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "relatedIdentifier" -> this.relatedIdentifier
    "dateAccessed" -> this.dateAccessed
    "version" -> this.version
    "currentState" -> this.currentState
    "statusDate" -> this.statusDate
    "title" -> this.title
    "abstract" -> this.`abstract`
    "part" -> this.part
    "relatesTo" -> this.relatesTo
    "publicationForm" -> this.publicationForm
    "webLocation" -> this.webLocation
    "classification" -> this.classification
    "contributorship" -> this.contributorship
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun Citation.CitedArtifact.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "relatedIdentifier" -> true
    "dateAccessed" -> true
    "version" -> true
    "currentState" -> true
    "statusDate" -> true
    "title" -> true
    "abstract" -> true
    "part" -> true
    "relatesTo" -> true
    "publicationForm" -> true
    "webLocation" -> true
    "classification" -> true
    "contributorship" -> true
    "note" -> true
    else -> false
  }

internal fun Citation.CitedArtifact.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.relatedIdentifier)
  this@getAllChildren.dateAccessed?.let { add(it) }
  this@getAllChildren.version?.let { add(it) }
  addAll(this@getAllChildren.currentState)
  addAll(this@getAllChildren.statusDate)
  addAll(this@getAllChildren.title)
  addAll(this@getAllChildren.`abstract`)
  this@getAllChildren.part?.let { add(it) }
  addAll(this@getAllChildren.relatesTo)
  addAll(this@getAllChildren.publicationForm)
  addAll(this@getAllChildren.webLocation)
  addAll(this@getAllChildren.classification)
  this@getAllChildren.contributorship?.let { add(it) }
  addAll(this@getAllChildren.note)
}

internal fun Citation.CitedArtifact.Version.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "value" -> this.`value`
    "baseCitation" -> this.baseCitation
    else -> error("$name is not a valid property name")
  }

internal fun Citation.CitedArtifact.Version.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "value" -> true
    "baseCitation" -> true
    else -> false
  }

internal fun Citation.CitedArtifact.Version.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.`value`)
  this@getAllChildren.baseCitation?.let { add(it) }
}

internal fun Citation.CitedArtifact.StatusDate.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "activity" -> this.activity
    "actual" -> this.`actual`
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun Citation.CitedArtifact.StatusDate.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "activity" -> true
    "actual" -> true
    "period" -> true
    else -> false
  }

internal fun Citation.CitedArtifact.StatusDate.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.activity)
  this@getAllChildren.`actual`?.let { add(it) }
  add(this@getAllChildren.period)
}

internal fun Citation.CitedArtifact.Title.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "language" -> this.language
    "text" -> this.text
    else -> error("$name is not a valid property name")
  }

internal fun Citation.CitedArtifact.Title.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "language" -> true
    "text" -> true
    else -> false
  }

internal fun Citation.CitedArtifact.Title.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.type)
  this@getAllChildren.language?.let { add(it) }
  add(this@getAllChildren.text)
}

internal fun Citation.CitedArtifact.Abstract.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "language" -> this.language
    "text" -> this.text
    "copyright" -> this.copyright
    else -> error("$name is not a valid property name")
  }

internal fun Citation.CitedArtifact.Abstract.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "language" -> true
    "text" -> true
    "copyright" -> true
    else -> false
  }

internal fun Citation.CitedArtifact.Abstract.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  add(this@getAllChildren.text)
  this@getAllChildren.copyright?.let { add(it) }
}

internal fun Citation.CitedArtifact.Part.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    "baseCitation" -> this.baseCitation
    else -> error("$name is not a valid property name")
  }

internal fun Citation.CitedArtifact.Part.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    "baseCitation" -> true
    else -> false
  }

internal fun Citation.CitedArtifact.Part.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.`value`?.let { add(it) }
  this@getAllChildren.baseCitation?.let { add(it) }
}

internal fun Citation.CitedArtifact.RelatesTo.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "classifier" -> this.classifier
    "label" -> this.label
    "display" -> this.display
    "citation" -> this.citation
    "document" -> this.document
    "resource" -> this.resource
    "resourceReference" -> this.resourceReference
    else -> error("$name is not a valid property name")
  }

internal fun Citation.CitedArtifact.RelatesTo.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "classifier" -> true
    "label" -> true
    "display" -> true
    "citation" -> true
    "document" -> true
    "resource" -> true
    "resourceReference" -> true
    else -> false
  }

internal fun Citation.CitedArtifact.RelatesTo.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.classifier)
  this@getAllChildren.label?.let { add(it) }
  this@getAllChildren.display?.let { add(it) }
  this@getAllChildren.citation?.let { add(it) }
  this@getAllChildren.document?.let { add(it) }
  this@getAllChildren.resource?.let { add(it) }
  this@getAllChildren.resourceReference?.let { add(it) }
}

internal fun Citation.CitedArtifact.PublicationForm.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "publishedIn" -> this.publishedIn
    "citedMedium" -> this.citedMedium
    "volume" -> this.volume
    "issue" -> this.issue
    "articleDate" -> this.articleDate
    "publicationDateText" -> this.publicationDateText
    "publicationDateSeason" -> this.publicationDateSeason
    "lastRevisionDate" -> this.lastRevisionDate
    "language" -> this.language
    "accessionNumber" -> this.accessionNumber
    "pageString" -> this.pageString
    "firstPage" -> this.firstPage
    "lastPage" -> this.lastPage
    "pageCount" -> this.pageCount
    "copyright" -> this.copyright
    else -> error("$name is not a valid property name")
  }

internal fun Citation.CitedArtifact.PublicationForm.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "publishedIn" -> true
    "citedMedium" -> true
    "volume" -> true
    "issue" -> true
    "articleDate" -> true
    "publicationDateText" -> true
    "publicationDateSeason" -> true
    "lastRevisionDate" -> true
    "language" -> true
    "accessionNumber" -> true
    "pageString" -> true
    "firstPage" -> true
    "lastPage" -> true
    "pageCount" -> true
    "copyright" -> true
    else -> false
  }

internal fun Citation.CitedArtifact.PublicationForm.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.publishedIn?.let { add(it) }
  this@getAllChildren.citedMedium?.let { add(it) }
  this@getAllChildren.volume?.let { add(it) }
  this@getAllChildren.issue?.let { add(it) }
  this@getAllChildren.articleDate?.let { add(it) }
  this@getAllChildren.publicationDateText?.let { add(it) }
  this@getAllChildren.publicationDateSeason?.let { add(it) }
  this@getAllChildren.lastRevisionDate?.let { add(it) }
  addAll(this@getAllChildren.language)
  this@getAllChildren.accessionNumber?.let { add(it) }
  this@getAllChildren.pageString?.let { add(it) }
  this@getAllChildren.firstPage?.let { add(it) }
  this@getAllChildren.lastPage?.let { add(it) }
  this@getAllChildren.pageCount?.let { add(it) }
  this@getAllChildren.copyright?.let { add(it) }
}

internal fun Citation.CitedArtifact.PublicationForm.PublishedIn.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "identifier" -> this.identifier
    "title" -> this.title
    "publisher" -> this.publisher
    "publisherLocation" -> this.publisherLocation
    else -> error("$name is not a valid property name")
  }

internal fun Citation.CitedArtifact.PublicationForm.PublishedIn.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "identifier" -> true
    "title" -> true
    "publisher" -> true
    "publisherLocation" -> true
    else -> false
  }

internal fun Citation.CitedArtifact.PublicationForm.PublishedIn.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    this@getAllChildren.type?.let { add(it) }
    addAll(this@getAllChildren.identifier)
    this@getAllChildren.title?.let { add(it) }
    this@getAllChildren.publisher?.let { add(it) }
    this@getAllChildren.publisherLocation?.let { add(it) }
  }

internal fun Citation.CitedArtifact.WebLocation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "classifier" -> this.classifier
    "url" -> this.url
    else -> error("$name is not a valid property name")
  }

internal fun Citation.CitedArtifact.WebLocation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "classifier" -> true
    "url" -> true
    else -> false
  }

internal fun Citation.CitedArtifact.WebLocation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.classifier)
  this@getAllChildren.url?.let { add(it) }
}

internal fun Citation.CitedArtifact.Classification.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "classifier" -> this.classifier
    "artifactAssessment" -> this.artifactAssessment
    else -> error("$name is not a valid property name")
  }

internal fun Citation.CitedArtifact.Classification.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "classifier" -> true
    "artifactAssessment" -> true
    else -> false
  }

internal fun Citation.CitedArtifact.Classification.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.classifier)
  addAll(this@getAllChildren.artifactAssessment)
}

internal fun Citation.CitedArtifact.Contributorship.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "complete" -> this.complete
    "entry" -> this.entry
    "summary" -> this.summary
    else -> error("$name is not a valid property name")
  }

internal fun Citation.CitedArtifact.Contributorship.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "complete" -> true
    "entry" -> true
    "summary" -> true
    else -> false
  }

internal fun Citation.CitedArtifact.Contributorship.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.complete?.let { add(it) }
  addAll(this@getAllChildren.entry)
  addAll(this@getAllChildren.summary)
}

internal fun Citation.CitedArtifact.Contributorship.Entry.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "contributor" -> this.contributor
    "forenameInitials" -> this.forenameInitials
    "affiliation" -> this.affiliation
    "contributionType" -> this.contributionType
    "role" -> this.role
    "contributionInstance" -> this.contributionInstance
    "correspondingContact" -> this.correspondingContact
    "rankingOrder" -> this.rankingOrder
    else -> error("$name is not a valid property name")
  }

internal fun Citation.CitedArtifact.Contributorship.Entry.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "contributor" -> true
    "forenameInitials" -> true
    "affiliation" -> true
    "contributionType" -> true
    "role" -> true
    "contributionInstance" -> true
    "correspondingContact" -> true
    "rankingOrder" -> true
    else -> false
  }

internal fun Citation.CitedArtifact.Contributorship.Entry.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.contributor)
  this@getAllChildren.forenameInitials?.let { add(it) }
  addAll(this@getAllChildren.affiliation)
  addAll(this@getAllChildren.contributionType)
  this@getAllChildren.role?.let { add(it) }
  addAll(this@getAllChildren.contributionInstance)
  this@getAllChildren.correspondingContact?.let { add(it) }
  this@getAllChildren.rankingOrder?.let { add(it) }
}

internal fun Citation.CitedArtifact.Contributorship.Entry.ContributionInstance.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "time" -> this.time
    else -> error("$name is not a valid property name")
  }

internal fun Citation.CitedArtifact.Contributorship.Entry.ContributionInstance.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "time" -> true
    else -> false
  }

internal fun Citation.CitedArtifact.Contributorship.Entry.ContributionInstance.getAllChildren():
  List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.time?.let { add(it) }
}

internal fun Citation.CitedArtifact.Contributorship.Summary.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "style" -> this.style
    "source" -> this.source
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun Citation.CitedArtifact.Contributorship.Summary.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "style" -> true
    "source" -> true
    "value" -> true
    else -> false
  }

internal fun Citation.CitedArtifact.Contributorship.Summary.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    this@getAllChildren.type?.let { add(it) }
    this@getAllChildren.style?.let { add(it) }
    this@getAllChildren.source?.let { add(it) }
    add(this@getAllChildren.`value`)
  }
