public class QuickSort {

      static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
      }

      static void quickSort(int arr[], int low, int high) {
            // code here
            if (low < high) {
                  int p = partition(arr, low, high);
                  quickSort(arr, low, p - 1);
                  quickSort(arr, p + 1, high);
            }
      }

      static int partition(int arr[], int low, int high) {
            // your code here
            int i = low - 1;
            int pivot = arr[high];
            for (int j = low; j <= high - 1; j++) {
                  if (arr[j] < pivot) {
                        i++;
                        swap(arr, i, j);
                  }
            }

            swap(arr, i + 1, high);
            return i + 1;
      }
      
}
