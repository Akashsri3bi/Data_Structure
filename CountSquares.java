public class CountSquares {

      static int countSquares(int N) {
            int i = 1;
            int c = 0;
            while (i * i < N) {
                  c++;
                  i++;
            }

            
            return c;
      }

      public static void main(String[] args) {
      }
      
}
