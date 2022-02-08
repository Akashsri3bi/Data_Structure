import java.util.HashMap;
//Given an array of size n and a number k, find all elements that appear more than n/k times
public class More {

      static int moreThanNdK(int arr[], int n, int k){ 
            int count= 0; 
            HashMap<Integer,Integer> h = new HashMap<>() ;
            for(int i = 0 ; i < n ; i++){
                  if(h.containsKey(arr[i])){
                        h.put(arr[i], h.get(arr[i]) + 1);
                  }else{
                        h.put(arr[i], 1);
                  }
            }
            
            for(int i : h.values()){
                  if(i>n/k){
                        count++;
                  }
            }

            return count ; 
      }

      public static void main(String[] args) {
            int arr1[] = { 2, 3, 3, 2 };
            int size = arr1.length;
            int k = 3;
            System.out.println(moreThanNdK(arr1, size, k));
      }
      
}
