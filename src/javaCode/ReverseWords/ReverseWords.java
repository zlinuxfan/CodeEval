package javaCode.ReverseWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*****
 * ** Created by kde on 22.03.16, 22:01
 ****/
public class ReverseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));

        for (String[] strings: readFromFile(file)) {
            for (int i = strings.length-1; i >= 0 ; i--) {
                System.out.print(strings[i] + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<String[]> readFromFile(BufferedReader file) throws IOException {
        ArrayList<String[]> arrayList = new ArrayList<>();

        String str;

        while ((str = file.readLine()) != null) {

            String[] lineFromFile = str.split(" ");

            arrayList.add(lineFromFile);
        }
        return arrayList;
    }
}
