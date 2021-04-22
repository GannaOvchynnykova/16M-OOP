package telran.dto;

import java.util.HashMap;

public class Anagram {
    public static boolean isAnagram(String word, String anagram) {
        if (word == null || anagram == null
                || word.isEmpty() || anagram.isEmpty()
                || anagram.length() > word.length())
            return false;

        char [] letters = word.toLowerCase().toCharArray();

        HashMap<Character, Integer> res = new HashMap<>();

        for (Character ch: letters) {
            int count = res.getOrDefault(ch, 0);
            res.put(ch, count+1);
        }

        char [] lettersAnagram = anagram.toLowerCase().toCharArray();
        for (Character ch: lettersAnagram) {
            int count = res.getOrDefault(ch, 0);
            if(count == 0) return false;
            res.put(ch, count-1);    // tak ili tak
            //res.replace(ch, count-1);    //ili tak
        }
        return true;
    }
}
