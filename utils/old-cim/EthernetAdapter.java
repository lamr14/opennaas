/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class EthernetAdapter as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the EthernetAdapterBean Interface. The CIM class EthernetAdapter is described as
 * follows:
 * 
 * Note: The use of the CIM_EthernetAdapter class has been deprecated, consistent with NetworkAdapter. Instead use the CIM_EthernetPort class.
 * Deprecated description: This class describes the capabilities and management aspects of an EthernetAdapter.
 */
@Deprecated
public class EthernetAdapter extends NetworkAdapter implements Serializable
{

	/**
	 * This constructor creates a EthernetAdapterBeanImpl Class which implements the EthernetAdapterBean Interface, and encapsulates the CIM class
	 * EthernetAdapter in a Java Bean. The CIM class EthernetAdapter is described as follows:
	 * 
	 * Note: The use of the CIM_EthernetAdapter class has been deprecated, consistent with NetworkAdapter. Instead use the CIM_EthernetPort class.
	 * Deprecated description: This class describes the capabilities and management aspects of an EthernetAdapter.
	 */
	public EthernetAdapter() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property networkAddresses.
	 */
	@Deprecated
	private String[]	networkAddresses;

	/**
	 * This method returns the EthernetAdapter.networkAddresses property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: Ethernet/802.3 MAC addresses formatted as twelve hexadecimal digits
	 * (for example, "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Therefore, the
	 * Group address bit is found in the low order bit of the first character of the string.)
	 * 
	 * @return String[] current networkAddresses property value
	 * @exception Exception
	 */
	@Override
	@Deprecated
	public String[] getNetworkAddresses() {

		return this.networkAddresses;
	} // getNetworkAddresses

	/**
	 * This method sets the EthernetAdapter.networkAddresses property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: Ethernet/802.3 MAC addresses formatted as twelve hexadecimal digits
	 * (for example, "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Therefore, the
	 * Group address bit is found in the low order bit of the first character of the string.)
	 * 
	 * @param String
	 *            [] new networkAddresses property value
	 * @exception Exception
	 */
	@Override
	@Deprecated
	public void setNetworkAddresses(String[] networkAddresses) {

		this.networkAddresses = networkAddresses;
	} // setNetworkAddresses

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property maxDataSize.
	 */
	@Deprecated
	private long	maxDataSize;

	/**
	 * This method returns the EthernetAdapter.maxDataSize property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: The maximum size of the INFO (non-MAC) field that will be received or
	 * transmitted.
	 * 
	 * @return long current maxDataSize property value
	 * @exception Exception
	 */
	@Deprecated
	public long getMaxDataSize() {

		return this.maxDataSize;
	} // getMaxDataSize

	/**
	 * This method sets the EthernetAdapter.maxDataSize property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: The maximum size of the INFO (non-MAC) field that will be received or
	 * transmitted.
	 * 
	 * @param long new maxDataSize property value
	 * @exception Exception
	 */
	@Deprecated
	public void setMaxDataSize(long maxDataSize) {

		this.maxDataSize = maxDataSize;
	} // setMaxDataSize

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property Capabilities.
	 */
	@Deprecated
	public enum Capabilities {
		UNKNOWN,
		OTHER,
		ALERTONLAN,
		WAKEONLAN,
		FAILOVER,
		LOADBALANCING
	}

	@Deprecated
	private Capabilities	capabilities;

	/**
	 * This method returns the EthernetAdapter.capabilities property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: Capabilities of the EthernetAdapter. For example, the Device might
	 * support AlertOnLan, WakeOnLan, Load Balancing, or FailOver. If failover or load balancing capabilities are listed, a SpareGroup (failover) or
	 * ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
	 * 
	 * @return int current capabilities property value
	 * @exception Exception
	 */
	@Deprecated
	public Capabilities getCapabilities() {

		return this.capabilities;
	} // getCapabilities

