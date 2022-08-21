import java.util.Arrays;

public class MissingRepeating {

      static int[] findTwoElement(int arr[], int n) {
            int B = 0;
            Arrays.sort(arr);
            int con = 1;
            for (int i = 0; i < n; i++) {
                  if (arr[i] == con) {
                        con++;

                  }
            }

            for (int i = 1; i < n; i++) {
                  if (arr[i - 1] == arr[i]) {
                        B = arr[i];
                        break;
                  }
            }

            int[] newarr = new int[2];

            newarr[0] = B;
            newarr[1] = con;
            return newarr;
      }

      public static void main(String[] args) {
            int[] arr = new int[]{2 ,21 ,17 ,16 ,22 ,3 ,9 ,10 ,14 ,12 ,20 ,11 ,6 ,4 ,8 ,7 ,23 ,15 ,18 ,13 ,1 ,10 ,19} ;
            int[] findarr = findTwoElement(arr , 23);

            System.out.println(findarr[0]) ; 
            System.out.print(findarr[1]);

      }
      
}
