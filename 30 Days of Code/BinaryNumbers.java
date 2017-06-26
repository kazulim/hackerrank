import java.util.Scanner;

public class Solution {

    //  Solution from https://www.hackerrank.com/challenges/30-binary-numbers

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        String binary = Integer.toBinaryString(input);
        int maxCons = 0;
        int cons = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                cons++;
                maxCons = Math.max(maxCons, cons);
            } else {
                cons = 0;
            }
        }

        System.out.println(maxCons);
    }
}
