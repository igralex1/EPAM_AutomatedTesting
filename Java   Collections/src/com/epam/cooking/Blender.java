/*
 * Blender
 *
 * v1.0
 *
 * Igor Usmanov
 */
package com.epam.cooking;

import com.epam.abstract_electrical_appliances.CookingElectricalAppliances;

import java.io.IOException;

public class Blender extends CookingElectricalAppliances {
    public Blender(String brand) throws IOException {
        super(brand);
    }

    @Override
    protected String getFolderName() {
        return "blender";
    }
}
