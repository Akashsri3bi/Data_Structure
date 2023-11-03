import java.util.ArrayList;
import java.util.List;

public class PythagoreanTriplet {

          boolean checkTriplet(int[] arr, int n) {
        // code here
       List<Integer>list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                int res=(arr[i]*arr[i])+(arr[j]*arr[j]);
                double res1=Math.sqrt(res);
                double res2=Math.floor(res1);
                if(res2==res1){
                    
                    if(list.contains((int)res2))
                        return true;
                    
                   }
                    
                }
                
            }
        }
        return false;
    }
      
}
