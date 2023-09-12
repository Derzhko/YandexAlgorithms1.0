package Lect2.Ex3;

class Solution {
    static int findMax(int[] numbers) {
        int max;
        if(numbers.length > 0) {
            max = numbers[0];
            for(int number : numbers) {
                max = Math.max(number, max);
            }
        }else {
            max = Integer.MIN_VALUE;
        }
        return max;
    }
}
public class Ex3 {
}