	/**
	 * This method sets the EthernetAdapter.capabilities property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: Capabilities of the EthernetAdapter. For example, the Device might
	 * support AlertOnLan, WakeOnLan, Load Balancing, or FailOver. If failover or load balancing capabilities are listed, a SpareGroup (failover) or
	 * ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
	 * 
	 * @param int new capabilities property value
	 * @exception Exception
	 */
	@Deprecated
	public void setCapabilities(Capabilities capabilities) {

		this.capabilities = capabilities;
	} // setCapabilities

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property capabilityDescriptions.
	 */
	@Deprecated
	private String[]	capabilityDescriptions;

	/**
	 * This method returns the EthernetAdapter.capabilityDescriptions property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: An array of free-form strings that provides more detailed
	 * explanations for any of the EthernetAdapter features that are indicated in the Capabilities array. Note, each entry of this array is related to
	 * the entry in the Capabilities array that is located at the same index.
	 * 
	 * @return String[] current capabilityDescriptions property value
	 * @exception Exception
	 */
	@Deprecated
	public String[] getCapabilityDescriptions() {

		return this.capabilityDescriptions;
	} // getCapabilityDescriptions

	/**
	 * This method sets the EthernetAdapter.capabilityDescriptions property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: An array of free-form strings that provides more detailed
	 * explanations for any of the EthernetAdapter features that are indicated in the Capabilities array. Note, each entry of this array is related to
	 * the entry in the Capabilities array that is located at the same index.
	 * 
	 * @param String
	 *            [] new capabilityDescriptions property value
	 * @exception Exception
	 */
	@Deprecated
	public void setCapabilityDescriptions(String[] capabilityDescriptions) {

		this.capabilityDescriptions = capabilityDescriptions;
	} // setCapabilityDescriptions

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property EnabledCapabilities.
	 */
	@Deprecated
	public enum EnabledCapabilities {
		UNKNOWN,
		OTHER,
		ALERTONLAN,
		WAKEONLAN,
		FAILOVER,
		LOADBALANCING
	}

	@Deprecated
	private EnabledCapabilities	enabledCapabilities;

	/**
	 * This method returns the EthernetAdapter.enabledCapabilities property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: Specifies which capabilities are enabled from the list of all
	 * supported ones, which are defined in the Capabilities array.
	 * 
	 * @return int current enabledCapabilities property value
	 * @exception Exception
	 */
	@Deprecated
	public EnabledCapabilities getEnabledCapabilities() {

		return this.enabledCapabilities;
	} // getEnabledCapabilities

	/**
	 * This method sets the EthernetAdapter.enabledCapabilities property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: Specifies which capabilities are enabled from the list of all
	 * supported ones, which are defined in the Capabilities array.
	 * 
	 * @param int new enabledCapabilities property value
	 * @exception Exception
	 */
	@Deprecated
	public void setEnabledCapabilities(EnabledCapabilities
			enabledCapabilities) {

		this.enabledCapabilities = enabledCapabilities;
	} // setEnabledCapabilities

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property symbolErrors.
	 */
	@Deprecated
	private long	symbolErrors;

	/**
	 * This method returns the EthernetAdapter.symbolErrors property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: The number of times there was an invalid data symbol when a valid
	 * carrier was present. The count is incremented at most once per carrier event, even if multiple symbol errors occur during the carrier event.
	 * 
	 * @return long current symbolErrors property value
	 * @exception Exception
	 */
	@Deprecated
	public long getSymbolErrors() {

		return this.symbolErrors;
	} // getSymbolErrors

	/**
	 * This method sets the EthernetAdapter.symbolErrors property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: The number of times there was an invalid data symbol when a valid
	 * carrier was present. The count is incremented at most once per carrier event, even if multiple symbol errors occur during the carrier event.
	 * 
	 * @param long new symbolErrors property value
	 * @exception Exception
	 */
	@Deprecated
	public void setSymbolErrors(long symbolErrors) {

		this.symbolErrors = symbolErrors;
	} // setSymbolErrors

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property totalPacketsTransmitted.
	 */
	@Deprecated
	private long	totalPacketsTransmitted;

	/**
	 * This method returns the EthernetAdapter.totalPacketsTransmitted property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: The total number of packets that are transmitted.
	 * 
	 * @return long current totalPacketsTransmitted property value
	 * @exception Exception
	 */
	@Deprecated
	public long getTotalPacketsTransmitted() {

		return this.totalPacketsTransmitted;
	} // getTotalPacketsTransmitted

