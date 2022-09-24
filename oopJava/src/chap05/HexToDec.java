package chap05;

import java.util.Scanner;

public class HexToDec {
    public static void main(String[] args) {
        java.util.Scanner hexNumScan = new Scanner(System.in);
        String hexNum = hexNumScan.next();
        int decNum = 0;
        for(int i =hexNum.length() - 1; i >= 0; i--){
            int digit = hexNum.length() - i - 1;
            if(hexNum.charAt(i) <= '9' && hexNum.charAt(i) >= '0')
                decNum += Integer.parseInt((" " + hexNum.charAt(i)).trim()) * Math.pow(16, digit);
            else if(hexNum.charAt(i) <= 'z' && hexNum.charAt(i) >= 'a')
                decNum += (10 + hexNum.charAt(i) - 'a') * Math.pow(16, digit);
        }
        System.out.println(decNum);
    }
}
