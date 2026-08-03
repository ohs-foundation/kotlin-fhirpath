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

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/** This interface defines a complete listener for a parse tree produced by [fhirpathParser]. */
public interface fhirpathListener : ParseTreeListener {
  /**
   * Enter a parse tree produced by the `indexerExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun enterIndexerExpression(ctx: fhirpathParser.IndexerExpressionContext)

  /**
   * Exit a parse tree produced by the `indexerExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun exitIndexerExpression(ctx: fhirpathParser.IndexerExpressionContext)

  /**
   * Enter a parse tree produced by the `polarityExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun enterPolarityExpression(ctx: fhirpathParser.PolarityExpressionContext)

  /**
   * Exit a parse tree produced by the `polarityExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun exitPolarityExpression(ctx: fhirpathParser.PolarityExpressionContext)

  /**
   * Enter a parse tree produced by the `additiveExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun enterAdditiveExpression(ctx: fhirpathParser.AdditiveExpressionContext)

  /**
   * Exit a parse tree produced by the `additiveExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun exitAdditiveExpression(ctx: fhirpathParser.AdditiveExpressionContext)

  /**
   * Enter a parse tree produced by the `multiplicativeExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun enterMultiplicativeExpression(ctx: fhirpathParser.MultiplicativeExpressionContext)

  /**
   * Exit a parse tree produced by the `multiplicativeExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun exitMultiplicativeExpression(ctx: fhirpathParser.MultiplicativeExpressionContext)

  /**
   * Enter a parse tree produced by the `unionExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun enterUnionExpression(ctx: fhirpathParser.UnionExpressionContext)

  /**
   * Exit a parse tree produced by the `unionExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun exitUnionExpression(ctx: fhirpathParser.UnionExpressionContext)

  /**
   * Enter a parse tree produced by the `orExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun enterOrExpression(ctx: fhirpathParser.OrExpressionContext)

  /**
   * Exit a parse tree produced by the `orExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun exitOrExpression(ctx: fhirpathParser.OrExpressionContext)

  /**
   * Enter a parse tree produced by the `andExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun enterAndExpression(ctx: fhirpathParser.AndExpressionContext)

  /**
   * Exit a parse tree produced by the `andExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun exitAndExpression(ctx: fhirpathParser.AndExpressionContext)

  /**
   * Enter a parse tree produced by the `membershipExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun enterMembershipExpression(ctx: fhirpathParser.MembershipExpressionContext)

  /**
   * Exit a parse tree produced by the `membershipExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun exitMembershipExpression(ctx: fhirpathParser.MembershipExpressionContext)

  /**
   * Enter a parse tree produced by the `inequalityExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun enterInequalityExpression(ctx: fhirpathParser.InequalityExpressionContext)

  /**
   * Exit a parse tree produced by the `inequalityExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun exitInequalityExpression(ctx: fhirpathParser.InequalityExpressionContext)

  /**
   * Enter a parse tree produced by the `invocationExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun enterInvocationExpression(ctx: fhirpathParser.InvocationExpressionContext)

  /**
   * Exit a parse tree produced by the `invocationExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun exitInvocationExpression(ctx: fhirpathParser.InvocationExpressionContext)

  /**
   * Enter a parse tree produced by the `equalityExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun enterEqualityExpression(ctx: fhirpathParser.EqualityExpressionContext)

  /**
   * Exit a parse tree produced by the `equalityExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun exitEqualityExpression(ctx: fhirpathParser.EqualityExpressionContext)

  /**
   * Enter a parse tree produced by the `impliesExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun enterImpliesExpression(ctx: fhirpathParser.ImpliesExpressionContext)

  /**
   * Exit a parse tree produced by the `impliesExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun exitImpliesExpression(ctx: fhirpathParser.ImpliesExpressionContext)

  /**
   * Enter a parse tree produced by the `termExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun enterTermExpression(ctx: fhirpathParser.TermExpressionContext)

  /**
   * Exit a parse tree produced by the `termExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun exitTermExpression(ctx: fhirpathParser.TermExpressionContext)

  /**
   * Enter a parse tree produced by the `typeExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun enterTypeExpression(ctx: fhirpathParser.TypeExpressionContext)

  /**
   * Exit a parse tree produced by the `typeExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   */
  public fun exitTypeExpression(ctx: fhirpathParser.TypeExpressionContext)

