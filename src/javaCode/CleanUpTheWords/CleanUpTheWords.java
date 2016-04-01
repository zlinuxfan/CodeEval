package javaCode.CleanUpTheWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*****
 * ** Created by kde on 25.03.16, 11:54
 ****/
public class CleanUpTheWords {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));

        System.out.print(readFromFile(file));
    }

    public static String cleanUp(String str) {
        StringBuilder result = new StringBuilder();

        for (String s : str.split("[^a-zA-Z]+")) {
            result.append(' ').append(s);
        }
        return result.toString().toLowerCase().trim();
    }

    public static String readFromFile(BufferedReader file) throws IOException {

        String str = file.readLine(),
               answer = "";

        do {
            answer += cleanUp(str) + "\n";
        } while ((str = file.readLine()) != null);
        return answer;
    }


}
