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

import org.antlr.v4.kotlinruntime.tree.AbstractParseTreeVisitor

/**
 * This class provides an empty implementation of [fhirpathVisitor], which can be extended to create
 * a visitor which only needs to handle a subset of the available methods.
 *
 * @param T The return type of the visit operation. Use [Unit] for operations with no return type
 */
public abstract class fhirpathBaseVisitor<T> : AbstractParseTreeVisitor<T>(), fhirpathVisitor<T> {
  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitIndexerExpression(ctx: fhirpathParser.IndexerExpressionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitPolarityExpression(ctx: fhirpathParser.PolarityExpressionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitAdditiveExpression(ctx: fhirpathParser.AdditiveExpressionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitMultiplicativeExpression(
    ctx: fhirpathParser.MultiplicativeExpressionContext
  ): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitUnionExpression(ctx: fhirpathParser.UnionExpressionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitOrExpression(ctx: fhirpathParser.OrExpressionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitAndExpression(ctx: fhirpathParser.AndExpressionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitMembershipExpression(ctx: fhirpathParser.MembershipExpressionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitInequalityExpression(ctx: fhirpathParser.InequalityExpressionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitInvocationExpression(ctx: fhirpathParser.InvocationExpressionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitEqualityExpression(ctx: fhirpathParser.EqualityExpressionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitImpliesExpression(ctx: fhirpathParser.ImpliesExpressionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitTermExpression(ctx: fhirpathParser.TermExpressionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitTypeExpression(ctx: fhirpathParser.TypeExpressionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitInvocationTerm(ctx: fhirpathParser.InvocationTermContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitLiteralTerm(ctx: fhirpathParser.LiteralTermContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitExternalConstantTerm(ctx: fhirpathParser.ExternalConstantTermContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitParenthesizedTerm(ctx: fhirpathParser.ParenthesizedTermContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitNullLiteral(ctx: fhirpathParser.NullLiteralContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitBooleanLiteral(ctx: fhirpathParser.BooleanLiteralContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitStringLiteral(ctx: fhirpathParser.StringLiteralContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitNumberLiteral(ctx: fhirpathParser.NumberLiteralContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitDateLiteral(ctx: fhirpathParser.DateLiteralContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitDateTimeLiteral(ctx: fhirpathParser.DateTimeLiteralContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitTimeLiteral(ctx: fhirpathParser.TimeLiteralContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitQuantityLiteral(ctx: fhirpathParser.QuantityLiteralContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitExternalConstant(ctx: fhirpathParser.ExternalConstantContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitMemberInvocation(ctx: fhirpathParser.MemberInvocationContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitFunctionInvocation(ctx: fhirpathParser.FunctionInvocationContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitThisInvocation(ctx: fhirpathParser.ThisInvocationContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitIndexInvocation(ctx: fhirpathParser.IndexInvocationContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitTotalInvocation(ctx: fhirpathParser.TotalInvocationContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitFunction(ctx: fhirpathParser.FunctionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitParamList(ctx: fhirpathParser.ParamListContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitQuantity(ctx: fhirpathParser.QuantityContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitUnit(ctx: fhirpathParser.UnitContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitDateTimePrecision(ctx: fhirpathParser.DateTimePrecisionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitPluralDateTimePrecision(ctx: fhirpathParser.PluralDateTimePrecisionContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitTypeSpecifier(ctx: fhirpathParser.TypeSpecifierContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitQualifiedIdentifier(ctx: fhirpathParser.QualifiedIdentifierContext): T {
    return this.visitChildren(ctx)
  }

  /** The default implementation returns the result of calling [visitChildren] on [ctx]. */
  override fun visitIdentifier(ctx: fhirpathParser.IdentifierContext): T {
    return this.visitChildren(ctx)
  }
}
