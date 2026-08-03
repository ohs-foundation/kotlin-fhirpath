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

package dev.ohs.fhir.fhirpath.parsers

import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.misc.*
import org.antlr.v4.kotlinruntime.tree.*

@Suppress(
  // This is required as we are using a custom JsName alias that is not recognized by the IDE.
  // No name clashes will happen tho.
  "JS_NAME_CLASH",
  "UNUSED_VARIABLE",
  "ClassName",
  "FunctionName",
  "LocalVariableName",
  "ConstPropertyName",
  "ConvertSecondaryConstructorToPrimary",
  "CanBeVal",
)
public open class fhirpathParser(input: TokenStream) : Parser(input) {
  private companion object {
    init {
      RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.runtimeVersion)
    }

    private const val SERIALIZED_ATN: String =
      "\u0004\u0001\u0040\u0096\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\u0008\u0007\u0008\u0002\u0009\u0007\u0009\u0002\u000a\u0007\u000a\u0002\u000b\u0007\u000b\u0002\u000c\u0007\u000c\u0002\u000d\u0007\u000d\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0021\u0008\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0049\u0008\u0000\u000a\u0000\u000c\u0000\u004c\u0009\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0055\u0008\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0060\u0008\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0065\u0008\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u006c\u0008\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0071\u0008\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0078\u0008\u0006\u000a\u0006\u000c\u0006\u007b\u0009\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u007f\u0008\u0007\u0001\u0008\u0001\u0008\u0001\u0008\u0003\u0008\u0084\u0008\u0008\u0001\u0009\u0001\u0009\u0001\u000a\u0001\u000a\u0001\u000b\u0001\u000b\u0001\u000c\u0001\u000c\u0001\u000c\u0005\u000c\u008f\u0008\u000c\u000a\u000c\u000c\u000c\u0092\u0009\u000c\u0001\u000d\u0001\u000d\u0001\u000d\u0000\u0001\u0000\u000e\u0000\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u000c\u0001\u0000\u0004\u0005\u0001\u0000\u0006\u0009\u0002\u0000\u0004\u0005\u000a\u000a\u0001\u0000\u000e\u0011\u0001\u0000\u0012\u0015\u0001\u0000\u0016\u0017\u0001\u0000\u0019\u001a\u0001\u0000\u000b\u000c\u0001\u0000\u0020\u0021\u0001\u0000\u0027\u002e\u0001\u0000\u002f\u0036\u0003\u0000\u000b\u000c\u0016\u0017\u003a\u003b\u00a9\u0000\u0020\u0001\u0000\u0000\u0000\u0002\u0054\u0001\u0000\u0000\u0000\u0004\u005f\u0001\u0000\u0000\u0000\u0006\u0061\u0001\u0000\u0000\u0000\u0008\u006b\u0001\u0000\u0000\u0000\u000a\u006d\u0001\u0000\u0000\u0000\u000c\u0074\u0001\u0000\u0000\u0000\u000e\u007c\u0001\u0000\u0000\u0000\u0010\u0083\u0001\u0000\u0000\u0000\u0012\u0085\u0001\u0000\u0000\u0000\u0014\u0087\u0001\u0000\u0000\u0000\u0016\u0089\u0001\u0000\u0000\u0000\u0018\u008b\u0001\u0000\u0000\u0000\u001a\u0093\u0001\u0000\u0000\u0000\u001c\u001d\u0006\u0000\uffff\uffff\u0000\u001d\u0021\u0003\u0002\u0001\u0000\u001e\u001f\u0007\u0000\u0000\u0000\u001f\u0021\u0003\u0000\u0000\u000b\u0020\u001c\u0001\u0000\u0000\u0000\u0020\u001e\u0001\u0000\u0000\u0000\u0021\u004a\u0001\u0000\u0000\u0000\u0022\u0023\u000a\u000a\u0000\u0000\u0023\u0024\u0007\u0001\u0000\u0000\u0024\u0049\u0003\u0000\u0000\u000b\u0025\u0026\u000a\u0009\u0000\u0000\u0026\u0027\u0007\u0002\u0000\u0000\u0027\u0049\u0003\u0000\u0000\u000a\u0028\u0029\u000a\u0007\u0000\u0000\u0029\u002a\u0005\u000d\u0000\u0000\u002a\u0049\u0003\u0000\u0000\u0008\u002b\u002c\u000a\u0006\u0000\u0000\u002c\u002d\u0007\u0003\u0000\u0000\u002d\u0049\u0003\u0000\u0000\u0007\u002e\u002f\u000a\u0005\u0000\u0000\u002f\u0030\u0007\u0004\u0000\u0000\u0030\u0049\u0003\u0000\u0000\u0006\u0031\u0032\u000a\u0004\u0000\u0000\u0032\u0033\u0007\u0005\u0000\u0000\u0033\u0049\u0003\u0000\u0000\u0005\u0034\u0035\u000a\u0003\u0000\u0000\u0035\u0036\u0005\u0018\u0000\u0000\u0036\u0049\u0003\u0000\u0000\u0004\u0037\u0038\u000a\u0002\u0000\u0000\u0038\u0039\u0007\u0006\u0000\u0000\u0039\u0049\u0003\u0000\u0000\u0003\u003a\u003b\u000a\u0001\u0000\u0000\u003b\u003c\u0005\u001b\u0000\u0000\u003c\u0049\u0003\u0000\u0000\u0002\u003d\u003e\u000a\u000d\u0000\u0000\u003e\u003f\u0005\u0001\u0000\u0000\u003f\u0049\u0003\u0008\u0004\u0000\u0040\u0041\u000a\u000c\u0000\u0000\u0041\u0042\u0005\u0002\u0000\u0000\u0042\u0043\u0003\u0000\u0000\u0000\u0043\u0044\u0005\u0003\u0000\u0000\u0044\u0049\u0001\u0000\u0000\u0000\u0045\u0046\u000a\u0008\u0000\u0000\u0046\u0047\u0007\u0007\u0000\u0000\u0047\u0049\u0003\u0016\u000b\u0000\u0048\u0022\u0001\u0000\u0000\u0000\u0048\u0025\u0001\u0000\u0000\u0000\u0048\u0028\u0001\u0000\u0000\u0000\u0048\u002b\u0001\u0000\u0000\u0000\u0048\u002e\u0001\u0000\u0000\u0000\u0048\u0031\u0001\u0000\u0000\u0000\u0048\u0034\u0001\u0000\u0000\u0000\u0048\u0037\u0001\u0000\u0000\u0000\u0048\u003a\u0001\u0000\u0000\u0000\u0048\u003d\u0001\u0000\u0000\u0000\u0048\u0040\u0001\u0000\u0000\u0000\u0048\u0045\u0001\u0000\u0000\u0000\u0049\u004c\u0001\u0000\u0000\u0000\u004a\u0048\u0001\u0000\u0000\u0000\u004a\u004b\u0001\u0000\u0000\u0000\u004b\u0001\u0001\u0000\u0000\u0000\u004c\u004a\u0001\u0000\u0000\u0000\u004d\u0055\u0003\u0008\u0004\u0000\u004e\u0055\u0003\u0004\u0002\u0000\u004f\u0055\u0003\u0006\u0003\u0000\u0050\u0051\u0005\u001c\u0000\u0000\u0051\u0052\u0003\u0000\u0000\u0000\u0052\u0053\u0005\u001d\u0000\u0000\u0053\u0055\u0001\u0000\u0000\u0000\u0054\u004d\u0001\u0000\u0000\u0000\u0054\u004e\u0001\u0000\u0000\u0000\u0054\u004f\u0001\u0000\u0000\u0000\u0054\u0050\u0001\u0000\u0000\u0000\u0055\u0003\u0001\u0000\u0000\u0000\u0056\u0057\u0005\u001e\u0000\u0000\u0057\u0060\u0005\u001f\u0000\u0000\u0058\u0060\u0007\u0008\u0000\u0000\u0059\u0060\u0005\u003c\u0000\u0000\u005a\u0060\u0005\u003d\u0000\u0000\u005b\u0060\u0005\u0037\u0000\u0000\u005c\u0060\u0005\u0038\u0000\u0000\u005d\u0060\u0005\u0039\u0000\u0000\u005e\u0060\u0003\u000e\u0007\u0000\u005f\u0056\u0001\u0000\u0000\u0000\u005f\u0058\u0001\u0000\u0000\u0000\u005f\u0059\u0001\u0000\u0000\u0000\u005f\u005a\u0001\u0000\u0000\u0000\u005f\u005b\u0001\u0000\u0000\u0000\u005f\u005c\u0001\u0000\u0000\u0000\u005f\u005d\u0001\u0000\u0000\u0000\u005f\u005e\u0001\u0000\u0000\u0000\u0060\u0005\u0001\u0000\u0000\u0000\u0061\u0064\u0005\u0022\u0000\u0000\u0062\u0065\u0003\u001a\u000d\u0000\u0063\u0065\u0005\u003c\u0000\u0000\u0064\u0062\u0001\u0000\u0000\u0000\u0064\u0063\u0001\u0000\u0000\u0000\u0065\u0007\u0001\u0000\u0000\u0000\u0066\u006c\u0003\u001a\u000d\u0000\u0067\u006c\u0003\u000a\u0005\u0000\u0068\u006c\u0005\u0023\u0000\u0000\u0069\u006c\u0005\u0024\u0000\u0000\u006a\u006c\u0005\u0025\u0000\u0000\u006b\u0066\u0001\u0000\u0000\u0000\u006b\u0067\u0001\u0000\u0000\u0000\u006b\u0068\u0001\u0000\u0000\u0000\u006b\u0069\u0001\u0000\u0000\u0000\u006b\u006a\u0001\u0000\u0000\u0000\u006c\u0009\u0001\u0000\u0000\u0000\u006d\u006e\u0003\u001a\u000d\u0000\u006e\u0070\u0005\u001c\u0000\u0000\u006f\u0071\u0003\u000c\u0006\u0000\u0070\u006f\u0001\u0000\u0000\u0000\u0070\u0071\u0001\u0000\u0000\u0000\u0071\u0072\u0001\u0000\u0000\u0000\u0072\u0073\u0005\u001d\u0000\u0000\u0073\u000b\u0001\u0000\u0000\u0000\u0074\u0079\u0003\u0000\u0000\u0000\u0075\u0076\u0005\u0026\u0000\u0000\u0076\u0078\u0003\u0000\u0000\u0000\u0077\u0075\u0001\u0000\u0000\u0000\u0078\u007b\u0001\u0000\u0000\u0000\u0079\u0077\u0001\u0000\u0000\u0000\u0079\u007a\u0001\u0000\u0000\u0000\u007a\u000d\u0001\u0000\u0000\u0000\u007b\u0079\u0001\u0000\u0000\u0000\u007c\u007e\u0005\u003d\u0000\u0000\u007d\u007f\u0003\u0010\u0008\u0000\u007e\u007d\u0001\u0000\u0000\u0000\u007e\u007f\u0001\u0000\u0000\u0000\u007f\u000f\u0001\u0000\u0000\u0000\u0080\u0084\u0003\u0012\u0009\u0000\u0081\u0084\u0003\u0014\u000a\u0000\u0082\u0084\u0005\u003c\u0000\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0011\u0001\u0000\u0000\u0000\u0085\u0086\u0007\u0009\u0000\u0000\u0086\u0013\u0001\u0000\u0000\u0000\u0087\u0088\u0007\u000a\u0000\u0000\u0088\u0015\u0001\u0000\u0000\u0000\u0089\u008a\u0003\u0018\u000c\u0000\u008a\u0017\u0001\u0000\u0000\u0000\u008b\u0090\u0003\u001a\u000d\u0000\u008c\u008d\u0005\u0001\u0000\u0000\u008d\u008f\u0003\u001a\u000d\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0019\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u000b\u0000\u0000\u0094\u001b\u0001\u0000\u0000\u0000\u000c\u0020\u0048\u004a\u0054\u005f\u0064\u006b\u0070\u0079\u007e\u0083\u0090"

