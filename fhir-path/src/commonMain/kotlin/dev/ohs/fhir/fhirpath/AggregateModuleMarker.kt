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

package dev.ohs.fhir.fhirpath

/**
 * Marker for the aggregate `fhir-path` module, which bundles [fhir-path-r4], [fhir-path-r4b] and
 * [fhir-path-r5] as API dependencies and contains no code of its own.
 *
 * A module with no sources produces no klib for native targets, which breaks publication metadata
 * generation (https://youtrack.jetbrains.com/issue/KT-52344). This declaration exists solely so
 * every target compiles a non-empty artifact.
 */
internal object AggregateModuleMarker
