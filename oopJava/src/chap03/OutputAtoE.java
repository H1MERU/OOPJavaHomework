package chap03;
import java.util.Scanner;
/*
 * ʹ��switch��Сд���͵�charתΪ��д��ֻת��a,b,c,d,e�������������other��
 */

import java.util.Scanner;

public class OutputAtoE {
    public static void main(String[] args) {
        System.out.println("������Ӣ���ַ����������̾�ţ�!���˳�\n");
        java.util.Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        while(character != '!'){
            switch (character){
                case 'a', 'b', 'c', 'd', 'e':
                    System.out.println(Character.toUpperCase(character));
                    character = scanner.next().charAt(0);
                    break;
                default:
                    System.out.println("other\n");
                    character = scanner.next().charAt(0);
                    break;
            }

        }
    }
}
