/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12 
 * 09:21:06 CET 2011. 
 */

package net.i2cat.mantychore.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined 
 * in the CIM class LogicalPortSettings as well as methods comparable to the 
 * invokeMethods defined for this class. This Class implements the 
 * LogicalPortSettingsBean Interface. The CIM class LogicalPortSettings is 
 * described as follows: 
 * 
 * A LogicalPort may be configured via the LogicalPortSettings class. The 
 * configuration changes are expected to be stored to non-volatile memory. 
 */
public class LogicalPortSettings extends SettingData implements Serializable 
    {

    /**
     * This constructor creates a LogicalPortSettingsBeanImpl Class which 
     * implements the LogicalPortSettingsBean Interface, and encapsulates the 
     * CIM class LogicalPortSettings in a Java Bean. The CIM class 
     * LogicalPortSettings is described as follows: 
     * 
     * A LogicalPort may be configured via the LogicalPortSettings class. The 
     * configuration changes are expected to be stored to non-volatile 
     * memory. 
     */
    public LogicalPortSettings(){};
    /**
     * The following constants are defined for use with the ValueMap/Values 
     * qualified property requestedSpeed. 
     */
    private long requestedSpeed;
    /**
     * This method returns the LogicalPortSettings.requestedSpeed property 
     * value. This property is described as follows: 
     * 
     * The requested bandwidth of the Port in Bits per Second. The actual 
     * bandwidth is reported in LogicalPort.Speed. 
     * 
     * @return	long	current requestedSpeed property value
     * @exception	Exception	
     */
    public long getRequestedSpeed(){

    return this.requestedSpeed;
    } // getRequestedSpeed

    /**
     * This method sets the LogicalPortSettings.requestedSpeed property value. 
     * This property is described as follows: 
     * 
     * The requested bandwidth of the Port in Bits per Second. The actual 
     * bandwidth is reported in LogicalPort.Speed. 
     * 
     * @param	long	new requestedSpeed property value
     * @exception	Exception	
     */
    public void setRequestedSpeed(long requestedSpeed) {

    this.requestedSpeed = requestedSpeed;
    } // setRequestedSpeed


    /**
     * The following constants are defined for use with the ValueMap/Values 
     * qualified property autoSenseSpeed. 
     */
    private boolean autoSenseSpeed;
    /**
     * This method returns the LogicalPortSettings.autoSenseSpeed property 
     * value. This property is described as follows: 
     * 
     * A boolean indicating whether the LogicalPort should automatically 
     * negotiate an optimal bandwidth (TRUE), or attempt to communicate only 
     * at the RequestedSpeed (FALSE). The actual bandwidth is reported in 
     * LogicalPort.Speed. Changing this value to (FALSE) may cause the 
     * OperationalStatus to change to [stopped] if the RequestedSpeed is not 
     * compatible with the attached device Check 
     * LogicalPortCapabilities.AutoSenseSpeedConfigurable to see if this 
     * value may be changed. 
     * 
     * @return	boolean	current autoSenseSpeed property value
     * @exception	Exception	
     */
    public boolean isAutoSenseSpeed(){

    return this.autoSenseSpeed;
    } // getAutoSenseSpeed

    /**
     * This method sets the LogicalPortSettings.autoSenseSpeed property value. 
     * This property is described as follows: 
     * 
     * A boolean indicating whether the LogicalPort should automatically 
     * negotiate an optimal bandwidth (TRUE), or attempt to communicate only 
     * at the RequestedSpeed (FALSE). The actual bandwidth is reported in 
     * LogicalPort.Speed. Changing this value to (FALSE) may cause the 
     * OperationalStatus to change to [stopped] if the RequestedSpeed is not 
     * compatible with the attached device Check 
     * LogicalPortCapabilities.AutoSenseSpeedConfigurable to see if this 
     * value may be changed. 
     * 
     * @param	boolean	new autoSenseSpeed property value
     * @exception	Exception	
     */
    public void setAutoSenseSpeed(boolean autoSenseSpeed) {

    this.autoSenseSpeed = autoSenseSpeed;
    } // setAutoSenseSpeed



} // Class LogicalPortSettings