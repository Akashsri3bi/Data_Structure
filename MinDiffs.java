import java.util.ArrayList;
import java.util.Collections;

public class MinDiffs {

          public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a) ; 
        int i = 0;
        int j = m-1;
        int minDiff = Integer.MAX_VALUE ;
        while(j<n){
            minDiff = Math.min(minDiff , a.get(j) - a.get(i)) ;
            i++ ;
            j++ ;
        }
        return minDiff;
    }
      
}
