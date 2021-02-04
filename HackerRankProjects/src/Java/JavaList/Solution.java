package Java.JavaList;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int listSize = scan.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>(listSize);

        for (int i = 0; i < listSize; i++) {
            arrayList.add(i, scan.nextInt());
        }

        int queries = scan.nextInt();

        for (int i = 0; i < queries; i++) {
            String queryType = scan.next(); // here lies the problem

            if (queryType.equalsIgnoreCase("Insert")) {
                int index = scan.nextInt();
                int item = scan.nextInt();
                arrayList.add(index, item);
            } else if (queryType.equalsIgnoreCase("Delete")) {
                int index = scan.nextInt();
                arrayList.remove(index);
            }
        }

        scan.close();

        for (Integer element : arrayList) {
            System.out.print(element.toString() + " ");
        };
    }
}
