public class LongestDistinctSubstring {

          public int longestkSubstr(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = -1, i = 0, j = 0;
        while (j < s.length()) {
            if (map.size() < k) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                j++;
            }
            else if (map.size() == k) {
                if (map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
                    j++;
                } else {
                    if (ans < j - i) ans = j - i;
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if (map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                    i++;
                }
            }
        }
        if (map.size() == k && ans < j - i) ans = j - i;
        return ans;
    }
      
}
