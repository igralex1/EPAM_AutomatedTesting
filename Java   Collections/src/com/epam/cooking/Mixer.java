/*
 * Mixer
 *
 * v1.0
 *
 * Igor Usmanov
 */
package com.epam.cooking;

import com.epam.abstract_electrical_appliances.CookingElectricalAppliances;

import java.io.IOException;

public class Mixer extends CookingElectricalAppliances {

    public Mixer(String brandAppliance) throws IOException {
        super(brandAppliance);
    }

    @Override
    protected String getFolderName() {
        return "mixer";
    }
}
