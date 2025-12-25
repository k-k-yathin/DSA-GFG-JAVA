public class GFG20 {
        public int maxCircularSum(int arr[]) {
            int n = arr.length;
            int totalSum = 0;

            int maxEnding = arr[0];
            int maxSoFar = arr[0];

            int minEnding = arr[0];
            int minSoFar = arr[0];

            for (int i = 0; i < n; i++) {
                totalSum += arr[i];

                if (i > 0) {
                    maxEnding = Math.max(arr[i], maxEnding + arr[i]);
                    maxSoFar = Math.max(maxSoFar, maxEnding);

                    minEnding = Math.min(arr[i], minEnding + arr[i]);
                    minSoFar = Math.min(minSoFar, minEnding);
                }
            }

            if (maxSoFar < 0)
                return maxSoFar;

            int maxCircular = totalSum - minSoFar;
            return Math.max(maxSoFar, maxCircular);
        }
        public static void main(String[] args) {
            GFG20 gfg20 = new GFG20();
            System.out.println(gfg20.maxCircularSum(new int[]{1,2,3,4,5}));
        }

    }
