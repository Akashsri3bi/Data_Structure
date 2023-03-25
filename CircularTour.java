public class CircularTour {

      int tour(int petrol[], int distance[]) {
            // Your code here
            int toBeConsumed = 0;
            int balance = 0;
            int start = 0;
            for (int i = 0; i < petrol.length; i++) {
                  balance += petrol[i] - distance[i];
                  if (balance < 0) {
                        toBeConsumed += balance;
                        start = i + 1;
                        balance = 0;
                  }
            }

            if (toBeConsumed + balance >= 0) {
                  return start;
            } else {
                  return -1;
            }
      }
      
}
