import java.util.Arrays;

public class AgressiveCows {

      static int placeCows(int[] stalls, int minD){
        int cowPlaced = 1; 
        int curr = stalls[0] ; 
        for(int i = 1 ;i<stalls.length;i++){
            int dist = stalls[i] - curr ; 
            if(dist>=minD){
                cowPlaced++;
                curr = stalls[i] ; 
            }
        }

        return cowPlaced ; 
    }
    public static int aggressiveCows(int[]stalls, int k) {
        //    Write your code here.
        Arrays.sort(stalls); 
        int low = 1; 
        int high = stalls[stalls.length-1] - stalls[0] ; 
        int ans = 0 ; 
        while(low<=high){
            int mid = low + ((high-low)>>1) ;
            int cowsPlaced = placeCows(stalls,mid) ;
            if(cowsPlaced>=k){
                ans = mid ; 
                low = mid+1; 
            }else{
                high = mid-1;
            } 
        }
        return ans ; 
    }
      
}
