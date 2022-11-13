import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewTree {
      class Node {
            int val;
            Node left, right;

            Node(int data) {
                  val = data;
                  left = null;
                  right = null;
            }
      }

      static class Pair {
            int hd;
            Node node;

            public Pair(int hd, Node node) {
                  this.hd = hd;
                  this.node = node;
            }
      }


      static ArrayList<Integer> bottomView(Node root) {
            Queue<Pair> q = new ArrayDeque<>();
            Map<Integer, Integer> map = new TreeMap<>();
            ArrayList<Integer> list = new ArrayList<>();

            q.add(new Pair(0, root));

            while (!q.isEmpty()) {
                  Pair curr = q.poll();
                  map.put(curr.hd , curr.node.val) ; 

                  if (curr.node.left != null) {
                        q.add(new Pair(curr.hd - 1, curr.node.left));
                  }

                  if (curr.node.right != null) {
                        q.add(new Pair(curr.hd + 1, curr.node.right));
                  }

            }

            for (int i : map.values()) {
                  list.add(i);
            }

            int[] arr = new int[5] ; 
            Arrays.copyOfRange(arr, 0, 0) ; 
            return list;

      }

      
}
