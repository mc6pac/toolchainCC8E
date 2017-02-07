/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bknd.toolchainCC8E;

import com.microchip.mplab.nbide.embedded.makeproject.spi.configurations.UserIncludeModifier;

public class CC8EUserIncludeModifier extends UserIncludeModifier
{
    
    public CC8EUserIncludeModifier() {
        super(CC8EUserIncludeProvider.OPT_ID, CC8EUserIncludeProvider.OPT_PROP);
    }
    
}
