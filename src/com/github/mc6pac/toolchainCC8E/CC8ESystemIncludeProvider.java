/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mc6pac.toolchainCC8E;

import com.microchip.mplab.nbide.embedded.makeproject.api.configurations.MakeConfiguration;
import com.microchip.mplab.nbide.embedded.spi.IncludeProvider;
import com.microchip.mplab.nbide.toolchainCommon.LTUtils;
import java.util.ArrayList;
import java.util.List;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ProjectConfiguration;

public class CC8ESystemIncludeProvider implements IncludeProvider {

    @Override
    public List<String> getIncludes(Project project, ProjectConfiguration projectConf, String itemPath) {
        MakeConfiguration makeConf = (MakeConfiguration)projectConf;

        final List<String> ret = new ArrayList<>();
        final String pathToBin = LTUtils.pathToBin(projectConf);

        ret.add(pathToBin);
        
        return ret;
    }
    
}
