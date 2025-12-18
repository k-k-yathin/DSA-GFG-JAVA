public class GFG11 {
    int maxProduct(int[] arr) {
        int maxEnding = arr[0];
        int minEnding = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int temp = maxEnding;

            maxEnding = Math.max(arr[i],
                    Math.max(maxEnding * arr[i], minEnding * arr[i]));

            minEnding = Math.min(arr[i],
                    Math.min(temp * arr[i], minEnding * arr[i]));

            maxSoFar = Math.max(maxSoFar, maxEnding);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        GFG11 g = new GFG11();
        System.out.println(g.maxProduct(new int[]{1,2,3,4,-7,7,8,9,10}));
    }
}
