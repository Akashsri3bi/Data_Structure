import java.util.ArrayList;

public class MedianBST {

      static void inorder(Node root, ArrayList<Integer> list) {
            if (root == null) {
                  return;
            }
            inorder(root.left, list);
            list.add(root.data);
            inorder(root.right, list);

      }

      public static float findMedian(Node root) {
            // code here.
            int n = 0;
            ArrayList<Integer> list = new ArrayList<>();
            inorder(root, list);
            int size = list.size();
            if (size % 2 == 1) {
                  n = size / 2;
                  return (float) (list.get(n));
            }
            n = size / 2;
            int ans = list.get(n) + list.get(n - 1);
            return (float) ans / 2;

      }
      
}
