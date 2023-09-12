package Lect1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(s.length() == 0) {
            System.out.println(0);
            return;
        }
        int sum = 0;
        String[] strs = s.split(" ");
        int[] numbers = new int[strs.length];
        for(int i = 0; i < strs.length; i++) {
            numbers[i] = Integer.parseInt(strs[i]);
        }
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
