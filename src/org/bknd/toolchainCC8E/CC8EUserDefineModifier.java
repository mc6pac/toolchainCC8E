/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bknd.toolchainCC8E;

import com.microchip.mplab.nbide.embedded.makeproject.spi.configurations.UserDefineModifier;

public class CC8EUserDefineModifier extends UserDefineModifier {
    
    public CC8EUserDefineModifier() {
        super(CC8EUserDefineProvider.OPT_ID, CC8EUserDefineProvider.OPT_PROP);
    }

}