  /**
   * Enter a parse tree produced by the `invocationTerm` labeled alternative in
   * [fhirpathParser.term].
   *
   * @param ctx The parse tree
   */
  public fun enterInvocationTerm(ctx: fhirpathParser.InvocationTermContext)

  /**
   * Exit a parse tree produced by the `invocationTerm` labeled alternative in
   * [fhirpathParser.term].
   *
   * @param ctx The parse tree
   */
  public fun exitInvocationTerm(ctx: fhirpathParser.InvocationTermContext)

  /**
   * Enter a parse tree produced by the `literalTerm` labeled alternative in [fhirpathParser.term].
   *
   * @param ctx The parse tree
   */
  public fun enterLiteralTerm(ctx: fhirpathParser.LiteralTermContext)

  /**
   * Exit a parse tree produced by the `literalTerm` labeled alternative in [fhirpathParser.term].
   *
   * @param ctx The parse tree
   */
  public fun exitLiteralTerm(ctx: fhirpathParser.LiteralTermContext)

  /**
   * Enter a parse tree produced by the `externalConstantTerm` labeled alternative in
   * [fhirpathParser.term].
   *
   * @param ctx The parse tree
   */
  public fun enterExternalConstantTerm(ctx: fhirpathParser.ExternalConstantTermContext)

  /**
   * Exit a parse tree produced by the `externalConstantTerm` labeled alternative in
   * [fhirpathParser.term].
   *
   * @param ctx The parse tree
   */
  public fun exitExternalConstantTerm(ctx: fhirpathParser.ExternalConstantTermContext)

  /**
   * Enter a parse tree produced by the `parenthesizedTerm` labeled alternative in
   * [fhirpathParser.term].
   *
   * @param ctx The parse tree
   */
  public fun enterParenthesizedTerm(ctx: fhirpathParser.ParenthesizedTermContext)

  /**
   * Exit a parse tree produced by the `parenthesizedTerm` labeled alternative in
   * [fhirpathParser.term].
   *
   * @param ctx The parse tree
   */
  public fun exitParenthesizedTerm(ctx: fhirpathParser.ParenthesizedTermContext)

  /**
   * Enter a parse tree produced by the `nullLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun enterNullLiteral(ctx: fhirpathParser.NullLiteralContext)

  /**
   * Exit a parse tree produced by the `nullLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun exitNullLiteral(ctx: fhirpathParser.NullLiteralContext)

  /**
   * Enter a parse tree produced by the `booleanLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun enterBooleanLiteral(ctx: fhirpathParser.BooleanLiteralContext)

  /**
   * Exit a parse tree produced by the `booleanLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun exitBooleanLiteral(ctx: fhirpathParser.BooleanLiteralContext)

  /**
   * Enter a parse tree produced by the `stringLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun enterStringLiteral(ctx: fhirpathParser.StringLiteralContext)

  /**
   * Exit a parse tree produced by the `stringLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun exitStringLiteral(ctx: fhirpathParser.StringLiteralContext)

  /**
   * Enter a parse tree produced by the `numberLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun enterNumberLiteral(ctx: fhirpathParser.NumberLiteralContext)

  /**
   * Exit a parse tree produced by the `numberLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun exitNumberLiteral(ctx: fhirpathParser.NumberLiteralContext)

  /**
   * Enter a parse tree produced by the `dateLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun enterDateLiteral(ctx: fhirpathParser.DateLiteralContext)

  /**
   * Exit a parse tree produced by the `dateLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun exitDateLiteral(ctx: fhirpathParser.DateLiteralContext)

  /**
   * Enter a parse tree produced by the `dateTimeLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun enterDateTimeLiteral(ctx: fhirpathParser.DateTimeLiteralContext)

  /**
   * Exit a parse tree produced by the `dateTimeLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun exitDateTimeLiteral(ctx: fhirpathParser.DateTimeLiteralContext)

  /**
   * Enter a parse tree produced by the `timeLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun enterTimeLiteral(ctx: fhirpathParser.TimeLiteralContext)

  /**
   * Exit a parse tree produced by the `timeLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun exitTimeLiteral(ctx: fhirpathParser.TimeLiteralContext)

  /**
   * Enter a parse tree produced by the `quantityLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun enterQuantityLiteral(ctx: fhirpathParser.QuantityLiteralContext)

  /**
   * Exit a parse tree produced by the `quantityLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   */
  public fun exitQuantityLiteral(ctx: fhirpathParser.QuantityLiteralContext)

