/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class WiFiNetworkDetectionSettings as well as methods
 * comparable to the invokeMethods defined for this class. This Class implements the WiFiNetworkDetectionSettingsBean Interface. The CIM class
 * WiFiNetworkDetectionSettings is described as follows:
 * 
 * CIM_WiFiNetworkDetectionSettings describes setting data that control the behavior of the network detection and selection logic in a Wi-Fi Port.
 */
public class WiFiNetworkDetectionSettings extends SettingData implements
		Serializable {

	/**
	 * This constructor creates a WiFiNetworkDetectionSettingsBeanImpl Class which implements the WiFiNetworkDetectionSettingsBean Interface, and
	 * encapsulates the CIM class WiFiNetworkDetectionSettings in a Java Bean. The CIM class WiFiNetworkDetectionSettings is described as follows:
	 * 
	 * CIM_WiFiNetworkDetectionSettings describes setting data that control the behavior of the network detection and selection logic in a Wi-Fi Port.
	 */
	public WiFiNetworkDetectionSettings() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property TargetNetworkCategories.
	 */

	public enum TargetNetworkCategories {
		ANY,
		PREFERRED,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private TargetNetworkCategories	targetNetworkCategories;

	/**
	 * This method returns the WiFiNetworkDetectionSettings.targetNetworkCategories property value. This property is described as follows:
	 * 
	 * Enumeration indicating the type of wireless networks that will be searched for. A value of 2 "Any" shall indicate that no restrictions are
	 * enforced on the SSIDs searched for. A value of 3 "Preferred" shall indicate that only networks listed in the PreferredNetworks property are
	 * searced for.
	 * 
	 * @return int current targetNetworkCategories property value
	 * @exception Exception
	 */
	public TargetNetworkCategories getTargetNetworkCategories() {

		return this.targetNetworkCategories;
	} // getTargetNetworkCategories

	/**
	 * This method sets the WiFiNetworkDetectionSettings.targetNetworkCategories property value. This property is described as follows:
	 * 
	 * Enumeration indicating the type of wireless networks that will be searched for. A value of 2 "Any" shall indicate that no restrictions are
	 * enforced on the SSIDs searched for. A value of 3 "Preferred" shall indicate that only networks listed in the PreferredNetworks property are
	 * searced for.
	 * 
	 * @param int new targetNetworkCategories property value
	 * @exception Exception
	 */
	public void setTargetNetworkCategories(TargetNetworkCategories
			targetNetworkCategories) {

		this.targetNetworkCategories = targetNetworkCategories;
	} // setTargetNetworkCategories

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property preferredNetworks.
	 */
	private String[]	preferredNetworks;

	/**
	 * This method returns the WiFiNetworkDetectionSettings.preferredNetworks property value. This property is described as follows:
	 * 
	 * PreferredNetworks lists the SSIDs of preferred wireless LAN networks. Each value contained shall also be contained in the KnownNetworks
	 * property.
	 * 
	 * @return String[] current preferredNetworks property value
	 * @exception Exception
	 */
	public String[] getPreferredNetworks() {

		return this.preferredNetworks;
	} // getPreferredNetworks

	/**
	 * This method sets the WiFiNetworkDetectionSettings.preferredNetworks property value. This property is described as follows:
	 * 
	 * PreferredNetworks lists the SSIDs of preferred wireless LAN networks. Each value contained shall also be contained in the KnownNetworks
	 * property.
	 * 
	 * @param String
	 *            [] new preferredNetworks property value
	 * @exception Exception
	 */
	public void setPreferredNetworks(String[] preferredNetworks) {

		this.preferredNetworks = preferredNetworks;
	} // setPreferredNetworks

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property knownNetworks.
	 */
	private String[]	knownNetworks;

	/**
	 * This method returns the WiFiNetworkDetectionSettings.knownNetworks property value. This property is described as follows:
	 * 
	 * KnownNetworks lists the SSIDs of networks that have been previously identified to or by the wireless LAN endpoint on the platform.
	 * 
	 * @return String[] current knownNetworks property value
	 * @exception Exception
	 */
	public String[] getKnownNetworks() {

		return this.knownNetworks;
	} // getKnownNetworks

	/**
	 * This method sets the WiFiNetworkDetectionSettings.knownNetworks property value. This property is described as follows:
	 * 
	 * KnownNetworks lists the SSIDs of networks that have been previously identified to or by the wireless LAN endpoint on the platform.
	 * 
	 * @param String
	 *            [] new knownNetworks property value
	 * @exception Exception
	 */
	public void setKnownNetworks(String[] knownNetworks) {

		this.knownNetworks = knownNetworks;
	} // setKnownNetworks

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property minimumSignalStrength.
	 */
	private int	minimumSignalStrength;

	/**
	 * This method returns the WiFiNetworkDetectionSettings.minimumSignalStrength property value. This property is described as follows:
	 * 
	 * MinimumSignalStrength specifies the minimum signal strength required to be received by the wireless LAN endpoint in order for it to attempt to
	 * connect to the wireless network.
	 * 
	 * @return int current minimumSignalStrength property value
	 * @exception Exception
	 */
	public int getMinimumSignalStrength() {

		return this.minimumSignalStrength;
	} // getMinimumSignalStrength

	/**
	 * This method sets the WiFiNetworkDetectionSettings.minimumSignalStrength property value. This property is described as follows:
	 * 
	 * MinimumSignalStrength specifies the minimum signal strength required to be received by the wireless LAN endpoint in order for it to attempt to
	 * connect to the wireless network.
	 * 
	 * @param int new minimumSignalStrength property value
	 * @exception Exception
	 */
	public void setMinimumSignalStrength(int minimumSignalStrength) {

		this.minimumSignalStrength = minimumSignalStrength;
	} // setMinimumSignalStrength

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property PortTypes.
	 */

	public enum PortTypes {
		UNKNOWN,
		OTHER,
		_802_11A,
		_802_11B,
		_802_11G,
		_802_11N,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private PortTypes	portTypes;

	/**
	 * This method returns the WiFiNetworkDetectionSettings.portTypes property value. This property is described as follows:
	 * 
	 * ProtocolTypes lists the different 802.11 variations that a network may support in order to for the wireless catcher to attempt a connection to
	 * the network. The enumeration values are selected to align with CIM_ProtocolEndpoint.ProtocolIFType's enumeration.
	 * 
	 * @return int current portTypes property value
	 * @exception Exception
	 */
	public PortTypes getPortTypes() {

		return this.portTypes;
	} // getPortTypes

	/**
	 * This method sets the WiFiNetworkDetectionSettings.portTypes property value. This property is described as follows:
	 * 
	 * ProtocolTypes lists the different 802.11 variations that a network may support in order to for the wireless catcher to attempt a connection to
	 * the network. The enumeration values are selected to align with CIM_ProtocolEndpoint.ProtocolIFType's enumeration.
	 * 
	 * @param int new portTypes property value
	 * @exception Exception
	 */
	public void setPortTypes(PortTypes portTypes) {

		this.portTypes = portTypes;
	} // setPortTypes

} // Class WiFiNetworkDetectionSettings