	/**
	 * This method sets the EthernetAdapter.totalPacketsTransmitted property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: The total number of packets that are transmitted.
	 * 
	 * @param long new totalPacketsTransmitted property value
	 * @exception Exception
	 */
	@Deprecated
	public void setTotalPacketsTransmitted(long totalPacketsTransmitted) {

		this.totalPacketsTransmitted = totalPacketsTransmitted;
	} // setTotalPacketsTransmitted

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property totalPacketsReceived.
	 */
	@Deprecated
	private long	totalPacketsReceived;

	/**
	 * This method returns the EthernetAdapter.totalPacketsReceived property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: The total number of packets that are received.
	 * 
	 * @return long current totalPacketsReceived property value
	 * @exception Exception
	 */
	@Deprecated
	public long getTotalPacketsReceived() {

		return this.totalPacketsReceived;
	} // getTotalPacketsReceived

	/**
	 * This method sets the EthernetAdapter.totalPacketsReceived property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: The total number of packets that are received.
	 * 
	 * @param long new totalPacketsReceived property value
	 * @exception Exception
	 */
	@Deprecated
	public void setTotalPacketsReceived(long totalPacketsReceived) {

		this.totalPacketsReceived = totalPacketsReceived;
	} // setTotalPacketsReceived

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property alignmentErrors.
	 */
	@Deprecated
	private long	alignmentErrors;

	/**
	 * This method returns the EthernetAdapter.alignmentErrors property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of frames that were received on a particular interface, are
	 * not an integral number of octets in length, and do not pass the FCS check. The count that is represented by an instance of this object is
	 * incremented when the alignment Error status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple
	 * error conditions obtained are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status
	 * presented to the LLC.
	 * 
	 * @return long current alignmentErrors property value
	 * @exception Exception
	 */
	@Deprecated
	public long getAlignmentErrors() {

		return this.alignmentErrors;
	} // getAlignmentErrors

	/**
	 * This method sets the EthernetAdapter.alignmentErrors property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of frames that were received on a particular interface, are
	 * not an integral number of octets in length, and do not pass the FCS check. The count that is represented by an instance of this object is
	 * incremented when the alignment Error status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple
	 * error conditions obtained are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status
	 * presented to the LLC.
	 * 
	 * @param long new alignmentErrors property value
	 * @exception Exception
	 */
	@Deprecated
	public void setAlignmentErrors(long alignmentErrors) {

		this.alignmentErrors = alignmentErrors;
	} // setAlignmentErrors

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property fCSErrors.
	 */
	@Deprecated
	private long	fCSErrors;

	/**
	 * This method returns the EthernetAdapter.fCSErrors property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of frames that were received on a particular interface and
	 * are an integral number of octets in length, but do not pass the FCS check. The count represented by an instance of this object is incremented
	 * when the frame CheckError status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error
	 * conditions obtained are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status
	 * presented to the LLC.
	 * 
	 * @return long current fCSErrors property value
	 * @exception Exception
	 */
	@Deprecated
	public long getFCSErrors() {

		return this.fCSErrors;
	} // getFCSErrors

	/**
	 * This method sets the EthernetAdapter.fCSErrors property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of frames that were received on a particular interface and
	 * are an integral number of octets in length, but do not pass the FCS check. The count represented by an instance of this object is incremented
	 * when the frame CheckError status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error
	 * conditions obtained are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status
	 * presented to the LLC.
	 * 
	 * @param long new fCSErrors property value
	 * @exception Exception
	 */
	@Deprecated
	public void setFCSErrors(long fCSErrors) {

		this.fCSErrors = fCSErrors;
	} // setFCSErrors

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property singleCollisionFrames.
	 */
	@Deprecated
	private long	singleCollisionFrames;

	/**
	 * This method returns the EthernetAdapter.singleCollisionFrames property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of successfully transmitted frames on a particular interface
	 * for which transmission is inhibited by exactly one collision. A frame that is counted by an instance of this object is not counted by the
	 * corresponding instance of the MultipleCollisionFrames property.
	 * 
	 * @return long current singleCollisionFrames property value
	 * @exception Exception
	 */
	@Deprecated
	public long getSingleCollisionFrames() {

		return this.singleCollisionFrames;
	} // getSingleCollisionFrames

