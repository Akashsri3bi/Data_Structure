import java.util.Scanner;

public class kickstart4 {

      static int binary_search(int arr[], int l, int r, int x) {
            if (r >= l) {
                  int mid = l + (r - l) / 2;

                  
                  if (arr[mid] == x)
                        return mid;

                  // If element is smaller than mid, then
                  // it can only be present in left subarray
                  if (arr[mid] > x)
                        return binary_search(arr, l, mid - 1, x);

                  // Else the element can only be present
                  // in right subarray
                  return binary_search(arr, mid + 1, r, x);
            }

            // We reach here when element is not present
            // in array
            return -1;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ; 
            int t = sc.nextInt() ; 
            int i = 1 ; 
            while(i<=t){
                  int n = sc.nextInt() ; 
                  int[] s = new int[n] ; 
                  for(int j = 0 ; j < n ; j++){
                        s[j] = sc.nextInt() ; 
                  }
                  int m = sc.nextInt();
                  int[] k = new int[m];
                  for (int j = 0; j < m; j++) {
                        k[j] = sc.nextInt();
                  }

                  int first = s[0] ;
                  int key_index = binary_search(k , 0 , m-1 , first) ; 
                  int start = 1 ; 
                  int time = 0;
                  while(start<n){ 
                        int next_index = binary_search(k , 0 , m-1 , s[start]) ; 
                        time+= Math.abs(key_index-next_index) ; 
                        key_index = next_index ; 
                        start++ ; 
                  }
                  System.out.println("Case #" + i + ": " + time);
                  i++ ; 

            }
      }
      
}
