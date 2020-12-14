package InterviewPreparation.Arrays.MinimumSwaps2;

public class Solution {
    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        int minValue = arr[0];
        int minIndex = 0;

        //find min value in the array
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }

        //place min value into the beginning of array
        if(minIndex != 0) {
            int temp = arr[0];
            arr[0] = minValue;
            arr[minIndex] = temp;
            swaps++;
        }

        for(int i = 1; i < arr.length; i++){
            while(arr[i] - minValue != i){
                int temp = arr[arr[i] - minValue];
                arr[arr[i] - minValue] = arr[i];
                arr[i] = temp;
                swaps++;
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 5};

        System.out.println(minimumSwaps(arr));
    }
}
