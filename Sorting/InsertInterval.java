import java.util.*;
class Solution {
    public ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
    ArrayList<int[]> result = new ArrayList<>(); 
    int i =0;
    int n = intervals.length;
    
    int start = newInterval[0];
    int end = newInterval[1];
    
    while(i<n && intervals[i][1]<start){
        result.add(intervals[i]);
        i++;
    }
    
    while(i<n && intervals[i][0]<=end){
        start = Math.min(start,intervals[i][0]);
        end = Math.max(end,intervals[i][1]);
        i++;
    }
    
    result.add(new int[]{start,end});
    
    while(i<n){
        result.add(intervals[i]);
        i++;
    }
    return result;
    }
}
