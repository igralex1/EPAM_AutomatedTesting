/*
 * Разработать консольное многопоточное приложение.
 * Использовать возможности, предоставляемые пакетом java.util.concurrent.
 * Все сущности, желающие получить доступ к ресурсу, должны быть потоками.
 *
 * Автостоянка. Доступно несколько машиномест. На одном месте может находиться только один автомобиль.
 *  Если все места заняты, то автомобиль не станет ждать больше определенного времени и уедет на другую стоянку.
 */

package pvt.core;

import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int capacity = 3;
        final ArrayBlockingQueue<Automobile>
                queue = new ArrayBlockingQueue<Automobile>(capacity);

        DepartureAutomobile departure = new DepartureAutomobile(queue);
        ArrivalAutomobile arrive = new ArrivalAutomobile(queue);

        departure.start();
        arrive.start();
    }
}