package chap03;
import java.util.Scanner;
/*
 * 使用switch把小写类型的char转为大写，只转换a,b,c,d,e，其他的输出“other”
 */

import java.util.Scanner;

public class OutputAtoE {
    public static void main(String[] args) {
        System.out.println("请输入英文字符，或输入感叹号（!）退出\n");
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