  /**
   * Enter a parse tree produced by [fhirpathParser.externalConstant].
   *
   * @param ctx The parse tree
   */
  public fun enterExternalConstant(ctx: fhirpathParser.ExternalConstantContext)

  /**
   * Exit a parse tree produced by [fhirpathParser.externalConstant].
   *
   * @param ctx The parse tree
   */
  public fun exitExternalConstant(ctx: fhirpathParser.ExternalConstantContext)

  /**
   * Enter a parse tree produced by the `memberInvocation` labeled alternative in
   * [fhirpathParser.invocation].
   *
   * @param ctx The parse tree
   */
  public fun enterMemberInvocation(ctx: fhirpathParser.MemberInvocationContext)

  /**
   * Exit a parse tree produced by the `memberInvocation` labeled alternative in
   * [fhirpathParser.invocation].
   *
   * @param ctx The parse tree
   */
  public fun exitMemberInvocation(ctx: fhirpathParser.MemberInvocationContext)

  /**
   * Enter a parse tree produced by the `functionInvocation` labeled alternative in
   * [fhirpathParser.invocation].
   *
   * @param ctx The parse tree
   */
  public fun enterFunctionInvocation(ctx: fhirpathParser.FunctionInvocationContext)

  /**
   * Exit a parse tree produced by the `functionInvocation` labeled alternative in
   * [fhirpathParser.invocation].
   *
   * @param ctx The parse tree
   */
  public fun exitFunctionInvocation(ctx: fhirpathParser.FunctionInvocationContext)

  /**
   * Enter a parse tree produced by the `thisInvocation` labeled alternative in
   * [fhirpathParser.invocation].
   *
   * @param ctx The parse tree
   */
  public fun enterThisInvocation(ctx: fhirpathParser.ThisInvocationContext)

  /**
   * Exit a parse tree produced by the `thisInvocation` labeled alternative in
   * [fhirpathParser.invocation].
   *
   * @param ctx The parse tree
   */
  public fun exitThisInvocation(ctx: fhirpathParser.ThisInvocationContext)

  /**
   * Enter a parse tree produced by the `indexInvocation` labeled alternative in
   * [fhirpathParser.invocation].
   *
   * @param ctx The parse tree
   */
  public fun enterIndexInvocation(ctx: fhirpathParser.IndexInvocationContext)

  /**
   * Exit a parse tree produced by the `indexInvocation` labeled alternative in
   * [fhirpathParser.invocation].
   *
   * @param ctx The parse tree
   */
  public fun exitIndexInvocation(ctx: fhirpathParser.IndexInvocationContext)

  /**
   * Enter a parse tree produced by the `totalInvocation` labeled alternative in
   * [fhirpathParser.invocation].
   *
   * @param ctx The parse tree
   */
  public fun enterTotalInvocation(ctx: fhirpathParser.TotalInvocationContext)

  /**
   * Exit a parse tree produced by the `totalInvocation` labeled alternative in
   * [fhirpathParser.invocation].
   *
   * @param ctx The parse tree
   */
  public fun exitTotalInvocation(ctx: fhirpathParser.TotalInvocationContext)

