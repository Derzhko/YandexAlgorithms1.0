package Lect2.Ex2;

class Solution {
    static int findRightX(int[] numbers, int number) {
        int ans = -1;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == number) {
                ans = i;
            }
        }
        return ans;
    }
}
public class Ex2 {
}
