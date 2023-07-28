import java.util.Arrays;
import java.util.Comparator;

class Pair
{
    int x;
    int y;
    
    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}
public class MaxChain {

    int maxChainLength(Pair arr[], int n)
    {
       // your code here
       Arrays.sort(arr , new Comparator<Pair>(){
           public int compare(Pair p1 , Pair p2){
               if(p1.y>p2.y) return 1 ; 
               else if(p1.y<p2.y) return -1 ;
               return 0 ;
           }
       }) ; 
       
       int count = 1 ; 
       int currEnd = arr[0].y;
       for(int i =1  ;i<n ; i++){
           if(arr[i].x>currEnd){
               count++ ; 
               currEnd = arr[i].y ; 
           }
       }
       
       return count ; 
    }
      
}
