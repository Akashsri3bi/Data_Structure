public class FlattenBst {

      static void inorder(List<Integer> traversal,
                  Node parent) {
            // Base Case
            if (parent == null)
                  return;

            inorder(traversal, parent.left);
            // Storing the values in the list
            traversal.add(parent.data);

            inorder(traversal, parent.right);
      }
      
}
