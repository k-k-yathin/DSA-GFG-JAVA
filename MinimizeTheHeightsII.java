Arrays/MinimizeTheHeightsII.java
import java.util.Arrays;
public class GFG9 {
    public int getMinDiff(int[] arr ,int k){
        int n = arr.length;
        Arrays.sort(arr);
        int ans = arr[n-1] -arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-k<0){
                continue;
            }
            int minHeight = Math.min(arr[0]+k,arr[i]-k);
            int maxHeight = Math.max(arr[i-1]+k,arr[n-1]-k);
            ans = Math.min(ans,maxHeight-minHeight);
    }
    return ans;
    }
    public static void main(String[] args) {
     GFG9 d = new GFG9();
    int k = d.getMinDiff(new int[]{1,2,3,4,5,6,7,8,9,10},5);
        System.out.println(k);
    }
}
