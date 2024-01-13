
 public class Insertion_sort_LL {

      public static Node insertionSort(Node head_ref) {
            // code here
            Node dummy = new Node(10000);
            while (head_ref != null) {
                  Node next = head_ref.next;
                  Node temp = dummy;
                  while (temp.next != null && temp.next.data < head_ref.data) {
                        temp = temp.next;
                  }
                  head_ref.next = temp.next;
                  temp.next = head_ref;
                  head_ref = next;
            }
            return dummy.next;
      }
      
}
