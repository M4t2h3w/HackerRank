package ValidUsernameRegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UsernameValidator {

    public static final String regularExpression = "^(?=.{8,30}$)(?![1-9_])[\\w]+$";
}

class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //int n = Integer.parseInt(scan.nextLine());
        while (true) {
            System.out.print("Enter user name: ");
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}


