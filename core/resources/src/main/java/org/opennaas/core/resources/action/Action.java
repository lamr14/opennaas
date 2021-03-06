package org.opennaas.core.resources.action;

/*
 * #%L
 * OpenNaaS :: Core :: Resources
 * %%
 * Copyright (C) 2007 - 2014 Fundació Privada i2CAT, Internet i Innovació a Catalunya
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.opennaas.core.resources.IModel;

public abstract class Action implements IAction {

	protected Log		log				= LogFactory.getLog(Action.class);
	protected IModel	modelToUpdate;
	protected Object	params			= null;
	protected String	actionID		= null;

	protected Object	behaviorParams	= null;

	@Override
	public IModel getModelToUpdate() {
		return modelToUpdate;
	}

	@Override
	public void setModelToUpdate(IModel modelToUpdate) {
		this.modelToUpdate = modelToUpdate;
	}

	@Override
	public Object getParams() {
		return params;
	}

	@Override
	public void setParams(Object params) {
		this.params = params;
	}

	@Override
	public String getActionID() {
		return actionID;
	}

	@Override
	public void setActionID(String actionID) {
		this.actionID = actionID;
	}

	public Object getBehaviorParams() {
		return behaviorParams;
	}

	/**
	 * Set params an action may use to specify its behavior (i.e. path to a template file to be loaded)
	 * 
	 * @param params
	 */
	public void setBehaviorParams(Object params) {
		behaviorParams = params;
	}

}
