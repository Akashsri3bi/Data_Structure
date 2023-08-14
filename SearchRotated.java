public class SearchRotated {

      int search(int arr[], int l, int h, int key) {
            int s = l, e = h;
            while (s <= e) {
                  int m = (s + e) / 2;
                  if (arr[m] == key) {
                        return m;
                  } else if (arr[m] >= arr[s]) {
                        // left side is sorted so check if key lies in left side or not
                        if (key >= arr[s] && key < arr[m])
                              e = m - 1;
                        else
                              s = m + 1;
                  } else {
                        // right side is sorted so check if key lies in right side or not
                        if (key <= arr[e] && key > arr[m])
                              s = m + 1;
                        else
                              e = m - 1;
                  }
            }
            return -1;
      }
      
}
