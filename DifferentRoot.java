import java.util.ArrayList;

public class DifferentRoot {

      public static void helper(Node root, ArrayList<Integer> list) {
            if (root == null) {
                  return;
            }
            helper(root.left, list);
            list.add(root.data);
            helper(root.right, list);

      }

      public static int countPairs(Node root1, Node root2, int x) {
            // Code here
            int pair = 0;
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            helper(root1, list1);
            helper(root2, list2);
            int k = 0;
            int y = list2.size() - 1;
            while (k < list1.size() && y >= 0) {
                  int a = list1.get(k);
                  int b = list2.get(y);

                  if (a + b == x) {
                        pair++;
                        y--;
                  } else if (a + b > x) {
                        y--;
                  } else {
                        k++;
                  }
            }

            return pair;
      }
      
}
