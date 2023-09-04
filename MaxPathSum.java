public class MaxPathSum {

      class Solution {
            private int sum;

            public Solution() {
                  this.sum = Integer.MIN_VALUE;
            }

            int findMaxPathSum(Node root) {
                  if (root == null) {
                        return 0;
                  }

                  int lsum = findMaxPathSum(root.left);
                  int rsum = findMaxPathSum(root.right);

                  if (root.left == null && root.right == null) {
                        return root.data;
                  }

                  if (root.left == null) {
                        return root.data + rsum;
                  }

                  if (root.right == null) {
                        return root.data + lsum;
                  }

                  this.sum = Math.max(this.sum, root.data + lsum + rsum);
                  return Math.max(root.data + lsum, root.data + rsum);
            }

            int maxPathSum(Node root) {
                  int ans = findMaxPathSum(root);

                  if (root.left == null || root.right == null) {
                        this.sum = Math.max(this.sum, ans);
                  }

                  return this.sum;
            }
      }
      
}
