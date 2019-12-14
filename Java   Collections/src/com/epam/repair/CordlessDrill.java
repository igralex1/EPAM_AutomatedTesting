/*
 * CordlessDrill
 *
 * v1.0
 *
 * Igor Usmanov
 */
package com.epam.repair;

import com.epam.abstract_electrical_appliances.RepairElectricalAppliances;

import java.io.IOException;

public class CordlessDrill extends RepairElectricalAppliances {
    private double voltage = 12.2;

    public CordlessDrill(String brandAppliance) throws IOException {
        super(brandAppliance);
    }

    @Override
    protected String getFolderName() {
        return "cordlessdrill";
    }

    @Override
    public String StatusAppliance() {
        String status = applianceSwitch != true ?
                "Из прибора " + brandAppliance + " вынят аккумулятор" :
                "В прибор " + brandAppliance + " вставлен аккумулятор";
        System.out.println(status);
        return status;
    }
}
