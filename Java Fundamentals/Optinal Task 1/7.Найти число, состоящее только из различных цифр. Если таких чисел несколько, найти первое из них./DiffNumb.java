//7.Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

public class DiffNumb {


    public static void main(String[] args) {
        differentNumber(args);
    }

    private static void differentNumber(String args[]) {
        // split an array into digit
        for (String digit : args) {
            // divide digits into numeral
            char numerals[] = new char[digit.length()];
            digit.getChars(0, digit.length(), numerals, 0);
            // check numeral to each other
            int k = 1;
            for (int i = 0; i < digit.length(); i++) {
                for (int j = i + 1; j < digit.length(); j++) {
                    if (numerals[i] != numerals[j]) {
                        if (k == 0) {
                            break;
                        }
                        k++;

                    } else {
                        k = 0;
                        break;
                    }

                }
            }
            if (k > 0) {
                System.out.println(digit);
            }
        }
    }
}
