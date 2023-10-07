public class InsertSortedNode {

      Node sortedInsert(Node head, int key) {
            // Add your code here.
            Node nn = new Node(key);
            if (head == null)
                  return nn;

            Node temp = head;
            Node prev = null;
            while (temp != null && temp.data < key) {
                  prev = temp;
                  temp = temp.next;
            }
            if (temp == null) {
                  prev.next = nn;
            } else if (prev == null) {
                  nn.next = head;
                  head = nn;
            } else {
                  nn.next = prev.next;
                  prev.next = nn;
            }
            return head;
      }
      
}
