/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class PhysicalStatistics as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the PhysicalStatisticsBean Interface. The CIM class PhysicalStatistics is described
 * as follows:
 * 
 * PhysicalStatistics relates the PhysicalStatisticalInformation class to the PhysicalElement to which it applies.
 */
public class PhysicalStatistics extends Statistics implements Serializable {

	/**
	 * This constructor creates a PhysicalStatisticsBeanImpl Class which implements the PhysicalStatisticsBean Interface, and encapsulates the CIM
	 * class PhysicalStatistics in a Java Bean. The CIM class PhysicalStatistics is described as follows:
	 * 
	 * PhysicalStatistics relates the PhysicalStatisticalInformation class to the PhysicalElement to which it applies.
	 */
	public PhysicalStatistics() {
	};

	/**
	 * This method create an Association of the type PhysicalStatistics between one PhysicalStatisticalInformation object and PhysicalElement object
	 */
	public static PhysicalStatistics link(PhysicalStatisticalInformation
			stats, PhysicalElement element) {

		return (PhysicalStatistics) Association.link(PhysicalStatistics.class, stats, element);
	}// link

} // Class PhysicalStatistics