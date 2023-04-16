
import java.util.* ; 
public class MedianStream {

      // Function to insert heap.
      static PriorityQueue<Integer> first;
      static PriorityQueue<Integer> second;

      public MedianStream() {
        first = new PriorityQueue<>(Collections.reverseOrder());
        second = new PriorityQueue<>();
    }

      public static void insertHeap(int x) {
            // add your code here
            if (first.size() == 0 || first.peek() >= x) {
                  first.add(x);
            } else {
                  second.add(x);
            }

            balanceHeaps();
      }

      // Function to balance heaps.
      public static void balanceHeaps() {
            // add your code here
            if (first.size() - second.size() > 1) {
                  second.add(first.peek());
                  first.poll();
            } else if (second.size() > first.size()) {
                  first.add(second.peek());
                  second.poll();
            }
      }

      // Function to return Median.
      public static double getMedian() {
            // add your code here
            double median;
            if (first.size() == second.size()) {
                  median = (first.peek() + second.peek()) / 2.0;
            } else {
                  median = first.peek();
            }

            return median;
      }
      
}
