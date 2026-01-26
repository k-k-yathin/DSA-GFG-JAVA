import java.util.*;

class Solution {
    public static int longestSubarray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] == 0 ? -1 : 1);

            if (sum == 0)
                maxLen = i + 1;

            if (map.containsKey(sum))
                maxLen = Math.max(maxLen, i - map.get(sum));
            else
                map.put(sum, i); 
        }
        return maxLen;
    }
}
