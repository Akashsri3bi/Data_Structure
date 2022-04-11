public class RabinKarpAlgo {
      //This denotes the number if characters in input alphabet
      public static int d = 256 ; 
      static void search(String pat, String txt, int q){
            int n = txt.length() ; 
            int m = pat.length() ; 
            int h = 1 ;
            int p = 0 ; //Hash value for pattern 
            int t = 0 ; //Hash value for text 
            for(int i = 0 ; i < m-1 ; i++){
                  h = (h*d)%q ; 
            }

            for(int i = 0 ; i < m ; i++){
                  p = (p*d + pat.charAt(i))%q ; //Hash value is calculated 
                  t = (t*d + txt.charAt(i))%q ;  //Similarly here for the text of that pattern length 
            }

            //Sliding the pattern over text one by one
            for(int i = 0 ; i <= n-m ; i++){
                  int j ; 
                  if(p==t){
                        for(j = 0 ; j < m ; j++){
                              if(txt.charAt(i+j)!=pat.charAt(j)){
                                    break ; 
                              }
                        }
                        if(j==m){
                              System.out.println("Pattern found at index" +  i);
                        }
                  }

                  if(i<n-m){
                        //Calculating the hash value of next round of string 
                        t = (d*(t-txt.charAt(i)*h)+txt.charAt(i+m))%q ; 

                        if(t<0){
                              t = t + q ; 
                        }
                  }
            }
      }
      public static void main(String[] args) {
            String txt = "GEEKS FOR GEEKS";
            String pat = "GEEK";

            // A prime number
            int q = 101;

            // Function Call
            search(pat, txt, q);
      }
      
}
