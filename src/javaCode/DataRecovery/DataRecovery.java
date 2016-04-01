package javaCode.DataRecovery;

import java.io.*;
import java.util.ArrayList;

/*****
 * ** Created by kde on 20.03.16, 21:09
 ****/
public class DataRecovery {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));

        ArrayList<String[]> arrayList = readFromFile(file);

        for (String[] strings: arrayList) {
            System.out.println(getRecoveryData(strings));
        }

    }

    public static String getRecoveryData(String[] strings) {
        String[] words = strings[0].split(" ");
        String[] numbers = strings[1].split(" ");
        String[] answers = words.clone();
        String answer = "";
        int sizeWords = words.length;
        Integer[] fullNumbers = new Integer[sizeWords];

        int index = 0,
            tmp;

        for (String number: numbers){
            tmp = Integer.parseInt(number);
            fullNumbers[tmp-1] = tmp;
            answers[tmp - 1] = words[index++];
        }

        for (int i = 0; i < sizeWords; i++) {
            if (fullNumbers[i] == null) {
                answers[i] = words[index];
                i = sizeWords;
            }
        }

        for (String str: answers) {
            answer += str + " ";
        }
        return answer;
    }

    public static ArrayList<String[]> readFromFile(BufferedReader file) throws IOException {

        ArrayList<String[]> list = new ArrayList<>();
        String str;

        while ((str = file.readLine()) != null) {
            String[] lineFromFile = str.split(";");
            list.add(lineFromFile);
        }
        return list;
    }
}
