package InterviewPreparation.DictionariesAndHashMaps.TwoStrings;

//Given two strings, determine if they share a common substring. A substring may be as small as one character.
//        For example, the words "a", "and", "art" share the common substring .
//        The words "be" and "cat" do not share a substring.
//        Function Description
//        Complete the function twoStrings in the editor below. It should return a string,
//        either YES or NO based on whether the strings share a common substring.
//        twoStrings has the following parameter(s):
//        s1, s2: two strings to analyze .
//        Input Format
//        The first line contains a single integer , the number of test cases.
//        The following  pairs of lines are as follows:
//        The first line contains string .
//        The second line contains string .
//        Constraints
//        and  consist of characters in the range ascii[a-z].
//
//
//        Output Format
//        For each pair of strings, return YES or NO.

public class Solution {
    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        //this solution gives time-out exception on HackerRank
//        for(int i = 0; i < s1.length(); i++){
//            if(s2.indexOf(s1.charAt(i)) >= 0){
//                return "YES";
//            }
//        }
//        return "NO";

        for(char character : "abcdefghijklmnopqrstuvwxyz".toCharArray()){
            if(s1.indexOf(character) >= 0 && s2.indexOf(character) >= 0) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        String firstString = "aardvark";
        String secondString = "apple";
        System.out.println(twoStrings(firstString, secondString));
    }
}
