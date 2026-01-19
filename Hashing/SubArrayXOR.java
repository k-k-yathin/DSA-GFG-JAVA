class Solution {
    public long subarrayXor(int arr[], int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        int prefixXor=0;
        long count =0;
        
        for(int num : arr){
            prefixXor ^= num;
            
            int need = prefixXor ^ k;
            if(map.containsKey(need)) {
                count += map.get(need);
            }
            map.put(prefixXor,map.getOrDefault(prefixXor, 0)+1);
        }
        return count;
    }
}
