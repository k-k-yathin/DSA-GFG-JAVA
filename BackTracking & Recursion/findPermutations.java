class Solution {
    public ArrayList<String> findPermutation(String s) {
        ArrayList<String> result = new ArrayList<>();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        boolean[] used = new boolean[ch.length];
        backtrack(ch,used,new StringBuilder(),result);
        return result;
    }
    private void backtrack(char[] ch,boolean[] used,StringBuilder sb,ArrayList<String> res){
        if(sb.length()==ch.length) {
            res.add(sb.toString());
            return;
        }
        for(int i =0;i<ch.length;i++){
            if(used[i]) continue;
            
            if(i>0 && ch[i] == ch[i-1] && !used[i-1]) continue;
            
            used[i] = true;
            sb.append(ch[i]);
            
            backtrack(ch,used,sb,res);
            
            sb.deleteCharAt(sb.length()-1);
            used[i]=false;
        }
    }
}
