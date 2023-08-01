import java.util.Arrays;
import java.util.Comparator;


class Comp implements Comparator<Job>{
           @Override
           public int compare(Job a , Job b){
               return b.profit - a.profit ; 
           }
    }

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
public class JobsScheduling {

          int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        boolean[] slots = new boolean[n] ; 
        int[] ans = new int[2] ; 
        
        Arrays.sort(arr , new Comp());
        
        int max_profit = 0 ;
        int jobs = 0 ;
        
        for(int i = 0 ;i<arr.length ; i++){
            Job curr = arr[i] ; 
                for(int j = Math.min(curr.deadline-1,n) ; j>=0 ; j--){
                    if(!slots[j]){
                        slots[j] = true ; 
                        max_profit+=curr.profit ;
                        jobs++;
                        break;
                    }
                }
        }
        
        ans[0] = jobs ; 
        ans[1] = max_profit ;
        return ans ; 
    }
      
}
