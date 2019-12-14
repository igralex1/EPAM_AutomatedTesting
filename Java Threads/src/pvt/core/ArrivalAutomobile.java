package pvt.core;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArrivalAutomobile extends Thread {
    private ArrayBlockingQueue<Automobile> arrayBlockingQueue;

    ArrivalAutomobile(ArrayBlockingQueue<Automobile> blockarr) {
        this.arrayBlockingQueue = blockarr;
    }

    @Override
    public void run() {
        for (int i = 1; i < 99; i++) {
            try {
                Automobile auto = new Automobile();
                //arrayBlockingQueue.put(auto);
                if (arrayBlockingQueue.offer(auto, 2, TimeUnit.SECONDS)) {
                    sleep(100);
                    System.out.println(auto + " припарковался");
                } else {
                    Automobile depAuto = new Automobile();
                    System.out.println("Парковка занята");
                    System.out.println(depAuto + " не припарковался и уехал");
                    System.out.println("Парковочнве места " + arrayBlockingQueue);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
