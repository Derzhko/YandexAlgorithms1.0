package Lect2.Ex5;

class Solution {
    static int findMinEven(int[] numbers) {
        int ans = -1;
        boolean flag = false;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0 && (!flag || ans > numbers[i])) {
                ans = numbers[i];
                flag = true;
            }
        }
        return ans;
    }
}

public class Ex5 {
}
