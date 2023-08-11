import java.util.ArrayList;

public class MaxSubArray {

          static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
        //int max;
        for(int i=0;i<n-k+1;i++){
            int max=0;
            int j=i;
            while(j<i+k){
                if(arr[j]>max)
                  max=arr[j];
                j++;
            }
            list.add(max);
        }
        return list;
    
    }
      
}
