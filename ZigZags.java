public class ZigZags {

      public void zigZag(int a[], int n) {
            // Code your solution here.
            boolean flag = false;
            for (int i = 0; i < n - 1; i++) {
                  if (flag && a[i] < a[i + 1]) {
                        int temp = a[i + 1];
                        a[i + 1] = a[i];
                        a[i] = temp;
                  } else if (!flag && a[i + 1] < a[i]) {
                        int temp = a[i + 1];
                        a[i + 1] = a[i];
                        a[i] = temp;
                  }
                  flag = !flag;
            }

      }
      
}
