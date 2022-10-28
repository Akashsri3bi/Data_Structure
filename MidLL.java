public class MidLL {

      //Find Middle Node in LinkedList

      public Node middleNode(Node head) {
            Node slow = head;
            Node fast = head;
            while (fast.next != null) {
                  slow = slow.next;
                  fast = fast.next.next;

                  if (fast == null) {
                        break;
                  }
            }

            return slow;
      }

      public static void main(String[] args) {
            
      }
      
}
