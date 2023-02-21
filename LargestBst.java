public class LargestBst {

      static class Node {
            int data;
            Node left, right;

            public Node(int data) {
                  this.data = data;
            }
      }
      static class Pair {
            int size;
            boolean isBST;
            int min;
            int max;

            Pair(int s, boolean b, int maxi, int mini) {
                  size = s;
                  isBST = b;
                  max = maxi;
                  min = mini;
            }
      }

      static int maxSize = 0;

      static Pair solve(Node root) {
            if (root == null) {
                  return new Pair(0, true, Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
            Pair left = solve(root.left);
            Pair right = solve(root.right);
            // calcualte size
            int currSize = left.size + right.size + 1;
            // condition for bst
            boolean currBST = false;
            // left and right subtree should be BST and
            // root data wiil be greater than maximum value of left subtree and will be less
            // than minimum value of eight subtree
            if (left.isBST && right.isBST && root.data > left.max && root.data < right.min) {
                  currBST = true;
            }
            int currMax = Math.max(root.data, right.max);
            int currMin = Math.min(root.data, left.min);
            Pair ans = new Pair(currSize, currBST, currMax, currMin);
            if (ans.isBST) {
                  if (ans.size > maxSize)
                        maxSize = ans.size;
            }
            return ans;
      }

      static int largestBst(Node root) {
            // Write your code here
            maxSize = 0;
            Pair ans = solve(root);
            return maxSize;
      }

}
