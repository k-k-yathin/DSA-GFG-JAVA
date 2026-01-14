import java.util.HashSet;
class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i =0;i<arr.length;i++){
            int needed = target - arr[i];
            
            if(set.contains(needed)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
