package javaCode.SumOfPrimes;

import java.util.ArrayList;

/***
 * Created by ZLinuxFan on 26.11.15.
 ***/

public class SieveOfEratosthenes {

    public static void main(String[] args) {

        ArrayList <Integer> primeNum = new ArrayList<Integer>();
        int maxNum = 7919,
                sumOfPrime = 0,
                number;

        for (int i = 2; i < maxNum + 1 ; i++) {
            primeNum.add(i);
        }

        for (int i = 0; i < primeNum.size(); i++) {
            number = primeNum.get(i);
            if (number != 0) {
//                System.out.println(i + " -> " + number);
                calPrimeNum(number, primeNum);
            }
        }

        for (int i : primeNum) {
            sumOfPrime += i;
        }

        System.out.println(sumOfPrime);
    }

    private static void calPrimeNum(int i, ArrayList<Integer> array) {

        for (int j = (i * 2) - 2; j < array.size(); j += i) {
//            System.out.print("i: " + i + "; j: " + j + "; del: " + array.get(j));
//            System.out.println();
            array.set(j, 0);
        }
    }
}
