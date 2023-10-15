public class MinWinSub {

      public String minWindow(String s, String t) {

            if (s.length() < t.length()) {
                  return "";
            }
            HashMap<Character, Integer> countMap = new HashMap<>();
            for (char c : t.toCharArray()) {
                  countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            }
            int start = 0;
            int end = 0;
            int maxLen = Integer.MAX_VALUE;
            int maxStart = 0; // to track Start index of substring
            int maxEnd = 0; // to track End index of substring
            int count = countMap.size();
            while (end < s.length()) {
                  char tempCharEnd = s.charAt(end);
                  if (countMap.containsKey(tempCharEnd)) {
                        countMap.put(tempCharEnd, countMap.get(tempCharEnd) - 1);
                        if (countMap.get(tempCharEnd) == 0) {
                              count--;
                        }
                  }
                  while (count == 0) {
                        if (maxLen > end - start + 1) {
                              maxLen = end - start + 1;
                              maxStart = start;
                              maxEnd = end + 1;
                        }
                        char tempCharStart = s.charAt(start);
                        if (countMap.containsKey(tempCharStart)) {
                              countMap.put(tempCharStart, countMap.get(tempCharStart) + 1);
                              if (countMap.get(tempCharStart) > 0) {
                                    count++;
                              }
                        }
                        start++;
                  }
                  end++;
            }
            return s.substring(maxStart, maxEnd);
      }
      
}
