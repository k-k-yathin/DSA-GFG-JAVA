import java.util.*;
class Solution {
    public int minRemoval(int intervals[][]) {
        int n = intervals.length;
        if (n==0) return 0;
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));
        
        int count =1;
        int lastEnd = intervals[0][1];
        
        for(int i =1; i<n;i++){
            if(intervals[i][0]>=lastEnd){
                count++;
                lastEnd = intervals[i][1];
            }
        }
        
        return n-count;
    }
}
