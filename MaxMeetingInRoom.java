import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



class Trie {
    int start;
    int finish;
    int index;

    Trie(int start, int finish, int index) {
        this.start = start;
        this.finish = finish;
        this.index = index;
    }
}
public class MaxMeetingInRoom {


    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // code here
        Trie[] arr = new Trie[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new Trie(S[i], F[i], i + 1);
        }

        Arrays.sort(arr, (a, b) -> a.finish==b.finish ? a.start - b.start : a.finish - b.finish);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0].index);
        Trie prev = arr[0];
        for (int i = 1; i < N; i++) {
            Trie curr = arr[i];
            if (curr.start > prev.finish) {
                
                ans.add(curr.index);
                prev = curr ;
            }
        }
        Collections.sort(ans);
        return ans ;
      }
}
      
