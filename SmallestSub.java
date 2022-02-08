//Smallest subarray with sum greater than a given value
public class SmallestSub {

      static int smallestSubWithSum(int arr[], int n, int x){
            int smallest = Integer.MAX_VALUE ; 
            int left = 0 ; //1
            int sum = 0 ; 
            for(int i = 0 ; i < n ; i++){
                  sum+=arr[i] ; 
                  while(sum>x){
                        smallest = Math.min(smallest, i-left+1); //1 is added for length 
                        sum = sum-arr[left] ; 
                        left++ ; 
                  }
            }
            return smallest ; 
      }
      public static void main(String[] args) {
            int arr1[] = { 1, 4, 45, 6, 10, 19 };
        int x = 51;
        int n1 = arr1.length;
        int res1 = smallestSubWithSum(arr1, n1, x);
        if (res1 == n1 + 1)
            System.out.println("Not Possible");
        else
            System.out.println(res1);
 
        int arr2[] = { 1, 10, 5, 2, 7 };
        int n2 = arr2.length;
        x = 9;
        int res2 = smallestSubWithSum(arr2, n2, x);
        if (res2 == n2 + 1)
            System.out.println("Not Possible");
        else
            System.out.println(res2);
 
        int arr3[]
            = { 1, 11, 100, 1, 0, 200, 3, 2, 1, 250 };
        int n3 = arr3.length;
        x = 280;
        int res3 = smallestSubWithSum(arr3, n3, x);
        if (res3 == n3 + 1)
            System.out.println("Not Possible");
        else
            System.out.println(res3);
      }
      
}
