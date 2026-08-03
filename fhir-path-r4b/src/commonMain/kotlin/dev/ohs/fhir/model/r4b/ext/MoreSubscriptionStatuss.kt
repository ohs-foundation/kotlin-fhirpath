package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.SubscriptionStatus
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun SubscriptionStatus.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "meta" -> this.meta
  "implicitRules" -> this.implicitRules
  "language" -> this.language
  "text" -> this.text
  "contained" -> this.contained
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "status" -> this.status
  "type" -> this.type
  "eventsSinceSubscriptionStart" -> this.eventsSinceSubscriptionStart
  "notificationEvent" -> this.notificationEvent
  "subscription" -> this.subscription
  "topic" -> this.topic
  "error" -> this.error
  else -> error("$name is not a valid property name")
}

internal fun SubscriptionStatus.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "meta" -> true
  "implicitRules" -> true
  "language" -> true
  "text" -> true
  "contained" -> true
  "extension" -> true
  "modifierExtension" -> true
  "status" -> true
  "type" -> true
  "eventsSinceSubscriptionStart" -> true
  "notificationEvent" -> true
  "subscription" -> true
  "topic" -> true
  "error" -> true
  else -> false
}

internal fun SubscriptionStatus.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.status?.let { add(it) }
  add(this@getAllChildren.type)
  this@getAllChildren.eventsSinceSubscriptionStart?.let { add(it) }
  addAll(this@getAllChildren.notificationEvent)
  add(this@getAllChildren.subscription)
  this@getAllChildren.topic?.let { add(it) }
  addAll(this@getAllChildren.error)
}

internal fun SubscriptionStatus.NotificationEvent.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "eventNumber" -> this.eventNumber
  "timestamp" -> this.timestamp
  "focus" -> this.focus
  "additionalContext" -> this.additionalContext
  else -> error("$name is not a valid property name")
}

internal fun SubscriptionStatus.NotificationEvent.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "eventNumber" -> true
  "timestamp" -> true
  "focus" -> true
  "additionalContext" -> true
  else -> false
}

internal fun SubscriptionStatus.NotificationEvent.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.eventNumber)
  this@getAllChildren.timestamp?.let { add(it) }
  this@getAllChildren.focus?.let { add(it) }
  addAll(this@getAllChildren.additionalContext)
}
