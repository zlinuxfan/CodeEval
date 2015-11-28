package javaCode.SumOfPrimes;

/***
 * Created by ZLinuxFan on 28.11.15.
 ***/
public class Bust {

    public static void main (String[] args) {
        int sumOfPrimes = 1,
            count = 0,
            i = 0;

        while (count < 1000) {
            i++;
            if (i % 2 != 0) {
                if (isPrime(i)) {
                    sumOfPrimes += i;
                    count++;
                }
            }
        }
        System.out.println(sumOfPrimes);
    }

    // Returns whether the given integer is prime
    public static boolean isPrime(int n) {
        for (int i = 3; i * i <= n; i+= 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
