import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LargestRectangularWithSum0 {

    public static ArrayList<ArrayList<Integer>> sumZeroMatrix(int[][] a) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = a.length, m = a[0].length;
        int up = 0,down = 0,left = 0,right = 0;
        int dp[] = new int[m];
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                
                for(int k=0;k<m;k++){
                    dp[k] += a[j][k];
                }

                HashMap<Integer,Integer> map = new HashMap<>();
                int l=0,r=0,sum=0;
                map.put(0,-1);
                for(int k=0;k<m;k++){
                    sum += dp[k];
                    if(map.containsKey(sum)){
                        if(k-map.get(sum) > r-l){
                            l = map.get(sum)+1;
                            r = k+1;
                        }
                    }else{
                        map.put(sum,k);
                    }
                }
                
                int curArea = (j-i+1)*(r-l);
                int maxArea = (down-up)*(right-left);
                
                
                if( curArea >maxArea){
                    right = r;
                    left = l;
                    down = j+1;
                    up = i;
                }else if(curArea ==maxArea){
                    if(l<left){
                        right = r;
                        left = l;
                        down = j+1;
                        up = i;
                    }
                }
            }
            Arrays.fill(dp,0);
        }
        
        for(int i=up;i<down;i++){
            ArrayList<Integer> ls = new ArrayList<>();
            for(int j=left;j<right;j++){
                ls.add(a[i][j]);
            }
            res.add(new ArrayList<>(ls));
        }
        return res;
    }
      
}
