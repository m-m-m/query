/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.query.base.path;

import net.sf.mmm.bean.api.entity.EntityBean;
import net.sf.mmm.property.api.ReadableProperty;
import net.sf.mmm.query.api.path.EntityBeanPath;
import net.sf.mmm.query.api.path.PathRoot;
import net.sf.mmm.query.base.argument.AbstractEntityBeanArgument;

/**
 * This is the implementation of {@link EntityBeanPath}.
 *
 * @param <V> the generic type of the property value identified by this path.
 *
 * @author hohwille
 * @since 8.5.0
 */
public class EntityBeanPathImpl<V extends EntityBean> extends PathImpl<V> implements EntityBeanPath<V>, AbstractEntityBeanArgument<V> {

  /**
   * The constructor.
   *
   * @param parent - {@link #getParent()}.
   * @param property - see {@link #getProperty()}.
   */
  public EntityBeanPathImpl(PathImpl<?> parent, ReadableProperty<?> property) {

    super(parent, property);
  }

  /**
   * The constructor.
   *
   * @param root - {@link #getRoot()}.
   * @param property - see {@link #getProperty()}.
   */
  public EntityBeanPathImpl(PathRoot<?> root, ReadableProperty<?> property) {

    super(root, property);
  }

}
