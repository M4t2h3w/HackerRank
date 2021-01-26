package ProblemSolving.SparseArrays;

public class Solution {
    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            result[i] = 0;
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < queries.length; j++) {
                if (strings[i].equalsIgnoreCase(queries[j])) {
                    result[j] += 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strings = {"aba", "baba", "aba", "xzxb"};
        String[] queries = {"aba", "xzxb", "ab"};
        int[] result = matchingStrings(strings, queries);
        for (int value : result) {
            System.out.println(value);
        }
    }
}
