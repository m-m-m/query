/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.query.base.statement;

import java.util.Arrays;
import java.util.List;

import net.sf.mmm.bean.api.Bean;
import net.sf.mmm.query.api.feature.FeatureLimit;
import net.sf.mmm.query.api.feature.FeatureModify;
import net.sf.mmm.query.api.feature.FeatureSet;
import net.sf.mmm.query.api.feature.FeatureWhere;
import net.sf.mmm.query.api.feature.StatementFeature;
import net.sf.mmm.query.api.statement.SqlDialect;
import net.sf.mmm.query.api.statement.UpdateStatement;
import net.sf.mmm.query.base.example.QueryTestPropertyBean;
import net.sf.mmm.query.base.path.Alias;
import net.sf.mmm.query.base.statement.AbstractUpdateStatement;
import net.sf.mmm.query.base.statement.UpdateStatementTest.TestUpdateStatement;

/**
 * Test of {@link UpdateStatement} and {@link AbstractUpdateStatement}.
 *
 * @author hohwille
 */
public class UpdateStatementTest extends AbstractStatementTest<TestUpdateStatement<QueryTestPropertyBean>> {

  @Override
  protected TestUpdateStatement<QueryTestPropertyBean> createStatement(SqlDialect dialect) {

    return new TestUpdateStatement<>(dialect, getAlias());
  }

  @Override
  protected List<Class<? extends StatementFeature>> getFeatures() {

    return Arrays.asList(FeatureWhere.class, FeatureLimit.class, FeatureModify.class, FeatureSet.class);
  }

  @Override
  protected String getSqlStart() {

    return "UPDATE ";
  }

  public static class TestUpdateStatement<E extends Bean> extends AbstractUpdateStatement<E, TestUpdateStatement<E>> {

    public TestUpdateStatement(SqlDialect dialect, Alias<E> alias) {

      super(dialect, alias);
    }

    @Override
    protected long doExecute(String sql, Integer limit) {

      throw new UnsupportedOperationException();
    }

  }

}
