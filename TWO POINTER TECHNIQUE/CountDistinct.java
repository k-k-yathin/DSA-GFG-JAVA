import java.util.*;
class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>(); 
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        result.add(map.size());
        
        for(int i=k;i<arr.length;i++){
            int out=arr[i-k];
            map.put(out,map.get(out)-1);
            if(map.get(out)==0) map.remove(out);
            
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
            result.add(map.size());
        }
        return result;
    }
}
