import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {

      public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
            ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
            Arrays.sort(arr) ;
            for(int i = 0 ; i<arr.length-1; i++){
                  for(int j = i+1 ; j<arr.length ; j++){
                        
                        int target2 = k - arr[i] - arr[j] ;  
                        int left = j+1 ; 
                        int right = arr.length-1 ;
                        while(left<right){
                              int sum_two = arr[left] + arr[right] ; 
                              if(sum_two<target2){
                                    left++ ; 
                              }else if(sum_two>target2){
                                    right-- ; 
                              }else{
                                    ArrayList<Integer> list = new ArrayList<>();
                                    list.add(arr[i]) ;
                                    list.add(arr[j]);
                                    list.add(arr[left]);
                                    list.add(arr[right]); 

                                    mainList.add(list) ;

                                    //Processing Duplicates of number 3 
                                    while(left<right && arr[left]==list.get(2)){left++ ; }

                                    //Processing Duplicates of number 4
                                    while(left<right && arr[right]==list.get(3)){right-- ; }

                              }
                        }
                        // Processing Duplicates of number 2
                        while(j+1<arr.length && arr[j+1]==arr[j]){j++ ;}
                  }

                  // Processing Duplicates of number 2
                  while (i + 1 < arr.length-1 && arr[i + 1] == arr[i]) {
                        i++;
                  }
            }

            return mainList ;
      }

      public static void main(String[] args) {
            
      }
      
}
