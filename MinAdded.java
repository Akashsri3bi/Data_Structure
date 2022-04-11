import java.util.Scanner;

public class MinAdded {

      //Main Approach using DP (Longest plaindromic subsequence)

      public static int[] computeLPS(String str){
            int n = str.length() ;
            int i = 1  , len = 0 ; 
            int lps[] = new int[n] ; 
            lps[0] = 0 ; 
            while(i<n){
            if(str.charAt(i)==str.charAt(len)){
                  len++ ; 
                  lps[i] =  len ; 
                  i++ ;  
            }else{
                  if(len!=0){
                        len = lps[len - 1] ; 

                  }else{
                        lps[i] = 0 ; 
                        i++ ; 
                  }
            }
      }
      return lps ; 
      }

      static int getMinCharToAddedToMakeStringPalin(String str){

            StringBuilder s = new StringBuilder() ;           
            s.append(str) ;                                

            String rev = s.reverse().toString() ; 
            s.reverse().append("$").append(rev) ; 

            int lps[] = computeLPS(
                  s.toString()
            ) ; 
            return str.length() - lps[str.length()-1] ; 
      }
      //Minimum characters to be added at front to make string palindrome
      //Naive Approach

      static boolean isPalindrome(String s){
            int i = 0 , j = s.length()-1 ;
            while(i<=j){
                  if(s.charAt(i)!=s.charAt(j)){
                        return false ;
                  }
                  i++ ; 
                  j--; 
            }

            return true ; 
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ; 
            String s = sc.next() ; 
            int flag = 0; 
            int count = 0 ; 
            
            while(s.length()>0){
                  if(isPalindrome(s)){
                        flag = 1 ; 
                        break ; 
                  }else{
                        count++ ; 
                        s = s.substring(0, s.length()-1) ; 
                  }
            }

            if(flag==1){
                  System.out.print(count);
            }
      }
      
}
