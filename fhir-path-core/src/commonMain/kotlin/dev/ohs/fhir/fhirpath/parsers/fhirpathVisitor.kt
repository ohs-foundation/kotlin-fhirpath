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

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced by [fhirpathParser].
 *
 * @param T The return type of the visit operation. Use [Unit] for operations with no return type
 */
public interface fhirpathVisitor<T> : ParseTreeVisitor<T> {
  /**
   * Visit a parse tree produced by the `indexerExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitIndexerExpression(ctx: fhirpathParser.IndexerExpressionContext): T

  /**
   * Visit a parse tree produced by the `polarityExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitPolarityExpression(ctx: fhirpathParser.PolarityExpressionContext): T

  /**
   * Visit a parse tree produced by the `additiveExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitAdditiveExpression(ctx: fhirpathParser.AdditiveExpressionContext): T

  /**
   * Visit a parse tree produced by the `multiplicativeExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitMultiplicativeExpression(ctx: fhirpathParser.MultiplicativeExpressionContext): T

  /**
   * Visit a parse tree produced by the `unionExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitUnionExpression(ctx: fhirpathParser.UnionExpressionContext): T

  /**
   * Visit a parse tree produced by the `orExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitOrExpression(ctx: fhirpathParser.OrExpressionContext): T

  /**
   * Visit a parse tree produced by the `andExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitAndExpression(ctx: fhirpathParser.AndExpressionContext): T

  /**
   * Visit a parse tree produced by the `membershipExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitMembershipExpression(ctx: fhirpathParser.MembershipExpressionContext): T

  /**
   * Visit a parse tree produced by the `inequalityExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitInequalityExpression(ctx: fhirpathParser.InequalityExpressionContext): T

  /**
   * Visit a parse tree produced by the `invocationExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitInvocationExpression(ctx: fhirpathParser.InvocationExpressionContext): T

  /**
   * Visit a parse tree produced by the `equalityExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitEqualityExpression(ctx: fhirpathParser.EqualityExpressionContext): T

  /**
   * Visit a parse tree produced by the `impliesExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitImpliesExpression(ctx: fhirpathParser.ImpliesExpressionContext): T

  /**
   * Visit a parse tree produced by the `termExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitTermExpression(ctx: fhirpathParser.TermExpressionContext): T

  /**
   * Visit a parse tree produced by the `typeExpression` labeled alternative in
   * [fhirpathParser.expression].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitTypeExpression(ctx: fhirpathParser.TypeExpressionContext): T

  /**
   * Visit a parse tree produced by the `invocationTerm` labeled alternative in
   * [fhirpathParser.term].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitInvocationTerm(ctx: fhirpathParser.InvocationTermContext): T

  /**
   * Visit a parse tree produced by the `literalTerm` labeled alternative in [fhirpathParser.term].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitLiteralTerm(ctx: fhirpathParser.LiteralTermContext): T

  /**
   * Visit a parse tree produced by the `externalConstantTerm` labeled alternative in
   * [fhirpathParser.term].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitExternalConstantTerm(ctx: fhirpathParser.ExternalConstantTermContext): T

  /**
   * Visit a parse tree produced by the `parenthesizedTerm` labeled alternative in
   * [fhirpathParser.term].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitParenthesizedTerm(ctx: fhirpathParser.ParenthesizedTermContext): T

  /**
   * Visit a parse tree produced by the `nullLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitNullLiteral(ctx: fhirpathParser.NullLiteralContext): T

  /**
   * Visit a parse tree produced by the `booleanLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitBooleanLiteral(ctx: fhirpathParser.BooleanLiteralContext): T

  /**
   * Visit a parse tree produced by the `stringLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitStringLiteral(ctx: fhirpathParser.StringLiteralContext): T

  /**
   * Visit a parse tree produced by the `numberLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitNumberLiteral(ctx: fhirpathParser.NumberLiteralContext): T

  /**
   * Visit a parse tree produced by the `dateLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitDateLiteral(ctx: fhirpathParser.DateLiteralContext): T

  /**
   * Visit a parse tree produced by the `dateTimeLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitDateTimeLiteral(ctx: fhirpathParser.DateTimeLiteralContext): T

  /**
   * Visit a parse tree produced by the `timeLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitTimeLiteral(ctx: fhirpathParser.TimeLiteralContext): T

  /**
   * Visit a parse tree produced by the `quantityLiteral` labeled alternative in
   * [fhirpathParser.literal].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitQuantityLiteral(ctx: fhirpathParser.QuantityLiteralContext): T

  /**
   * Visit a parse tree produced by [fhirpathParser.externalConstant].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitExternalConstant(ctx: fhirpathParser.ExternalConstantContext): T

  /**
   * Visit a parse tree produced by the `memberInvocation` labeled alternative in
   * [fhirpathParser.invocation].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitMemberInvocation(ctx: fhirpathParser.MemberInvocationContext): T

  /**
   * Visit a parse tree produced by the `functionInvocation` labeled alternative in
   * [fhirpathParser.invocation].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitFunctionInvocation(ctx: fhirpathParser.FunctionInvocationContext): T

  /**
   * Visit a parse tree produced by the `thisInvocation` labeled alternative in
   * [fhirpathParser.invocation].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitThisInvocation(ctx: fhirpathParser.ThisInvocationContext): T

  /**
   * Visit a parse tree produced by the `indexInvocation` labeled alternative in
   * [fhirpathParser.invocation].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitIndexInvocation(ctx: fhirpathParser.IndexInvocationContext): T

  /**
   * Visit a parse tree produced by the `totalInvocation` labeled alternative in
   * [fhirpathParser.invocation].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitTotalInvocation(ctx: fhirpathParser.TotalInvocationContext): T

  /**
   * Visit a parse tree produced by [fhirpathParser.function].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitFunction(ctx: fhirpathParser.FunctionContext): T

  /**
   * Visit a parse tree produced by [fhirpathParser.paramList].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitParamList(ctx: fhirpathParser.ParamListContext): T

  /**
   * Visit a parse tree produced by [fhirpathParser.quantity].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitQuantity(ctx: fhirpathParser.QuantityContext): T

  /**
   * Visit a parse tree produced by [fhirpathParser.unit].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitUnit(ctx: fhirpathParser.UnitContext): T

  /**
   * Visit a parse tree produced by [fhirpathParser.dateTimePrecision].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitDateTimePrecision(ctx: fhirpathParser.DateTimePrecisionContext): T

  /**
   * Visit a parse tree produced by [fhirpathParser.pluralDateTimePrecision].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitPluralDateTimePrecision(ctx: fhirpathParser.PluralDateTimePrecisionContext): T

  /**
   * Visit a parse tree produced by [fhirpathParser.typeSpecifier].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitTypeSpecifier(ctx: fhirpathParser.TypeSpecifierContext): T

  /**
   * Visit a parse tree produced by [fhirpathParser.qualifiedIdentifier].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitQualifiedIdentifier(ctx: fhirpathParser.QualifiedIdentifierContext): T

  /**
   * Visit a parse tree produced by [fhirpathParser.identifier].
   *
   * @param ctx The parse tree
   * @return The visitor result
   */
  public fun visitIdentifier(ctx: fhirpathParser.IdentifierContext): T
}
