// 5. Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.

import java.util.*;

public class FindEven {


    public static void main(String[] args) {
        FindEvenNumber(args);
    }

    private static void FindEvenNumber(String args[]) {
        // There are three stacks show the answer on this task
        Stack<String> evenLessOdd = new Stack<String>();
        Stack<String> oddLessEven = new Stack<String>();
        Stack<String> oddEqualEven = new Stack<String>();

        for (String el : args) {
            int value = Integer.parseInt(el);
            if (value % 2 == 0) {
                String[] stringValue = el.split("");
                System.out.println(el);
                // help to calculate in which number more or less odd and even digits
                int even = 0;
                int odd = 0;
                for (String element : stringValue) {
                    if (Integer.parseInt(element) % 2 == 0) {
                        //even digit
                        even++;
                    } else {
                        //odd digit
                        odd++;
                    }
                }
                if (even < odd) {
                    evenLessOdd.add(el);
                } else if (even == odd) {
                    oddEqualEven.add(el);
                } else {
                    oddLessEven.add(el);
                }
            }
        }
        System.out.println("oddLessEven : " + oddLessEven);
        System.out.println("evenLessOdd : " + evenLessOdd);
        System.out.println("oddEqualEven : " + oddEqualEven);
    }
}
