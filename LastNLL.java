public class LastNLL {

      static Node reverseList(Node head) {
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

      int getNthFromLast(Node head, int n) {
            Node curr = reverseList(head);
            for (int i = 1; i < n; i++) {
                  if (curr != null) {
                        curr = curr.next;
                  }
            }
            if (curr == null) {
                  return -1;
            } else {
                  return curr.data;
            }
      }
      public static void main(String[] args) {
            
      }
      
}
