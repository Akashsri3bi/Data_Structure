public class MergeTwoBinary {

      public static void heapify(int[] arr, int n, int i) {
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < n && arr[left] > arr[largest]) {
                  largest = left;
            }
            if (right < n && arr[right] > arr[largest]) {
                  largest = right;
            }

            if (largest != i) {
                  int temp = arr[i];
                  arr[i] = arr[largest];
                  arr[largest] = temp;

                  heapify(arr, n, largest);
            }
      }

      public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
            // your code here
            int[] newarr = new int[n + m];
            int i = 0;
            for (; i < n; i++) {
                  newarr[i] = a[i];
            }
            for (int j = 0; j < m; j++) {
                  newarr[i] = b[j];
                  i++;
            }

            int size = n + m;
            for (int k = (size / 2) - 1; k >= 0; k--) {
                  heapify(newarr, size, k);
            }

            return newarr;
      }
      
}