	/**
	 * This method sets the EthernetAdapter.singleCollisionFrames property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of successfully transmitted frames on a particular interface
	 * for which transmission is inhibited by exactly one collision. A frame that is counted by an instance of this object is not counted by the
	 * corresponding instance of the MultipleCollisionFrames property.
	 * 
	 * @param long new singleCollisionFrames property value
	 * @exception Exception
	 */
	@Deprecated
	public void setSingleCollisionFrames(long singleCollisionFrames) {

		this.singleCollisionFrames = singleCollisionFrames;
	} // setSingleCollisionFrames

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property multipleCollisionFrames.
	 */
	@Deprecated
	private long	multipleCollisionFrames;

	/**
	 * This method returns the EthernetAdapter.multipleCollisionFrames property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of successfully transmitted frames on a particular interface
	 * for which transmission is inhibited by more than one collision. A frame that is counted by an instance of this object is not counted by the
	 * corresponding instance of the SingleCollisionFrames property.
	 * 
	 * @return long current multipleCollisionFrames property value
	 * @exception Exception
	 */
	@Deprecated
	public long getMultipleCollisionFrames() {

		return this.multipleCollisionFrames;
	} // getMultipleCollisionFrames

	/**
	 * This method sets the EthernetAdapter.multipleCollisionFrames property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of successfully transmitted frames on a particular interface
	 * for which transmission is inhibited by more than one collision. A frame that is counted by an instance of this object is not counted by the
	 * corresponding instance of the SingleCollisionFrames property.
	 * 
	 * @param long new multipleCollisionFrames property value
	 * @exception Exception
	 */
	@Deprecated
	public void setMultipleCollisionFrames(long multipleCollisionFrames) {

		this.multipleCollisionFrames = multipleCollisionFrames;
	} // setMultipleCollisionFrames

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property sQETestErrors.
	 */
	@Deprecated
	private long	sQETestErrors;

	/**
	 * This method returns the EthernetAdapter.sQETestErrors property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of times that the SQE TEST ERROR message is generated by the
	 * PLS sublayer for a particular interface. The SQE TEST ERROR message is defined in section 7.2.2.2.4 of ANSI/IEEE 802.3-1985 and its generation
	 * is described in section 7.2.4.6 of the same document.
	 * 
	 * @return long current sQETestErrors property value
	 * @exception Exception
	 */
	@Deprecated
	public long getSQETestErrors() {

		return this.sQETestErrors;
	} // getSQETestErrors

	/**
	 * This method sets the EthernetAdapter.sQETestErrors property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of times that the SQE TEST ERROR message is generated by the
	 * PLS sublayer for a particular interface. The SQE TEST ERROR message is defined in section 7.2.2.2.4 of ANSI/IEEE 802.3-1985 and its generation
	 * is described in section 7.2.4.6 of the same document.
	 * 
	 * @param long new sQETestErrors property value
	 * @exception Exception
	 */
	@Deprecated
	public void setSQETestErrors(long sQETestErrors) {

		this.sQETestErrors = sQETestErrors;
	} // setSQETestErrors

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property deferredTransmissions.
	 */
	@Deprecated
	private long	deferredTransmissions;

	/**
	 * This method returns the EthernetAdapter.deferredTransmissions property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of frames for which the first transmission attempt on a
	 * particular interface is delayed because the medium is busy. The count represented by an instance of this object does not include the frames
	 * that are involved in collisions.
	 * 
	 * @return long current deferredTransmissions property value
	 * @exception Exception
	 */
	@Deprecated
	public long getDeferredTransmissions() {

		return this.deferredTransmissions;
	} // getDeferredTransmissions

	/**
	 * This method sets the EthernetAdapter.deferredTransmissions property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of frames for which the first transmission attempt on a
	 * particular interface is delayed because the medium is busy. The count represented by an instance of this object does not include the frames
	 * that are involved in collisions.
	 * 
	 * @param long new deferredTransmissions property value
	 * @exception Exception
	 */
	@Deprecated
	public void setDeferredTransmissions(long deferredTransmissions) {

		this.deferredTransmissions = deferredTransmissions;
	} // setDeferredTransmissions

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property lateCollisions.
	 */
	@Deprecated
	private long	lateCollisions;

