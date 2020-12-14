package InterviewPreparation.Arrays.LeftRotation;

public class Solution {
    static int[] rotLeft(int[] a, int d) {
        int[] resultArray = new int[a.length];
        for(int i = 0; i < a.length; i++){
            // calculate the new position of int
            int newIndex = (i + (a.length - d)) % a.length;
            resultArray[newIndex] = a[i];
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int d = 4;
        int[] result = rotLeft(a, d);
        for(int number : result){
            System.out.print(number + " ");
        }
    }
}
