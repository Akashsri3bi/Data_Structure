public class OddEvenLL {

      public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null) {
                  return head;
            }
            ListNode start = head;
            ListNode temp = head.next;
            ListNode curr = temp;
            while (start.next != null && curr.next != null) {
                  start.next = curr.next;
                  start = curr.next;
                  curr.next = curr.next.next;
                  curr = start.next;
            }

            start.next = temp;
            return head;
      }
      
}
