public class RotateLinkedList {

      public Node rotate(Node head, int k) {
            // add code here
            if (head == null || head.next == null) {
                  return head;
            }

            Node curr = head;
            int size = 1;
            while (curr.next != null) {
                  curr = curr.next;
                  size++;
            }
            if (size == k) {
                  return head;
            }
            curr.next = head;

            Node start = null;
            int count = 1;
            Node temp = head;
            while (temp != null && count < k) {
                  temp = temp.next;
                  count++;
            }

            if (temp.next != null) {
                  start = temp.next;
                  temp.next = null;
            }

            return start;
      }
      
}
