public class ZigZagConversion {

      public String convert(String s, int numRows) {
            if (numRows == 1) {
                  return s;
            }

            StringBuilder res = new StringBuilder();
            int n = s.length();
            int increment = 2 * (numRows - 1);

            for (int r = 0; r < numRows; r++) {
                  for (int i = r; i < n; i += increment) {
                        res.append(s.charAt(i));

                        if (r > 0 && r < numRows - 1 && i + increment - 2 * r < n) {
                              res.append(s.charAt(i + increment - 2 * r));
                        }
                  }
            }

            return res.toString();
      }
      
}
