import java.util.*;

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = n - 1; i >= 0; i--){
            
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                result.add(0, -1);
            } else {
                result.add(0, stack.peek());
            }
            
            stack.push(arr[i]);
        }
        
        return result;
    }
}
