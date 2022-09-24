package chap05;

import java.util.Scanner;

public class FindChar {
    static void Find(String str, char ch) {
        int index = -1;
        for(int i = 0; i < str.length(); i++){
            if(ch == str.charAt(i))
                index = i;
        }
        if(index == -1)
            System.out.println("Not Found");
        else
            System.out.println("Found, last index: " + index);
    }

    public static void main(String[] args) {
        java.util.Scanner charScan = new Scanner(System.in);
        java.util.Scanner strScan = new Scanner(System.in);
        char ch = charScan.next().charAt(0);
        String str = strScan.next();
        Find(str, ch);
    }
}
