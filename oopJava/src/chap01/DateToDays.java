package chap01;
/*
 * 输入2014年的月份日期，程序输出当天为2014年的第几天
 */

import java.util.Scanner;

public class DateToDays {
    public static void main(String[] args) {
        System.out.println("输入2014年的某个日期：");
        java.util.Scanner scanMonth = new Scanner(System.in);
        java.util.Scanner scanDay = new Scanner(System.in);
        int month = scanMonth.nextInt();
        int day = scanDay.nextInt();
        while (true) {
            int days = 0;
            while (month > 0) {
                switch (month -1) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        days += 31;
                        break;
                    case 4, 6, 9, 11:
                        days += 30;
                        break;
                    case 2:
                        days += 28;
                        break;
                }
                month -= 1;
            }
            days += day;
            System.out.println("这是2014年的第" + days + "天");
            month = scanMonth.nextInt();
            day = scanDay.nextInt();
        }
    }
}
