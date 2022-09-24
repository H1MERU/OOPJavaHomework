package chap01;
import java.lang.Math;

/**
 * 输出所有的水仙花数
 */

public class chap01_03 {
    public static void main(String[] args) {
        System.out.println("水仙花数：");
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
