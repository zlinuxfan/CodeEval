package javaCode.CleanUpTheWords;

import java.io.IOException;
import java.util.ArrayList;

/*****
 * ** Created by kde on 24.03.16, 21:15
 ****/
public class CleanUpTheWordsLong {
    public static void main(String[] args) throws IOException {
        cleanUp(args[0]);
    }

    public static void cleanUp(String fileName) throws
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
                    System.out.print(strWord);
                }
                if (str == 10 || str == 12) {
                    listWords.add("\n");
                    System.out.print("\n");
                }
                strWord = "";
                flag = false;
            }
        }
    }
}
