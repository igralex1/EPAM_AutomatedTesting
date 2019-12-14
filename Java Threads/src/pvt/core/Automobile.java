package pvt.core;

import java.util.Random;

public class Automobile extends Thread {
    private String nameAuto;
    private int valueAuto;

    Automobile() {
        this.nameAuto = "Авто c номером ";
        this.valueAuto = +1000 + (int) (Math.random() * 7000);
    }

    @Override
    public synchronized String toString() {
        return nameAuto + " " + String.valueOf(valueAuto);
    }
}
