import java.util.*;

class Solution {
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k)
                maxLen = i + 1;

            if (map.containsKey(sum - k))
                maxLen = Math.max(maxLen, i - map.get(sum - k));

            map.putIfAbsent(sum, i); // store first index only
        }
        return maxLen;
    }
}
