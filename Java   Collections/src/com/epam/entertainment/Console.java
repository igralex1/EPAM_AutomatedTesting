/*
 * Console
 *
 * v1.0
 *
 * Igor Usmanov
 */
package com.epam.entertainment;

import com.epam.abstract_electrical_appliances.EntertainmentElectrcalAppliance;

import java.io.IOException;

public class Console extends EntertainmentElectrcalAppliance {
    public Console(String brandAppliance) throws IOException {
        super(brandAppliance);
    }

    @Override
    protected String getFolderName() {
        return "console";
    }
}
