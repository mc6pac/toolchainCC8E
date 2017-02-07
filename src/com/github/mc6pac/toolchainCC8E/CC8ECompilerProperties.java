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
import com.microchip.mplab.nbide.toolchainCommon.LTUtils;
import java.util.List;
import java.util.Properties;

public class CC8ECompilerProperties {

    public CC8ECompilerProperties(MakeConfigurationBook projectDescriptor, MakeConfiguration conf, Properties commandLineProperties) {
        commandLineProperties.put("PROCESSOR_NAME", CC8EChipDependentProperties.getProcessorNameForCompiler(conf));
    }
}