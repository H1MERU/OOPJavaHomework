package chap01;
/*
 * ����2014����·����ڣ������������Ϊ2014��ĵڼ���
 */

import java.util.Scanner;

public class DateToDays {
    public static void main(String[] args) {
        System.out.println("����2014���ĳ�����ڣ�");
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
            System.out.println("����2014��ĵ�" + days + "��");
            month = scanMonth.nextInt();
            day = scanDay.nextInt();
        }
    }
}
