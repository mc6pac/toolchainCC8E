/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.mc6pac.toolchainCC8E;

import com.microchip.mplab.nbide.embedded.makeproject.spi.configurations.UserIncludeProvider;

public class CC8EUserIncludeProvider extends UserIncludeProvider {
    
    public static final String OPT_ID = "CC8E";
    public static final String OPT_PROP = "user-includes";

    public CC8EUserIncludeProvider() {
        super(OPT_ID, OPT_PROP);
    }    
}
