import java.util.*;
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i =0;i<b.length;i++){
            set.add(b[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int index : set){
            result.add(index);
        }
        return result;
    }
}
