// 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        Random randomNumber = new Random();
        System.out.println("How many number do you wnat to see ?");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            randomNumbers.add(randomNumber.nextInt(30));
        }

        for (int el : randomNumbers) {
            System.out.println(el);
        }

    }
}






