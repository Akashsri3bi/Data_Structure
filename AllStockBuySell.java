import java.util.ArrayList;

public class AllStockBuySell {

          ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>() ; 
        
        boolean buy = true ; 
        int b = 0 ;
        int s = 0 ;
        for(int i = 0 ;i<n-1;i++){
            if(buy){
                if (A[i]<A[i+1]){
                    b = i ;
                    buy = false ; 
                }
            }else{
                if(A[i]>A[i+1]){
                    s = i;
                    ArrayList<Integer> list = new ArrayList<>() ; 
                    list.add(b) ; 
                    list.add(s) ; 
                    ans.add(list) ; 
                    
                    buy = true ; 
                }
            }
        }
        
        if(buy==false){
            ArrayList<Integer> list = new ArrayList<>() ; 
            list.add(b) ; 
            list.add(n-1) ;
            ans.add(list) ; 
        }
        
        
        
        
        return ans ;
    }
      
}
