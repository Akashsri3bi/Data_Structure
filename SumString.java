public class SumString {

      static String sumString(String a, String b) {
            int i = a.length() - 1;
            int j = b.length() - 1;
            StringBuilder ans = new StringBuilder();
            int carry = 0;
            while (i >= 0 && j >= 0) {
                  int x = Character.getNumericValue(a.charAt(i));
                  int y = Character.getNumericValue(b.charAt(j));
                  int res = x + y + carry;
                  int rem = res % 10;
                  carry = res / 10;
                  ans.append(rem);
                  i--;
                  j--;
            }
            while (i >= 0) {
                  int x = Character.getNumericValue(a.charAt(i));
                  int res = x + carry;
                  int rem = res % 10;
                  carry = res / 10;
                  ans.append(rem);
                  i--;
            }
            while (j >= 0) {
                  int y = Character.getNumericValue(b.charAt(j));
                  int res = y + carry;
                  int rem = res % 10;
                  carry = res / 10;
                  ans.append(rem);
                  j--;
            }
            while (carry > 0) {
                  int rem = carry % 10;
                  ans.append(rem);
                  carry /= 10;
            }
            return ans.reverse().toString();
      }

      static boolean check(String s, int start, int l1, int l2, int n) {
            String s1 = s.substring(start, start + l1);
            String s2 = s.substring(start + l1, start + l1 + l2);
            String s3 = sumString(s1, s2);
            int s3_len = s3.length();
            if (s3_len > n - l1 - l2 - start) {
                  return false;
            }
            if (s.substring(start + l1 + l2, start + l1 + l2 + s3_len).equals(s3)) {
                  if (start + l1 + l2 + s3_len == n) {
                        return true;
                  }
                  return check(s, start + l1, l2, s3_len, n);
            }
            return false;
      }

      public int isSumString(String S) {
            // code here
            int n = S.length();
            for (int i = 1; i < n; i++) {
                  for (int j = 1; j < n - i; j++) {
                        if (check(S, 0, i, j, n)) {
                              return 1;
                        }
                  }
            }
            return 0;
      }
      
}
