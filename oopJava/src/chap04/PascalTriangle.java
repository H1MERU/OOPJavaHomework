package chap04;

public class PascalTriangle {
    public static void main(String[] args) {
        int[][] triangle = new int[11][];               //创建多维数组
        for(int i = 0; i < 11; i++) {
            triangle[i] = new int[i+1];
            for(int j = 0; j < i; j++){
                if(j == 0 || j == i -1)
                    triangle[i][j] = 1;
                else
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
