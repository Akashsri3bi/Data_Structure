public class LargestSumPossible {

      static String findLargest(int N, int S) {
            // code here

            if (N > 1 && S == 0) {
                  return "-1";
            }
            if (N * 9 < S) {
                  return "-1";
            }

            String res = "";
            while (N > 0) {
                  if (S >= 9) {
                        res += '9';
                        S = S - 9;
                  } else {
                        res += String.valueOf(S);
                        S = 0;
                  }
                  N--;
            }

            return res;

      }
      
}
