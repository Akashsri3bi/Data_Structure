import java.util.HashMap;
import java.util.Map;

public class ArrayPairSumDivisbility {

        public static boolean canPair(int[] nums, int k) {
         int len = nums.length;
        if(len % 2 != 0){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            int rem = num%k;
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()%2 != 0){
                if(!entry.getValue().equals(map.get(k - entry.getKey()))){
                    return false;
                }
            }
        }
        return true;
    }
      
}
