public class KthLargest {

      public int kthLargest(Node root, int K) {
            // Your code here
            List<Integer> l = new ArrayList<>();
            t(root, l);
            return l.get(l.size() - K);
      }

      void t(Node root, List<Integer> l) {
            if (root == null) {
                  return;
            }
            t(root.left, l);
            l.add(root.data);
            t(root.right, l);
      }
      
}
