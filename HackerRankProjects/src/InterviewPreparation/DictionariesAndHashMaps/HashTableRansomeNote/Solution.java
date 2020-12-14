package InterviewPreparation.DictionariesAndHashMaps.HashTableRansomeNote;

import java.util.HashMap;

public class Solution {
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> magazineMap = new HashMap<>();
        for(String word : magazine){
            if (magazineMap.containsKey(word)) {
                magazineMap.put(word, magazineMap.get(word) + 1);
            } else {
                magazineMap.put(word, 1);
            }
        }
        for(int i = 0; i < note.length; i++){
            if(magazineMap.containsKey(note[i]) && magazineMap.get(note[i]) > 0){
                magazineMap.put(note[i], magazineMap.get(note[i]) - 1);
            }
            else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }

    public static void main(String[] args) {
        String[] magazine = {"two", "times", "three", "is", "five", "four"};
        String[] note = {"two", "times", "two", "is", "four"};
        checkMagazine(magazine, note);
    }
}
