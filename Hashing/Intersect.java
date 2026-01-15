import java.util.*;

class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int x : a) {
            set.add(x);
        }

        for (int x : b) {
            if (set.contains(x)) {
                result.add(x);
                set.remove(x); 
            }
        }
        return result;
    }
}
