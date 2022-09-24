package chap01;
/*
 * 对学生成绩大于60分的，输出“合格”，低于60的，输出“不合格”
 */

import java.util.Scanner;

public class chap01_05 {
    public static void main(String[] args) {
        System.out.println("输入学生成绩：");
        java.util.Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        while (true) {
            if (score >= 60 && score <= 100)
                System.out.println("合格");
            else if (score < 60 && score >= 0)
                System.out.println("不合格");
            else
                System.out.println("错误！不可能的分数。");
            score = scan.nextInt();
        }
    }
}
