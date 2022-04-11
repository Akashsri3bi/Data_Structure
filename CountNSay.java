public class CountNSay {
      //Count and Say 12 => one 1 and one 2 ;
      public static String countAndSay(int n) {
            if(n==1){
                  return "1" ;
            }
            String s = countAndSay(n-1) ;
            String res= "" ;
            int counter = 0 ; 
            for(int i = 0 ; i < s.length() ; i++){
                  counter++ ;
                  if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1)){
                        res = res + counter + s.charAt(i) ;
                        counter = 0 ; 
                  }
            }
            return res ;
      }
      public static void main(String[] args) {
            System.out.print(countAndSay(4));
      }
      
}
