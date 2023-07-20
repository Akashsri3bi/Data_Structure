public class MColoring {

      public boolean graphColoring(boolean graph[][], int m, int n) {
            int[] colors = new int[n];
            return graphColoringUtil(graph, m, n, 0, colors);
      }

      private boolean graphColoringUtil(boolean[][] graph, int m, int n, int vertex, int[] colors) {
            if (vertex == n) {
                  return true;
            }

            for (int color = 1; color <= m; color++) {
                  if (isSafe(graph, colors, vertex, color)) {
                        colors[vertex] = color;
                        if (graphColoringUtil(graph, m, n, vertex + 1, colors)) {
                              return true;
                        }
                        colors[vertex] = 0;
                  }
            }

            return false;

      }

      private boolean isSafe(boolean graph[][], int[] colors, int vertex, int color) {
            for (int i = 0; i < graph.length; i++) {
                  if (graph[vertex][i] == true && colors[i] == color) {
                        return false; // Check if adjacent vertices have the same color
                  }
            }
            return true;
      }
      
}
