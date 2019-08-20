/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mc6pac.toolchainCC8E;

import com.microchip.mplab.nbide.embedded.spi.IncludeProvider;
import com.microchip.mplab.nbide.toolchainCommon.properties.CommonLanguageToolchainPropertiesUtils;
import java.util.ArrayList;
import java.util.List;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ProjectConfiguration;

public class CC8ESystemIncludeProvider implements IncludeProvider {

    private final CommonLanguageToolchainPropertiesUtils utils = new CommonLanguageToolchainPropertiesUtils();

    @Override
    public List<String> getIncludes(Project project, ProjectConfiguration projectConf, String itemPath) {
        final List<String> ret = new ArrayList<>();
        final String pathToBin = utils.pathToBin(projectConf);

        ret.add(pathToBin);
        
        return ret;
    }    
}
