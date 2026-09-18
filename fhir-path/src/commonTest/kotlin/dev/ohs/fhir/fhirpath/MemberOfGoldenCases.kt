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

// GENERATED. Do not edit by hand.
// Results recorded from the HL7 FHIRPath engine: ca.uhn.hapi.fhir:org.hl7.fhir.r5 6.9.4.1,
// no terminology server, code systems loaded. Generator: memberof-oracle @ ab5c86e.
// Fixtures sha256 a7a609dd15cceed19d1f2de7e89ef6542eaf4ff363dc92b1ee362c02e8050871.

/** A `memberOf` evaluation and the result the HL7 engine gave: "true", "false" or "empty". */
internal data class MemberOfCase(
  val id: String,
  val note: String,
  val resource: String,
  val expression: String,
  val hl7Result: String,
)

internal val memberOfCodeSystems: List<String> =
  listOf(
    """{"resourceType":"CodeSystem","id":"alpha","url":"http://example.org/fhirpath-memberof/CodeSystem/alpha","version":"1.0.0","name":"Alpha","status":"active","content":"complete","caseSensitive":true,"concept":[{"code":"A1","display":"Alpha A1"},{"code":"A2","display":"Alpha A2"},{"code":"A3","display":"Alpha A3"},{"code":"A4","display":"Alpha A4"}]}""",
    """{"resourceType":"CodeSystem","id":"beta","url":"http://example.org/fhirpath-memberof/CodeSystem/beta","version":"1.0.0","name":"Beta","status":"active","content":"complete","caseSensitive":true,"concept":[{"code":"B1","display":"Beta B1","concept":[{"code":"B1a","display":"Beta B1a"},{"code":"B1b","display":"Beta B1b"}]},{"code":"B2","display":"Beta B2"}],"hierarchyMeaning":"is-a"}""",
    """{"resourceType":"CodeSystem","id":"gamma","url":"http://example.org/fhirpath-memberof/CodeSystem/gamma","version":"1.0.0","name":"Gamma","status":"active","content":"complete","caseSensitive":true,"concept":[{"code":"A1","display":"Gamma A1"},{"code":"G2","display":"Gamma G2"}]}""",
  )

