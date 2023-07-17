import java.util.ArrayList;
import java.util.List;

public class JourneyMoon {
          public static int journeyToMoon(int n, List<List<Integer>> astronaut) {
    // Write your code here
    
    //Basic idea of this question is to first count number of individual components
    //using DFS and then find no of pairs of each subtracted from total no of pairs
    //or we can say combinations possible which is 5C2 or 3C2 like that
    // Build adjacency list representation of the astronauts
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (List<Integer> list : astronaut) {
            int astronaut1 = list.get(0);
            int astronaut2 = list.get(1);

            adjList.get(astronaut1).add(astronaut2);
            adjList.get(astronaut2).add(astronaut1);
        }

        // Perform DFS and count the number of astronauts in each connected component
        List<Integer> componentSizes = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int componentSize = dfs(i, adjList, visited);
                componentSizes.add(componentSize);
            }
        }

        // Calculate the total number of pairs of astronauts from different countries
        long totalPairs = 0;
        long sum = 0;
        for (int componentSize : componentSizes) {
            totalPairs += sum * componentSize;
            sum += componentSize;
        }

        return (int) totalPairs;
    
    }
    
    private static int dfs(int node, List<List<Integer>> adjList , boolean[] visited){
        visited[node] = true;
        int count = 1;

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                count += dfs(neighbor, adjList, visited);
            }
        }

        return count;
    }
}
