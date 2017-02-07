/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bknd.toolchainCC8E;

import com.microchip.mplab.nbide.embedded.api.LanguageToolSupport;
import com.microchip.mplab.nbide.embedded.spi.VersionProvider;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;

public class CC8EVersionProvider implements VersionProvider {

    @Override
    public String getVersion(String directory) {
        if (directory == null || directory.isEmpty())
            return "";
        
        String pathToCompiler = directory + File.separator + "cc5x.exe";

        try
        {
            Matcher m = LanguageToolSupport.findInOutput(pathToCompiler, new String [] {"-S"}, "CC8E.+(\\d\\.\\d[A-Z]?)", true, true);
            if (m == null) {
                return "";
            }
            return m.group(1);
        }
        catch (IOException ex)
        {
        }

        return "";
    }
    
}
