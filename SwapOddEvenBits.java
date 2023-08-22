public class SwapOddEvenBits {

      public static int swapBits(int n) {
            // Your code
            int even_bits = n & 0xAAAAAAAA;

            // Get all odd bits of x
            int odd_bits = n & 0x55555555;

            even_bits = even_bits >> 1;
            odd_bits = odd_bits << 1;

            return (even_bits | odd_bits);

      }
      
}
