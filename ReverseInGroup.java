public class ReverseInGroup {

      public static Node reverse(Node node, int k) {
            int count = 0;
            Node curr = node;
            Node prev = null;
            Node temp = null;
            while (count < k && curr != null) {
                  temp = curr.next;
                  curr.next = prev;
                  prev = curr;
                  curr = temp;
                  count++;
            }

            if (temp != null) {
                  node.next = reverse(curr, k);
            }

            return prev;

      }

      public static void main(String[] args) {
            
      }
      
}