internal val memberOfValueSets: List<String> =
  listOf(
    """{"resourceType":"ValueSet","id":"abstract","url":"http://example.org/fhirpath-memberof/ValueSet/abstract","name":"abstract","status":"active","expansion":{"timestamp":"2026-01-01T00:00:00Z","contains":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B1","abstract":true,"contains":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B1a"}]}]}}""",
    """{"resourceType":"ValueSet","id":"compose-only","url":"http://example.org/fhirpath-memberof/ValueSet/compose-only","name":"compose_only","status":"active","compose":{"include":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","concept":[{"code":"A1"},{"code":"A2"}]}]}}""",
    """{"resourceType":"ValueSet","id":"disagree","url":"http://example.org/fhirpath-memberof/ValueSet/disagree","name":"disagree","status":"active","compose":{"include":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","concept":[{"code":"A1"}]}]},"expansion":{"timestamp":"2026-01-01T00:00:00Z","contains":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A2"}]}}""",
    """{"resourceType":"ValueSet","id":"exclude","url":"http://example.org/fhirpath-memberof/ValueSet/exclude","name":"exclude","status":"active","compose":{"include":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","concept":[{"code":"A1"},{"code":"A2"},{"code":"A3"}]}],"exclude":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","concept":[{"code":"A2"}]}]}}""",
    """{"resourceType":"ValueSet","id":"expansion-only","url":"http://example.org/fhirpath-memberof/ValueSet/expansion-only","name":"expansion_only","status":"active","expansion":{"timestamp":"2026-01-01T00:00:00Z","contains":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
    """{"resourceType":"ValueSet","id":"filter","url":"http://example.org/fhirpath-memberof/ValueSet/filter","name":"filter","status":"active","compose":{"include":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","filter":[{"property":"concept","op":"is-a","value":"B1"}]}]}}""",
    """{"resourceType":"ValueSet","id":"import","url":"http://example.org/fhirpath-memberof/ValueSet/import","name":"import","status":"active","compose":{"include":[{"valueSet":["http://example.org/fhirpath-memberof/ValueSet/compose-only"]}]}}""",
    """{"resourceType":"ValueSet","id":"inactive","url":"http://example.org/fhirpath-memberof/ValueSet/inactive","name":"inactive","status":"active","expansion":{"timestamp":"2026-01-01T00:00:00Z","contains":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"},{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A3","inactive":true}]}}""",
    """{"resourceType":"ValueSet","id":"nested","url":"http://example.org/fhirpath-memberof/ValueSet/nested","name":"nested","status":"active","compose":{"include":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","concept":[{"code":"B1"},{"code":"B1a"},{"code":"B1b"}]}]},"expansion":{"timestamp":"2026-01-01T00:00:00Z","contains":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B1","contains":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B1a"},{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B1b"}]}]}}""",
    """{"resourceType":"ValueSet","id":"versioned-1","url":"http://example.org/fhirpath-memberof/ValueSet/versioned","name":"versioned","status":"active","version":"1.0.0","compose":{"include":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","concept":[{"code":"A1"}]}]}}""",
    """{"resourceType":"ValueSet","id":"versioned-2","url":"http://example.org/fhirpath-memberof/ValueSet/versioned","name":"versioned","status":"active","version":"2.0.0","compose":{"include":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","concept":[{"code":"A2"}]}]}}""",
    """{"resourceType":"ValueSet","id":"who-shape","url":"http://example.org/fhirpath-memberof/ValueSet/who-shape","name":"who_shape","status":"active","compose":{"include":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","concept":[{"code":"A1"},{"code":"A2"}]},{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","concept":[{"code":"B2"}]}]},"expansion":{"timestamp":"2026-01-01T00:00:00Z","contains":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"},{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A2"},{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B2"}]}}""",
    """{"resourceType":"ValueSet","id":"whole-system","url":"http://example.org/fhirpath-memberof/ValueSet/whole-system","name":"whole_system","status":"active","compose":{"include":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha"}]}}""",
  )

internal val memberOfCases: List<MemberOfCase> =
  listOf(
    MemberOfCase(
      "S001",
      "Coding in set (first system)",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "true",
    ),
    MemberOfCase(
      "S002",
      "Coding in set (second system)",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B2"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "true",
    ),
    MemberOfCase(
      "S003",
      "Coding: right system, code not in set",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A3"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "false",
    ),
    MemberOfCase(
      "S004",
      "Coding: code unknown to its system",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"ZZ"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "false",
    ),
    MemberOfCase(
      "S005",
      "Coding: right code, wrong system",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/gamma","code":"A1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "false",
    ),
    MemberOfCase(
      "S006",
      "Coding: right code, unknown system",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/nowhere","code":"A1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "true",
    ),
    MemberOfCase(
      "S007",
      "Coding without system",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"code":"A1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "false",
    ),
    MemberOfCase(
      "S008",
      "Coding without code",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "false",
    ),
    MemberOfCase(
      "S009",
      "CodeableConcept: single member",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "true",
    ),
    MemberOfCase(
      "S010",
      "CodeableConcept: one member among non-members",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/gamma","code":"G2"},{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A2"}]}}""",
      "Observation.code.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "true",
    ),
    MemberOfCase(
      "S011",
      "CodeableConcept: no members",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/gamma","code":"G2"},{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A3"}]}}""",
      "Observation.code.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "false",
    ),
    MemberOfCase(
      "S012",
      "CodeableConcept without codings",
      """{"resourceType":"Observation","status":"final","code":{"text":"free text"}}""",
      "Observation.code.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "false",
    ),
    MemberOfCase(
      "S013",
      "bare code in set, unambiguous",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B2"}]}}""",
      "Observation.code.coding.code.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "true",
    ),
    MemberOfCase(
      "S014",
      "bare code in set, code also exists in a system outside the set",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.code.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "true",
    ),
    MemberOfCase(
      "S015",
      "bare code not in set",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A3"}]}}""",
      "Observation.code.coding.code.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "false",
    ),
    MemberOfCase(
      "S016",
      "bare string in set",
      """{"resourceType":"Observation","status":"final","code":{"text":"unused"},"valueString":"A1"}""",
      "Observation.value.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "true",
    ),
    MemberOfCase(
      "S017",
      "bare string not in set",
      """{"resourceType":"Observation","status":"final","code":{"text":"unused"},"valueString":"A3"}""",
      "Observation.value.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "false",
    ),
    MemberOfCase(
      "S018",
      "bare uri focus",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.system.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "false",
    ),
    MemberOfCase(
      "S019",
      "empty focus",
      """{"resourceType":"Observation","status":"final","code":{"text":"unused"}}""",
      "Observation.category.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "empty",
    ),
    MemberOfCase(
      "S020",
      "focus with two Codings",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"},{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A2"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "empty",
    ),
    MemberOfCase(
      "S021",
      "focus of an unsupported type (boolean)",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.exists().memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape')",
      "empty",
    ),
    MemberOfCase(
      "S022",
      "unknown ValueSet url",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/does-not-exist')",
      "empty",
    ),
    MemberOfCase(
      "S023",
      "empty collection as argument",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.memberOf({})",
      "empty",
    ),
    MemberOfCase(
      "S024",
      "integer as argument",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.memberOf(1)",
      "empty",
    ),
    MemberOfCase(
      "S025",
      "expansion only: member",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/expansion-only')",
      "true",
    ),
    MemberOfCase(
      "S026",
      "expansion only: non-member",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A2"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/expansion-only')",
      "false",
    ),
    MemberOfCase(
      "S027",
      "expansion only: CodeableConcept member",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.memberOf('http://example.org/fhirpath-memberof/ValueSet/expansion-only')",
      "true",
    ),
    MemberOfCase(
      "S028",
      "expansion only: bare code member",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.code.memberOf('http://example.org/fhirpath-memberof/ValueSet/expansion-only')",
      "true",
    ),
    MemberOfCase(
      "S029",
      "compose only: member",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A2"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/compose-only')",
      "true",
    ),
    MemberOfCase(
      "S030",
      "compose only: non-member",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A3"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/compose-only')",
      "false",
    ),
    MemberOfCase(
      "S031",
      "compose only: wrong system",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/gamma","code":"A1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/compose-only')",
      "false",
    ),
    MemberOfCase(
      "S032",
      "compose only: bare code member",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A2"}]}}""",
      "Observation.code.coding.code.memberOf('http://example.org/fhirpath-memberof/ValueSet/compose-only')",
      "true",
    ),
    MemberOfCase(
      "S033",
      "nested expansion: parent",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/nested')",
      "true",
    ),
    MemberOfCase(
      "S034",
      "nested expansion: child",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B1a"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/nested')",
      "true",
    ),
    MemberOfCase(
      "S035",
      "nested expansion: sibling outside set",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B2"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/nested')",
      "false",
    ),
    MemberOfCase(
      "S036",
      "abstract entry itself",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/abstract')",
      "true",
    ),
    MemberOfCase(
      "S037",
      "child of abstract entry",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B1a"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/abstract')",
      "true",
    ),
    MemberOfCase(
      "S038",
      "inactive entry",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A3"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/inactive')",
      "true",
    ),
    MemberOfCase(
      "S039",
      "active entry beside an inactive one",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/inactive')",
      "true",
    ),
    MemberOfCase(
      "S040",
      "exclude: included and not excluded",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/exclude')",
      "true",
    ),
    MemberOfCase(
      "S041",
      "exclude: excluded",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A2"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/exclude')",
      "false",
    ),
    MemberOfCase(
      "S042",
      "versioned: url|1.0.0 member",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/versioned|1.0.0')",
      "true",
    ),
    MemberOfCase(
      "S043",
      "versioned: url|1.0.0 non-member",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A2"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/versioned|1.0.0')",
      "false",
    ),
    MemberOfCase(
      "S044",
      "versioned: url|2.0.0 member",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A2"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/versioned|2.0.0')",
      "true",
    ),
    MemberOfCase(
      "S045",
      "versioned: unversioned url, code only in 1.0.0",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/versioned')",
      "false",
    ),
    MemberOfCase(
      "S046",
      "versioned: unversioned url, code only in 2.0.0",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A2"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/versioned')",
      "true",
    ),
    MemberOfCase(
      "S047",
      "versioned: url|9.9.9 does not exist",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/versioned|9.9.9')",
      "empty",
    ),
    MemberOfCase(
      "S048",
      "unversioned ValueSet referenced with a version",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/who-shape|1.0.0')",
      "empty",
    ),
    MemberOfCase(
      "S049",
      "filter is-a: descendant",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B1a"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/filter')",
      "true",
    ),
    MemberOfCase(
      "S050",
      "filter is-a: the root itself",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/filter')",
      "true",
    ),
    MemberOfCase(
      "S051",
      "filter is-a: outside",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/beta","code":"B2"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/filter')",
      "false",
    ),
    MemberOfCase(
      "S052",
      "whole system: a code of the system",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A4"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/whole-system')",
      "true",
    ),
    MemberOfCase(
      "S053",
      "whole system: not a code of the system",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"ZZ"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/whole-system')",
      "false",
    ),
    MemberOfCase(
      "S054",
      "whole system: another system",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/gamma","code":"G2"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/whole-system')",
      "false",
    ),
    MemberOfCase(
      "S055",
      "imported ValueSet: member",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/import')",
      "true",
    ),
    MemberOfCase(
      "S056",
      "imported ValueSet: non-member",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A3"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/import')",
      "false",
    ),
    MemberOfCase(
      "S057",
      "disagree: code only in compose",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A1"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/disagree')",
      "true",
    ),
    MemberOfCase(
      "S058",
      "disagree: code only in expansion",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A2"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/disagree')",
      "true",
    ),
    MemberOfCase(
      "S059",
      "disagree: code in neither",
      """{"resourceType":"Observation","status":"final","code":{"coding":[{"system":"http://example.org/fhirpath-memberof/CodeSystem/alpha","code":"A3"}]}}""",
      "Observation.code.coding.memberOf('http://example.org/fhirpath-memberof/ValueSet/disagree')",
      "false",
    ),
  )
