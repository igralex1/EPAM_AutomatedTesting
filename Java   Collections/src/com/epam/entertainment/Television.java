/*
 * Television
 *
 * v1.0
 *
 * Igor Usmanov
 */
package com.epam.entertainment;

import com.epam.abstract_electrical_appliances.EntertainmentElectrcalAppliance;

import java.io.IOException;

public class Television extends EntertainmentElectrcalAppliance {
    public Television(String brandAppliance) throws IOException {
        super(brandAppliance);
    }

    @Override
    protected String getFolderName() {
        return "television";
    }
}
