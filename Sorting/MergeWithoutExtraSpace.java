class Solution {
    public void mergeArrays(int a[], int b[]) {
        int n = a.length;
        int m = b.length;

        int gap = (n + m + 1) / 2;

        while (gap > 0) {
            int i = 0;
            int j = gap;

            while (j < n + m) {

                // both in a[]
                if (i < n && j < n) {
                    if (a[i] > a[j]) swap(a, i, j);
                }

                // i in a[], j in b[]
                else if (i < n && j >= n) {
                    if (a[i] > b[j - n]) {
                        int temp = a[i];
                        a[i] = b[j - n];
                        b[j - n] = temp;
                    }
                }

                // both in b[]
                else {
                    if (b[i - n] > b[j - n]) swap(b, i - n, j - n);
                }

                i++;
                j++;
            }

            if (gap == 1) break;
            gap = (gap + 1) / 2;
        }
    }

    void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
