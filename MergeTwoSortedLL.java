public class MergeTwoSortedLL {

      Node sortedMerge(Node head1, Node head2) {
            // This is a "method-only" submission.
            // You only need to complete this method
            if (head1 == null) {
                  return head2;
            } else if (head2 == null) {
                  return head1;
            }

            Node start = null;
            Node head = null;
            Node curr1 = head1;
            Node curr2 = head2;

            if (curr1.data < curr2.data) {
                  head = start = curr1;
                  curr1 = curr1.next;
            } else {
                  head = start = curr2;
                  curr2 = curr2.next;
            }

            while (curr1 != null && curr2 != null) {
                  if (curr1.data <= curr2.data) {
                        start.next = curr1;
                        curr1 = curr1.next;
                  } else {
                        start.next = curr2;
                        curr2 = curr2.next;
                  }
                  start = start.next;
            }

            while (curr1 != null) {
                  start.next = curr1;
                  curr1 = curr1.next;
                  start = start.next;
            }

            while (curr2 != null) {
                  start.next = curr2;
                  curr2 = curr2.next;
                  start = start.next;
            }

            return head;

      }
      
}
