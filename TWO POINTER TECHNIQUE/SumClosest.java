import java.util.*;
class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        if(arr.length == 0 || arr.length == 1){
            return result ;
        }
        int n = arr.length;
        int left=0,right=n-1;
        int minDiff = Integer.MAX_VALUE;
        int bestA = 0, bestB =0;
        while(left<right){
            int sum = arr[left]+arr[right] ;
            int diff = Math.abs(sum-target);
            
            if(diff<minDiff || (diff == minDiff && Math.abs(arr[right]-arr[left])>Math.abs(bestB-bestA))){
                minDiff = diff;
                bestA = arr[left];
                bestB = arr[right];
            }
            if (sum < target) left++;
            else right--;
        }
        result.add(bestA);
        result.add(bestB);
        return result;
    }
}
