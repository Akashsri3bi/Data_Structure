public class CountSetBits {

      public static int countSetBits(int n) {
            // Your code here
            if (n == 0) {
                  return 0;
            }

            int pow = 0;
            int temp = n;
            while (temp > 1) {
                  temp = temp >> 1;
                  pow++;
            }
            int y = (1 << (pow - 1)) * pow;
            int z = n - (1 << (pow));
            return y + z + 1 + countSetBits(z);
      }
      
}
