// 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

import java.util.Scanner;

enum Months {
    JANUARY(1),
    FEBUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);
    int value;

    Months(int value) {
        this.value = value;
    }

    Months() {
    }
}

public class ChooseMonth {
    private static void Info(int i) {
        System.out.println(Months.values()[--i].toString());
    }

    public static void main(String[] args) {

        System.out.println("Enter a number of month:");
        System.out.println("1 - JANUARY");
        System.out.println("2 - FEBUARY");
        System.out.println("3 - MARCH");
        System.out.println("4 - APRIL");
        System.out.println("5 - MAY");
        System.out.println("6 - JUNE");
        System.out.println("7 - JULY");
        System.out.println("8 - AUGUST");
        System.out.println("9 - SEPTEMBER");
        System.out.println("10 - OCTOBER");
        System.out.println("11- NOVEMBER");
        System.out.println("12 - DECEMBER");


        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        switch (i) {
            case 1:
                Info(i);
                break;
            case 2:
                Info(i);
                break;
            case 3:
                Info(i);
                break;
            case 5:
                Info(i);
                break;
            case 6:
                Info(i);
                break;
            case 7:
                Info(i);
                break;
            case 8:
                Info(i);
                break;
            case 9:
                Info(i);
                break;
            case 10:
                Info(i);
                break;
            case 11:
                Info(i);
                break;
            case 12:
                Info(i);
                break;
            default:
                System.out.println(" Unable to choose number. There was an error with your request. Please try again...");
        }
    }
}






