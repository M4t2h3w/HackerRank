package InterviewPreparation.Arrays.NewYearChaos;

public class Solution {
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int totalBribes = 0;
        for(int i = q.length - 1; i >= 0; i--){
            if(q[i] - (i + 1) > 2){
                System.out.println("Too chaotic");
                return;
            }
            for(int j = Math.max(0, q[i] - 2); j < i; j++){
                if(q[j] > q[i]) totalBribes++;
            }
        }
        System.out.println(totalBribes);
    }

    public static void main(String[] args) {
        int[] queue = {1, 2, 5, 3, 7, 8, 6, 4};
        minimumBribes(queue);
    }
}

