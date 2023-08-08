import java.util.Arrays;

public class SmallestSubsetsum {

          int minSubset(int[] Arr,int N) { 
        Arrays.sort(Arr);
        long totalSum = 0;
        for(int i=0;i<N;i++)
        {
            totalSum += Arr[i];
        }
        long sum=0;
        int count=0;
        for(int i=N-1;i>=0;i--)
        {
            count++;
            sum += Arr[i];
            totalSum -= Arr[i];
            if(sum > totalSum)
            {
                break;
            }
        }

        return count;
    }
      
}
