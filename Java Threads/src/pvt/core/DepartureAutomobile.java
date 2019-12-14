package pvt.core;

import java.util.concurrent.ArrayBlockingQueue;

public class DepartureAutomobile extends Thread {
    private ArrayBlockingQueue<Automobile> arrayBlockingQueue;

    DepartureAutomobile(ArrayBlockingQueue<Automobile> blockarr) {
        this.arrayBlockingQueue = blockarr;
    }

    @Override
    public void run() {
        for (int i = 1; i < 99; i++) {
            try {
                sleep(4123);
                System.out.println(arrayBlockingQueue.take() + " уехал с парковки");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Парковочнве места " + arrayBlockingQueue);
    }

}
