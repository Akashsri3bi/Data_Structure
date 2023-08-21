public class SetKBit {

      static int setKthBit(int N, int K) {
            // code here
            // Shift one k times and the OR operation with the number
            int res = (N | (1 << K));
            return res;
      }
      
}
