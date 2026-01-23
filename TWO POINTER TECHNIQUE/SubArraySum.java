import java.util.*;
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int left =0,sum=0;
        for(int right = 0;right<n;right++){
            sum += arr[right];
            while(sum>target && left<=right){
                sum=sum-arr[left];
                left++;
            }
                if(sum==target){
                    result.add(left+1);
                    result.add(right+1);
                    return result;
                }
            }
        result.add(-1);
        return result ;
    }
}
