package chap01;
import java.lang.Math;

/**
 * ������е�ˮ�ɻ���
 */

public class chap01_03 {
    public static void main(String[] args) {
        System.out.println("ˮ�ɻ�����");
        for(int i = 100; i<1000;i++){
            int process = i;
            int units = process % 10;
            process = process / 10;
            int tens = process % 10;
            process = process / 10;
            int hundreds = process % 10;
            if(Math.pow(units, 3) + Math.pow(tens, 3) + Math.pow(hundreds, 3) == i) {
                System.out.println(i);
            }
        }
    }
}