    private val ATN = ATNDeserializer().deserialize(SERIALIZED_ATN.toCharArray())

    private val DECISION_TO_DFA =
      Array(ATN.numberOfDecisions) { DFA(ATN.getDecisionState(it)!!, it) }

    private val SHARED_CONTEXT_CACHE = PredictionContextCache()
    private val RULE_NAMES: Array<String> =
      arrayOf(
        "expression",
        "term",
        "literal",
        "externalConstant",
        "invocation",
        "function",
        "paramList",
        "quantity",
        "unit",
        "dateTimePrecision",
        "pluralDateTimePrecision",
        "typeSpecifier",
        "qualifiedIdentifier",
        "identifier",
      )

    private val LITERAL_NAMES: Array<String?> =
      arrayOf(
        null,
        "'.'",
        "'['",
        "']'",
        "'+'",
        "'-'",
        "'*'",
        "'/'",
        "'div'",
        "'mod'",
        "'&'",
        "'is'",
        "'as'",
        "'|'",
        "'<='",
        "'<'",
        "'>'",
        "'>='",
        "'='",
        "'~'",
        "'!='",
        "'!~'",
        "'in'",
        "'contains'",
        "'and'",
        "'or'",
        "'xor'",
        "'implies'",
        "'('",
        "')'",
        "'{'",
        "'}'",
        "'true'",
        "'false'",
        "'%'",
        "'\$this'",
        "'\$index'",
        "'\$total'",
        "','",
        "'year'",
        "'month'",
        "'week'",
        "'day'",
        "'hour'",
        "'minute'",
        "'second'",
        "'millisecond'",
        "'years'",
        "'months'",
        "'weeks'",
        "'days'",
        "'hours'",
        "'minutes'",
        "'seconds'",
        "'milliseconds'",
      )

    private val SYMBOLIC_NAMES: Array<String?> =
      arrayOf(
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        "DATE",
        "DATETIME",
        "TIME",
        "IDENTIFIER",
        "DELIMITEDIDENTIFIER",
        "STRING",
        "NUMBER",
        "WS",
        "COMMENT",
        "LINE_COMMENT",
      )

