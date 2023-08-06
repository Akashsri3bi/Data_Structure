import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

      class myComp implements Comparator<Item>
{
    public int compare(Item a,Item b)
    {
        double r1=((double)(a.value))/((double)(a.weight));
        double r2=((double)(b.value))/((double)(b.weight));
        if(r1<r2){
            return 1;
        }
        else if(r1>r2){
            return -1;
        }
        else{
            return 0;
        }
    }
}
class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        
        
        Arrays.sort(arr,new myComp());
        double ans=0.0;
        int i=0;
        while(W>0 && i<n)
        {
            if(arr[i].weight<=W)
            {
              ans+=arr[i].value; 
              W=W-arr[i].weight;
            }
            else{
             ans+=W*(double)arr[i].value/arr[i].weight;
             break;
            }
          i++;  
        }
        
        return ans;
    }
}
      
}
