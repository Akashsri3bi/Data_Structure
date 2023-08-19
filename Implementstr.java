public class Implementstr {

      int strstr(String s, String x) {
            // Your code here
            for (int i = 0; i <= s.length() - x.length(); i++) {
                  boolean check = true;
                  int temp = i;
                  for (int j = 0; j < x.length(); j++) {
                        if (x.charAt(j) != s.charAt(temp)) {
                              check = false;
                              break;
                        } else {
                              temp++;
                        }
                  }
                  if (check) {
                        return i;
                  }
            }
            return -1;

      }
      
}
