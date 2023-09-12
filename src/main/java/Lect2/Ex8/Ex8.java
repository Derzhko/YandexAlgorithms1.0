package Lect2.Ex8;

import java.util.LinkedList;

class Solution {
    static String rle(String str) {
        char[] arrCh = str.toCharArray();
        LinkedList<Character> list = new LinkedList<>();
        char ch = arrCh[0];
        int count = 1;
        list.add(ch);
        for(int i = 1; i < arrCh.length; i++) {
            if(arrCh[i] != ch){
                if(count > 1){
                    list.add((char) count);

                }
                ch = arrCh[i];
                count = 1;
                list.add(ch);
            }else {
                count++;
            }
        }
        if(count > 1){
            list.add((char) count);
        }
        return list.toString();
    }
}

public class Ex8 {
}
