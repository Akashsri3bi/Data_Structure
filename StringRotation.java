public class StringRotation {

      public static boolean areRotations(String s1, String s2) {
            // Your code here
            if (s1.length() != s2.length()) {
                  return false;
            }
            s2 = s2 + s2;
            return s2.contains(s1);
      }
      
}
