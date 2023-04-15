import java.util.* ; 
public class SmallestRangeK {

      class Pair implements Comparable<Pair> {
            int data;
            int row;
            int col;

            Pair(int data, int row, int col) {
                  this.data = data;
                  this.row = row;
                  this.col = col;
            }

            public int compareTo(Pair obj) {
                  return this.data - obj.data;
            }
      }

      
            static int[] findSmallestRange(int[][] arr, int n, int k) {
                  PriorityQueue<Pair> pq = new PriorityQueue<>();

                  int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
                  for (int i = 0; i < k; i++) {
                        int ele = arr[i][0];
                        max = Math.max(max, ele);
                        min = Math.min(min, ele);
                        pq.add(new Pair(ele, i, 0));
                  }

                  int start = min;
                  int end = max;

                  while (!pq.isEmpty()) {

                        Pair temp = pq.poll();
                        min = temp.data; // update min ele

                        int uprange = max - min;
                        int ansrange = end - start;
                        if (uprange < ansrange) {
                              start = min;
                              end = max;
                        }
                        if (temp.col + 1 < n) {
                              max = Math.max(max, arr[temp.row][temp.col + 1]);
                              pq.add(new Pair(arr[temp.row][temp.col + 1], temp.row, temp.col + 1));
                        } else
                              break;
                  }
                  int[] ans = new int[2];
                  ans[0] = start;
                  ans[1] = end;
                  return ans;
            }
}
