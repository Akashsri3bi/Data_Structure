public class ColumnNameNumber {

      String colName(long n) {
            // your code here
            StringBuilder sb = new StringBuilder();

            while (n > 0) {
                  n--; // Convert to 0-based indexing
                  long k = n % 26;
                  char c = (char) (k + 'A');
                  sb.append(c);
                  n = n / 26;
            }

            return sb.reverse().toString();
      }
      
}
