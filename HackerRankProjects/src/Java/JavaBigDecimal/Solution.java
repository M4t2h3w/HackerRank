package Java.JavaBigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        System.out.print("Number of lines: ");
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            System.out.print("Enter number " + (i+1) + ": ");
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Comparator<String> bigDecimalComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal bigDecimal1 = new BigDecimal(o1);
                BigDecimal bigDecimal2 = new BigDecimal(o2);

                return bigDecimal2.compareTo(bigDecimal1);
            }
        };

        Arrays.sort(s,0, n, bigDecimalComparator);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
