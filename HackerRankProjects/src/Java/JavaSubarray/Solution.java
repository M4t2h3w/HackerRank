package Java.JavaSubarray;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int input = scan.nextInt();
            arr[i] = input;
        }
        scan.close();

        System.out.println(negativeSubarraySum(arr));
    }

    private static int negativeSubarraySum(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int subSum = arr[i];
            if (subSum < 0) result++;
            for (int j = i + 1; j < arr.length; j++) {
                subSum += arr[j];
                if (subSum < 0) result++;
            }
        }
        return result;
    }
}
