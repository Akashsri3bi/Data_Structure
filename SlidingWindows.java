import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindows {

      public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length ;
        int i ;
        ArrayList<Integer> list = new ArrayList<>() ; 
        Deque<Integer> dq = new ArrayDeque<>() ; 
        for(i=0;i<k;i++){
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.removeLast() ; 
            }
            dq.addLast(i) ; 
        }
        list.add(nums[dq.peek()]) ;
        for(;i<n;i++){
            while(!dq.isEmpty() && (dq.peek()<=i-k)){
                dq.removeFirst() ; 
            }
            while(!dq.isEmpty() && (nums[i]>=nums[dq.peekLast()]) ){
                dq.removeLast() ; 
            }
            dq.addLast(i);
            list.add(nums[dq.peek()]) ;
        }
        int[] temp = new int[list.size()] ; 
        int j = 0 ;
        for(int kl : list){
            temp[j] = kl ; 
            j++;
        }

        return temp ; 
    }
      
}
