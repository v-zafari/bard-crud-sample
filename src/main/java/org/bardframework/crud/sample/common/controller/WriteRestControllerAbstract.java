package org.bardframework.crud.sample.common.controller;

import org.bardframework.crud.api.base.WriteRestController;
import org.bardframework.crud.sample.common.BaseCriteriaAbstract;
import org.bardframework.crud.sample.common.BaseModelAbstract;
import org.bardframework.crud.sample.common.BaseServiceAbstract;
import org.bardframework.crud.sample.common.User;

public abstract class WriteRestControllerAbstract<M extends BaseModelAbstract, C extends BaseCriteriaAbstract, D, S extends BaseServiceAbstract<M, C, D, ?>> extends OperationRestControllerAbstract<M, C, D, S> implements WriteRestController<M, D, S, String, User> {

}
