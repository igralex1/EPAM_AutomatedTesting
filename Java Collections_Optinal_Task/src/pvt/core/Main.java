package pvt.core;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void reverseStringFromFile() throws IOException {
        //1.   Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
        ArrayList<String> listFromDataFile = new ArrayList();
        FileReader fr = new FileReader("/home/u7man/IdeaProjects/Java Collections_Optinal_Task/src/pvt/core/data/data.txt");
        String str = "";
        int i;
        while ((i = fr.read()) != -1) {
            str += Character.toString((char) i);
        }
        fr.close();

        String[] arrOfStr = str.split("\n");
        for (String a : arrOfStr)
            listFromDataFile.add(a);
        System.out.println(listFromDataFile);

        ArrayList<String> revArrayList = new ArrayList<>();
        for (int j = listFromDataFile.size() - 1; j >= 0; j--) {
            revArrayList.add(listFromDataFile.get(j));
        }
        System.out.println(revArrayList);
    }

    public static void main(String[] args) throws IOException {
        //reverseStringFromFile();

        //   7. Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}». Проверить правильность расстановки скобок. Использовать стек.
        String sentence = "" +
                "Pictures beetle wasn't. " +
                "Live (license all work freezes you perpetual worrying managed. " +
                "Lock [when down forth.] Serious mind create suspend unacceptable again." +
                " Relating {Talking talking} closed you cure learnenglish term. " +
                "Pet (One living ask prohibited work. " +
                "Same[ adapt sitting flooding psychiatrists terrible particular suggested screams. " +
                "You climbed years {schools.] Violation them you pictures unacceptable uses liable discretion uses sole offence. " +
                "Caps harmful reproduce do ip oriented still you've poll. State Aggrieved work screams avoid including validate. " +
                "Don't don't all usually additionally do audio arachnophobia particular being realised.";

        findOpenBrackets(sentence, '(');
        findOpenBrackets(sentence, '[');
        findOpenBrackets(sentence, '{');

    }

    public static void findOpenBrackets(String sentence, char bracket) {
        Stack<Character> sentenceInStack = new Stack<Character>();
        ArrayList position = new ArrayList();
        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) == bracket) {
                position.add(i);
                sentenceInStack.push(sentence.charAt(i));
            }

            if (!sentenceInStack.empty() && i == sentence.length() - 1) {
                for (int k = 0; k < position.size(); k++) {
                    System.out.println("В строке есть открытая скобка \"" + bracket + "\" на позиции " + position.get(k));
                }
            }
        }
    }
}
