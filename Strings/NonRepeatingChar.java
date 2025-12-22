public class GFG18 {
    public char nonRepeatingChar(String str) {
        int[] freq = new int[256];
        for(char c : str.toCharArray()){
            freq[c]++;
        }
        for(char c : str.toCharArray()){
            if(freq[c]==1){
                return c;
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        GFG18 gfg18 = new GFG18();
        System.out.println(gfg18.nonRepeatingChar("tenet"));
    }
}
