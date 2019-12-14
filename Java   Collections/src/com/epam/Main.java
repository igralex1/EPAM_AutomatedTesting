
package com.epam;

import com.epam.abstract_electrical_appliances.HomeElectricalAppliances;
import com.epam.cooking.Blender;
import com.epam.cooking.Mixer;
import com.epam.cooking.Toster;
import com.epam.entertainment.Computer;
import com.epam.entertainment.Console;
import com.epam.entertainment.Television;
import com.epam.repair.CordlessDrill;
import com.epam.repair.Drill;
import com.epam.repair.Multimeter;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {

    public static void main(String[] args) throws IOException {
        // Cooking appliance
        Toster toster = new Toster("Tefal");
        System.out.println(toster);
        Mixer mixer = new Mixer("Bosch");
        Blender blender = new Blender("KitFort");

        toster.StatusAppliance();
        toster.PlugInOutAppliance();
        toster.StatusAppliance();

        mixer.StatusAppliance();
        mixer.PlugInOutAppliance();
        mixer.StatusAppliance();

        blender.StatusAppliance();
        blender.PlugInOutAppliance();
        blender.StatusAppliance();

        //Entertaiment appliance
        Computer computer = new Computer("Apple");
        Console console = new Console("PlayStation");
        Television television = new Television("Samsung");

        computer.StatusAppliance();
        computer.PlugInOutAppliance();
        computer.StatusAppliance();

        console.StatusAppliance();
        console.PlugInOutAppliance();
        console.StatusAppliance();

        television.StatusAppliance();
        television.PlugInOutAppliance();
        television.StatusAppliance();

        //Repair appliance
        CordlessDrill cordlessDrill = new CordlessDrill("EKT");
        Drill drill = new Drill("Makita");
        Multimeter multimeter = new Multimeter("Mastech");

        // Error работает от батареи
        cordlessDrill.StatusAppliance();
        cordlessDrill.PlugInOutAppliance();
        cordlessDrill.StatusAppliance();

        drill.StatusAppliance();
        drill.PlugInOutAppliance();
        drill.StatusAppliance();

        // Error работает от кроны
        multimeter.StatusAppliance();
        multimeter.PlugInOutAppliance();
        multimeter.StatusAppliance();

        ArrayList<HomeElectricalAppliances> appliances = new ArrayList();
        appliances.add(toster);
        appliances.add(mixer);
        appliances.add(blender);
        appliances.add(computer);
        appliances.add(television);
        appliances.add(console);
        appliances.add((cordlessDrill));
        appliances.add(drill);
        appliances.add(multimeter);

        // Сортировка по мощности
        System.out.println(appliances);
            Comparator <HomeElectricalAppliances> comparator = new Comparator<HomeElectricalAppliances>() {
                @Override
                public int compare(HomeElectricalAppliances homeElectricalAppliances, HomeElectricalAppliances t1) {
                    return (Double.toString(homeElectricalAppliances.getPower())).compareTo((Double.toString(t1.getPower())));
                }
            };
            Collections.sort(appliances,comparator);
        System.out.println(appliances);

        // Сортировка по  диапозону мощности
        ArrayList <HomeElectricalAppliances> ListHome500 = new ArrayList<>();
        for ( HomeElectricalAppliances el : appliances) {
            if(el.getPower() < 500 ){
                ListHome500.add(el);
            }
        }
        System.out.println(ListHome500);


    }
}

