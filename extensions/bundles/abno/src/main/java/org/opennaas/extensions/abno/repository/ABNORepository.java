package org.opennaas.extensions.abno.repository;

/*
 * #%L
 * OpenNaaS :: XIFI ABNO
 * %%
 * Copyright (C) 2007 - 2014 Fundació Privada i2CAT, Internet i Innovació a Catalunya
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.opennaas.core.resources.IResource;
import org.opennaas.core.resources.ResourceException;
import org.opennaas.core.resources.ResourceRepository;
import org.opennaas.core.resources.capability.ICapabilityFactory;

/**
 * 
 * @author Julio Carlos Barrera
 *
 */
public class ABNORepository extends ResourceRepository {

	public static final String	ABNO_RESOURCE_TYPE	= "abno";

	private Log					log					= LogFactory.getLog(ABNORepository.class);

	public ABNORepository(String resourceType) {
		super(resourceType);
	}

	@Override
	protected void checkResourceCanBeStarted(IResource resource)
			throws ResourceException {
		super.checkResourceCanBeStarted(resource);
	}

	public void capabilityFactoryAdded(ICapabilityFactory capabilityFactory) {
		log.info("Adding factory: " + capabilityFactory.getType());
		this.capabilityFactories.put(capabilityFactory.getType(), capabilityFactory);
	}

	public void capabilityFactoryDeleted(ICapabilityFactory capabilityFactory) {
		if (capabilityFactory != null) {
			log.info("Deleting factory: " + capabilityFactory.getType());
			this.capabilityFactories.remove(capabilityFactory.getType());
		}
	}

}
