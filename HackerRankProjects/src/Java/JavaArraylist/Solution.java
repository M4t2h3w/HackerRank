package Java.JavaArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int rowsCount = scan.nextInt();
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>(rowsCount);

        for (int i = 0; i < rowsCount; i++) {
            arrayLists.add(new ArrayList<>());
            int numbersCount = scan.nextInt();
            for (int j = 0; j < numbersCount; j++) {
                arrayLists.get(i).add(scan.nextInt());
            }
        }

        int queryCount = scan.nextInt();
        for (int i = 0; i < queryCount; i++) {
            int row = scan.nextInt() - 1;
            int position = scan.nextInt() - 1;
            if (row >= arrayLists.size()) {
                System.out.println("ERROR!");
            } else if (position >= arrayLists.get(row).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(arrayLists.get(row).get(position));
            }
        }

        scan.close();
    }
}
