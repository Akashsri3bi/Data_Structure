import java.util.ArrayList;

public class SubarrayGivenSum {

          static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        
        int start = -1 ;
        int end = -1;
        int point = 0;
        ArrayList<Integer> ans = new ArrayList<>() ; 
        
        int sum = 0 ;
        
        if(s==0){
            ans.add(-1) ; 
            return ans ;
        }
        
        for(int i = 0 ; i<n ; i++){
            sum+=arr[i] ; 
            if(sum==s){
                start = point+1;
                end = i+1;
                break;
            }
            if(sum>s){
                while(sum>s && point<=i){
                    sum-=arr[point];
                    point++;
                }
                if(sum==s){
                start = point+1;
                end = i+1;
                break;
                }
            }
        }
        if(start!=-1 && end!=-1){
        ans.add(start) ; 
        ans.add(end); 
        }else{
            ans.add(-1) ; 
        }
        
        return ans ; 
    }
      
}
