import java.util.ArrayList;

public class ClosestPair {

      public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        ArrayList<Integer> res = new ArrayList<>(2);
        int start = 0, end = m - 1, closestDiff = Integer.MAX_VALUE;
        int pairFromArr = Integer.MIN_VALUE, pairFromBrr = Integer.MIN_VALUE;
        while(start < n && end >= 0) {
            int sum = arr[start] + brr[end];
            int absDiff = Math.abs(sum - x);
            if(absDiff < closestDiff) {
                closestDiff = absDiff;
                pairFromArr = arr[start];
                pairFromBrr = brr[end];
            }
            if(sum > x) {
                --end;
            }
            else {
                ++start;
            }
        }
        res.add(pairFromArr);
        res.add(pairFromBrr);
        return res;
    }
      
}
