public class POTD145 {

      public static boolean isPowerofTwo(long n){
        
        // Your code here
        int i = 0 ; 
        while(Math.pow(2,i)<n){
            i++;
        }
        if(Math.pow(2,i)==n){
            return true ; 
        }else{
            return false ;
        }
    }
      
}
