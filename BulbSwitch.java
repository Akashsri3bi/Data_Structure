public class BulbSwitch {

      public static int countFlips(int a[], int n) {
            // code here.
            boolean switchOn = false;
            int count = 0;
            for (int i = 0; i < n; i++) {
                  if (a[i] == 0 && !switchOn) {
                        switchOn = true;
                        count++;
                  } else if (a[i] == 1 && switchOn) {
                        switchOn = false;
                        count++;
                  }
            }

            return count;
      }
      
}
