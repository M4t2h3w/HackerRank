package InterviewPreparation.Arrays.ArrayManipulation;

public class Solution {
    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long maxValue = 0;
        long value = 0;
        long[] array = new long[n+1];

        for(int i = 0; i < queries.length; i++){
            array[queries[i][0]] += queries[i][2];
            if((queries[i][1] + 1) <= n) array[queries[i][1] + 1] -= queries[i][2];
        }

        for(int i = 1; i <= n; i++){
            value += array[i];
            if(maxValue < value) maxValue = value;
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] queries = {{1, 2, 100},{2, 5, 100},{3, 4, 100}};
        long maxValue = arrayManipulation(n, queries);

        System.out.println(maxValue);
    }
}
