public class RemoveDupLin {

      Node removeDuplicates(Node head) {
            // Your code here
            if (head == null || head.next == null) {
                  return head;
            }

            Node prev = head;
            Node curr = head.next;
            while (curr != null) {
                  if (prev.data == curr.data) {
                        curr = curr.next;
                  } else {
                        prev.next = curr;
                        prev = curr;
                        curr = curr.next;

                  }
            }
            if (prev.next != null) {
                  prev.next = null;
            }
            return head;
      }
      
}
