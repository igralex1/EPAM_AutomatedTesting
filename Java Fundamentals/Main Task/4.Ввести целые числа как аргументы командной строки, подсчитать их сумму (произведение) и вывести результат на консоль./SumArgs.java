// 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

public class SumArgs {
    public static void main(String[] args) {
        double sum = 0;
        for (String el : args) {
            sum += Double.parseDouble(el);
        }
        System.out.println(Math.round(sum));

    }
}






