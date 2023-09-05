import java.util.ArrayList;
import java.util.List;

public class MinNumCoin {

          static List<Integer> minPartition(int N)
    {
        // code here
       List<Integer> ans = new ArrayList<>() ; 
       int[] deno = {1,2,5,10,20,50,100,200,500,2000};
       int i = deno.length-1;
       while(N>0){
           if(deno[i]>N){
               i--;
           }else{
               N = N - deno[i] ; 
               ans.add(deno[i]); 
           }
       }
       return ans ;
    }
      
}
