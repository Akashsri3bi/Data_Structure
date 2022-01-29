//Java Programm to find sum and intersection .
public class Union {

      static int union(int[] arr1 , int[] arr2  , int m , int n ){
            int i = 0  , j = 0 ; 
            int count=0 ; 
            while(i < m && j < n){
                  if(arr1[i]<arr2[j]){
                        System.out.print(arr1[i]+" ");
                        count++; 
                        i++ ; 
                  }else if(arr2[j] < arr1[i]){
                        System.out.print(arr2[j] + " ");
                        count++ ; 
                        j++ ; 
                  }else{
                        System.out.print(arr2[j] + " ");
                        count++ ; 
                        i++  ;
                        j++ ; 
                  }
            }
            while(i<m){
                  System.out.print(arr1[i] + " ");
                  count++ ;
                  i++ ; 
            }
            while(j < n ){
                  System.out.print(arr2[j] + " ");
                  count++; 
                  j++ ;
            }
            return count ;
      }
      static int intersection(int[] arr1 , int[] arr2 , int m , int n){
            int i = 0, j = 0;
            int count = 0;
            while (i < m && j < n) {
                  if (arr1[i] < arr2[j]) {
                        i++;
                  } else if (arr2[j] < arr1[i]) {
                        j++;
                  } else {
                        System.out.print(arr2[j] + " ");
                        count++;
                        i++;
                        j++;
                  }
            }

            return count;
      }
      public static void main(String[] args) {
            int arr1[] = { 1, 2, 4, 5, 6 };
            int arr2[] = { 2, 3, 5, 7 };
            int m = arr1.length;
            int n = arr2.length;
            int unionSum = union(arr1, arr2, m, n);
            System.out.println(unionSum);
            int intersectionSum = intersection(arr1, arr2, m, n);
            System.out.println(intersectionSum);
      }
      
}
