import java.util.Arrays;
class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low =1;
        int high =stalls[stalls.length-1]-stalls[0];
        int ans=0;
        while(low<=high){
            int mid = low +(high-low)/2;
            
            if(canPlace(stalls,k,mid)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    private boolean canPlace(int[] stalls,int k, int dist){
        int cows =1;
        int lastPos = stalls[0];
        
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastPos >= dist){
                cows++;
                lastPos=stalls[i];
                
                if(cows==k){
                    return true;
                }
            }
        }
        return false;
    }
}
