public class ReverseWords {

      public String reverseWords(String s) {
            int i = 0, j = s.length() - 1;
            while (i <= j && s.charAt(i) == ' ')
                  i++;
            while (j >= i && s.charAt(j) == ' ')
                  j--;
            // Trimed input string by removing trailing and leading spaces
            s = s.substring(i, j + 1);
            String[] words = s.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (int k = words.length - 1; k > 0; k--) {
                  sb.append(words[k]).append(" ");
            }
            sb.append(words[0]);
            return sb.toString();
      }
      
}
