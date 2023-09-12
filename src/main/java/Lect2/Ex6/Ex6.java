package Lect2.Ex6;

import java.util.LinkedList;
import java.util.List;

class Solution {
    static List<String> findMinStrings(String[] words) {
        List<String> ans = new LinkedList<>();
        int minLength = words[0].length();
        for(String word : words) {
            minLength = Math.min(minLength, word.length());
        }

        for(String word : words) {
            if(word.length() == minLength) {
                ans.add(word);
            }
        }

        return ans;
    }
}
public class Ex6 {
}
