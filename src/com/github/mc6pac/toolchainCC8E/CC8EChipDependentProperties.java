/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mc6pac.toolchainCC8E;

import com.microchip.crownking.mplabinfo.DeviceSupport;
import com.microchip.crownking.mplabinfo.DeviceSupportException;
import com.microchip.crownking.mplabinfo.FamilyDefinitions;
import com.microchip.mplab.nbide.embedded.makeproject.api.configurations.MakeConfiguration;
import org.openide.util.Exceptions;

public class CC8EChipDependentProperties {

    private static String getDeviceName(MakeConfiguration makeConf){
        return makeConf.getDevice().getName();    
    }
            
    public static String getProcessorNameForCompiler(MakeConfiguration makeConf){
        String shortname = getDeviceName(makeConf).substring(3);
        return shortname.toLowerCase();
    }
    
    public static String getProcessorShortNameForCompiler(MakeConfiguration makeConf) {
        String shortname = getDeviceName(makeConf).substring(3);
        return shortname.toUpperCase();
    }
    
    public static String getProcessorCoreType(MakeConfiguration makeConf){
        String ret = "";
        try{    
            DeviceSupport deviceSupport = DeviceSupport.getInstance();
            DeviceSupport.Device dev = deviceSupport.getDeviceFromDeviceName(getDeviceName(makeConf));
            FamilyDefinitions.Family family = dev.getFamily();
            switch (family) {
                case PIC18:
                    ret = "1800";
//                    ret = family.hasSubFamily(FamilyDefinitions.SubFamily.PIC18) ? "1810" : "1800";
                    break;
            }
        } catch (DeviceSupportException ex) {
            Exceptions.printStackTrace(ex);
        }
        return ret;
    }
}
