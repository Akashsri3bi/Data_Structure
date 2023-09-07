public class MinStepsStarttoEnd {
          int minimumMultiplications(int[] arr, int start, int end) {
        // Your code here
        int n = arr.length ; 
        int[] temp = new int[100001] ;
        int mod = 100000 ; 
        Arrays.fill(temp , -1) ; 
        Queue<Integer> q = new LinkedList<>() ; 
        q.add(start) ;
        temp[start] = 0 ; 
        while(!q.isEmpty()){
            int top = q.poll() ;
            if(top==end){
                return temp[end]; 
            }
            for(int i = 0 ; i<n;i++){
                int pushed = top*arr[i] ; 
                pushed = pushed % mod ;
                if(temp[pushed]==-1){
                    temp[pushed] = temp[top]+1;
                    q.add(pushed) ;
                }
            }
            
        }
        
        return -1 ; 
        
    }
      
}
