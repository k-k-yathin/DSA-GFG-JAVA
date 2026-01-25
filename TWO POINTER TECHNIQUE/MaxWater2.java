class Solution {
    public int maxWater(int arr[]) {
        int left=0,right=arr.length-1;
        int water=0;
        while(left<right){
            int height = Math.min(arr[left],arr[right]);
            int width=right-left;
            water = Math.max(water,height*width);
            
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return water;
    }
}
