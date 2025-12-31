import java.util.*;
class OverlappingIntervals {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        ArrayList<int[]> result = new ArrayList<>();
        if(arr == null || arr.length==0){
            return result;
        }
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0] , b[0]));
        
        int index=0;
        
        for(int i=1;i<arr.length;i++){
            if(arr[index][1]>= arr[i][0]){
                arr[index][1] = Math.max(arr[index][1],arr[i][1]);
            }else{
                index++;
                arr[index]=arr[i];
            }
        }
        for(int i=0;i<=index;i++){
            result.add(arr[i]);
        }
        return result;
    }
}
