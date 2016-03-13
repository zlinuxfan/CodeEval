package javaCode.FizzBuzz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*****
 *** Created by kde on 13.03.16, 16:45
 ****/
public class FizzBazzPrimitiveArray {
    public static void main(String[] args) throws Exception {

        String patchFile = args[0];
        BufferedReader file = new BufferedReader(new FileReader(patchFile));

        ArrayList<Integer[]> arrayList = readFromFile(file);

        for (Integer[] list: arrayList) {
            System.out.println(makeFizzBuzz(list));
        }

    }

    public static String makeFizzBuzz(Integer[] list) {
        String str = "";

        for (int i = 1; i <= list[2]; i++) {
            if ((i % list[0]) == 0 && (i % list[1]) == 0) {
                str += "FB" + " ";
            } else if (i % list[0] == 0) {
                str += "F" + " ";
            } else if (i % list[1] == 0) {
                str += "B" + " ";
            } else
                str += i + " ";
        }

        return str;
    }

    public static ArrayList<Integer[]> readFromFile(BufferedReader file) throws IOException {
        ArrayList<Integer[]> arrayList = new ArrayList<>();
        Integer[] list;
        String str;

        while ((str = file.readLine()) != null) {
            list = new Integer[3];
            String[] lineFromFile = str.split(" ");
            int index = 0;

            for (String el : lineFromFile) {
                list[index++] = Integer.parseInt(el);
            }
            arrayList.add(list);
        }
        return arrayList;
    }
}