	/**
	 * This method returns the EthernetAdapter.lateCollisions property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: The number of times that a collision is detected on a particular
	 * interface later than 512 bit-times into the transmission of a packet. Five hundred and twelve bit-times corresponds to 51.2 microseconds on a
	 * 10 Mbit/s system. A late collision included in a count that is represented by an instance of this object is also considered to be a generic
	 * collision for purposes of other collision-related statistics.
	 * 
	 * @return long current lateCollisions property value
	 * @exception Exception
	 */
	@Deprecated
	public long getLateCollisions() {

		return this.lateCollisions;
	} // getLateCollisions

	/**
	 * This method sets the EthernetAdapter.lateCollisions property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: The number of times that a collision is detected on a particular
	 * interface later than 512 bit-times into the transmission of a packet. Five hundred and twelve bit-times corresponds to 51.2 microseconds on a
	 * 10 Mbit/s system. A late collision included in a count that is represented by an instance of this object is also considered to be a generic
	 * collision for purposes of other collision-related statistics.
	 * 
	 * @param long new lateCollisions property value
	 * @exception Exception
	 */
	@Deprecated
	public void setLateCollisions(long lateCollisions) {

		this.lateCollisions = lateCollisions;
	} // setLateCollisions

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property excessiveCollisions.
	 */
	@Deprecated
	private long	excessiveCollisions;

	/**
	 * This method returns the EthernetAdapter.excessiveCollisions property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of frames for which transmission on a particular interface
	 * fails due to excessive collisions.
	 * 
	 * @return long current excessiveCollisions property value
	 * @exception Exception
	 */
	@Deprecated
	public long getExcessiveCollisions() {

		return this.excessiveCollisions;
	} // getExcessiveCollisions

	/**
	 * This method sets the EthernetAdapter.excessiveCollisions property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of frames for which transmission on a particular interface
	 * fails due to excessive collisions.
	 * 
	 * @param long new excessiveCollisions property value
	 * @exception Exception
	 */
	@Deprecated
	public void setExcessiveCollisions(long excessiveCollisions) {

		this.excessiveCollisions = excessiveCollisions;
	} // setExcessiveCollisions

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property internalMACTransmitErrors.
	 */
	@Deprecated
	private long	internalMACTransmitErrors;

	/**
	 * This method returns the EthernetAdapter.internalMACTransmitErrors property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of frames for which transmission on a particular interface
	 * fails due to an internal MAC sublayer transmit error. A frame is counted by an instance of this object only if it is not counted by the
	 * corresponding instance of the LateCollisions property, the Excessive Collisions property, or the CarrierSenseErrors property. The precise
	 * meaning of the count represented by an instance of this object is implementation-specific. In particular, an instance of this object might
	 * represent a count of transmission errors on a particular interface that are not otherwise counted.
	 * 
	 * @return long current internalMACTransmitErrors property value
	 * @exception Exception
	 */
	@Deprecated
	public long getInternalMACTransmitErrors() {

		return this.internalMACTransmitErrors;
	} // getInternalMACTransmitErrors

	/**
	 * This method sets the EthernetAdapter.internalMACTransmitErrors property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of frames for which transmission on a particular interface
	 * fails due to an internal MAC sublayer transmit error. A frame is counted by an instance of this object only if it is not counted by the
	 * corresponding instance of the LateCollisions property, the Excessive Collisions property, or the CarrierSenseErrors property. The precise
	 * meaning of the count represented by an instance of this object is implementation-specific. In particular, an instance of this object might
	 * represent a count of transmission errors on a particular interface that are not otherwise counted.
	 * 
	 * @param long new internalMACTransmitErrors property value
	 * @exception Exception
	 */
	@Deprecated
	public void setInternalMACTransmitErrors(long internalMACTransmitErrors)
	{

		this.internalMACTransmitErrors = internalMACTransmitErrors;
	} // setInternalMACTransmitErrors

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property internalMACReceiveErrors.
	 */
	@Deprecated
	private long	internalMACReceiveErrors;

