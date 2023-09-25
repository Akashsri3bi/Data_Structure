import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;

      class Triplet{
    int x ; 
    int y ; 
    int sum ; 
    Triplet(int x , int y , int sum){
        this.sum = sum ;
        this.x = x ; 
        this.y = y ; 
    }
}

class Pair {
        int indexA;
        int indexB;
        
        
        public Pair(int indexA, int indexB) {
            this.indexA = indexA;
            this.indexB = indexB;
            
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(indexA, indexB);
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Pair other = (Pair) obj;
            return indexA == other.indexA && indexB == other.indexB;
        }
    }

public class MaxSumCombination {

    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // code here
         Arrays.sort(A);
        Arrays.sort(B);
        
        PriorityQueue<Triplet> maxHeap = new PriorityQueue<>((a, b) -> (b.sum - a.sum));
        
        Set<Pair> visited = new HashSet<>();
        maxHeap.offer(new Triplet(N - 1, N - 1, A[N - 1] + B[N - 1]));
        visited.add(new Pair(N - 1, N - 1));
        
        List<Integer> result = new ArrayList<>();
        
        while (K > 0) {
            Triplet p = maxHeap.poll();
            result.add(p.sum);
            
            int i = p.x;
            int j = p.y;
            
            if (i > 0 && !visited.contains(new Pair(i - 1, j))) {
                maxHeap.offer(new Triplet(i - 1, j, A[i - 1] + B[j]));
                visited.add(new Pair(i - 1, j));
            }
            if (j > 0 && !visited.contains(new Pair(i, j - 1))) {
                maxHeap.offer(new Triplet(i, j - 1, A[i] + B[j - 1]));
                visited.add(new Pair(i, j - 1));
            }
            
            K--;
        }
        
        return result;
    }
      
}
