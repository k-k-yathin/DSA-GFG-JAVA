public class GFG7 {
    public int maxProfit(int[] prices){
       int profit = 0;
       for(int i=1;i<prices.length;i++){
           if(prices[i]>prices[i-1]){
               profit += prices[i]-prices[i-1];
           }
       }
       return profit;
    }
    public static void main(String[] args) {
        GFG7 g = new GFG7();
        int k = g.maxProfit(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println(k);
    }
}
