/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mc6pac.toolchainCC8E;

import com.microchip.crownking.Pair;
import com.microchip.mplab.nbide.embedded.makeproject.api.configurations.MakeConfiguration;
import com.microchip.mplab.nbide.embedded.makeproject.api.configurations.MakeConfigurationBook;
import com.microchip.mplab.nbide.embedded.makeproject.api.configurations.OptionConfiguration;
import java.util.List;
import java.util.Properties;
import org.openide.util.Utilities;

public class CC8EMakeRuntimeProperties {
    public CC8EMakeRuntimeProperties(MakeConfigurationBook projectDescriptor, MakeConfiguration conf,Properties commandLineProperties) {
        commandLineProperties.put("SINGLE_MODE", getCompilerMode(projectDescriptor, conf));
        commandLineProperties.put("MP_LINK", getMPLinkerLocation(projectDescriptor, conf));
    }

    public boolean getCompilerMode(MakeConfigurationBook projectDescriptor, MakeConfiguration conf) {
        boolean res = true;
        if (!Utilities.isWindows())
            return res;
        // Check the option value
        OptionConfiguration confObject = projectDescriptor.getSynthesizedOptionConfiguration(conf.getName(), "cc8e-mode", null);
        if (confObject != null) {
            List<Pair<String, String>> emissionPairs = confObject.getEmissionPairs(null, null);
            if (emissionPairs != null) {
                for (Pair<String, String> p : emissionPairs) {
                    if (p.first.equals("singlemode")) {
                        res = p.second.equals("true");
                        break;
                    }
                }
            }
        }
        return res;
    }
    
    
    public String getMPLinkerLocation(MakeConfigurationBook projectDescriptor, MakeConfiguration conf) {
        String res = "";
        if (!Utilities.isWindows())
            return res;
        // Check the option value
        OptionConfiguration confObject = projectDescriptor.getSynthesizedOptionConfiguration(conf.getName(), "cc8e-mode", null);
        if (confObject != null) {
            List<Pair<String, String>> emissionPairs = confObject.getEmissionPairs(null, null);
            if (emissionPairs != null) {
                for (Pair<String, String> p : emissionPairs) {
                    if (p.first.equals("mplinklocation")) {
                        res = p.second.toString();
                        break;
                    }
                }
            }
        }
        return res;
    }

}
