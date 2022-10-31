public class L1 {

      public static String licenseKeyFormatting(String s, int k) {
            String R = s.replace("-", "") ; 
            R = R.toUpperCase() ; 
            StringBuilder b = new StringBuilder(); 
            int count = 0 ; 
            for(int i = R.length()-1 ; i>=0 ; i--){
                  if(count==k){
                        b.append("-") ;
                        count = 0 ;  
                  }
                  b.append(R.charAt(i)) ; 
                  count++ ; 
            }
            

            

            return b.reverse().toString() ;

            
      }
      public static void main(String[] args) {
            System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
      }
}
