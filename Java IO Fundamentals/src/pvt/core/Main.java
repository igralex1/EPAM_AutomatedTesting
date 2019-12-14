//Реализовать программу которая будет получать в качестве аргумента командной строки путь к директории,
// например "D:/movies". Записать в текстовый файл структуру папок и файлов в виде, похожем на выполнение программы tree /F.
// Пример:
//
//        Amon Amarth
//        |-----2004 - Fate Of Norns
//        |       01 - An Ancient Sign Of Coming Storm.mp3
//        |       02 - Where Death Seems To Dwell.mp3
//        |       03 - The Fate Of Norns.mp3
//        |       04 - The Pursuit Of Vikings.mp3
//        |       05 - Valkyries Ride.mp3
//        |       06 - The Beheading Of A King.mp3
//        |       07 - Arson.String temp;mp3
//        |       08 - Once Sealed In Blood.mp3
//        |
//        |-----2016 - Jomsviking
//        |       01 First Kill.mp3
//        |       02 Wanderer.mp3
//        |       03 On A Sea Of Blood.mp3
//        |       04 One Against All.mp3
//        |       05 Raise Your Horns.mp3
//        |       06 The Way Of Vikings.mp3
//        |       07 At Dawn’s First Light.mp3
//        |       08 One Thousand Burning Arrows.mp3
//        |       09 Vengeance Is My Name.mp3
//        |       10 A Dream That Cannot Be (feat. Doro Pesch).mp3
//        |       11 Back On Northern Shores.mp3
//        |       12 Death In Fire 2016.mp3
//        |       13 Death In Fire (Live).mp3
//        |
//        |-----2019 - Berserker
//        01 Fafner's Gold.mp3
//        02 Crack the Sky.mp3
//        03 Mjölner, Hammer of Thor.mp3
//        04 Shield Wall.mp3
//        05 Valkyria.mp3
//        06 Raven's Flight.mp3
//        07 Ironside.mp3
//        08 The Berserker at Stamford Bridge.mp3
//        09 When Once Again We Can Set Our Sails.mp3
//        10 Skoll and Hati.mp3
//        11 Wings of Eagles.mp3
//        12 Into the Dark.mp3
//
//        +Если в качестве параметра в программу передается не путь к директории, а путь к txt файлу по образцу выше - прочитать файл и вывести в консоль следующие данные:
//
//        +Количество папок
//        +Количество файлов
//        Среднее количество файлов в папке
//        +Среднюю длинну названия файла


package pvt.core;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // path (Unix filesystem) from args example
        String argsExample = "/home/u7man/IdeaProjects/Java IO Fundamentals/src/pvt/core/movies/drama/Logan";

        File maindir = new File(argsExample);

        if (maindir.exists() && maindir.isDirectory()) {
            File arr[] = maindir.listFiles();
            // recursive method
            showFilesAndDir(arr, 0, 0);

        } else {
            // Read file
            readFile(argsExample);

//        Количество папок
//        Количество файлов
//        Среднюю длинну названия файла
            anothreInformation(argsExample);
        }
    }


    public static void showFilesAndDir(File[] arr, int index, int level) {
        // terminate condition
        if (index == arr.length)
            return;

        // tabs for internal levels
        for (int i = 0; i < level; i++) {
            System.out.print("|\t");
        }

        // for files
        if (arr[index].isFile()) {
            System.out.println(arr[index].getName());
        }

        // for sub-directories
        else if (arr[index].isDirectory()) {
            System.out.println(arr[index].getName());
            // recursion for sub-directories
            showFilesAndDir(arr[index].listFiles(), 0, level + 1);
        }

        // recursion for main directory
        showFilesAndDir(arr, ++index, level);
    }

    public static void readFile(String argsExample) throws IOException {
        File file = new File(argsExample);

        BufferedReader br = new BufferedReader(new FileReader(file));

        System.out.println("В файле находится следующая информация:");
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }

    public static void anothreInformation(String argsExample) {
        File f = new File(argsExample);
        // Parent
        File fileFilm = new File(f.getParent());
        File[] pathnames;
        pathnames = fileFilm.listFiles();
        int files = 0;
        int directory = 0;
        int lengthFiles = 0;

        for (File pathname : pathnames) {
            if (pathname.isDirectory()) {
                directory++;
                System.out.println();

            } else {
                files++;
                String strFile = pathname.getName();
                lengthFiles += strFile.length();
            }
        }
        System.out.println("Files = " + files);
        System.out.println("Directories = " + directory);
        System.out.println("Average filename of all file is " + lengthFiles / files);
    }
}


