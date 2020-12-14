package InterviewPreparation.warmUp.RepeatedString;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long result = 0;
        long numberOfA = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'a') numberOfA++;
        }
        result = n / s.length() * numberOfA;

        long helperN = n % s.length();
        for(char ch : s.substring(0, (int) helperN).toCharArray()){
            if(ch == 'a') result++;
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

