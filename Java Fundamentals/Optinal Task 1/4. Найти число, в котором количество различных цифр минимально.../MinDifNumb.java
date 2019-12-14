//        4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.

import java.util.*;

public class MinDifNumb {


    public static void main(String[] args) {

        //String[] s = new String[] {"31","252","81","4454","1","33"};
        MinimalDifferentValue(args);
    }


    //    Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
    private static void MinimalDifferentValue(String[] args) {
        int[] markedNumber = new int[args.length];
        for (String el : args) {
            char[] sliceNumb = new char[el.length()];
            el.getChars(0, el.length(), sliceNumb, 0);
            printRepeating(sliceNumb, sliceNumb.length);
        }
    }

    private static String printRepeating(char arr[], int size) {
        // Creates an empty hashset
        HashSet<Character> h = new HashSet<>();
        String s = "";

        // Traverse the input array from left to right
        for (int i = 0; i <= arr.length - 1; i++) {
            char c = arr[i];
            // If element is already in hash set, update x
            // and then break
            if (h.contains(c)) {
                return "";
            } else {
                // Else add element to hash set
                h.add(c);
                s += c;
            }

        }
        System.out.println("The number of different digits is minimal : " + s);
        return s;
    }

}
