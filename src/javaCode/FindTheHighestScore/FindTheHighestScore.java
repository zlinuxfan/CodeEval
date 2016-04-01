package javaCode.FindTheHighestScore;


import java.io.IOException;
import java.util.ArrayList;

/*****
 * ** Created by kde on 23.03.16, 18:06
 ****/
public class FindTheHighestScore {
    public static void main(String[] args) throws IOException {

        getHighestScore(args[0]);
//        for (ArrayList<Integer> highestScores: getHighestScore(args[0])) {
//            for (Integer highestScore: highestScores) {
//                System.out.print(highestScore + " ");
//            }
//            System.out.println();
//        }
    }

    public static ArrayList<ArrayList<Integer>> getHighestScore(String fileName) throws
            IOException {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileName);
        ArrayList<Integer> highestScores = new ArrayList<>();
//        ArrayList<ArrayList<Integer>> allHighestScores = new ArrayList<>();

        boolean flag = false;
        String numStr = "";
        int currentNumber, //
            col = 0,
            c = 1000,
            index = 0;

        while (fileInputStream.available() > 0) {
            currentNumber = fileInputStream.read();


            if ((currentNumber > 47 && currentNumber < 58 && (fileInputStream.available() > 0)) ||
                    currentNumber == 45 && (fileInputStream.available() > 0)) {
                numStr += (char) currentNumber;
                flag = true;

            } else {
                if (flag) {
                    if (col >= c) {
//                        System.out.print("check this: ");
//                        System.out.print(numStr + ">" + highestScore.get(index));
//                        System.out.println();
                        if (Integer.parseInt(numStr) > highestScores.get(index)) {
                            highestScores.set(index, Integer.parseInt(numStr));
//                            System.out.println("to be:" + highestScore.get(index));
                        }
                        index++;
                        numStr = "";
                        col++;
                    } else {
                        highestScores.add(Integer.parseInt(numStr));
                        col++;
//                        System.out.print(numStr + " ");
                        numStr = "";
                        index = 0;
                    }
                }
                flag = false;
            }

            if (currentNumber == 124) {
//                System.out.println();
                c = col;
                index = 0;
            }

            if (currentNumber == 10 || currentNumber == 13 || !(fileInputStream.available() > 0)) {
//                allHighestScores.add((ArrayList<Integer>) highestScores.clone());
                for (Integer hs: highestScores) {
                    System.out.print(hs + " ");
                }
                System.out.println();
                highestScores.clear();
                c = 1000;
                col = 0;
            }
        }

        return null;
    }
}