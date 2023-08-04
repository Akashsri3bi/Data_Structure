import java.util.Arrays;

public class JobSchedulings {

          int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        int[] result= new int[2] ; 
        boolean[] slot = new boolean[n] ;
        Arrays.fill(slot,false) ;
        
        int jobs = 0 ;
        int maxProfit = 0 ;
        Arrays.sort(arr,(Job a,Job b)-> b.profit-a.profit);
        
        for(int i = 0 ;i<n;i++){
            int deadline = arr[i].deadline - 1;
            int profit = arr[i].profit ;
            for(int j = deadline ; j>=0 ; j--){
                if(slot[j]==false){
                    slot[j] = true ; 
                    jobs++ ;
                    maxProfit+= profit ;
                    break;
                }
            }
            
        }
        result[0] = jobs ;
        result[1] = maxProfit ;
        return result ;
        
    }
      
}
