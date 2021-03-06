package org.opennaas.extensions.xifi.capability.e2e.model;

/*
 * #%L
 * OpenNaaS :: XIFI
 * %%
 * Copyright (C) 2007 - 2015 Fundació Privada i2CAT, Internet i Innovació a Catalunya
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

/**
 * XIFI Region configuration
 * 
 * @author Julio Carlos Barrera
 *
 */
public class Region {

	private String	name;
	private String	ryuEndpoint;
	private String	ryuSwitchDPID;
	private String	openstackEndpoint;
	private String	openstackUser;
	private String	openstackPassword;
	private String	openstackTenant;
	private String	autoBAHNInterface;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRyuEndpoint() {
		return ryuEndpoint;
	}

	public void setRyuEndpoint(String ryuEndpoint) {
		this.ryuEndpoint = ryuEndpoint;
	}

	public String getRyuSwitchDPID() {
		return ryuSwitchDPID;
	}

	public void setRyuSwitchDPID(String ryuSwitchDPID) {
		this.ryuSwitchDPID = ryuSwitchDPID;
	}

	public String getOpenstackEndpoint() {
		return openstackEndpoint;
	}

	public void setOpenstackEndpoint(String openstackEndpoint) {
		this.openstackEndpoint = openstackEndpoint;
	}

	public String getOpenstackUser() {
		return openstackUser;
	}

	public void setOpenstackUser(String openstackUser) {
		this.openstackUser = openstackUser;
	}

	public String getOpenstackPassword() {
		return openstackPassword;
	}

	public void setOpenstackPassword(String openstackPassword) {
		this.openstackPassword = openstackPassword;
	}

	public String getOpenstackTenant() {
		return openstackTenant;
	}

	public void setOpenstackTenant(String openstackTenant) {
		this.openstackTenant = openstackTenant;
	}

	public String getAutoBAHNInterface() {
		return autoBAHNInterface;
	}

	public void setAutoBAHNInterface(String autoBAHNInterface) {
		this.autoBAHNInterface = autoBAHNInterface;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autoBAHNInterface == null) ? 0 : autoBAHNInterface.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((openstackEndpoint == null) ? 0 : openstackEndpoint.hashCode());
		result = prime * result + ((openstackPassword == null) ? 0 : openstackPassword.hashCode());
		result = prime * result + ((openstackTenant == null) ? 0 : openstackTenant.hashCode());
		result = prime * result + ((openstackUser == null) ? 0 : openstackUser.hashCode());
		result = prime * result + ((ryuEndpoint == null) ? 0 : ryuEndpoint.hashCode());
		result = prime * result + ((ryuSwitchDPID == null) ? 0 : ryuSwitchDPID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		if (autoBAHNInterface == null) {
			if (other.autoBAHNInterface != null)
				return false;
		} else if (!autoBAHNInterface.equals(other.autoBAHNInterface))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (openstackEndpoint == null) {
			if (other.openstackEndpoint != null)
				return false;
		} else if (!openstackEndpoint.equals(other.openstackEndpoint))
			return false;
		if (openstackPassword == null) {
			if (other.openstackPassword != null)
				return false;
		} else if (!openstackPassword.equals(other.openstackPassword))
			return false;
		if (openstackTenant == null) {
			if (other.openstackTenant != null)
				return false;
		} else if (!openstackTenant.equals(other.openstackTenant))
			return false;
		if (openstackUser == null) {
			if (other.openstackUser != null)
				return false;
		} else if (!openstackUser.equals(other.openstackUser))
			return false;
		if (ryuEndpoint == null) {
			if (other.ryuEndpoint != null)
				return false;
		} else if (!ryuEndpoint.equals(other.ryuEndpoint))
			return false;
		if (ryuSwitchDPID == null) {
			if (other.ryuSwitchDPID != null)
				return false;
		} else if (!ryuSwitchDPID.equals(other.ryuSwitchDPID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [name=" + name + ", ryuEndpoint=" + ryuEndpoint + ", ryuSwitchDPID=" + ryuSwitchDPID
				+ ", openstackEndpoint=" + openstackEndpoint + ", openstackUser=" + openstackUser + ", openstackPassword=[HIDDEN]"
				+ ", openstackTenant=" + openstackTenant + ", autoBAHNInterface=" + autoBAHNInterface + "]";
	}

}
