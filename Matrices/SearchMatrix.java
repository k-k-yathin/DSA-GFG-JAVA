class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        int n = mat.length;
        int m =mat[0].length;
        int low=0,high=n*m-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            int value = mat[mid/m][mid%m];
            
            if(value==x){
                return true;
            }
            else if(value<x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}
