import java.util.HashMap;

//find all pairs of given integer in an array whose sum is equal to given number
public class Count {

      //Will give not very correct answer 
      static int count(int[] arr , int k){
            HashMap<Integer,Integer> map = new HashMap<>() ; 
            int count = 0 ;
            for(int i = 0 ; i < arr.length ; i++){
                  if(map.containsKey(k-arr[i])){
                        System.out.println("Pair is " + arr[map.get(k-arr[i])] + "," +arr[i]);
                        count++ ; 
                  }
                  map.put(arr[i], i) ; 
            }
            return count ;
      }

      static int getPairsCount(int arr[], int n, int k) {
            HashMap<Integer, Integer> m = new HashMap<>();
            int count = 0;
            for (int i = 0; i < n; i++) {
                  if (m.containsKey(k - arr[i])) {
                        count += m.get(k - arr[i]);
                  }
                  //Count value is increased but the other If statements will run it will not skip them 
                  if (m.containsKey(arr[i])) {
                        m.put(arr[i], m.get(arr[i]) + 1);
                  } else {
                        m.put(arr[i], 1);
                  }
            }
            return count;
      }
      public static void main(String[] args) {
            int[] arr = {1, 1, 1, 1};
            int count = getPairsCount(arr,arr.length ,2);
            System.out.println(count);
            int counter = count(arr,6);
            System.out.println(counter);
      }
      
}
