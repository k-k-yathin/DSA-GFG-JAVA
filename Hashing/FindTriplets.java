class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        int n = arr.length;
        Map<Integer, List<Integer>> mp = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            mp.putIfAbsent(arr[i], new ArrayList<>());
            mp.get(arr[i]).add(i);
        }

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int num = -(arr[i] + arr[j]);
                if (mp.containsKey(num)) {
                    for (int index : mp.get(num)) {
                        if (index > j) {
                            ans.add(Arrays.asList(i, j, index));
                        }
                    }
                }
            }
        }

        return ans;
    }
}
