import java.util.HashSet;

public class WildCardString {

      static boolean StringMatching(String s1 , String s2){
            if(s1.length()==0 && s2.length()==0){
                  return true ; 
            }

            if(s1.length()>1 && s1.charAt(0)=='*' && s2.length()==0){
                  return false ;
            }

            if((s1.length()>1 && s1.charAt(0)=='?')||(s1.length()!=0 && s2.length()!=0 && s1.charAt(0)==s2.charAt(0))){
                  return StringMatching(s1.substring(1), s2.substring(1));
            }

            if(s1.length()>0 && s1.charAt(0)=='*'){
                  return StringMatching(s1.substring(1), s2) || StringMatching(s1, s2.substring(1)); 
            }

            return false; 
      }

      static void test(String first, String second) {
            if (StringMatching(first, second))
                  System.out.println("Yes");
            else
                  System.out.println("No");
      }

      public static void main(String[] args) {
            test("g*ks", "geeks"); // Yes
            test("ge?ks*", "geeksforgeeks"); // Yes
            test("g*k", "gee"); // No because 'k' is not in second
            test("*pqrs", "pqrst"); // No because 't' is not in first
            test("abc*bcd", "abcdhghgbcd"); // Yes
            test("abc*c?d", "abcd"); // No because second must have 2
            // instances of 'c'
            test("*c*d", "abcd"); // Yes
            test("*?c*d", "abcd");
      }
      
}
