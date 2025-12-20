import java.util.Arrays;

public class GFG14 {
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sort012(int[] arr) {
        int low =0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else {
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        GFG14 g = new GFG14();
        int[] arr ={0,1,2,0,0,0,2,2,2,1};
        g.sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
