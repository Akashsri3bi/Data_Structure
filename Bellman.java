public class Bellman {


            public int bellman(int s, int n, int[][] edges) {

                  int dist[] = new int[n];

                  for (int i = 0; i < n; i++) {
                        dist[i] = Integer.MAX_VALUE;
                  }

                  dist[s] = 0;

                  for (int i = 0; i < n - 1; i++) {
                        for (int arr[] : edges) {

                              int u = arr[0];
                              int v = arr[1];
                              int wt = arr[2];

                              if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                                    dist[v] = dist[u] + wt;
                              }
                        }
                  }
                  for (int arr[] : edges) {

                        int u = arr[0];
                        int v = arr[1];
                        int wt = arr[2];

                        if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                              return 1;
                        }
                  }
                  return 0;
            }

            public int isNegativeWeightCycle(int n, int[][] edges) {
                  for (int i = 0; i < n; i++) {

                        if (bellman(i, n, edges) == 1)
                              return 1;
                  }

                  return 0;
            }
      
      
}
