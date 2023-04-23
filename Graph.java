import java.util.*;

public class Graph{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // n is the number of vertices
            // m is the number of edges
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] adjMat = new int[n + 1][n + 1];
            for(int i = 0 ; i<m ; i++){
                  int u = sc.nextInt() ; 
                  int v = sc.nextInt() ; 
                  adjMat[u][v] = 1 ; 
                  adjMat[v][u] = 1;
            }
      }

      public ArrayList<ArrayList<Integer>> printGraph(
                  int V, ArrayList<ArrayList<Integer>> adj) {
            // Code here
            ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(V);
            for (int i = 0; i < adj.size(); i++) {
                  ArrayList<Integer> list1 = new ArrayList<Integer>(adj.get(i).size());
                  list1.add(i);
                  for (int j = 0; j < adj.get(i).size(); j++) {
                        list1.add(adj.get(i).get(j));
                  }
                  list.add(list1);
            }

            return list;
      }
}