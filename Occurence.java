public class Occurence {

          public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        HashMap<Integer,Integer> map = new HashMap<>() ; 
        for(int i = 0 ;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1); 
            }else{
                map.put(arr[i] , 1) ; 
            }
        }
        
        int count = 0 ;
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int value = entry.getValue() ; 
            if(value > (n/k)){
                count++;
            }
        }
        return count ; 
    }
      
}
