public class GFG16 {
    public String addBinary(String s1, String s2) {
        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry=0;
        StringBuilder sb = new StringBuilder();

        while(i>=0||j>=0||carry>0){
            int sum = carry;

            if(i>=0) sum+= s1.charAt(i--) - '0';
            if(j>=0) sum+= s2.charAt(j--) - '0';

            sb.append(sum%2);
            carry = sum/2;
        }
        String result= sb.reverse().toString();
        int k=0;
        while(k<result.length()-1 && result.charAt(k)=='0'){
            k++;
        }
        return result.substring(k);
    }
    public static void main(String[] args) {
        GFG16 gfg16=new GFG16();
        System.out.println(gfg16.addBinary("11","1"));
    }
}
