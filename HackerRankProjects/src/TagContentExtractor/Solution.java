package TagContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        //int testCases = Integer.parseInt(in.nextLine());
        while(true){
            System.out.print("Enter tag: ");
            String line = in.nextLine();

            Pattern p = Pattern.compile("<(.+)>([.[^<>]]+)</(\\1)>");
            Matcher m = p.matcher(line);
            boolean match = false;

            while(m.find()){
                System.out.println(m.group(2));
                match = true;
            }
            if(!match){
                System.out.println("None");
            }

            //testCases--;
        }
    }
}
