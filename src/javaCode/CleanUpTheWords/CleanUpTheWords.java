package javaCode.CleanUpTheWords;

import java.io.IOException;
import java.util.ArrayList;

/*****
 * ** Created by kde on 24.03.16, 21:15
 ****/
public class CleanUpTheWords {
    public static void main(String[] args) throws IOException {
        ArrayList<String> cleanWords = cleanWords(args[0]);

        for (int i = 1; i < cleanWords.size(); i++) {
            if (cleanWords.get(i).equals("\n")) {
                System.out.print(cleanWords.get(i-1) + cleanWords.get(i++));
            } else {
                System.out.print(cleanWords.get(i-1) + " ");
            }

            if (i == cleanWords.size()-1) {
                System.out.print(cleanWords.get(i));
            }
        }
    }

    public static ArrayList<String> cleanWords(String fileName) throws
            IOException {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileName);
        ArrayList<String> listWords = new ArrayList<>();

        String strWord = "";
        int str;
        boolean flag = false;

        while (fileInputStream.available() > 0) {
            str = fileInputStream.read();

            if ((str > 64 && str < 90 && (fileInputStream.available() > 0))) {
                str += 32;
            }

            if ((str > 96 && str < 123 && (fileInputStream.available() > 0))) {

                strWord += (char) str;
                flag = true;

            } else {
                if (flag) {
                    listWords.add(strWord);
                }
                if (str == 10 || str == 12) {
                    listWords.add("\n");
                }
                strWord = "";
                flag = false;
            }
        }

        return listWords;
    }
}
