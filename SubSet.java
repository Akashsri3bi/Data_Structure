import java.util.Arrays;
//Array is a subset of another array
public class SubSet {

      static int binarySearch(int arr[], int l, int r, int x) {
            if (r >= l) {
                  int mid = l + (r - l) / 2;
                  if (arr[mid] == x)
                        return mid;
                  if (arr[mid] > x)
                        return binarySearch(arr, l, mid - 1, x);
                  return binarySearch(arr, mid + 1, r, x);
            }
            return -1;
      }

      static String isSubset(int a1[], int a2[], int n, int m) {
            boolean flag = false ; 
            int count = 0 ;
            Arrays.sort(a1);
            for(int i = 0 ; i < m ; i++){
                  if(binarySearch(a1 , 0 , a1.length , a2[i])!=-1){
                        count++;
                  }
            }
            if(m-count==0){
                  return "yes" ;
            }else{
                  return "no";
            }
      }

      public static void main(String[] args) {
            int a1[] = { 1, 2, 3, 4, 5, 6 };
            int a2[] = { 1, 2, 4 };

            System.out.print(isSubset(a1, a2, a1.length, a2.length));
      }
      
}
