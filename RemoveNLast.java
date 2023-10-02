public class RemoveNLast {

      static int positionFront(ListNode curr, int n) {
            int len = 0;
            while (curr.next != null) {
                  len++;
                  curr = curr.next;
            }
            return len - n;
      }

      public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode curr = head;
            int length = positionFront(curr, n);
            ListNode prev = null;
            curr = head;
            while (length >= 0) {
                  prev = curr;
                  curr = curr.next;
                  length--;
            }
            if (prev == null) {
                  head = head.next;

            } else {
                  prev.next = curr.next;
            }
            return head;
      }
      
}
