import java.util.HashSet;

public class LongestConsecutiveS {

      public int longestConsecutive(int[] nums) {
         HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
        set.add(num);
    }

    int longest = 0;
    for (int num : set) {
        if (!set.contains(num - 1)) { // Start of a potential sequence
            int curr = 1;
            int next = num + 1;
            while (set.contains(next)) {
                curr++;
                next++;
            }
            longest = Math.max(longest, curr);
        }
    }

    return longest;
    }
      
}
