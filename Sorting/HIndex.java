import java.util.*;

class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int papers = n - i;
            if (arr[i] >= papers) {
                return papers;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution ob = new Solution();
        int[] arr = {3, 0, 6, 1, 5};
        System.out.println(ob.hIndex(arr));
    }
}
