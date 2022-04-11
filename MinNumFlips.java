public class MinNumFlips {

      public int minFlips(String S) {
            int c1 = 0 ; 
            int c2 = 0 ; 
            for(int i = 0 ; i < S.length() ; i++){
                  if(i%2==0 && S.charAt(i)=='1'){c1++ ; } 
                  if(i%2!=0 && S.charAt(i)=='0'){c1++ ; }
                  if (i % 2 == 0 && S.charAt(i) == '0') {
                        c2++;
                  }
                  if (i % 2 != 0 && S.charAt(i) == '1') {
                        c2++;
                  }
            }

            return Math.min(c1, c2) ; 

      }

      public static void main(String[] args) {
            
      }
      
}
