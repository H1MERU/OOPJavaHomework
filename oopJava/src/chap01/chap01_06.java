package chap01;
/*
 * ����ָ���·ݣ���ӡ���·������ļ���
 */

import java.util.Scanner;

public class chap01_06 {
    public static void main(String[] args) {
        System.out.println("�����·ݣ�");
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
