/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bknd.toolchainCC8E;

import com.microchip.mplab.nbide.embedded.makeproject.spi.configurations.UserDefineProvider;

/**
 *
 * @author Patrick
 */
public class CC8EUserDefineProvider extends UserDefineProvider {
    
    public static final String OPT_ID = "CC8E";
    public static final String OPT_PROP = "user-defines";    

    public CC8EUserDefineProvider() {
        super(OPT_ID, OPT_PROP);
    }
    
}