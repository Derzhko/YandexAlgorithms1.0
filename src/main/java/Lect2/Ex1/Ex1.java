package Lect2.Ex1;

class Solution {
    static int findX(int[] numbers, int number) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
public class Ex1 {

    public static void main(String[] args) {

    }
}
