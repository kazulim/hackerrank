import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int[] returnDate = new int[3];
        int[] limitDate = new int[3];
        for (int i = 0; i < returnDate.length; i++) {
            returnDate[i] = scan.nextInt();
        }
        for (int i = 0; i < limitDate.length; i++) {
            limitDate[i] = scan.nextInt();
        }

        System.out.println(calculateFine(returnDate, limitDate));
    }

    public static int calculateFine(int[] returnDate, int[] limitDate) {
        int fine = 0;

        if (returnDate[2] > limitDate[2]) {
            fine = 10000;
        } else if (returnDate[2] < limitDate[2]) {
            return fine;
        } else {
            if (returnDate[1] > limitDate[1]) {
                fine = 500 * (returnDate[1] - limitDate[1]);
            } else if (returnDate[1] < limitDate[1]) {
                return fine;
            } else {
                if (returnDate[0] > limitDate[0]) {
                    fine = 15 * (returnDate[0] - limitDate[0]);
                }
            }
        }
        return fine;
    }
}