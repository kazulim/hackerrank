import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int final_sum = 0;
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 4; col++){
                sum = arr[row][col] + arr[row][col+1] + arr[row][col+2]
                        + arr[row+1][col+1]
                        + arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
                final_sum = Math.max(sum, final_sum);
            }
        }
        System.out.println(final_sum);
    }
}
