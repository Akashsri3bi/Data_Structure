public class MidLinkedList {

      int getMiddle(Node head) {
            // Your code here.
            if (head == null || head.next == null) {
                  return head.data;
            }

            Node slow = head;
            Node fast = head;
            while (fast.next != null && fast.next.next != null) {
                  slow = slow.next;
                  fast = fast.next.next;
            }

            int cnt = 0;
            Node curr = head;
            while (curr != null) {
                  curr = curr.next;
                  cnt++;
            }

            if (cnt % 2 == 0) {
                  slow = slow.next;
                  return slow.data;
            }

            return slow.data;
      }
      
}
