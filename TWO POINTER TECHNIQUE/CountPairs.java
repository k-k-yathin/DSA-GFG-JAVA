import java.util.*;
class Solution {
    int countPairs(int arr[], int target) {
        Arrays.sort(arr);
        int count=0;
        int n =arr.length;
        int left =0,right=n-1;
        while(left<right){
            if(arr[left]+arr[right]>=target){
                right--;
            }
            else{
                count+= right-left ;
                left++;
            }
        }
        return count;
    }
}
