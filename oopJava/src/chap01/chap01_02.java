package chap01;
/*
 * ��ӡ1~100֮��������7�����������������ܺ�
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
        System.out.println("1~100֮��������7����������������" + num);
        System.out.println("1~100֮��������7����������֮�ͣ�" + sum);
    }
}
