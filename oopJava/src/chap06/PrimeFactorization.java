package chap06;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorization {

    static ArrayList<Integer> FindPrime(int num) {
        ArrayList<Integer> primeNumber = new ArrayList<>();
        for (int i = 2; i < num; i++) {
            boolean flag = true;
            for (int j : primeNumber) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                primeNumber.add(i);
        }
        return primeNumber;
    }

    static void PrimeFactor(int num, ArrayList<Integer> primes){
        ArrayList<Integer> primeFactor = new ArrayList<>();
        for (int prime:primes) {
            if(num % prime == 0) {
                primeFactor.add(prime);
                break;
            }
        }
        for (int prime:primeFactor) {
            System.out.println(num + " = " + prime + " * " + num / prime);
        }
    }

    public static void main(String[] args) {
        System.out.println("input a number: ");
        java.util.Scanner numScan = new Scanner(System.in);
        int num = numScan.nextInt();
        PrimeFactor(num, FindPrime(num));
    }

}
