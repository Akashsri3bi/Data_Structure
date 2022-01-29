import java.util.Arrays;

//Buy and Sell stocks;
public class Stocks {
      public static int maxProfit(int[] prices) {
            int profit = 0 ; 
            int min = Integer.MAX_VALUE ; 
            int max = Integer.MIN_VALUE; 

            for(int i = 0 ; i < prices.length ; i++){
                  min = Math.min(prices[i], min);
                  profit = prices[i] - min ; 
                  max = Math.max(profit, max);
            }
            return max ; 
      }
      public static void main(String[] args) {
            int[] prices = { 7, 1, 5, 3, 6, 4} ;

            int profit = maxProfit(prices);
            System.out.print(profit);
                        
      }
      
}
