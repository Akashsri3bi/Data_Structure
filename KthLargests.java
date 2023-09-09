public class KthLargests {

      static void inorder(Node root, ArrayList<Integer> ans) {
            if (root == null) {
                  return;
            }
            inorder(root.right, ans);
            ans.add(root.data);
            inorder(root.left, ans);

      }

      public int kthLargest(Node root, int K) {
            // Your code here
            ArrayList<Integer> ans = new ArrayList<>();
            inorder(root, ans);
            return ans.get(K - 1);

      }
      
}
