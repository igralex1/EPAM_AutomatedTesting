// 1. Приветствовать любого пользователя при вводе его имени через командную строку.

import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        Hello();

    }

    private static void Hello() {
        String name;
        System.out.println("What is your name?");
        Scanner nameInput = new Scanner(System.in);
        name = nameInput.nextLine();
        System.out.println("Hello " + name + " !!! You are welcome ...");
    }
}
