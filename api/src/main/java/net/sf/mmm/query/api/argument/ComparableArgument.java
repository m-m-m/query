/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.query.api.argument;

import net.sf.mmm.query.api.expression.Expression;

/**
 * Extends {@link Argument} to build an {@link Expression} for {@link Comparable} value(s).
 *
 * @param <V> the generic type of the value to check by the {@link Expression} to build.
 *
 * @author hohwille
 * @since 8.5.0
 */
public interface ComparableArgument<V extends Comparable<?>> extends Argument<V> {

}