  /**
   * Enter a parse tree produced by [fhirpathParser.function].
   *
   * @param ctx The parse tree
   */
  public fun enterFunction(ctx: fhirpathParser.FunctionContext)

  /**
   * Exit a parse tree produced by [fhirpathParser.function].
   *
   * @param ctx The parse tree
   */
  public fun exitFunction(ctx: fhirpathParser.FunctionContext)

  /**
   * Enter a parse tree produced by [fhirpathParser.paramList].
   *
   * @param ctx The parse tree
   */
  public fun enterParamList(ctx: fhirpathParser.ParamListContext)

  /**
   * Exit a parse tree produced by [fhirpathParser.paramList].
   *
   * @param ctx The parse tree
   */
  public fun exitParamList(ctx: fhirpathParser.ParamListContext)

  /**
   * Enter a parse tree produced by [fhirpathParser.quantity].
   *
   * @param ctx The parse tree
   */
  public fun enterQuantity(ctx: fhirpathParser.QuantityContext)

  /**
   * Exit a parse tree produced by [fhirpathParser.quantity].
   *
   * @param ctx The parse tree
   */
  public fun exitQuantity(ctx: fhirpathParser.QuantityContext)

  /**
   * Enter a parse tree produced by [fhirpathParser.unit].
   *
   * @param ctx The parse tree
   */
  public fun enterUnit(ctx: fhirpathParser.UnitContext)

  /**
   * Exit a parse tree produced by [fhirpathParser.unit].
   *
   * @param ctx The parse tree
   */
  public fun exitUnit(ctx: fhirpathParser.UnitContext)

  /**
   * Enter a parse tree produced by [fhirpathParser.dateTimePrecision].
   *
   * @param ctx The parse tree
   */
  public fun enterDateTimePrecision(ctx: fhirpathParser.DateTimePrecisionContext)

  /**
   * Exit a parse tree produced by [fhirpathParser.dateTimePrecision].
   *
   * @param ctx The parse tree
   */
  public fun exitDateTimePrecision(ctx: fhirpathParser.DateTimePrecisionContext)

  /**
   * Enter a parse tree produced by [fhirpathParser.pluralDateTimePrecision].
   *
   * @param ctx The parse tree
   */
  public fun enterPluralDateTimePrecision(ctx: fhirpathParser.PluralDateTimePrecisionContext)

  /**
   * Exit a parse tree produced by [fhirpathParser.pluralDateTimePrecision].
   *
   * @param ctx The parse tree
   */
  public fun exitPluralDateTimePrecision(ctx: fhirpathParser.PluralDateTimePrecisionContext)

  /**
   * Enter a parse tree produced by [fhirpathParser.typeSpecifier].
   *
   * @param ctx The parse tree
   */
  public fun enterTypeSpecifier(ctx: fhirpathParser.TypeSpecifierContext)

  /**
   * Exit a parse tree produced by [fhirpathParser.typeSpecifier].
   *
   * @param ctx The parse tree
   */
  public fun exitTypeSpecifier(ctx: fhirpathParser.TypeSpecifierContext)

  /**
   * Enter a parse tree produced by [fhirpathParser.qualifiedIdentifier].
   *
   * @param ctx The parse tree
   */
  public fun enterQualifiedIdentifier(ctx: fhirpathParser.QualifiedIdentifierContext)

  /**
   * Exit a parse tree produced by [fhirpathParser.qualifiedIdentifier].
   *
   * @param ctx The parse tree
   */
  public fun exitQualifiedIdentifier(ctx: fhirpathParser.QualifiedIdentifierContext)

  /**
   * Enter a parse tree produced by [fhirpathParser.identifier].
   *
   * @param ctx The parse tree
   */
  public fun enterIdentifier(ctx: fhirpathParser.IdentifierContext)

  /**
   * Exit a parse tree produced by [fhirpathParser.identifier].
   *
   * @param ctx The parse tree
   */
  public fun exitIdentifier(ctx: fhirpathParser.IdentifierContext)
}
