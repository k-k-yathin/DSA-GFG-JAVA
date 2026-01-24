class Solution {
    public int longestUniqueSubstr(String s) {
        int left=0,maxLen=0;
        boolean[] seen = new boolean[256];
        
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            
            while(seen[ch]){
                seen[s.charAt(left)]=false;
                left++;
            }
            
            seen[ch]=true;
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
