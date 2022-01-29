import java.util.Arrays;

//Minimize the maximum difference between the heights
//Decrease or Increase the heights in an Array by k so that the difference between the largest and smallest height is smaller
//One array value can be increased by k and the other can be decreased by k .
public class Maximize {
      static int minimize(int[] arr , int n, int k){
            //Sort the Array 
            Arrays.sort(arr);
            int maxMinDiff = arr[n-1] - arr[0] ; 
            int smallest = arr[0]+k ; 
            int largest = arr[n-1] - k ; 
            int min , max ; 

            for(int i = 0 ; i < n-1 ; i++){
                  min = Math.min(smallest, arr[i+1]-k);
                  max = Math.max(largest, arr[i]+k);
                  if(min<0) continue;  //If min is negative then the total result will increase max-(-min) (^)
                  maxMinDiff = Math.min(maxMinDiff, max-min) ;
            }
            return maxMinDiff ;
      }
      public static void main(String[] args) {
            int arr[] = { 3, 9, 12, 16, 20 };
            int n = 5;
            int k = 3;
            int ans = minimize(arr, n, k);
            System.out.println(ans);
      }
      
}
