//6.Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

public class AscendingOrder {


    public static void main(String[] args) {
        inAscendingOrder(args);
    }

    private static void inAscendingOrder(String args[]) {
        // split an array into digit
        for (String digit : args) {
            // divide digits into numeral
            char numerals[] = new char[digit.length()];
            digit.getChars(0, digit.length(), numerals, 0);
            // consistency check numeral[i++]-numeral[i] == 1
            int i = 0;
            int j = 0;
            while (i < numerals.length - 1) {
                if (numerals[i + 1] - numerals[i] == 1) {
                    j++;
                }
                i++;
            }
            if (j == digit.length() - 1) {
                System.out.println(digit);
            }
        }
    }
}
