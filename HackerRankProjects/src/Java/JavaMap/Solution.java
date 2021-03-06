package Java.JavaMap;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        HashMap<String, Integer> phoneBook = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            System.out.println(phoneBook.containsKey(s) ? s + "=" + phoneBook.get(s) : "Not found");
        }
    }
}
