package javaCode.StringMask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*****
 * ** Created by kde on 01.04.16, 14:57
 ****/
public class StringMask {

    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        System.out.println(applyMask(file));
    }

    public static String applyMask(BufferedReader file) throws IOException {

        String answer = "";
        int ch = file.read(),
                index = 0;
        ArrayList<Integer> listOfChars = new ArrayList<>();
        boolean andLine = false;

        do {
            if (ch > 96 && ch < 123) {
                listOfChars.add(ch);
            } else if (ch > 47 && ch < 58) {
                if (ch == 48) {
                    index++;
                } else {
                    listOfChars.set(index, (listOfChars.get(index) - 32));
                    index++;
                }
            } else if (ch == 10 || ch == 13) {
                listOfChars.add(ch);
                andLine = true;
                index = 0;
            }

            if (andLine) {
                answer += makeWord(listOfChars);
                listOfChars.clear();
                andLine = false;
            }

        } while ((ch = file.read()) > 0);

        answer += makeWord(listOfChars);
        listOfChars.clear();

        return answer;
    }

    private static String makeWord(ArrayList<Integer> chars) {
        String word = "";

        for (Integer i : chars) {
            word += (char) (int) i;
        }
        return word;
    }
}
