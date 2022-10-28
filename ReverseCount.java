public class ReverseCount {

      public static int reverseCount(String str){
            int count = 0 ;
            if(str.length()<=1){
                  count = 0 ; 
            }else if(str.length()==2){
                  if(str.charAt(0)!=str.charAt(1)){
                        count++; 
                  }
            }else if(str.length()>2){
                  int start = 0 ; 
                  int end = str.length()-1 ; 
                  while(start<=end){
                        if(str.charAt(start)!=str.charAt(end)){
                              count++ ;
                        }
                        start++ ; 
                        end-- ; 
                  }
            }

            return count ; 
      }

      public static int check(String str , int d){
            int max_number = str.length()/d ; 
            String[] store = new String[d] ; 
            int j =0 ;
            int count =0 ;
            for(int i =0 ; i< d ; i++) {
                  String div = str.substring(j, max_number+1) ; 
                  store[i] = div ; 
                  j+=max_number ; 
                  max_number+=max_number ; 
            }

            for(int i = 0 ; i < store.length ; i++){
                  count+=reverseCount(store[i]) ;       
            }

            return count ; 
      }

      public static void main(String[] args) {
            System.out.println(check("ABC" , 2));
      }
      
}
