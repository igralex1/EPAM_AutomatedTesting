//1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

public class ShortAndLongNumber {

    public static void main(String[] args) {
        findShortAndLongNumber(args);
    }

    private static void findShortAndLongNumber(String[] args) {
        String shortNumber = args[0];
        String longNumber = args[0];
        for (String element : args) {
            if (shortNumber.length() > element.length()) {
                shortNumber = element;
            }
            if (longNumber.length() < element.length()) {
                longNumber = element;
            }
        }
        System.out.println("Short number is " + shortNumber + " It length is " + shortNumber.length());
        System.out.println("Long number is " + longNumber + " It length is " + longNumber.length());
    }
}


// Exception should be added if you don't enter no number in console

