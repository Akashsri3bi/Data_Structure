public class ReverseLLK {

      public static Node reverse(Node node, int k) {
            // Your code here
            if (node == null || node.next == null) {
                  return node;
            }

            int ls = 0;
            Node c = node;
            while (c != null) {
                  c = c.next;
                  ls++;
            }

            int kl = k;
            Node curr = node;
            Node kc = node;
            Node prev = null;

            while (k > 0 && curr != null) {
                  Node temp = curr.next;
                  curr.next = prev;
                  prev = curr;
                  curr = temp;
                  k--;
            }

            ls = ls - kl;
            if (ls > kl) {
                  kc.next = reverse(curr, kl);
            } else {
                  kc.next = reverse(curr, ls);
            }

            return prev;
      }
      
}
