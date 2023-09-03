public class MinDeletion {

      static int check(String num, int d1, int d2) {
            int n = num.length();
            boolean d2Found = false;
            for (int i = n - 1; i >= 0; i--) {
                  int curr = num.charAt(i) - '0';
                  if (curr == d2 && d2Found == false) {
                        d2Found = true;
                  } else if (curr == d1 && d2Found == true) {
                        return n - (i + 2);
                  }
            }

            return n;
      }

      public int minimumOperations(String num) {
            int ans = num.length();
            int n = num.length();
            int zt = 0;

            // Case 00
            ans = Math.min(ans, check(num, 0, 0));
            // Case 25
            ans = Math.min(ans, check(num, 2, 5));
            // Case 50
            ans = Math.min(ans, check(num, 5, 0));
            // Case 75
            ans = Math.min(ans, check(num, 7, 5));

            // this is for cases like 10 because 0 can only be divisible by 25 so remove the
            // only remaining number
            for (int i = 0; i < n; i++) {
                  int curr = num.charAt(i) - '0';
                  if (curr == 0) {
                        zt++;
                  }
            }

            ans = Math.min(ans, n - zt);
            return ans;

      }
      
}
