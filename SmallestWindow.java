import java.util.HashMap;

public class SmallestWindow {

      public static String smallestWindow(String s, String p){
            char[] S = s.toCharArray() ; 
            char[] P = p.toCharArray() ; 

            int[] m = new int[256] ; 

            int ans = Integer.MAX_VALUE ; 
            int start = 0 ; 
            int count = 0;


            //Filling our m array
            for(int i = 0 ; i<P.length ; i++){
                  if(m[P[i]]==0){
                        count++ ;
                  }
                  m[P[i]]++ ; 
            }

            int i = 0 ; 
            int j = 0 ;

            while(j<S.length ){
                  m[S[j]]-- ; 
                  if(m[S[j]]==0){
                        count-- ;
                  }

                  //Condition matching 
                  if(count==0){
                        while(count==0){
                              if(ans>j-i+1){
                                    ans = Math.min(ans, j-i+1) ; 
                                    start = i ;
                              }
                        m[S[i]]++ ; 
                        if(m[S[i]]>0){
                              count++ ; 
                        }

                        i++ ;
                        }

                        
                  }

                  j++;
            }

            if(ans!=Integer.MAX_VALUE){
                  return String.valueOf(S).substring(start , start+ans) ;
            }else{
                  return "-1" ;
            }
      }
      public static void main(String[] args) {
            String s = "ADOBECODEBANC";
            String t = "ABC";

            System.out.print("-->Smallest window that contain all character : ");
            System.out.print(smallestWindow(s, t));
      }

      
}
