package chap05;

import java.util.Scanner;

public class Palindrome {

    static boolean IsPalindrome(String str){
        System.out.println("Is it palindrome?: ");
        for(int i = 0; i < str.length() / 2; i++){
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner strScan = new Scanner(System.in);
        String str = strScan.next();
        System.out.println(IsPalindrome(str));
    }
}
