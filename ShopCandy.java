import java.util.ArrayList;
import java.util.Arrays;

public class ShopCandy {

          static ArrayList<Integer> candyStore(int candies[],int N,int K){
        // code here
        ArrayList<Integer> result = new ArrayList<>() ; 
        Arrays.sort(candies) ; 
        int minCost = 0 ;
        int maxCost = 0 ;
        if(K==0){
            for(int i = 0 ;i<N ; i++){
                minCost+=candies[i] ;
            }
            maxCost = minCost ; 
            result.add(minCost) ;
            result.add(maxCost) ; 
            return result ;
        }
        
        int i = 0 ;
        int j = N-1 ;
        while(i<=j){
            minCost+= candies[i] ;
            i++;
            j = j-K;
        }
        i = 0 ;
        j = N-1 ;
        while(i<=j){
            maxCost+= candies[j] ;
            j--;
            i = i+K;
        }
        result.add(minCost) ; 
        result.add(maxCost) ;
        return result ;
        
        
    }
      
}
