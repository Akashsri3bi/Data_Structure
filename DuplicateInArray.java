import java.util.ArrayList;

public class DuplicateInArray {

      public static ArrayList<Integer> duplicates(int arr[], int n) {
        
       ArrayList<Integer> list = new ArrayList<>() ; 
       for(int i = 0 ;i<n ;i++){
           int index = arr[i]%n ; 
           arr[index]+=n ; 
       }
       
       for(int i = 0 ;i<n ; i++){
           if((arr[i]/n)>=2){
               list.add(i) ; 
           }
       }
       
       if(list.size()==0){
           ArrayList<Integer> ans = new ArrayList<>() ; 
           ans.add(-1) ; 
           return ans ; 
       }
       
       return list ; 
    }
      
}
