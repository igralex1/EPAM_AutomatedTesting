/*
 * HomeElectricalAppliances
 *
 * v1.0
 *
 * Igor Usmanov
 */
package com.epam.abstract_electrical_appliances;

import java.io.*;
import java.util.Scanner;

public abstract class HomeElectricalAppliances {
    protected double current;
    protected final double voltage = 220;
    protected double power;
    protected String brandAppliance;
    boolean exists = new File("/home/u7man/IdeaProjects/Java   Collections/src/com/epam/data/" + this.getFolderName() + "/" + getBrandAppliance() + "/current.txt").isFile();

    protected boolean applianceSwitch = false;

    HomeElectricalAppliances(String brandAppliance) throws IOException {
        this.brandAppliance = brandAppliance;
        boolean exists = new File("/home/u7man/IdeaProjects/Java   Collections/src/com/epam/data/" + this.getFolderName() + "/" + getBrandAppliance() + "/current.txt").isFile();

        if (exists) {
            getCurrentFromFile();
        } else {
            createPathForObject(this.toString(), this.brandAppliance);
            setCurrent(this.toString(), this.brandAppliance);
        }
        //Внес данные в соответствуюшие файлы
        // getPower();
    }

    protected abstract String getFolderName();

    public void PlugInOutAppliance() {
        applianceSwitch = applianceSwitch != true ? true : false;
    }

    public String StatusAppliance() {

        String status = applianceSwitch != true ?
                "Прибор " + brandAppliance + " включен в розетку" :
                "Прибор " + brandAppliance + " выключен из розетки";

        return status;
    }

    public String getBrandAppliance() {
        return brandAppliance;
    }

    protected void createPathForObject(String appliance, String brandAppliance) throws IOException {

        // создание /applianceDirectory/
        new File("/home/u7man/IdeaProjects/Java   Collections/src/com/epam/data/" + this.getFolderName() + "/").mkdir();

        //Создание brand.txt
        File file = new File("/home/u7man/IdeaProjects/Java   Collections/src/com/epam/data/" + this.getFolderName() + "/" + getBrandAppliance() + "/current.txt");
        file.getParentFile().mkdirs();
        FileWriter writer = new FileWriter(file);


    }

    public void setCurrent(String appliance, String brandAppliance) throws IOException {
        System.out.println("Введите значение силы тока для " + this.toString());
        Scanner in = new Scanner(System.in);
        current = in.nextDouble();

        FileWriter fw = new FileWriter("/home/u7man/IdeaProjects/Java   Collections/src/com/epam/data/" + this.getFolderName() + "/" + getBrandAppliance() + "/current.txt");
        fw.write(Double.toString(current));
        fw.close();
        getPower();

    }

    public double getCurrentFromFile() throws IOException {
        FileReader fr = new FileReader("/home/u7man/IdeaProjects/Java   Collections/src/com/epam/data/" + this.getFolderName() + "/" + getBrandAppliance() + "/current.txt");
        int i;
        String y = "";
        while ((i = fr.read()) != -1) {
            y += (char) i;
        }
        fr.close();
        current = Double.parseDouble(y);
        getPower();

        return this.current = Double.parseDouble(y);
    }

    public String getCurrent() {
        return Double.toString(current);
    }

    public double getPower() {
        this.power = this.current * this.voltage;

        return power;
    }
}
