public class PairwiseSwap {

      public Node pairwiseSwap(Node head) {
            // code here
            Node curr = head;
            Node next = null;
            Node prev = null;
            int count = 0;
            while (curr != null && count < 2) {
                  next = curr.next;
                  curr.next = prev;
                  prev = curr;
                  curr = next;
                  count++;
            }
            if (next != null) {
                  head.next = pairwiseSwap(next);
            }

            return prev;
      }
      
}
