public class SumOfLongRoot {

      class Node {
            Node left, right;
            int data;

            Node(int d) {
                  data = d;
                  left = right = null;
            }

      }

      static int maxLen = 0;
      static int maxSum = Integer.MIN_VALUE;

      public void solve(Node root, int sum, int len) {
            if (root == null) {
                  return;
            }
            if (root.left == null && root.right == null) {
                  sum += root.data;
                  len++;
                  if (len > maxLen) {
                        maxLen = len;
                        maxSum = sum;
                  } else if (len == maxLen) {
                        if (sum > maxSum) {
                              maxSum = sum;
                        }
                  }
                  return;
            }
            sum += root.data;
            solve(root.left, sum, len + 1);
            solve(root.right, sum, len + 1);
      }

      public int sumOfLongRootToLeafPath(Node root) {
            // code here
            maxLen = 0;
            maxSum = Integer.MIN_VALUE;
            solve(root, 0, 0);
            return maxSum;
      }
      public static void main(String[] args) {
            
      }
      
}
