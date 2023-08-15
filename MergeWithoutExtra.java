public class MergeWithoutExtra {
      static void swap(long arr1[], long arr2[], int i, int j) {
            if (arr1[i] > arr2[j]) {
                  long temp = arr1[i];
                  arr1[i] = arr2[j];
                  arr2[j] = temp;
            }
      }

      public static void merge(long arr1[], long arr2[], int n, int m) {
            // code here

            int len = n + m;
            int gap = (len / 2) + len % 2;
            while (gap > 0) {
                  for (int i = 0; i + gap < len; i++) {
                        int j = i + gap;

                        if (i < n && j >= n) { // Elements from arr1 and arr2
                              swap(arr1, arr2, i, j - n);
                        } else if (i >= n && j >= n) { // Elements from arr2 and arr2
                              swap(arr2, arr2, i - n, j - n);
                        } else { // Elements from arr1 and arr1
                              swap(arr1, arr1, i, j);
                        }
                  }
                  if (gap == 1)
                        break;
                  gap = (gap / 2) + gap % 2;
            }

            /*
             * Not Optimal
             * int i = 0 ;
             * int j = 0 ;
             * while(i<n && j<m){
             * if(arr1[i]<=arr2[j]){
             * i++;
             * }else{
             * long temp = arr1[i] ;
             * arr1[i] = arr2[j] ;
             * arr2[j] = temp ;
             * 
             * Arrays.sort(arr2) ;
             * }
             * }
             */
      }
      
}
