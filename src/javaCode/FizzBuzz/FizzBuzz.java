package javaCode.FizzBuzz;

import java.io.*;

/***
 * Created by ZLinuxFan on 28.11.15.
 ***/
public class FizzBuzz {
    private static String fileName = "/home/kde/IdeaProjects/CodeEval/src/javaCode/FizzBuzz/fizzBuzz.txt";

    public static void main(String[] args) throws FileNotFoundException{
        String textFromFile = read(fileName);

        for (int i = 0; i < textFromFile.length(); i++) {

                System.out.print(textFromFile.charAt(i));

        }


    }

    public static String read(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);

        exists(fileName);

        try {
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                String str;
                while ((str = in.readLine()) != null) {
                    sb.append(str);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        return sb.toString();
    }

    public static void exists(String fileName) throws FileNotFoundException {

        File file = new File(fileName);

        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }
}
