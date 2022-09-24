package chap04;
import java.util.ArrayList;

import java.util.Scanner;

public class SortInt {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList();

        System.out.println("Origin Nums:");                     //10��2λ������
        for(int i = 0; i < 10; i++) {
            nums.add((i + 1) * 9);
            System.out.print(" " + nums.get(i));
        }

        System.out.println("A new num: ");
        java.util.Scanner numScan = new Scanner(System.in);     //����һ����λ������
        int num = numScan.nextInt();

        int insertPoint = 0;                                    //�ҳ����ݲ����
        for(int i = 0; i + 1 < nums.size(); i++) {
            if (num > nums.get(i) && num < nums.get(i + 1)) {
                insertPoint = i + 1;
            }
        }

        nums.add(0);                                            //��������
        for(int i = nums.size() - 1; i > insertPoint;i--) {
            nums.set(i, nums.get(i - 1));
        }
        nums.set(insertPoint, num);

        System.out.println("New Nums:");
        for(int i = 0; i < nums.size(); i++){
            System.out.print(" " + nums.get(i));
        }
    }
}
