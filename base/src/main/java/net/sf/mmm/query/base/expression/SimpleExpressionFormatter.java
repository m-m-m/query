/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.query.base.expression;

import net.sf.mmm.query.api.expression.ExpressionFormatter;

/**
 * A simple implementation of {@link ExpressionFormatter}.
 *
 * @author hohwille
 * @since 8.5.0
 */
public class SimpleExpressionFormatter implements ExpressionFormatter {

  private final StringBuilder buffer;

  /**
   * The constructor.
   */
  public SimpleExpressionFormatter() {
    super();
    this.buffer = new StringBuilder(64);
  }

  @Override
  public StringBuilder getBuffer() {

    return this.buffer;
  }

  @Override
  public boolean isResolveNegativeConjunctions() {

    return true;
  }

  @Override
  public String toString() {

    return this.buffer.toString();
  }

}
