/*
 * Toster
 *
 * v1.0
 *
 * Igor Usmanov
 */
package com.epam.cooking;

import com.epam.abstract_electrical_appliances.CookingElectricalAppliances;

import java.io.IOException;


public class Toster extends CookingElectricalAppliances {
    public Toster(String brandAppliance) throws IOException {
        super(brandAppliance);
    }

    @Override
    protected String getFolderName() {
        return "toster";
    }
}


