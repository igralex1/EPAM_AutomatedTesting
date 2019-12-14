//3.Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

public class Average {

    public static void main(String[] args) {
        NumbFromAverage(args);
    }

    private static void NumbFromAverage(String[] args) {
        int average = 0;
        for (String element : args) {
            average += element.length();
        }

        average /= args.length;
        System.out.println(average);
        for (String element : args) {
            if (element.length() < average)
                System.out.println("Value less than average : " + element + " and it length is " + element.length());
        }
    }
}    




