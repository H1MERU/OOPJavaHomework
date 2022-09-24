package chap01;
/*
 * 打印1~100之间所有是7倍数的整数个数以总和
 */

public class chap01_02 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 7 == 0){
                sum += i;
                num++;
            }
        }
        System.out.println("1~100之间所有是7倍数的整数个数：" + num);
        System.out.println("1~100之间所有是7倍数的整数之和：" + sum);
    }
}
