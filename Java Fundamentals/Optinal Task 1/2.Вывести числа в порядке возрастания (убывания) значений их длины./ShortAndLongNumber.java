//3.Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

public class ShortAndLongNumber {

    public static void main(String[] args) {
        FindShortAndLongNumber(args);
    }

    private static void FindShortAndLongNumber(String[] args) {

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
        System.out.println("Long number is " + longNumber + " It length is " + longNumber.length());
        System.out.println("Short number is " + shortNumber + " It length is " + shortNumber.length());
    }
}    



