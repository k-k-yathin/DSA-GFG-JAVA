public class GFG10 {
    int maxSubArray(int[] arr){
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++){
            // for creating the continuous sub array
            currentSum = Math.max(currentSum+arr[i],arr[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        GFG10 g = new GFG10();
        System.out.println(g.maxSubArray(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}
