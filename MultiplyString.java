public class MultiplyString {

      public String multiplyStrings(String s1, String s2) {
            // code here.
            int sign = 1;
            if (s1.charAt(0) == '-') {
                  sign *= -1;
                  s1 = s1.substring(1);
            }
            if (s2.charAt(0) == '-') {
                  sign *= -1;
                  s2 = s2.substring(1);
            }

            int n1 = s1.length();
            int n2 = s2.length();
            int[] result = new int[n1 + n2];

            for (int i = n1 - 1; i >= 0; i--) {
                  int num1 = s1.charAt(i) - '0';
                  for (int j = n2 - 1; j >= 0; j--) {
                        int num2 = s2.charAt(j) - '0';
                        int product = num1 * num2;
                        int sum = product + result[i + j + 1];
                        result[i + j + 1] = sum % 10;
                        result[i + j] += sum / 10;
                  }
            }

            StringBuilder sb = new StringBuilder();
            for (int num : result) {
                  sb.append(num);
            }

            while (sb.length() > 0 && sb.charAt(0) == '0') {
                  sb.deleteCharAt(0);
            }

            return sb.length() == 0 ? "0" : (sign == -1 ? "-" : "") + sb.toString();

      }
      
}
