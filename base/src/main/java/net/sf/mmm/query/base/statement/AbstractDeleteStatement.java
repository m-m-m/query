/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.query.base.statement;

import net.sf.mmm.query.api.expression.Expression;
import net.sf.mmm.query.api.path.EntityAlias;
import net.sf.mmm.query.api.statement.DeleteStatement;
import net.sf.mmm.query.api.statement.SqlDialect;
import net.sf.mmm.query.base.feature.FeaturePagingImpl;
import net.sf.mmm.query.base.feature.FeatureWhereImpl;

/**
 * This is the abstract base-implementation of {@link DeleteStatement}.
 *
 * @param <E> the generic type of the queried object (typically a {@link net.sf.mmm.bean.api.Bean}).
 * @param <SELF> the generic type of this query itself (this) for fluent API calls.
 *
 * @author hohwille
 * @since 8.5.0
 */
public abstract class AbstractDeleteStatement<E, SELF extends DeleteStatement<E, SELF>> extends AbstractModifyStatement<E, SELF>
    implements DeleteStatement<E, SELF> {

  /**
   * The constructor.
   *
   * @param dialect - see {@link #getDialect()}.
   * @param alias - see {@link #getAlias()}.
   */
  public AbstractDeleteStatement(SqlDialect dialect, EntityAlias<E> alias) {

    super(dialect, alias);
  }

  @Override
  public SELF where(Expression... expressions) {

    feature(FeatureWhereImpl.class).where(expressions);
    return self();
  }

  @Override
  public SELF limit(int limit) {

    feature(FeaturePagingImpl.class).limit(limit);
    return self();
  }

  @Override
  protected void buildStart(SqlBuilder builder) {

    builder.getBuffer().append(getDialect().deleteFrom());
    super.buildStart(builder);
  }

}
