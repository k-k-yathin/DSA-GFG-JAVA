 import java.util.HashSet;
 class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length == 0) return 0 ;
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        
        int longest = 0;
        
        for(int num : set) {
            if(!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;
                
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
