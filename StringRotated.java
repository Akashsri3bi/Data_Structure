public class StringRotated {

      public static boolean isRotated(String str1, String str2) {
            // Your code here
            int len1 = str1.length();
            int len2 = str2.length();

            if (len1 != len2) {
                  return false;
            }
            if (len1 <= 2) {
                  if (str1.equals(str2)) {
                        return true;
                  } else {
                        return false;
                  }
            }

            // anti-clockwise ;
            char c0 = str1.charAt(0);
            char c1 = str1.charAt(1);

            String newstr1 = str1.substring(2, len1) + c0 + c1;
            if (newstr1.equals(str2)) {
                  return true;
            }

            // clockwise ;
            char c_n1 = str1.charAt(len1 - 1);
            char c_n2 = str1.charAt(len1 - 2);

            String newstr2 = "" + c_n2 + c_n1 + str1.substring(0, len1 - 2);
            if (newstr2.equals(str2)) {
                  return true;
            }

            return false;
      }
      
}
