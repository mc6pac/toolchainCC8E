/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mc6pac.toolchainCC8E;

import com.microchip.mplab.nbide.embedded.spi.BuiltinProvider;
import java.util.HashSet;
import java.util.Set;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ProjectConfiguration;

public class CC8EBuiltinProvider implements BuiltinProvider {

    private static final Set<String> BUILTINS;

    static { 
        BUILTINS = new HashSet<>();
        BUILTINS.add("btsc");
        BUILTINS.add("btss");
        BUILTINS.add("clearRAM");
        BUILTINS.add("clrwdt");
        BUILTINS.add("decsz");
        BUILTINS.add("incsz");
        BUILTINS.add("nop");
        BUILTINS.add("nop2");
        BUILTINS.add("retint");
        BUILTINS.add("rl");
        BUILTINS.add("rr");
        BUILTINS.add("sleep");
        BUILTINS.add("skip");
        BUILTINS.add("swap");
        BUILTINS.add("addWFC");
        BUILTINS.add("subWFB");
        BUILTINS.add("sl");
        BUILTINS.add("lsr");
        BUILTINS.add("asr");
        BUILTINS.add("softReset");
    }
  
    @Override
    public Set<String> getBuiltins(Project project, ProjectConfiguration pc, String string) {
        return BUILTINS;
    }
}
