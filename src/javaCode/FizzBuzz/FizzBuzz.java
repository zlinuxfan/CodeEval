package javaCode.FizzBuzz;

import java.io.*;
import java.util.ArrayList;

/***
 * Created by ZLinuxFan on 12.03.16.
 ***/
public class FizzBuzz {
    public static void main(String[] args) throws Exception {

        String patchFile = args[0];
        BufferedReader file = new BufferedReader(new FileReader(patchFile));

        ArrayList<ArrayList> arrayList = readFromFile(file);

        for (ArrayList<Integer> list: arrayList) {
            System.out.println(toString(list));
            System.out.println(makeFizzBuzz(list));
        }

    }

    public static String makeFizzBuzz(ArrayList<Integer> list) {
        String str = "";

        for (int i = 1; i <= list.get(2); i++) {
            if ((i % list.get(0)) == 0 && (i % list.get(1)) == 0) {
                str += "FB" + " ";
            } else if (i % list.get(0) == 0) {
                str += "F" + " ";
            } else if (i % list.get(1) == 0) {
                str += "B" + " ";
            } else
                str += i + " ";
        }

        return str;
    }

    public static String toString(ArrayList<Integer> arrayList) {
        String str = "";

        for (Integer el: arrayList) {
            str += el + " ";
        }
        return str;
    }

    public static ArrayList<ArrayList> readFromFile(BufferedReader file) throws IOException {
        ArrayList<ArrayList> arrayList = new ArrayList<>();
        ArrayList<Integer> list;
        String str;

        while ((str = file.readLine()) != null) {
            list = new ArrayList<>();
            String[] lineFromFile = str.split(" ");

            for (String el : lineFromFile) {
                if (!el.equals(" "))
                    list.add(Integer.parseInt(el));
            }
            arrayList.add(list);
        }
        return arrayList;
    }
}
