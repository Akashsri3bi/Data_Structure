public class ConstructT {

      class Node {
            Node left, right;
            int data;

            Node(int d){
                  data = d;
                  left = right = null;
            }

      }

      static int index = 0;

      public static Node buildTree(int inorder[], int preorder[], int n) {
            index = 0;
            Node ans = helper(inorder, preorder, 0, n - 1, n);

            return ans;

      }

      public static Node helper(int[] inorder, int[] preorder, int start, int end, int n) {
            if (index >= n || start > end)

            {
                  return null;

            }

            Node root =  new Node(preorder[index++]);

            int ind = postion(inorder, n, root.data);

            root.left = helper(inorder, preorder, start, ind - 1, n);

            root.right = helper(inorder, preorder, ind + 1, end, n);

            return root;

      }

      public static int postion(int[] arr, int n, int data) {

            for (int i = 0; i < n; i++)

            {

                  if (arr[i] == data)

                  {

                        return i;

                  }

            }

            return -1;

      }
      
}
