/*
 * CookingElectricalAppliace
 *
 * v1.0
 *
 * Igor Usmanov
 */
package com.epam.abstract_electrical_appliances;

import java.io.IOException;

public abstract class CookingElectricalAppliances extends HomeElectricalAppliances {
    protected CookingElectricalAppliances(String brand) throws IOException {
        super(brand);
    }

    @Override
    public String toString() {
        return "Brand : " + this.brandAppliance + ", Current (A) : " + this.current + ", Voltage (V) : " + this.voltage + ", Power (Vt) : " + this.power + " " + StatusAppliance();
    }
}
