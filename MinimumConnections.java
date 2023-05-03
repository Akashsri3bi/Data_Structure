public class MinimumConnections {

      public int makeConnected(int n, int[][] connections) {
            if (connections.length < n - 1) {
                  return -1;
            }

            int[] parent = new int[n];
            for (int i = 0; i < n; i++) {
                  parent[i] = i;
            }

            for (int[] k : connections) {
                  int node1 = k[0];
                  int node2 = k[1];
                  union(node1, node2, parent);

            }

            int groups = 0;
            for (int i = 0; i < n; i++) {
                  if (parent[i] == i) {
                        groups++;
                  }
            }

            return groups - 1;
      }

      public int find(int node, int[] parent) {
            if (parent[node] != node) {
                  parent[node] = find(parent[node], parent);
            }

            return parent[node];
      }

      public void union(int node1, int node2, int[] parent) {
            int parent1 = find(node1, parent);
            int parent2 = find(node2, parent);

            if (parent1 != parent2) {
                  parent[parent2] = parent1;
            }
      }
      
}
