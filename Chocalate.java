import java.util.Arrays;

//Chocalate distribution among students such that the maximium choclate and minimum chocalate diffrenceis minimum

public class Chocalate {

      public static int findMinDiff(int[] a, int n, int m) {
            Arrays.sort(a);
            int min = Integer.MAX_VALUE ; 
            for(int i = 0 ; i+m-1 < n ; i++){
                  int difference = a[i+m-1] - a[i] ; 
                  if(min>difference){
                        min = difference;
                  }
            }
            return min ; 
      }

      public static void main(String[] args) {
            int[] arr = {3, 4, 1, 9, 56, 7, 9, 12} ; 
            int m = 5 ; 
            int n = arr.length ; 
            System.out.println(findMinDiff(arr, n , m));
      }
      
}
