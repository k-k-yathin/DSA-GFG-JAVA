import java.util.*;
class Solution {
    int countPairs(int arr[], int target) {
        int n = arr.length;
        int left=0,right=n-1;
        int count =0;
        while(left<right){
            int sum = arr[left]+arr[right] ;
            if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                if(arr[left]==arr[right]){
                    int len = right-left+1;
                    count += (len*(len-1))/2 ;
                    break;
                }
                int cnt1=1,cnt2=1;
                while(left+1 < right && arr[left]==arr[left+1]){
                    cnt1++;
                    left++;
                }
                while(right-1 > left && arr[right]==arr[right-1]){
                    cnt2++;
                    right--;
                }
                count+=cnt1*cnt2;
                left++;
                right--;
            }
        }
        return count;
    }
}
