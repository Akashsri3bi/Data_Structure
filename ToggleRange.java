public class ToggleRange {

      static int toggleBits(int N, int L, int R) {
            // code here
            int mask = ((1 << (R - L + 1)) - 1);
            int nmask = mask << (L - 1);
            int result = N ^ nmask;
            return result;

      }
      
}
