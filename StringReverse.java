public class StringReverse {

      public static String reverseWord(String str) {
            // Reverse the string str
            StringBuilder newstr = new StringBuilder(str);
            newstr.reverse();
            return newstr.toString();

      }
      
}
