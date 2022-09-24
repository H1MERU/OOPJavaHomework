package notes.practices;

//冒泡排序
public class practice01 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] height = new int[5];
        for (int i = 0; i< height.length; i++){
            System.out.println("输入身高" + ": ");
            height[i] = input.nextInt();
        }
        int tmp;
        for(int i = 0; i< height.length -1; i++){
            for(int j = 0; j < height.length - 1 - i; j++){
                if(height[j] > height[j+1]) {
                    tmp = height[j];
                    height[j] = height[j+1];
                    height[j+1] = tmp;
                }
            }
        }
        System.out.println("低到高排序：");
        for(int i = 0; i< height.length -1;i++)
        {
            System.out.println(height[i]);
        }
    }

}
