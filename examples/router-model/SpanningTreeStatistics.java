/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class SpanningTreeStatistics as well as methods comparable
 * to the invokeMethods defined for this class. This Class implements the SpanningTreeStatisticsBean Interface. The CIM class SpanningTreeStatistics
 * is described as follows:
 * 
 * Statistical information regarding the SpanningTreeService.
 */
public class SpanningTreeStatistics extends ServiceStatisticalInformation
		implements Serializable {

	/**
	 * This constructor creates a SpanningTreeStatisticsBeanImpl Class which implements the SpanningTreeStatisticsBean Interface, and encapsulates the
	 * CIM class SpanningTreeStatistics in a Java Bean. The CIM class SpanningTreeStatistics is described as follows:
	 * 
	 * Statistical information regarding the SpanningTreeService.
	 */
	public SpanningTreeStatistics() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property timeSinceTopologyChange.
	 */
	private long	timeSinceTopologyChange;

	/**
	 * This method returns the SpanningTreeStatistics.timeSinceTopologyChange property value. This property is described as follows:
	 * 
	 * The time since the last topology change was detected by the switch.
	 * 
	 * @return long current timeSinceTopologyChange property value
	 * @exception Exception
	 */
	public long getTimeSinceTopologyChange() {

		return this.timeSinceTopologyChange;
	} // getTimeSinceTopologyChange

	/**
	 * This method sets the SpanningTreeStatistics.timeSinceTopologyChange property value. This property is described as follows:
	 * 
	 * The time since the last topology change was detected by the switch.
	 * 
	 * @param long new timeSinceTopologyChange property value
	 * @exception Exception
	 */
	public void setTimeSinceTopologyChange(long timeSinceTopologyChange) {

		this.timeSinceTopologyChange = timeSinceTopologyChange;
	} // setTimeSinceTopologyChange

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property topChanges.
	 */
	private long	topChanges;

	/**
	 * This method returns the SpanningTreeStatistics.topChanges property value. This property is described as follows:
	 * 
	 * The total number of topology changes detected by the switch since the counter was last reset or initialized.
	 * 
	 * @return long current topChanges property value
	 * @exception Exception
	 */
	public long getTopChanges() {

		return this.topChanges;
	} // getTopChanges

	/**
	 * This method sets the SpanningTreeStatistics.topChanges property value. This property is described as follows:
	 * 
	 * The total number of topology changes detected by the switch since the counter was last reset or initialized.
	 * 
	 * @param long new topChanges property value
	 * @exception Exception
	 */
	public void setTopChanges(long topChanges) {

		this.topChanges = topChanges;
	} // setTopChanges

} // Class SpanningTreeStatistics