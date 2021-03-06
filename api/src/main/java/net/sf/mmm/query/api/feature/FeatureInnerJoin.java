/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.query.api.feature;

import java.util.Collection;

import net.sf.mmm.query.api.path.CollectionPath;
import net.sf.mmm.query.api.path.EntityAlias;

/**
 * {@link StatementFeature} for a {@link net.sf.mmm.query.api.statement.Statement} with support for
 * {@link #innerJoin(CollectionPath, EntityAlias) INNER JOIN} block.
 *
 * @param <SELF> the generic type of this query itself (this) for fluent API calls.
 *
 * @author hohwille
 * @since 8.5.0
 */
public abstract interface FeatureInnerJoin<SELF extends FeatureInnerJoin<SELF>> extends StatementFeature {

  /**
   * @param <E> the generic type of the {@link Collection}-{@link Collection#contains(Object) elements}.
   * @param path the {@link CollectionPath} to join.
   * @param alias the {@link EntityAlias}.
   * @return this query instance for fluent API calls.
   */
  <E> SELF innerJoin(CollectionPath<?, E> path, EntityAlias<E> alias);

}
