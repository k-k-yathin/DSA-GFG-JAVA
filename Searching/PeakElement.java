class Solution {
    public int peakElement(int[] arr) {
        int first = Integer.MIN_VALUE;
        int last = Integer.MIN_VALUE;
        if(arr.length==1) return 0;
        for(int i =0;i<arr.length;i++){
            if(i==0){
                if(arr[i]>first && arr[i]>arr[i+1]){
                    return i;
                }
            }
            else if(i==arr.length-1){
                if(arr[i]>last && arr[i]>arr[i-1]){
                    return i;
                }
            }
            else{
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    return i;
                }
            }
        }
        return 0 ;
    }
}
