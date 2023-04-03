import java.util.LinkedList;
import java.util.Queue;

public class SumOfMinMax {

      public static int SumOfKsubArray(int arr[] , int k){
            int sum = 0 ; 
            Queue<Integer> S = new LinkedList<>() , G = new LinkedList<>();
            int i = 0 ;
            //For First Window
        for (i = 0; i < k; i++)
        {
            // Remove all previous greater elements
            // that are useless.
            while ( !S.isEmpty() && arr[S.peek()] >= arr[i])
                S.remove(); // Remove from rear
   
            // Remove all previous smaller that are elements
            // are useless.
            while ( !G.isEmpty() && arr[G.peek()] <= arr[i])
                G.remove(); // Remove from rear
   
            // Add current element at rear of both deque
            G.add(i);
            S.add(i);
        }

        for( ;i<arr.length ; i++){
            sum += arr[S.peek()]+arr[G.peek()] ; 
            while (!S.isEmpty() && S.peek() <= i - k)
                  S.remove();
            while (!G.isEmpty() && G.peek() <= i - k)
                  G.remove() ; 

            while (!S.isEmpty() && arr[S.peek()] >= arr[i])
                  S.remove(); // Remove from rear

            // remove all previous smaller that are elements
            // are useless
            while (!G.isEmpty() && arr[G.peek()] <= arr[i])
                  G.remove();
            
            G.add(i);
            S.add(i);
        }
        sum += arr[S.peek()] + arr[G.peek()];
        return sum;
      
}
}
