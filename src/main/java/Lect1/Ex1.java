package Lect1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();
        char[] sCh = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : sCh) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int max = 0;
        for(char key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        System.out.println(max);
    }
}
