public class SwapLL {

      static Node swap(Node head) {
            if (head == null || head.next == null) {
                  return head;
            }
            Node prev = head;
            Node curr = head.next;
            Node temp = curr.next;
            curr.next = prev;
            prev.next = swap(temp);
            return curr;
      }

      public Node pairwiseSwap(Node head) {
            // code here
            return swap(head);
      }
      
}