	/**
	 * This method returns the EthernetAdapter.internalMACReceiveErrors property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of frames for which reception on a particular interface fails
	 * due to an internal MAC sublayer receive error. A frame is counted by an instance of this object only if it is not counted by the corresponding
	 * instance of the FrameTooLongs property the AlignmentErrors property, or the FCSErrors property. The precise meaning of the count that is
	 * represented by an instance of this object is implementation-specific. In particular, an instance of this object might represent a count of
	 * receive errors on a particular interface that are not otherwise counted.
	 * 
	 * @return long current internalMACReceiveErrors property value
	 * @exception Exception
	 */
	@Deprecated
	public long getInternalMACReceiveErrors() {

		return this.internalMACReceiveErrors;
	} // getInternalMACReceiveErrors

	/**
	 * This method sets the EthernetAdapter.internalMACReceiveErrors property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of frames for which reception on a particular interface fails
	 * due to an internal MAC sublayer receive error. A frame is counted by an instance of this object only if it is not counted by the corresponding
	 * instance of the FrameTooLongs property the AlignmentErrors property, or the FCSErrors property. The precise meaning of the count that is
	 * represented by an instance of this object is implementation-specific. In particular, an instance of this object might represent a count of
	 * receive errors on a particular interface that are not otherwise counted.
	 * 
	 * @param long new internalMACReceiveErrors property value
	 * @exception Exception
	 */
	@Deprecated
	public void setInternalMACReceiveErrors(long internalMACReceiveErrors) {

		this.internalMACReceiveErrors = internalMACReceiveErrors;
	} // setInternalMACReceiveErrors

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property carrierSenseErrors.
	 */
	@Deprecated
	private long	carrierSenseErrors;

	/**
	 * This method returns the EthernetAdapter.carrierSenseErrors property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: The number of times that the carrier sense condition was lost or
	 * never asserted when attempting to transmit a frame on a particular interface. The count represented by an instance of this object is
	 * incremented, at most, once per transmission attempt, even if the carrier sense condition fluctuates during a transmission attempt.
	 * 
	 * @return long current carrierSenseErrors property value
	 * @exception Exception
	 */
	@Deprecated
	public long getCarrierSenseErrors() {

		return this.carrierSenseErrors;
	} // getCarrierSenseErrors

	/**
	 * This method sets the EthernetAdapter.carrierSenseErrors property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: The number of times that the carrier sense condition was lost or
	 * never asserted when attempting to transmit a frame on a particular interface. The count represented by an instance of this object is
	 * incremented, at most, once per transmission attempt, even if the carrier sense condition fluctuates during a transmission attempt.
	 * 
	 * @param long new carrierSenseErrors property value
	 * @exception Exception
	 */
	@Deprecated
	public void setCarrierSenseErrors(long carrierSenseErrors) {

		this.carrierSenseErrors = carrierSenseErrors;
	} // setCarrierSenseErrors

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property frameTooLongs.
	 */
	@Deprecated
	private long	frameTooLongs;

	/**
	 * This method returns the EthernetAdapter.frameTooLongs property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of frames that are received on a particular interface that
	 * exceeds the maximum permitted frame size. The count that is represented by an instance of this object is incremented when the FrameTooLong
	 * status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtained are, according
	 * to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
	 * 
	 * @return long current frameTooLongs property value
	 * @exception Exception
	 */
	@Deprecated
	public long getFrameTooLongs() {

		return this.frameTooLongs;
	} // getFrameTooLongs

	/**
	 * This method sets the EthernetAdapter.frameTooLongs property value. This property is described as follows:
	 * 
	 * Note: The use of this method has been deprecated. Deprecated description: A count of frames that are received on a particular interface that
	 * exceeds the maximum permitted frame size. The count that is represented by an instance of this object is incremented when the FrameTooLong
	 * status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtained are, according
	 * to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
	 * 
	 * @param long new frameTooLongs property value
	 * @exception Exception
	 */
	@Deprecated
	public void setFrameTooLongs(long frameTooLongs) {

		this.frameTooLongs = frameTooLongs;
	} // setFrameTooLongs

} // Class EthernetAdapter
