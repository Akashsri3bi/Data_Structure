import java.util.ArrayList;

public class First_N_Last {

      ArrayList<Long> find(long arr[], int n, int x) {
            ArrayList<Long> list = new ArrayList<>() ;
            int l = 0 ; 
            int u = n-1 ; 
            int res = -1 ;

            //For first occurence
            while (l <= u) {
                  int mid = (l + u) / 2;
                  if (arr[mid] == x) {
                        res =  mid;
                        u = mid -1 ; 
                  } else if (arr[mid] < x) {
                        l = mid + 1;
                  } else {
                        u = mid - 1;
                  }
            }

            list.add((long)res) ;

            l = 0;
            u = n - 1;
            res = -1;
            //Last occurence 
            while (l <= u) {
                  int mid = (l + u) / 2;
                  if (arr[mid] == x) {
                        res = mid;
                        l = mid + 1;
                  } else if (arr[mid] < x) {
                        l = mid + 1;
                  } else {
                        u = mid - 1;
                  }
            }

            list.add((long) res);

            return list ; 
      }   
}
