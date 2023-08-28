public class DeleteNodeSmaller {

      static Node reverse(Node head) {
            Node curr = head;
            Node temp = null;
            Node prev = null;
            while (curr != null) {
                  temp = curr.next;
                  curr.next = prev;
                  prev = curr;
                  curr = temp;
            }

            return prev;
      }

      Node compute(Node head) {
            // your code here

            if (head == null || head.next == null) {
                  return head;
            }

            Node curr = reverse(head);
            int cnt = curr.data;
            head = curr;
            while (curr != null) {
                  Node p1 = curr.next;
                  while (p1 != null && p1.data < cnt) {
                        p1 = p1.next;
                  }
                  curr.next = p1;
                  curr = p1;
                  if (p1 != null) {
                        cnt = p1.data;
                  }
            }

            head = reverse(head);
            return head;

      }
      
}