    private val VOCABULARY = VocabularyImpl(LITERAL_NAMES, SYMBOLIC_NAMES)

    private val TOKEN_NAMES: Array<String> =
      Array(SYMBOLIC_NAMES.size) {
        VOCABULARY.getLiteralName(it) ?: VOCABULARY.getSymbolicName(it) ?: "<INVALID>"
      }
  }

  public object Tokens {
    public const val EOF: Int = -1
    public const val T__0: Int = 1
    public const val T__1: Int = 2
    public const val T__2: Int = 3
    public const val T__3: Int = 4
    public const val T__4: Int = 5
    public const val T__5: Int = 6
    public const val T__6: Int = 7
    public const val T__7: Int = 8
    public const val T__8: Int = 9
    public const val T__9: Int = 10
    public const val T__10: Int = 11
    public const val T__11: Int = 12
    public const val T__12: Int = 13
    public const val T__13: Int = 14
    public const val T__14: Int = 15
    public const val T__15: Int = 16
    public const val T__16: Int = 17
    public const val T__17: Int = 18
    public const val T__18: Int = 19
    public const val T__19: Int = 20
    public const val T__20: Int = 21
    public const val T__21: Int = 22
    public const val T__22: Int = 23
    public const val T__23: Int = 24
    public const val T__24: Int = 25
    public const val T__25: Int = 26
    public const val T__26: Int = 27
    public const val T__27: Int = 28
    public const val T__28: Int = 29
    public const val T__29: Int = 30
    public const val T__30: Int = 31
    public const val T__31: Int = 32
    public const val T__32: Int = 33
    public const val T__33: Int = 34
    public const val T__34: Int = 35
    public const val T__35: Int = 36
    public const val T__36: Int = 37
    public const val T__37: Int = 38
    public const val T__38: Int = 39
    public const val T__39: Int = 40
    public const val T__40: Int = 41
    public const val T__41: Int = 42
    public const val T__42: Int = 43
    public const val T__43: Int = 44
    public const val T__44: Int = 45
    public const val T__45: Int = 46
    public const val T__46: Int = 47
    public const val T__47: Int = 48
    public const val T__48: Int = 49
    public const val T__49: Int = 50
    public const val T__50: Int = 51
    public const val T__51: Int = 52
    public const val T__52: Int = 53
    public const val T__53: Int = 54
    public const val DATE: Int = 55
    public const val DATETIME: Int = 56
    public const val TIME: Int = 57
    public const val IDENTIFIER: Int = 58
    public const val DELIMITEDIDENTIFIER: Int = 59
    public const val STRING: Int = 60
    public const val NUMBER: Int = 61
    public const val WS: Int = 62
    public const val COMMENT: Int = 63
    public const val LINE_COMMENT: Int = 64
  }

  public object Rules {
    public const val Expression: Int = 0
    public const val Term: Int = 1
    public const val Literal: Int = 2
    public const val ExternalConstant: Int = 3
    public const val Invocation: Int = 4
    public const val Function: Int = 5
    public const val ParamList: Int = 6
    public const val Quantity: Int = 7
    public const val Unit: Int = 8
    public const val DateTimePrecision: Int = 9
    public const val PluralDateTimePrecision: Int = 10
    public const val TypeSpecifier: Int = 11
    public const val QualifiedIdentifier: Int = 12
    public const val Identifier: Int = 13
  }

  override var interpreter: ParserATNSimulator =
    @Suppress("LeakingThis") ParserATNSimulator(this, ATN, DECISION_TO_DFA, SHARED_CONTEXT_CACHE)

  override val grammarFileName: String = "fhirpath.g4"

  @Deprecated("Use vocabulary instead", replaceWith = ReplaceWith("vocabulary"))
  override val tokenNames: Array<String> = TOKEN_NAMES

  override val ruleNames: Array<String> = RULE_NAMES

  override val atn: ATN = ATN

  override val vocabulary: Vocabulary = VOCABULARY

  override val serializedATN: String = SERIALIZED_ATN

  /* Named actions */

  /* Funcs */
  public open class ExpressionContext : ParserRuleContext {
    override val ruleIndex: Int = Rules.Expression

    public constructor(
      parent: ParserRuleContext?,
      invokingState: Int,
    ) : super(parent, invokingState) {}

    public constructor() : super()

    public fun copyFrom(ctx: ExpressionContext) {
      super.copyFrom(ctx)
    }
  }

  public open class IndexerExpressionContext : ExpressionContext {
    public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)

    public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)

    public constructor(ctx: ExpressionContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterIndexerExpression(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitIndexerExpression(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitIndexerExpression(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class PolarityExpressionContext : ExpressionContext {
    public fun expression(): ExpressionContext = getRuleContext(ExpressionContext::class, 0)!!

    public constructor(ctx: ExpressionContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterPolarityExpression(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitPolarityExpression(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitPolarityExpression(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class AdditiveExpressionContext : ExpressionContext {
    public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)

    public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)

    public constructor(ctx: ExpressionContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterAdditiveExpression(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitAdditiveExpression(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitAdditiveExpression(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class MultiplicativeExpressionContext : ExpressionContext {
    public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)

    public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)

    public constructor(ctx: ExpressionContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterMultiplicativeExpression(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitMultiplicativeExpression(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitMultiplicativeExpression(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class UnionExpressionContext : ExpressionContext {
    public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)

    public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)

    public constructor(ctx: ExpressionContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterUnionExpression(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitUnionExpression(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitUnionExpression(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class OrExpressionContext : ExpressionContext {
    public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)

    public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)

    public constructor(ctx: ExpressionContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterOrExpression(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitOrExpression(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitOrExpression(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class AndExpressionContext : ExpressionContext {
    public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)

    public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)

    public constructor(ctx: ExpressionContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterAndExpression(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitAndExpression(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitAndExpression(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class MembershipExpressionContext : ExpressionContext {
    public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)

    public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)

    public constructor(ctx: ExpressionContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterMembershipExpression(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitMembershipExpression(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitMembershipExpression(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class InequalityExpressionContext : ExpressionContext {
    public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)

    public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)

    public constructor(ctx: ExpressionContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterInequalityExpression(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitInequalityExpression(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitInequalityExpression(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class InvocationExpressionContext : ExpressionContext {
    public fun expression(): ExpressionContext = getRuleContext(ExpressionContext::class, 0)!!

    public fun invocation(): InvocationContext = getRuleContext(InvocationContext::class, 0)!!

    public constructor(ctx: ExpressionContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterInvocationExpression(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitInvocationExpression(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitInvocationExpression(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class EqualityExpressionContext : ExpressionContext {
    public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)

    public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)

    public constructor(ctx: ExpressionContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterEqualityExpression(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitEqualityExpression(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitEqualityExpression(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class ImpliesExpressionContext : ExpressionContext {
    public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)

    public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)

    public constructor(ctx: ExpressionContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterImpliesExpression(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitImpliesExpression(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitImpliesExpression(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class TermExpressionContext : ExpressionContext {
    public fun term(): TermContext = getRuleContext(TermContext::class, 0)!!

    public constructor(ctx: ExpressionContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterTermExpression(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitTermExpression(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitTermExpression(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class TypeExpressionContext : ExpressionContext {
    public fun expression(): ExpressionContext = getRuleContext(ExpressionContext::class, 0)!!

    public fun typeSpecifier(): TypeSpecifierContext =
      getRuleContext(TypeSpecifierContext::class, 0)!!

    public constructor(ctx: ExpressionContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterTypeExpression(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitTypeExpression(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitTypeExpression(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public fun expression(): ExpressionContext {
    return expression(0)
  }

  private fun expression(_p: Int): ExpressionContext {
    var _parentctx = context
    var _parentState = state
    var _localctx = ExpressionContext(context, _parentState)
    var _prevctx = _localctx
    var _startState = 0
    var _token: Token?
    var _ctx: RuleContext?

    enterRecursionRule(_localctx, 0, Rules.Expression, _p)
    var _la: Int

    try {
      var _alt: Int
      enterOuterAlt(_localctx, 1)
      this.state = 32
      errorHandler.sync(this)

      when (_input.LA(1)) {
        Tokens.T__10,
        Tokens.T__11,
        Tokens.T__21,
        Tokens.T__22,
        Tokens.T__27,
        Tokens.T__29,
        Tokens.T__31,
        Tokens.T__32,
        Tokens.T__33,
        Tokens.T__34,
        Tokens.T__35,
        Tokens.T__36,
        Tokens.DATE,
        Tokens.DATETIME,
        Tokens.TIME,
        Tokens.IDENTIFIER,
        Tokens.DELIMITEDIDENTIFIER,
        Tokens.STRING,
        Tokens.NUMBER -> /*LL1AltBlock*/ {
          _localctx = TermExpressionContext(_localctx)
          context = _localctx
          _prevctx = _localctx

          this.state = 29
          term()
        }
        Tokens.T__3,
        Tokens.T__4 -> /*LL1AltBlock*/ {
          _localctx = PolarityExpressionContext(_localctx)
          context = _localctx
          _prevctx = _localctx
          this.state = 30
          _la = _input.LA(1)

          if (!(_la == Tokens.T__3 || _la == Tokens.T__4)) {
            errorHandler.recoverInline(this)
          } else {
            if (_input.LA(1) == Tokens.EOF) {
              isMatchedEOF = true
            }

            errorHandler.reportMatch(this)
            consume()
          }
          this.state = 31
          expression(11)
        }
        else -> throw NoViableAltException(this)
      }
      context!!.stop = _input.LT(-1)
      this.state = 74
      errorHandler.sync(this)
      _alt = interpreter.adaptivePredict(_input, 2, context)

      while (_alt != 2 && _alt != INVALID_ALT_NUMBER) {
        if (_alt == 1) {
          if (_parseListeners.isNotEmpty()) {
            triggerExitRuleEvent()
          }

          _prevctx = _localctx
          this.state = 72
          errorHandler.sync(this)

          when (interpreter.adaptivePredict(_input, 1, context)) {
            1 -> {
              _localctx =
                MultiplicativeExpressionContext(ExpressionContext(_parentctx, _parentState))
              pushNewRecursionContext(_localctx, _startState, Rules.Expression)
              this.state = 34

              if (!(precpred(context!!, 10))) {
                throw FailedPredicateException(this, "precpred(context!!, 10)")
              }
              this.state = 35
              _la = _input.LA(1)

              if (!((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 960L) != 0L))) {
                errorHandler.recoverInline(this)
              } else {
                if (_input.LA(1) == Tokens.EOF) {
                  isMatchedEOF = true
                }

                errorHandler.reportMatch(this)
                consume()
              }
              this.state = 36
              expression(11)
            }
            2 -> {
              _localctx = AdditiveExpressionContext(ExpressionContext(_parentctx, _parentState))
              pushNewRecursionContext(_localctx, _startState, Rules.Expression)
              this.state = 37

              if (!(precpred(context!!, 9))) {
                throw FailedPredicateException(this, "precpred(context!!, 9)")
              }
              this.state = 38
              _la = _input.LA(1)

              if (!((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 1072L) != 0L))) {
                errorHandler.recoverInline(this)
              } else {
                if (_input.LA(1) == Tokens.EOF) {
                  isMatchedEOF = true
                }

                errorHandler.reportMatch(this)
                consume()
              }
              this.state = 39
              expression(10)
            }
            3 -> {
              _localctx = UnionExpressionContext(ExpressionContext(_parentctx, _parentState))
              pushNewRecursionContext(_localctx, _startState, Rules.Expression)
              this.state = 40

              if (!(precpred(context!!, 7))) {
                throw FailedPredicateException(this, "precpred(context!!, 7)")
              }
              this.state = 41
              match(Tokens.T__12)

              this.state = 42
              expression(8)
            }
            4 -> {
              _localctx = InequalityExpressionContext(ExpressionContext(_parentctx, _parentState))
              pushNewRecursionContext(_localctx, _startState, Rules.Expression)
              this.state = 43

              if (!(precpred(context!!, 6))) {
                throw FailedPredicateException(this, "precpred(context!!, 6)")
              }
              this.state = 44
              _la = _input.LA(1)

              if (!((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 245760L) != 0L))) {
                errorHandler.recoverInline(this)
              } else {
                if (_input.LA(1) == Tokens.EOF) {
                  isMatchedEOF = true
                }

                errorHandler.reportMatch(this)
                consume()
              }
              this.state = 45
              expression(7)
            }
            5 -> {
              _localctx = EqualityExpressionContext(ExpressionContext(_parentctx, _parentState))
              pushNewRecursionContext(_localctx, _startState, Rules.Expression)
              this.state = 46

              if (!(precpred(context!!, 5))) {
                throw FailedPredicateException(this, "precpred(context!!, 5)")
              }
              this.state = 47
              _la = _input.LA(1)

              if (!((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 3932160L) != 0L))) {
                errorHandler.recoverInline(this)
              } else {
                if (_input.LA(1) == Tokens.EOF) {
                  isMatchedEOF = true
                }

                errorHandler.reportMatch(this)
                consume()
              }
              this.state = 48
              expression(6)
            }
            6 -> {
              _localctx = MembershipExpressionContext(ExpressionContext(_parentctx, _parentState))
              pushNewRecursionContext(_localctx, _startState, Rules.Expression)
              this.state = 49

              if (!(precpred(context!!, 4))) {
                throw FailedPredicateException(this, "precpred(context!!, 4)")
              }
              this.state = 50
              _la = _input.LA(1)

              if (!(_la == Tokens.T__21 || _la == Tokens.T__22)) {
                errorHandler.recoverInline(this)
              } else {
                if (_input.LA(1) == Tokens.EOF) {
                  isMatchedEOF = true
                }

                errorHandler.reportMatch(this)
                consume()
              }
              this.state = 51
              expression(5)
            }
            7 -> {
              _localctx = AndExpressionContext(ExpressionContext(_parentctx, _parentState))
              pushNewRecursionContext(_localctx, _startState, Rules.Expression)
              this.state = 52

              if (!(precpred(context!!, 3))) {
                throw FailedPredicateException(this, "precpred(context!!, 3)")
              }
              this.state = 53
              match(Tokens.T__23)

              this.state = 54
              expression(4)
            }
            8 -> {
              _localctx = OrExpressionContext(ExpressionContext(_parentctx, _parentState))
              pushNewRecursionContext(_localctx, _startState, Rules.Expression)
              this.state = 55

              if (!(precpred(context!!, 2))) {
                throw FailedPredicateException(this, "precpred(context!!, 2)")
              }
              this.state = 56
              _la = _input.LA(1)

              if (!(_la == Tokens.T__24 || _la == Tokens.T__25)) {
                errorHandler.recoverInline(this)
              } else {
                if (_input.LA(1) == Tokens.EOF) {
                  isMatchedEOF = true
                }

                errorHandler.reportMatch(this)
                consume()
              }
              this.state = 57
              expression(3)
            }
            9 -> {
              _localctx = ImpliesExpressionContext(ExpressionContext(_parentctx, _parentState))
              pushNewRecursionContext(_localctx, _startState, Rules.Expression)
              this.state = 58

              if (!(precpred(context!!, 1))) {
                throw FailedPredicateException(this, "precpred(context!!, 1)")
              }
              this.state = 59
              match(Tokens.T__26)

              this.state = 60
              expression(2)
            }
            10 -> {
              _localctx = InvocationExpressionContext(ExpressionContext(_parentctx, _parentState))
              pushNewRecursionContext(_localctx, _startState, Rules.Expression)
              this.state = 61

              if (!(precpred(context!!, 13))) {
                throw FailedPredicateException(this, "precpred(context!!, 13)")
              }
              this.state = 62
              match(Tokens.T__0)

              this.state = 63
              invocation()
            }
            11 -> {
              _localctx = IndexerExpressionContext(ExpressionContext(_parentctx, _parentState))
              pushNewRecursionContext(_localctx, _startState, Rules.Expression)
              this.state = 64

              if (!(precpred(context!!, 12))) {
                throw FailedPredicateException(this, "precpred(context!!, 12)")
              }
              this.state = 65
              match(Tokens.T__1)

              this.state = 66
              expression(0)

              this.state = 67
              match(Tokens.T__2)
            }
            12 -> {
              _localctx = TypeExpressionContext(ExpressionContext(_parentctx, _parentState))
              pushNewRecursionContext(_localctx, _startState, Rules.Expression)
              this.state = 69

              if (!(precpred(context!!, 8))) {
                throw FailedPredicateException(this, "precpred(context!!, 8)")
              }
              this.state = 70
              _la = _input.LA(1)

              if (!(_la == Tokens.T__10 || _la == Tokens.T__11)) {
                errorHandler.recoverInline(this)
              } else {
                if (_input.LA(1) == Tokens.EOF) {
                  isMatchedEOF = true
                }

                errorHandler.reportMatch(this)
                consume()
              }
              this.state = 71
              typeSpecifier()
            }
          }
        }

        this.state = 76
        errorHandler.sync(this)
        _alt = interpreter.adaptivePredict(_input, 2, context)
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      errorHandler.reportError(this, re)
      errorHandler.recover(this, re)
    } finally {
      unrollRecursionContexts(_parentctx)
    }

    return _localctx
  }

  public open class TermContext : ParserRuleContext {
    override val ruleIndex: Int = Rules.Term

    public constructor(
      parent: ParserRuleContext?,
      invokingState: Int,
    ) : super(parent, invokingState) {}

    public constructor() : super()

    public fun copyFrom(ctx: TermContext) {
      super.copyFrom(ctx)
    }
  }

  public open class ExternalConstantTermContext : TermContext {
    public fun externalConstant(): ExternalConstantContext =
      getRuleContext(ExternalConstantContext::class, 0)!!

    public constructor(ctx: TermContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterExternalConstantTerm(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitExternalConstantTerm(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitExternalConstantTerm(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class LiteralTermContext : TermContext {
    public fun literal(): LiteralContext = getRuleContext(LiteralContext::class, 0)!!

    public constructor(ctx: TermContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterLiteralTerm(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitLiteralTerm(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitLiteralTerm(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class ParenthesizedTermContext : TermContext {
    public fun expression(): ExpressionContext = getRuleContext(ExpressionContext::class, 0)!!

    public constructor(ctx: TermContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterParenthesizedTerm(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitParenthesizedTerm(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitParenthesizedTerm(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class InvocationTermContext : TermContext {
    public fun invocation(): InvocationContext = getRuleContext(InvocationContext::class, 0)!!

    public constructor(ctx: TermContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterInvocationTerm(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitInvocationTerm(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitInvocationTerm(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public fun term(): TermContext {
    var _localctx = TermContext(context, state)
    var _token: Token?
    var _ctx: RuleContext?

    enterRule(_localctx, 2, Rules.Term)

    try {
      this.state = 84
      errorHandler.sync(this)

      when (_input.LA(1)) {
        Tokens.T__10,
        Tokens.T__11,
        Tokens.T__21,
        Tokens.T__22,
        Tokens.T__34,
        Tokens.T__35,
        Tokens.T__36,
        Tokens.IDENTIFIER,
        Tokens.DELIMITEDIDENTIFIER -> /*LL1AltBlock*/ {
          _localctx = InvocationTermContext(_localctx)
          enterOuterAlt(_localctx, 1)
          this.state = 77
          invocation()
        }
        Tokens.T__29,
        Tokens.T__31,
        Tokens.T__32,
        Tokens.DATE,
        Tokens.DATETIME,
        Tokens.TIME,
        Tokens.STRING,
        Tokens.NUMBER -> /*LL1AltBlock*/ {
          _localctx = LiteralTermContext(_localctx)
          enterOuterAlt(_localctx, 2)
          this.state = 78
          literal()
        }
        Tokens.T__33 -> /*LL1AltBlock*/ {
          _localctx = ExternalConstantTermContext(_localctx)
          enterOuterAlt(_localctx, 3)
          this.state = 79
          externalConstant()
        }
        Tokens.T__27 -> /*LL1AltBlock*/ {
          _localctx = ParenthesizedTermContext(_localctx)
          enterOuterAlt(_localctx, 4)
          this.state = 80
          match(Tokens.T__27)

          this.state = 81
          expression(0)

          this.state = 82
          match(Tokens.T__28)
        }
        else -> throw NoViableAltException(this)
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      errorHandler.reportError(this, re)
      errorHandler.recover(this, re)
    } finally {
      exitRule()
    }

    return _localctx
  }

  public open class LiteralContext : ParserRuleContext {
    override val ruleIndex: Int = Rules.Literal

    public constructor(
      parent: ParserRuleContext?,
      invokingState: Int,
    ) : super(parent, invokingState) {}

    public constructor() : super()

    public fun copyFrom(ctx: LiteralContext) {
      super.copyFrom(ctx)
    }
  }

  public open class TimeLiteralContext : LiteralContext {
    public fun TIME(): TerminalNode = getToken(Tokens.TIME, 0)!!

    public constructor(ctx: LiteralContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterTimeLiteral(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitTimeLiteral(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitTimeLiteral(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class NullLiteralContext : LiteralContext {

    public constructor(ctx: LiteralContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterNullLiteral(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitNullLiteral(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitNullLiteral(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class DateTimeLiteralContext : LiteralContext {
    public fun DATETIME(): TerminalNode = getToken(Tokens.DATETIME, 0)!!

    public constructor(ctx: LiteralContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterDateTimeLiteral(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitDateTimeLiteral(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitDateTimeLiteral(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class StringLiteralContext : LiteralContext {
    public fun STRING(): TerminalNode = getToken(Tokens.STRING, 0)!!

    public constructor(ctx: LiteralContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterStringLiteral(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitStringLiteral(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitStringLiteral(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class DateLiteralContext : LiteralContext {
    public fun DATE(): TerminalNode = getToken(Tokens.DATE, 0)!!

    public constructor(ctx: LiteralContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterDateLiteral(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitDateLiteral(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitDateLiteral(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class BooleanLiteralContext : LiteralContext {

    public constructor(ctx: LiteralContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterBooleanLiteral(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitBooleanLiteral(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitBooleanLiteral(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class NumberLiteralContext : LiteralContext {
    public fun NUMBER(): TerminalNode = getToken(Tokens.NUMBER, 0)!!

    public constructor(ctx: LiteralContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterNumberLiteral(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitNumberLiteral(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitNumberLiteral(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class QuantityLiteralContext : LiteralContext {
    public fun quantity(): QuantityContext = getRuleContext(QuantityContext::class, 0)!!

    public constructor(ctx: LiteralContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterQuantityLiteral(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitQuantityLiteral(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitQuantityLiteral(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public fun literal(): LiteralContext {
    var _localctx = LiteralContext(context, state)
    var _token: Token?
    var _ctx: RuleContext?

    enterRule(_localctx, 4, Rules.Literal)
    var _la: Int

    try {
      this.state = 95
      errorHandler.sync(this)

      when (interpreter.adaptivePredict(_input, 4, context)) {
        1 -> {
          _localctx = NullLiteralContext(_localctx)
          enterOuterAlt(_localctx, 1)
          this.state = 86
          match(Tokens.T__29)

          this.state = 87
          match(Tokens.T__30)
        }
        2 -> {
          _localctx = BooleanLiteralContext(_localctx)
          enterOuterAlt(_localctx, 2)
          this.state = 88
          _la = _input.LA(1)

          if (!(_la == Tokens.T__31 || _la == Tokens.T__32)) {
            errorHandler.recoverInline(this)
          } else {
            if (_input.LA(1) == Tokens.EOF) {
              isMatchedEOF = true
            }

            errorHandler.reportMatch(this)
            consume()
          }
        }
        3 -> {
          _localctx = StringLiteralContext(_localctx)
          enterOuterAlt(_localctx, 3)
          this.state = 89
          match(Tokens.STRING)
        }
        4 -> {
          _localctx = NumberLiteralContext(_localctx)
          enterOuterAlt(_localctx, 4)
          this.state = 90
          match(Tokens.NUMBER)
        }
        5 -> {
          _localctx = DateLiteralContext(_localctx)
          enterOuterAlt(_localctx, 5)
          this.state = 91
          match(Tokens.DATE)
        }
        6 -> {
          _localctx = DateTimeLiteralContext(_localctx)
          enterOuterAlt(_localctx, 6)
          this.state = 92
          match(Tokens.DATETIME)
        }
        7 -> {
          _localctx = TimeLiteralContext(_localctx)
          enterOuterAlt(_localctx, 7)
          this.state = 93
          match(Tokens.TIME)
        }
        8 -> {
          _localctx = QuantityLiteralContext(_localctx)
          enterOuterAlt(_localctx, 8)
          this.state = 94
          quantity()
        }
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      errorHandler.reportError(this, re)
      errorHandler.recover(this, re)
    } finally {
      exitRule()
    }

    return _localctx
  }

  public open class ExternalConstantContext : ParserRuleContext {
    override val ruleIndex: Int = Rules.ExternalConstant

    public fun identifier(): IdentifierContext? = getRuleContext(IdentifierContext::class, 0)

    public fun STRING(): TerminalNode? = getToken(Tokens.STRING, 0)

    public constructor(
      parent: ParserRuleContext?,
      invokingState: Int,
    ) : super(parent, invokingState) {}

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterExternalConstant(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitExternalConstant(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitExternalConstant(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public fun externalConstant(): ExternalConstantContext {
    var _localctx = ExternalConstantContext(context, state)
    var _token: Token?
    var _ctx: RuleContext?

    enterRule(_localctx, 6, Rules.ExternalConstant)

    try {
      enterOuterAlt(_localctx, 1)
      this.state = 97
      match(Tokens.T__33)

      this.state = 100
      errorHandler.sync(this)

      when (_input.LA(1)) {
        Tokens.T__10,
        Tokens.T__11,
        Tokens.T__21,
        Tokens.T__22,
        Tokens.IDENTIFIER,
        Tokens.DELIMITEDIDENTIFIER -> /*LL1AltBlock*/ {
          this.state = 98
          identifier()
        }
        Tokens.STRING -> /*LL1AltBlock*/ {
          this.state = 99
          match(Tokens.STRING)
        }
        else -> throw NoViableAltException(this)
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      errorHandler.reportError(this, re)
      errorHandler.recover(this, re)
    } finally {
      exitRule()
    }

    return _localctx
  }

  public open class InvocationContext : ParserRuleContext {
    override val ruleIndex: Int = Rules.Invocation

    public constructor(
      parent: ParserRuleContext?,
      invokingState: Int,
    ) : super(parent, invokingState) {}

    public constructor() : super()

    public fun copyFrom(ctx: InvocationContext) {
      super.copyFrom(ctx)
    }
  }

  public open class TotalInvocationContext : InvocationContext {

    public constructor(ctx: InvocationContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterTotalInvocation(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitTotalInvocation(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitTotalInvocation(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class ThisInvocationContext : InvocationContext {

    public constructor(ctx: InvocationContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterThisInvocation(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitThisInvocation(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitThisInvocation(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class IndexInvocationContext : InvocationContext {

    public constructor(ctx: InvocationContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterIndexInvocation(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitIndexInvocation(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitIndexInvocation(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class FunctionInvocationContext : InvocationContext {
    public fun function(): FunctionContext = getRuleContext(FunctionContext::class, 0)!!

    public constructor(ctx: InvocationContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterFunctionInvocation(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitFunctionInvocation(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitFunctionInvocation(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public open class MemberInvocationContext : InvocationContext {
    public fun identifier(): IdentifierContext = getRuleContext(IdentifierContext::class, 0)!!

    public constructor(ctx: InvocationContext) {
      copyFrom(ctx)
    }

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterMemberInvocation(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitMemberInvocation(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitMemberInvocation(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public fun invocation(): InvocationContext {
    var _localctx = InvocationContext(context, state)
    var _token: Token?
    var _ctx: RuleContext?

    enterRule(_localctx, 8, Rules.Invocation)

    try {
      this.state = 107
      errorHandler.sync(this)

      when (interpreter.adaptivePredict(_input, 6, context)) {
        1 -> {
          _localctx = MemberInvocationContext(_localctx)
          enterOuterAlt(_localctx, 1)
          this.state = 102
          identifier()
        }
        2 -> {
          _localctx = FunctionInvocationContext(_localctx)
          enterOuterAlt(_localctx, 2)
          this.state = 103
          function()
        }
        3 -> {
          _localctx = ThisInvocationContext(_localctx)
          enterOuterAlt(_localctx, 3)
          this.state = 104
          match(Tokens.T__34)
        }
        4 -> {
          _localctx = IndexInvocationContext(_localctx)
          enterOuterAlt(_localctx, 4)
          this.state = 105
          match(Tokens.T__35)
        }
        5 -> {
          _localctx = TotalInvocationContext(_localctx)
          enterOuterAlt(_localctx, 5)
          this.state = 106
          match(Tokens.T__36)
        }
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      errorHandler.reportError(this, re)
      errorHandler.recover(this, re)
    } finally {
      exitRule()
    }

    return _localctx
  }

  public open class FunctionContext : ParserRuleContext {
    override val ruleIndex: Int = Rules.Function

    public fun identifier(): IdentifierContext = getRuleContext(IdentifierContext::class, 0)!!

    public fun paramList(): ParamListContext? = getRuleContext(ParamListContext::class, 0)

    public constructor(
      parent: ParserRuleContext?,
      invokingState: Int,
    ) : super(parent, invokingState) {}

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterFunction(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitFunction(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitFunction(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public fun function(): FunctionContext {
    var _localctx = FunctionContext(context, state)
    var _token: Token?
    var _ctx: RuleContext?

    enterRule(_localctx, 10, Rules.Function)
    var _la: Int

    try {
      enterOuterAlt(_localctx, 1)
      this.state = 109
      identifier()

      this.state = 110
      match(Tokens.T__27)

      this.state = 112
      errorHandler.sync(this)
      _la = _input.LA(1)

      if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 4575657493346129968L) != 0L)) {
        this.state = 111
        paramList()
      }
      this.state = 114
      match(Tokens.T__28)
    } catch (re: RecognitionException) {
      _localctx.exception = re
      errorHandler.reportError(this, re)
      errorHandler.recover(this, re)
    } finally {
      exitRule()
    }

    return _localctx
  }

  public open class ParamListContext : ParserRuleContext {
    override val ruleIndex: Int = Rules.ParamList

    public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)

    public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)

    public constructor(
      parent: ParserRuleContext?,
      invokingState: Int,
    ) : super(parent, invokingState) {}

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterParamList(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitParamList(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitParamList(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public fun paramList(): ParamListContext {
    var _localctx = ParamListContext(context, state)
    var _token: Token?
    var _ctx: RuleContext?

    enterRule(_localctx, 12, Rules.ParamList)
    var _la: Int

    try {
      enterOuterAlt(_localctx, 1)
      this.state = 116
      expression(0)

      this.state = 121
      errorHandler.sync(this)
      _la = _input.LA(1)

      while (_la == Tokens.T__37) {
        this.state = 117
        match(Tokens.T__37)

        this.state = 118
        expression(0)

        this.state = 123
        errorHandler.sync(this)
        _la = _input.LA(1)
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      errorHandler.reportError(this, re)
      errorHandler.recover(this, re)
    } finally {
      exitRule()
    }

    return _localctx
  }

  public open class QuantityContext : ParserRuleContext {
    override val ruleIndex: Int = Rules.Quantity

    public fun NUMBER(): TerminalNode = getToken(Tokens.NUMBER, 0)!!

    public fun unit(): UnitContext? = getRuleContext(UnitContext::class, 0)

    public constructor(
      parent: ParserRuleContext?,
      invokingState: Int,
    ) : super(parent, invokingState) {}

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterQuantity(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitQuantity(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitQuantity(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public fun quantity(): QuantityContext {
    var _localctx = QuantityContext(context, state)
    var _token: Token?
    var _ctx: RuleContext?

    enterRule(_localctx, 14, Rules.Quantity)

    try {
      enterOuterAlt(_localctx, 1)
      this.state = 124
      match(Tokens.NUMBER)

      this.state = 126
      errorHandler.sync(this)

      when (interpreter.adaptivePredict(_input, 9, context)) {
        1 -> {
          this.state = 125
          unit()
        }
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      errorHandler.reportError(this, re)
      errorHandler.recover(this, re)
    } finally {
      exitRule()
    }

    return _localctx
  }

  public open class UnitContext : ParserRuleContext {
    override val ruleIndex: Int = Rules.Unit

    public fun dateTimePrecision(): DateTimePrecisionContext? =
      getRuleContext(DateTimePrecisionContext::class, 0)

    public fun pluralDateTimePrecision(): PluralDateTimePrecisionContext? =
      getRuleContext(PluralDateTimePrecisionContext::class, 0)

    public fun STRING(): TerminalNode? = getToken(Tokens.STRING, 0)

    public constructor(
      parent: ParserRuleContext?,
      invokingState: Int,
    ) : super(parent, invokingState) {}

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterUnit(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitUnit(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitUnit(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public fun unit(): UnitContext {
    var _localctx = UnitContext(context, state)
    var _token: Token?
    var _ctx: RuleContext?

    enterRule(_localctx, 16, Rules.Unit)

    try {
      this.state = 131
      errorHandler.sync(this)

      when (_input.LA(1)) {
        Tokens.T__38,
        Tokens.T__39,
        Tokens.T__40,
        Tokens.T__41,
        Tokens.T__42,
        Tokens.T__43,
        Tokens.T__44,
        Tokens.T__45 -> /*LL1AltBlock*/ {
          enterOuterAlt(_localctx, 1)
          this.state = 128
          dateTimePrecision()
        }
        Tokens.T__46,
        Tokens.T__47,
        Tokens.T__48,
        Tokens.T__49,
        Tokens.T__50,
        Tokens.T__51,
        Tokens.T__52,
        Tokens.T__53 -> /*LL1AltBlock*/ {
          enterOuterAlt(_localctx, 2)
          this.state = 129
          pluralDateTimePrecision()
        }
        Tokens.STRING -> /*LL1AltBlock*/ {
          enterOuterAlt(_localctx, 3)
          this.state = 130
          match(Tokens.STRING)
        }
        else -> throw NoViableAltException(this)
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      errorHandler.reportError(this, re)
      errorHandler.recover(this, re)
    } finally {
      exitRule()
    }

    return _localctx
  }

  public open class DateTimePrecisionContext : ParserRuleContext {
    override val ruleIndex: Int = Rules.DateTimePrecision

    public constructor(
      parent: ParserRuleContext?,
      invokingState: Int,
    ) : super(parent, invokingState) {}

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterDateTimePrecision(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitDateTimePrecision(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitDateTimePrecision(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public fun dateTimePrecision(): DateTimePrecisionContext {
    var _localctx = DateTimePrecisionContext(context, state)
    var _token: Token?
    var _ctx: RuleContext?

    enterRule(_localctx, 18, Rules.DateTimePrecision)
    var _la: Int

    try {
      enterOuterAlt(_localctx, 1)
      this.state = 133
      _la = _input.LA(1)

      if (!((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 140187732541440L) != 0L))) {
        errorHandler.recoverInline(this)
      } else {
        if (_input.LA(1) == Tokens.EOF) {
          isMatchedEOF = true
        }

        errorHandler.reportMatch(this)
        consume()
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      errorHandler.reportError(this, re)
      errorHandler.recover(this, re)
    } finally {
      exitRule()
    }

    return _localctx
  }

  public open class PluralDateTimePrecisionContext : ParserRuleContext {
    override val ruleIndex: Int = Rules.PluralDateTimePrecision

    public constructor(
      parent: ParserRuleContext?,
      invokingState: Int,
    ) : super(parent, invokingState) {}

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterPluralDateTimePrecision(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitPluralDateTimePrecision(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitPluralDateTimePrecision(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public fun pluralDateTimePrecision(): PluralDateTimePrecisionContext {
    var _localctx = PluralDateTimePrecisionContext(context, state)
    var _token: Token?
    var _ctx: RuleContext?

    enterRule(_localctx, 20, Rules.PluralDateTimePrecision)
    var _la: Int

    try {
      enterOuterAlt(_localctx, 1)
      this.state = 135
      _la = _input.LA(1)

      if (!((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 35888059530608640L) != 0L))) {
        errorHandler.recoverInline(this)
      } else {
        if (_input.LA(1) == Tokens.EOF) {
          isMatchedEOF = true
        }

        errorHandler.reportMatch(this)
        consume()
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      errorHandler.reportError(this, re)
      errorHandler.recover(this, re)
    } finally {
      exitRule()
    }

    return _localctx
  }

  public open class TypeSpecifierContext : ParserRuleContext {
    override val ruleIndex: Int = Rules.TypeSpecifier

    public fun qualifiedIdentifier(): QualifiedIdentifierContext =
      getRuleContext(QualifiedIdentifierContext::class, 0)!!

    public constructor(
      parent: ParserRuleContext?,
      invokingState: Int,
    ) : super(parent, invokingState) {}

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterTypeSpecifier(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitTypeSpecifier(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitTypeSpecifier(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public fun typeSpecifier(): TypeSpecifierContext {
    var _localctx = TypeSpecifierContext(context, state)
    var _token: Token?
    var _ctx: RuleContext?

    enterRule(_localctx, 22, Rules.TypeSpecifier)

    try {
      enterOuterAlt(_localctx, 1)
      this.state = 137
      qualifiedIdentifier()
    } catch (re: RecognitionException) {
      _localctx.exception = re
      errorHandler.reportError(this, re)
      errorHandler.recover(this, re)
    } finally {
      exitRule()
    }

    return _localctx
  }

  public open class QualifiedIdentifierContext : ParserRuleContext {
    override val ruleIndex: Int = Rules.QualifiedIdentifier

    public fun identifier(): List<IdentifierContext> = getRuleContexts(IdentifierContext::class)

    public fun identifier(i: Int): IdentifierContext? = getRuleContext(IdentifierContext::class, i)

    public constructor(
      parent: ParserRuleContext?,
      invokingState: Int,
    ) : super(parent, invokingState) {}

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterQualifiedIdentifier(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitQualifiedIdentifier(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitQualifiedIdentifier(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public fun qualifiedIdentifier(): QualifiedIdentifierContext {
    var _localctx = QualifiedIdentifierContext(context, state)
    var _token: Token?
    var _ctx: RuleContext?

    enterRule(_localctx, 24, Rules.QualifiedIdentifier)

    try {
      var _alt: Int
      enterOuterAlt(_localctx, 1)
      this.state = 139
      identifier()

      this.state = 144
      errorHandler.sync(this)
      _alt = interpreter.adaptivePredict(_input, 11, context)

      while (_alt != 2 && _alt != INVALID_ALT_NUMBER) {
        if (_alt == 1) {
          this.state = 140
          match(Tokens.T__0)

          this.state = 141
          identifier()
        }

        this.state = 146
        errorHandler.sync(this)
        _alt = interpreter.adaptivePredict(_input, 11, context)
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      errorHandler.reportError(this, re)
      errorHandler.recover(this, re)
    } finally {
      exitRule()
    }

    return _localctx
  }

  public open class IdentifierContext : ParserRuleContext {
    override val ruleIndex: Int = Rules.Identifier

    public fun IDENTIFIER(): TerminalNode? = getToken(Tokens.IDENTIFIER, 0)

    public fun DELIMITEDIDENTIFIER(): TerminalNode? = getToken(Tokens.DELIMITEDIDENTIFIER, 0)

    public constructor(
      parent: ParserRuleContext?,
      invokingState: Int,
    ) : super(parent, invokingState) {}

    override fun enterRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.enterIdentifier(this)
      }
    }

    override fun exitRule(listener: ParseTreeListener) {
      if (listener is fhirpathListener) {
        listener.exitIdentifier(this)
      }
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
      return if (visitor is fhirpathVisitor) {
        visitor.visitIdentifier(this)
      } else {
        visitor.visitChildren(this)
      }
    }
  }

  public fun identifier(): IdentifierContext {
    var _localctx = IdentifierContext(context, state)
    var _token: Token?
    var _ctx: RuleContext?

    enterRule(_localctx, 26, Rules.Identifier)
    var _la: Int

    try {
      enterOuterAlt(_localctx, 1)
      this.state = 147
      _la = _input.LA(1)

      if (!((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 864691128467724288L) != 0L))) {
        errorHandler.recoverInline(this)
      } else {
        if (_input.LA(1) == Tokens.EOF) {
          isMatchedEOF = true
        }

        errorHandler.reportMatch(this)
        consume()
      }
    } catch (re: RecognitionException) {
      _localctx.exception = re
      errorHandler.reportError(this, re)
      errorHandler.recover(this, re)
    } finally {
      exitRule()
    }

    return _localctx
  }

  override fun sempred(_localctx: RuleContext?, ruleIndex: Int, predIndex: Int): Boolean {
    when (ruleIndex) {
      0 -> return expression_sempred(_localctx as ExpressionContext?, predIndex)
    }

    return true
  }

  @Suppress("UNSAFE_CALL")
  private fun expression_sempred(_localctx: ExpressionContext?, predIndex: Int): Boolean {
    when (predIndex) {
      0 -> return (precpred(context!!, 10))
      1 -> return (precpred(context!!, 9))
      2 -> return (precpred(context!!, 7))
      3 -> return (precpred(context!!, 6))
      4 -> return (precpred(context!!, 5))
      5 -> return (precpred(context!!, 4))
      6 -> return (precpred(context!!, 3))
      7 -> return (precpred(context!!, 2))
      8 -> return (precpred(context!!, 1))
      9 -> return (precpred(context!!, 13))
      10 -> return (precpred(context!!, 12))
      11 -> return (precpred(context!!, 8))
    }

    return true
  }
}
