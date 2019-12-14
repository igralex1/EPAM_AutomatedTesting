package com.epam.repair;

import com.epam.abstract_electrical_appliances.RepairElectricalAppliances;

import java.io.IOException;

/*
 * Multimeter
 *
 * v1.0
 *
 * Igor Usmanov
 */
public class Multimeter extends RepairElectricalAppliances {
    private double voltage = 9.2;

    public Multimeter(String brandAppliance) throws IOException {
        super(brandAppliance);
    }

    @Override
    protected String getFolderName() {
        return "multimeter";
    }

    @Override
    public String StatusAppliance() {
        String status = applianceSwitch != true ?
                "Из прибора " + brandAppliance + " вынята крона" :
                "В прибор " + brandAppliance + " вставлена крона";
        System.out.println(status);
        return status;
    }
}
