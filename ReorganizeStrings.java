import java.util.PriorityQueue;

public class ReorganizeStrings {

      //Important Question With Good Concept
      public class Pair {
            char ch;
            int fq;

            Pair(char ch, int fq) {
                  this.ch = ch;
                  this.fq = fq;
            }
      }

      public String reorganizeString(String s) {
            int[] map = new int[26];
            for (int i = 0; i < s.length(); i++) {
                  map[s.charAt(i) - 'a']++;
            }

            PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> (b.fq - a.fq));
            for (int i = 0; i < 26; i++) {
                  if (map[i] > 0) {
                        pq.add(new Pair((char) ('a' + i), map[i]));
                  }
            }

            StringBuilder sb = new StringBuilder();
            Pair block = pq.poll();
            sb.append(block.ch);
            block.fq--;

            while (pq.size() > 0) {
                  Pair temp = pq.poll();
                  sb.append(temp.ch);
                  temp.fq--;
                  if (block.fq > 0) {
                        pq.add(block);
                  }
                  block = temp;
            }

            if (block.fq > 0) {
                  return "";
            }

            return sb.toString();
      }
      
}
