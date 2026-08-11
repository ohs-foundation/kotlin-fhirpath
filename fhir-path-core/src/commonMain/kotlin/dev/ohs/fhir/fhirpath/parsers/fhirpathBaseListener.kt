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

import org.antlr.v4.kotlinruntime.ParserRuleContext
import org.antlr.v4.kotlinruntime.tree.ErrorNode
import org.antlr.v4.kotlinruntime.tree.TerminalNode

/**
 * This class provides an empty implementation of [fhirpathListener], which can be extended to
 * create a listener which only needs to handle a subset of the available methods.
 */
public open class fhirpathBaseListener : fhirpathListener {
  /** The default implementation does nothing. */
  override fun enterIndexerExpression(ctx: fhirpathParser.IndexerExpressionContext) {}

  /** The default implementation does nothing. */
  override fun exitIndexerExpression(ctx: fhirpathParser.IndexerExpressionContext) {}

  /** The default implementation does nothing. */
  override fun enterPolarityExpression(ctx: fhirpathParser.PolarityExpressionContext) {}

  /** The default implementation does nothing. */
  override fun exitPolarityExpression(ctx: fhirpathParser.PolarityExpressionContext) {}

  /** The default implementation does nothing. */
  override fun enterAdditiveExpression(ctx: fhirpathParser.AdditiveExpressionContext) {}

  /** The default implementation does nothing. */
  override fun exitAdditiveExpression(ctx: fhirpathParser.AdditiveExpressionContext) {}

  /** The default implementation does nothing. */
  override fun enterMultiplicativeExpression(ctx: fhirpathParser.MultiplicativeExpressionContext) {}

  /** The default implementation does nothing. */
  override fun exitMultiplicativeExpression(ctx: fhirpathParser.MultiplicativeExpressionContext) {}

  /** The default implementation does nothing. */
  override fun enterUnionExpression(ctx: fhirpathParser.UnionExpressionContext) {}

  /** The default implementation does nothing. */
  override fun exitUnionExpression(ctx: fhirpathParser.UnionExpressionContext) {}

  /** The default implementation does nothing. */
  override fun enterOrExpression(ctx: fhirpathParser.OrExpressionContext) {}

  /** The default implementation does nothing. */
  override fun exitOrExpression(ctx: fhirpathParser.OrExpressionContext) {}

  /** The default implementation does nothing. */
  override fun enterAndExpression(ctx: fhirpathParser.AndExpressionContext) {}

  /** The default implementation does nothing. */
  override fun exitAndExpression(ctx: fhirpathParser.AndExpressionContext) {}

  /** The default implementation does nothing. */
  override fun enterMembershipExpression(ctx: fhirpathParser.MembershipExpressionContext) {}

  /** The default implementation does nothing. */
  override fun exitMembershipExpression(ctx: fhirpathParser.MembershipExpressionContext) {}

  /** The default implementation does nothing. */
  override fun enterInequalityExpression(ctx: fhirpathParser.InequalityExpressionContext) {}

  /** The default implementation does nothing. */
  override fun exitInequalityExpression(ctx: fhirpathParser.InequalityExpressionContext) {}

  /** The default implementation does nothing. */
  override fun enterInvocationExpression(ctx: fhirpathParser.InvocationExpressionContext) {}

  /** The default implementation does nothing. */
  override fun exitInvocationExpression(ctx: fhirpathParser.InvocationExpressionContext) {}

  /** The default implementation does nothing. */
  override fun enterEqualityExpression(ctx: fhirpathParser.EqualityExpressionContext) {}

  /** The default implementation does nothing. */
  override fun exitEqualityExpression(ctx: fhirpathParser.EqualityExpressionContext) {}

  /** The default implementation does nothing. */
  override fun enterImpliesExpression(ctx: fhirpathParser.ImpliesExpressionContext) {}

  /** The default implementation does nothing. */
  override fun exitImpliesExpression(ctx: fhirpathParser.ImpliesExpressionContext) {}

  /** The default implementation does nothing. */
  override fun enterTermExpression(ctx: fhirpathParser.TermExpressionContext) {}

