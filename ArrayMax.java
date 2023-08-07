import java.util.Arrays;

public class ArrayMax {

          int Maximize(int arr[], int n)
    {
       //first we can sotrt this array
       
    Arrays.sort(arr);
     double sum=0;
        for(int x=0;x<n;x++)
        {
            
            sum=sum+(x*(long)arr[x]);
            
        }
        double y=sum%(1000000007);
        return (int)y;
    }
      
}
