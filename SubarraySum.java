import java.util.ArrayList;

public class SubarraySum {

          static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int start = 0 ;
        int end = 0 ; 
        int sum = 0 ;
        ArrayList<Integer> ans = new ArrayList<>() ; 
        
        while (end < n ){
            sum += arr[end];
            while (sum > s ){
                sum -= arr[start];
                start++;
            }
            if (sum == s && start <= end){
                ans.add(start+1);
                ans.add(end+1) ; 
                return ans;
            }
            end++;
        }

        ans.add(-1) ; 
        return ans ;
    }
      
}
