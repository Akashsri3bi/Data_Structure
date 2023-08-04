import java.util.Arrays;

public class Meeting {

          public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        int m[][] = new int[n][2];
        for(int i=0;i<n;i++){
            m[i][0] = start[i];
            m[i][1] = end[i];
        }
        Arrays.sort(m,(a,b) -> a[1] - b[1]);
        int c = 1;
        int e = m[0][1];
        for(int i=1;i<m.length;i++){
            if(m[i][0] > e){
                e = m[i][1];
                c++;
            }
        }
        return c;
    }
      
}
