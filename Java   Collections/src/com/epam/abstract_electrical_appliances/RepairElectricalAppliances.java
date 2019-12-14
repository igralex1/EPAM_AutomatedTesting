/*
 * RepairElectricalAppliances
 *
 * v1.0
 *
 * Igor Usmanov
 */
package com.epam.abstract_electrical_appliances;

import java.io.IOException;

public abstract class RepairElectricalAppliances extends HomeElectricalAppliances {
    protected RepairElectricalAppliances(String brandAppliance) throws IOException {
        super(brandAppliance);
    }

    @Override
    public String toString() {
        return "Brand : " + this.brandAppliance + ", Current (A) : " + this.current + ", Voltage (V) : " + this.voltage + ", Power (Vt) : " + this.power + " " + StatusAppliance();
    }
}
