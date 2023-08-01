public class BuyAndSellStock {

      public static int maxProfit(int n, int[] price) {
            // code here
            int[] profit = new int[n];
            for (int i = 0; i < n; i++) {
                  profit[i] = 0;
            }

            // for back case or maxcase
            int max_price = price[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                  max_price = Math.max(price[i], max_price);
                  int profits = max_price - price[i];
                  profit[i] = Math.max(profit[i + 1], profits);
            }

            // Since we can do two transactions we will use from front to calculate and add
            // up
            int min_price = price[0];
            for (int i = 1; i < n; i++) {
                  min_price = Math.min(min_price, price[i]);
                  int profits = price[i] - min_price;
                  profit[i] = Math.max(profit[i - 1], profit[i] + profits);
            }
            return profit[n - 1];
      }
      
}
