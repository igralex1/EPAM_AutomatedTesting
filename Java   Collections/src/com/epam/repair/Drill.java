package com.epam.repair;

import com.epam.abstract_electrical_appliances.RepairElectricalAppliances;

import java.io.IOException;

public class Drill extends RepairElectricalAppliances {

    public Drill(String brandAppliance) throws IOException {
        super(brandAppliance);
    }

    @Override
    protected String getFolderName() {
        return "drill";
    }
}
