import java.util.ArrayList;
import java.util.Arrays;

public class FindPairsum {

      public pair[] allPairs(long A[], long B[], long N, long M, long X) {
    ArrayList<pair> list = new ArrayList<>();
    Arrays.sort(A);
    Arrays.sort(B);
    
    int i = 0;
    int j = (int) M - 1;
    
    while (i < N && j >= 0) {
        long sum = A[i] + B[j];
        
        if (sum == X) {
            list.add(new pair(A[i], B[j]));
            i++;
            j--;
        } else if (sum < X) {
            i++;
        } else {
            j--;
        }
    }
    
    pair[] ans = new pair[list.size()];
    for (int k = 0; k < list.size(); k++) {
        ans[k] = list.get(k);
    }
    
    return ans;
}
      
}
