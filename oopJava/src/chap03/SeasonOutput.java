package chap03;
/*
 * 根据指定月份，打印该月份所属的季节
 */

import java.util.Scanner;

public class SeasonOutput {
    public static void main(String[] args) {
        System.out.println("输入月份：");
        java.util.Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        while(true){
            if(month >= 3 && month <=5)
                System.out.println("Spring");
            else if(month >= 6 && month <=8)
                System.out.println("Summer");
            else if(month >= 9 && month <=11)
                System.out.println("Autumn");
            else
                System.out.println("Winter");
            month = scan.nextInt();
        }
    }
}
