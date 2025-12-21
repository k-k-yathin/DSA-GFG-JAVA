public class GFG15 {
    public int myAtoi(String s){
        if(s==null||s.length()==0)return 0;
        int i=0,n=s.length();
        int sign=1;
        long result=0;

        // skip leading whitespaces
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        // Handle sign
        if(i<n&&(s.charAt(i)=='+'||s.charAt(i)=='-')){
            sign=(s.charAt(i)=='-')? -1:1;
            i++;
        }

        // Convert digits to number
        while(i<n && Character.isDigit(s.charAt(i))){
            result=result*10+(s.charAt(i)-'0');

            // handling overflow
            if(sign ==1 && result>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(sign ==-1 && result<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }
        return (int)(sign*result);
    }
    public static void main(String[] args) {
        GFG15 g = new GFG15();
        System.out.println(g.myAtoi("001827373839"));
    }
}