  /** The default implementation does nothing. */
  override fun exitTermExpression(ctx: fhirpathParser.TermExpressionContext) {}

  /** The default implementation does nothing. */
  override fun enterTypeExpression(ctx: fhirpathParser.TypeExpressionContext) {}

  /** The default implementation does nothing. */
  override fun exitTypeExpression(ctx: fhirpathParser.TypeExpressionContext) {}

  /** The default implementation does nothing. */
  override fun enterInvocationTerm(ctx: fhirpathParser.InvocationTermContext) {}

  /** The default implementation does nothing. */
  override fun exitInvocationTerm(ctx: fhirpathParser.InvocationTermContext) {}

  /** The default implementation does nothing. */
  override fun enterLiteralTerm(ctx: fhirpathParser.LiteralTermContext) {}

  /** The default implementation does nothing. */
  override fun exitLiteralTerm(ctx: fhirpathParser.LiteralTermContext) {}

  /** The default implementation does nothing. */
  override fun enterExternalConstantTerm(ctx: fhirpathParser.ExternalConstantTermContext) {}

  /** The default implementation does nothing. */
  override fun exitExternalConstantTerm(ctx: fhirpathParser.ExternalConstantTermContext) {}

  /** The default implementation does nothing. */
  override fun enterParenthesizedTerm(ctx: fhirpathParser.ParenthesizedTermContext) {}

  /** The default implementation does nothing. */
  override fun exitParenthesizedTerm(ctx: fhirpathParser.ParenthesizedTermContext) {}

  /** The default implementation does nothing. */
  override fun enterNullLiteral(ctx: fhirpathParser.NullLiteralContext) {}

  /** The default implementation does nothing. */
  override fun exitNullLiteral(ctx: fhirpathParser.NullLiteralContext) {}

  /** The default implementation does nothing. */
  override fun enterBooleanLiteral(ctx: fhirpathParser.BooleanLiteralContext) {}

  /** The default implementation does nothing. */
  override fun exitBooleanLiteral(ctx: fhirpathParser.BooleanLiteralContext) {}

  /** The default implementation does nothing. */
  override fun enterStringLiteral(ctx: fhirpathParser.StringLiteralContext) {}

  /** The default implementation does nothing. */
  override fun exitStringLiteral(ctx: fhirpathParser.StringLiteralContext) {}

  /** The default implementation does nothing. */
  override fun enterNumberLiteral(ctx: fhirpathParser.NumberLiteralContext) {}

  /** The default implementation does nothing. */
  override fun exitNumberLiteral(ctx: fhirpathParser.NumberLiteralContext) {}

  /** The default implementation does nothing. */
  override fun enterDateLiteral(ctx: fhirpathParser.DateLiteralContext) {}

  /** The default implementation does nothing. */
  override fun exitDateLiteral(ctx: fhirpathParser.DateLiteralContext) {}

  /** The default implementation does nothing. */
  override fun enterDateTimeLiteral(ctx: fhirpathParser.DateTimeLiteralContext) {}

  /** The default implementation does nothing. */
  override fun exitDateTimeLiteral(ctx: fhirpathParser.DateTimeLiteralContext) {}

  /** The default implementation does nothing. */
  override fun enterTimeLiteral(ctx: fhirpathParser.TimeLiteralContext) {}

  /** The default implementation does nothing. */
  override fun exitTimeLiteral(ctx: fhirpathParser.TimeLiteralContext) {}

  /** The default implementation does nothing. */
  override fun enterQuantityLiteral(ctx: fhirpathParser.QuantityLiteralContext) {}

  /** The default implementation does nothing. */
  override fun exitQuantityLiteral(ctx: fhirpathParser.QuantityLiteralContext) {}

  /** The default implementation does nothing. */
  override fun enterExternalConstant(ctx: fhirpathParser.ExternalConstantContext) {}

  /** The default implementation does nothing. */
  override fun exitExternalConstant(ctx: fhirpathParser.ExternalConstantContext) {}

  /** The default implementation does nothing. */
  override fun enterMemberInvocation(ctx: fhirpathParser.MemberInvocationContext) {}

