package chap03;
/*
 * ��ӡ1~100֮��������7�����������������ܺ�
 */

public class MultiplesOfSeven1to100 {
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
