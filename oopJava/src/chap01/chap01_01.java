package chap01;
/*
 * 打印1-100之间所有奇数的和
 */

public class chap01_01 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <=100;i++) {
            if(i % 2 == 1)
                sum += i;
        }
        System.out.println("100以内奇数和："+ sum);
    }
}