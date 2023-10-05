public class POTD2 {

      static Node reverse(Node head) {
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

      public static void rearrange(Node head) {
            // add your code here
            Node start = head;
            Node temp = head.next;
            Node curr = temp;
            while (start.next != null && curr.next != null) {
                  start.next = curr.next;
                  start = curr.next;
                  curr.next = curr.next.next;
                  curr = start.next;
            }
            start.next = reverse(temp);

      }
      
}
