import java.util.*;
class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0;
        int bottom = mat.length-1 ;
        int left = 0;
        int right = mat[0].length-1 ;
        while(top<=bottom && left<=right){
            for(int i =left;i<=right;i++){
                list.add(mat[top][i]);
            }
            top++;
            
            for(int j =top;j<=bottom;j++){
                list.add(mat[j][right]);
            }
            right--;
            
            if(top<=bottom){
            for(int k =right;k>=left;k--){
                list.add(mat[bottom][k]);
            }
            bottom--;
            }
            
            if(left<=right){
            for(int i =bottom;i>=top;i--){
                list.add(mat[i][left]);
            }
            left++;
            }
        }
        return list ; 
    }
}
