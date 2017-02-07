/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bknd.toolchainCC8E;

import com.microchip.crownking.opt.Version;

public class CC8EVersionFactory implements Version.Factory {

    @Override
    public Version create(String string) {
        return new CC8EVersion(string);
    }
}
