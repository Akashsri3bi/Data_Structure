public class ReverseDLLs {

      public static Node reverseDLL(Node head) {
            // Your code here
            Node p = head;
            Node temp = null;
            while (p != null) {
                  temp = p.next;
                  Node left = p.prev;
                  p.prev = p.next;
                  p.next = left;
                  if (temp == null) {
                        break;
                  }
                  p = temp;
            }
            return p;
      }
      
}
