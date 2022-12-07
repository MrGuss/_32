package _29;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int[][] matrix = new int[cnt][cnt];
        for (int i=0; i<cnt;i++){
            for (int j=0; j<cnt; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i=0; i<cnt;i++){
            for (int j=i; j<cnt; j++){
                sum+=matrix[i][j];
            }
        }
        System.out.println(sum);
        //for (int i=0; i<cnt; i)
    }
}
