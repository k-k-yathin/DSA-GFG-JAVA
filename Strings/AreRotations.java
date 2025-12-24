public class GFG19 {
        public boolean areRotations(String s1, String s2) {
            if(s1.length()!=s2.length()){
                return false;
            }
            String combined = s1+s1;
            return combined.contains(s2);
        }
        public static void main(String[] args) {
            GFG19 gfg19 = new GFG19();
            System.out.println(gfg19.areRotations("tenet","tenet"));
        }
}
