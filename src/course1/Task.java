package course1;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task {

    public static String readStringFromFile(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        String s = scanner.nextLine();
        scanner.close();
        return s;
    }

    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list = listOfAllInterrogativeSentences("В лингвистике термин «текст» используется в широком значении, включая и образцы устной речи. Восприятие текста изучается в рамках лингвистики текста и психолингвистики. Так, например, И. Р. Гальперин определяет текст следующим образом: «Это письменное сообщение, объективированное в виде письменного документа, состоящее из ряда высказываний, объединённых разными типами лексической, грамматической и");
        for (String s : list) {
            System.out.println(s);
        }
    }
    public static List<String> listOfAllInterrogativeSentences (String str){
        List<String> list= new ArrayList<>();

        //list = List.of(str.split("!")); // \\ нужны для того, чтобы джава не думала что мы команду какуе-то прописать хотим а просто символ
        list = List.of(str.split("[.!?]")); // .of вместо задачи new и  add те сократили
        // в [] мы сунули сразу несколько разделителей

        return list;
    }
}

