public class Arithmetic {

      static int inSequence(int A, int B, int C) {
            if (C == 0) {
                  if (A == B) {
                        return 1;
                  } else {
                        return 0;
                  }
            }

            if (A == B) {
                  return 1;
            }

            int k = (B - A) % C;
            if (k == 0) {
                  if (((B - A) / C) > 0) {
                        return 1;
                  }
            }
            return 0;
      }

      public static void main(String[] args) {
            
      }
      
}
