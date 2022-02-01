import java.util.ArrayList;
import java.util.Arrays;

//To find the longest sequence subArray 
public class LonSub {

      static int findLongestConseqSubseq(int arr[], int N) {
            int count = 0  , maxCount= 0 ;
            Arrays.sort(arr);
            ArrayList<Integer> nonDuplicates = new ArrayList<>() ;
            for(int i = 1 ; i < arr.length  ; i++){
                  if(arr[i]!=arr[i-1]){
                        nonDuplicates.add(arr[i]);
                  }
            }

            for(int i = 0 ; i < nonDuplicates.size() ; i++){
                  if(i>0 && nonDuplicates.get(i)==nonDuplicates.get(i-1)+1){
                        count++  ;
                  }else{
                        count = 1 ;
                  }

                  maxCount = Math.max(maxCount, count); 
            }

            return maxCount ; 
      }

      public static void main(String[] args) {
            int[] arr = {6, 6 ,2 ,3 ,1 ,4 ,1 ,5 ,6 ,2 ,8 ,7 ,4 ,2 ,1 ,3 ,4 ,5 ,9 ,6};
            System.out.println(findLongestConseqSubseq(arr, arr.length));
      }
      
}
