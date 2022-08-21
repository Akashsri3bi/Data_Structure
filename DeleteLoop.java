import java.util.HashMap;

public class DeleteLoop {
      public static void removeLoop(Node head) {
            // First step is to detect the loop

            // Floyds Algorithm
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                  slow = slow.next;
                  fast = fast.next.next;
                  if (slow == fast) {
                        break;
                  }
            }

            if (slow == head) {
                  while (fast.next != slow) {
                        fast = fast.next;
                  }
                  fast.next = null;
            }

            if (slow != fast) {
                  return;
            }

            slow = head;
            while (slow.next != fast.next) {
                  slow = slow.next;
                  fast = fast.next;
            }
            fast.next = null;
      }

      public static void main(String[] args) {
            
      }
      
}
