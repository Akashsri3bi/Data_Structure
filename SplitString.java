public class SplitString {
      //Split the Binary String into substrings with equal number of 0s and 1s
      static int maxSubstr(String str , int n){
            int count0 = 0  ; 
            int count1 = 0  ; 
            int resultantCount = 0 ;

            for(int i = 0 ; i < n ; i++){
                  if(str.charAt(i)=='0'){
                        count0++ ; 
                  }else{
                        count1++ ; 
                  }

                  if(count0==count1){
                        resultantCount++ ; 
                  }
            }

            if(count0!=count1){
                  return -1 ;
            }
            
            return resultantCount ; 
      }
      public static void main(String[] args) {
            
      }
      
}
