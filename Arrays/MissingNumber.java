import java.util.Arrays;
public class GFG13 {
    public int missingNumber(int[] arr) {
        int result =1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<result){
                continue;
            }
            if(arr[i]==result){
                result++;
            }
            else{
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        GFG13 g = new GFG13();
        int k = g.missingNumber(new int[]{1,2,0,4,-7,7,8,9,10});
        System.out.println(k);
    }
}
