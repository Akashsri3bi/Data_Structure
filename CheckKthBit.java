public class CheckKthBit {

          static boolean checkKthBit(int n, int k)
    {
        // Your code here
        if( ((n>>(k))&1)==1 ){
            return true ; 
        }else{
            return false ;
        }  
        
    }
      
}
