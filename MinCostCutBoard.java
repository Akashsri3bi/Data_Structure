import java.util.Arrays;

public class MinCostCutBoard {

          public static int minimumCostOfBreaking(int[] X, int[] Y,int M,int N) {
        // code here
        Arrays.sort(X);
        Arrays.sort(Y);
        int h = X.length-1, v = Y.length-1; // h & v both point the last element(expensive cost) of X[] & Y[] array respectively. 
        int hp=1, vp=1, minCost=0; 
        // Greedy approach --> choose extensive cost first then cheap cost. 
        // keep track of horizontal pieces(hp) & vertical pieces(vp).
        while(h>=0 && v>=0) {
            if(X[h]<=Y[v]) { 
                minCost+=(Y[v]*hp);
                vp++;
                v--;
            }else {
                minCost+=(X[h]*vp);
                hp++;
                h--;
            }
        }
        
        while(v>=0) {
            minCost+=(Y[v]*hp);
            vp++;
            v--;
        }
        
        while(h>=0) {
            minCost+=(X[h]*vp);
            hp++;
            h--;
        }
        return minCost;
    }
      
}
