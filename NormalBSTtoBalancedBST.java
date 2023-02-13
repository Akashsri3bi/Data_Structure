import java.util.ArrayList;

public class NormalBSTtoBalancedBST {

      static class Node {
            int data;
            Node left, right;

            public Node(int data) {
                  this.data = data;
            }
      }

      void inorder(Node root, ArrayList<Integer> list) {
            if (root == null) {
                  return;
            }
            inorder(root.left, list);
            list.add(root.data);
            inorder(root.right, list);

      }

      static Node balancedTree(ArrayList<Integer> list, int start, int end) {
            if (start > end) {
                  return null;
            }

            int mid = (start + end) / 2;
            Node newnode = new Node(list.get(mid));
            newnode.left = balancedTree(list, start, mid - 1);
            newnode.right = balancedTree(list, mid + 1, end);

            return newnode;

      }

      Node buildBalancedTree(Node root) {
            ArrayList<Integer> list = new ArrayList<>();
            inorder(root, list);
            return balancedTree(list, 0, list.size() - 1);
      }
      
}
