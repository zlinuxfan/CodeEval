package javaCode.MultiplicationTables;

/*****
 * ** Created by kde on 13.03.16, 22:17
 ****/

public class MultiplicationTables {
    public static void main(String[] args) {
        int answer;

        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <=12 ; j++) {
                answer = i * j;
                if (answer < 10) {
                    System.out.print("   " + answer);
                } else if (answer > 9 && answer < 100) {
                    System.out.print("  " + answer);
                } else
                    System.out.print(" " + answer);

            }
            System.out.println();
        }
    }
}
