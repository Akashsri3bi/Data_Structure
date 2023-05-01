import java.util.*;
public class CloneGraph {

      class Node {
            public int val;
            public List<Node> neighbors;

            public Node() {
                  val = 0;
                  neighbors = new ArrayList<Node>();
            }

            public Node(int _val) {
                  val = _val;
                  neighbors = new ArrayList<Node>();
            }

            public Node(int _val, ArrayList<Node> _neighbors) {
                  val = _val;
                  neighbors = _neighbors;
            }
      }

      public void dfs(Node copy, Node node, Node[] visted) {
            visted[copy.val] = copy;
            for (Node n : node.neighbors) {
                  if (visted[n.val] == null) {
                        Node newnode = new Node(n.val);
                        copy.neighbors.add(newnode);
                        dfs(newnode, n, visted);
                  } else {
                        copy.neighbors.add(visted[n.val]);
                  }
            }
      }

      public Node cloneGraph(Node node) {
            if (node == null)
                  return null;
            Node copy = new Node(node.val);
            Node[] visted = new Node[101];
            Arrays.fill(visted, null);
            dfs(copy, node, visted);
            return copy;
      }
      
}
