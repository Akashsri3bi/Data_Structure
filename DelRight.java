
public class DelRight {
      Node reverseList(Node head) {
            Node curr = head;
            Node prev = null;
            while (curr != null) {
                  Node temp = curr.next;
                  curr.next = prev;
                  prev = curr;
                  curr = temp;
            }

            return prev;

      }

      void delLesserNode(Node head) {
            Node curr = head;
            Node max = head;
            while (curr != null && curr.next != null) {
                  if (curr.next.data < max.data) {
                        Node temp = curr.next;
                        curr.next = temp.next;
                        temp = null;
                  } else {
                        // If newnode is greater make it max ;
                        curr = curr.next;
                        max = curr;

                  }
            }
      }

      Node compute(Node head) {
            Node ret = reverseList(head);
            delLesserNode(ret);
            ret = reverseList(ret);

            return ret;
      }

}
