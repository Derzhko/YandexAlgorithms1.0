package Lect2.Ex7;


class Solution {
    static int isleFlood(int[] heights) {
        int ans = 0;
        int idxMaxHeight = heights[0];

        for(int i = 0; i < heights.length; i++) {
            if(heights[i] > heights[idxMaxHeight]) {
                idxMaxHeight = i;
            }
        }

        int localMaxHeight = heights[0];

        for (int i = 1; i < idxMaxHeight ; i++) {
            localMaxHeight = Math.max(localMaxHeight, heights[i]);
            ans += localMaxHeight - heights[i];
        }

        localMaxHeight = heights[heights.length - 1];

        for(int i = heights.length - 1; i > idxMaxHeight; i--) {
            localMaxHeight = Math.max(localMaxHeight, heights[i]);
            ans += localMaxHeight - heights[i];
        }

        return ans;
    }
}
public class Ex7 {
}
