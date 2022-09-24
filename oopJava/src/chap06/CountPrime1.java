package chap06;

import java.util.ArrayList;
import java.util.Scanner;

public class CountPrime1 {

    static void FindPrime(int range){
        ArrayList<Integer> primeNumber = new ArrayList<>();
        for(int i = 2; i < range; i++){
            boolean flag = true;
            for(int j = 2; j < i; j++) {
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag)
                primeNumber.add(i);
        }
        System.out.println("在" + range + "之内有" + primeNumber.size() + "个质数");
        System.out.println(primeNumber);
    }

    public static void main(String[] args) {
        System.out.println("input a number: ");
        java.util.Scanner numScan = new Scanner(System.in);
        int range = numScan.nextInt();
        FindPrime(range);
    }

}
