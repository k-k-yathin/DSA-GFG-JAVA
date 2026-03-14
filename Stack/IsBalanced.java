class Solution {
    public boolean isBalanced(String s) {
        if(s.length()%2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(c=='(' || c == '{' || c=='['){
                stack.push(c);
            }else{
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                
                if(c==')' && top !='(') return false;
                if(c=='}' && top !='{') return false;
                if(c==']' && top !='[') return false;
            }
        }
        return stack.isEmpty();
    }
}
