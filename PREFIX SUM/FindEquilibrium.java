class Solution {
    public static int findEquilibrium(int arr[]) {
        int sum =0;
        for(int x : arr) sum += x ;
        int Lsum=0;
        for(int i=0;i<arr.length;i++){
            int Rsum = sum - Lsum-arr[i];
            
            if(Lsum==Rsum){
                return i;
            }
            Lsum += arr[i];
        }
        return -1;
    }
}
