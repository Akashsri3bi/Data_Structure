import java.util.Arrays;

public class OverlapSequence {

         public int[][] overlappedInterval(int[][] I){
        Arrays.sort(I,(a,b)->a[0] - b[0]);
        int s = I[0][0],e = I[0][1],k = 0;
        int ans[][] = new int[I.length][2];
        for(int i[]:I){
            if(e>=i[0]) e = Math.max(i[1],e);
            else{
                ans[k][0] = s;
                ans[k][1] = e;
                k++;
                s = i[0];
                e = i[1];
            }
        }
        ans[k][0] = s;
        ans[k][1] = e;
        return Arrays.copyOfRange(ans,0,k+1);
    }
      
}
