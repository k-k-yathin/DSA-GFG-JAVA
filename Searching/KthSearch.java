class Solution {
    public int kthMissing(int[] arr, int k) {
        int num = 1;
        int count = 0;
        int i = 0;

        while (true) {
            if (i < arr.length && arr[i] == num) {
                i++;
            } else {
                count++;
                if (count == k) {
                    return num;
                }
            }
            num++;
        }
    }
}
