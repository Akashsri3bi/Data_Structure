public class DaysSurvival {
      static int minimumDays(int S, int N, int M) {
            // code here
           
            int buyingDays = S - S / 7;
            if (M > N) {
                  return -1;
            }
            int totalFood = S * M;
            int ans = (totalFood % N == 0) ? totalFood / N : (totalFood / N) + 1;
            return (ans <= buyingDays) ? ans : -1;

      }
}