  /** The default implementation does nothing. */
  override fun exitMemberInvocation(ctx: fhirpathParser.MemberInvocationContext) {}

  /** The default implementation does nothing. */
  override fun enterFunctionInvocation(ctx: fhirpathParser.FunctionInvocationContext) {}

  /** The default implementation does nothing. */
  override fun exitFunctionInvocation(ctx: fhirpathParser.FunctionInvocationContext) {}

  /** The default implementation does nothing. */
  override fun enterThisInvocation(ctx: fhirpathParser.ThisInvocationContext) {}

  /** The default implementation does nothing. */
  override fun exitThisInvocation(ctx: fhirpathParser.ThisInvocationContext) {}

  /** The default implementation does nothing. */
  override fun enterIndexInvocation(ctx: fhirpathParser.IndexInvocationContext) {}

  /** The default implementation does nothing. */
  override fun exitIndexInvocation(ctx: fhirpathParser.IndexInvocationContext) {}

  /** The default implementation does nothing. */
  override fun enterTotalInvocation(ctx: fhirpathParser.TotalInvocationContext) {}

  /** The default implementation does nothing. */
  override fun exitTotalInvocation(ctx: fhirpathParser.TotalInvocationContext) {}

  /** The default implementation does nothing. */
  override fun enterFunction(ctx: fhirpathParser.FunctionContext) {}

  /** The default implementation does nothing. */
  override fun exitFunction(ctx: fhirpathParser.FunctionContext) {}

  /** The default implementation does nothing. */
  override fun enterParamList(ctx: fhirpathParser.ParamListContext) {}

  /** The default implementation does nothing. */
  override fun exitParamList(ctx: fhirpathParser.ParamListContext) {}

  /** The default implementation does nothing. */
  override fun enterQuantity(ctx: fhirpathParser.QuantityContext) {}

  /** The default implementation does nothing. */
  override fun exitQuantity(ctx: fhirpathParser.QuantityContext) {}

  /** The default implementation does nothing. */
  override fun enterUnit(ctx: fhirpathParser.UnitContext) {}

  /** The default implementation does nothing. */
  override fun exitUnit(ctx: fhirpathParser.UnitContext) {}

  /** The default implementation does nothing. */
  override fun enterDateTimePrecision(ctx: fhirpathParser.DateTimePrecisionContext) {}

  /** The default implementation does nothing. */
  override fun exitDateTimePrecision(ctx: fhirpathParser.DateTimePrecisionContext) {}

  /** The default implementation does nothing. */
  override fun enterPluralDateTimePrecision(ctx: fhirpathParser.PluralDateTimePrecisionContext) {}

  /** The default implementation does nothing. */
  override fun exitPluralDateTimePrecision(ctx: fhirpathParser.PluralDateTimePrecisionContext) {}

  /** The default implementation does nothing. */
  override fun enterTypeSpecifier(ctx: fhirpathParser.TypeSpecifierContext) {}

  /** The default implementation does nothing. */
  override fun exitTypeSpecifier(ctx: fhirpathParser.TypeSpecifierContext) {}

  /** The default implementation does nothing. */
  override fun enterQualifiedIdentifier(ctx: fhirpathParser.QualifiedIdentifierContext) {}

  /** The default implementation does nothing. */
  override fun exitQualifiedIdentifier(ctx: fhirpathParser.QualifiedIdentifierContext) {}

  /** The default implementation does nothing. */
  override fun enterIdentifier(ctx: fhirpathParser.IdentifierContext) {}

  /** The default implementation does nothing. */
  override fun exitIdentifier(ctx: fhirpathParser.IdentifierContext) {}

  /** The default implementation does nothing. */
  override fun enterEveryRule(ctx: ParserRuleContext) {}

  /** The default implementation does nothing. */
  override fun exitEveryRule(ctx: ParserRuleContext) {}

  /** The default implementation does nothing. */
  override fun visitTerminal(node: TerminalNode) {}

  /** The default implementation does nothing. */
  override fun visitErrorNode(node: ErrorNode) {}
}
