package chap01;
/*
 * ��ѧ���ɼ�����60�ֵģ�������ϸ񡱣�����60�ģ���������ϸ�
 */

import java.util.Scanner;

public class chap01_05 {
    public static void main(String[] args) {
        System.out.println("����ѧ���ɼ���");
        java.util.Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        while (true) {
            if (score >= 60 && score <= 100)
                System.out.println("�ϸ�");
            else if (score < 60 && score >= 0)
                System.out.println("���ϸ�");
            else
                System.out.println("���󣡲����ܵķ�����");
            score = scan.nextInt();
        }
    }
}
