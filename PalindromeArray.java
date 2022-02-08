//Palindromic array in java 

public class PalindromeArray {
      boolean isPalindrome(int n){
            int sum = 0 ; 
            int temp = n ; 
            while(n>0){
                  sum=sum*10 + n%10 ; 
                  n = n/10 ; 
            }
            if(sum==n){
                  return true ; 
            }else{
                  return false ;
            }
      }

      int PalinArray(int a[], int n) {
            for(int i = 0 ; i < a.length ; i++){
                  if(!isPalindrome(a[i])){
                        return 0 ; 
                  }
            }
            return 1 ; 
      }
      public static void main(String[] args) {
            
      }
      
}
