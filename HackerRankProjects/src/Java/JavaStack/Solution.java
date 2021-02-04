package Java.JavaStack;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();

            System.out.println(checkString(input) ? "true" : "false");
        }

    }

    private static boolean checkString(String input) {
        Stack<Character> stack = new Stack<>();

        for (char character : input.toCharArray()) {
            if (character == ')' || character == ']' || character == '}') {
                switch (character) {
                    case ')':
                        if (stack.empty() || stack.peek() != '(') {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.empty() || stack.peek() != '[') {
                            return false;
                        }
                        break;
                    case '}':
                        if (stack.empty() || stack.peek() != '{') {
                            return false;
                        }
                        break;
                }
                stack.pop();
            } else {
                stack.push(character);
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }
}
