import java.util.*;
public class NetworkDelayTime {

      class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // Create an adjacency list to represent the graph
        List<List<Pair<Integer, Integer>>> graph = new ArrayList<>();
        
        // Initialize the distance array to store minimum distances from the source node
        int[] dist = new int[n + 1];
        
        // Initialize the adjacency list for each node
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Populate the adjacency list based on the given times array
        for (int[] time : times) {
            graph.get(time[0]).add(new Pair(time[1], time[2]));
        }
        
        // Initialize a priority queue for exploring nodes in order of their shortest distance
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        
        // Add the starting node to the priority queue with distance 0
        pq.add(new Pair(k, 0));
        
        // Initialize all distances to infinity
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        
        // Explore nodes using Dijkstra's algorithm
        while (!pq.isEmpty()) {
            Pair<Integer, Integer> p = pq.poll();
            int cur = p.getKey();
            
            // Explore neighboring nodes and update distances
            for (Pair<Integer, Integer> neighbor : graph.get(cur)) {
                int curDist = neighbor.getValue() + dist[cur];
                
                // If the new distance is smaller, update and add to the priority queue
                if (curDist < dist[neighbor.getKey()]) {
                    dist[neighbor.getKey()] = curDist;
                    pq.add(new Pair(neighbor.getKey(), curDist));
                }
            }
        }
        
        // Find the maximum delay among all nodes
        int maxDelay = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1; // Some nodes are unreachable, return -1
            }
            maxDelay = Math.max(maxDelay, dist[i]);
        }
        
        return maxDelay;
    }
}
      
}
