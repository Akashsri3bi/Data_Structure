public class FindX {
      static int contains(int n , int x){
        int count = 0;
        while(n>0){
            int rem = n%10 ; 
            if(rem==x){
                count++; 
            }
            n = n/10 ; 
        }
        return count ;
    }
    int countX(int L, int R, int X) {
        // code here
        int count = 0 ;
        for(int i  = L+1;i<R;i++){
            count+= contains(i,X) ; 
        }
        return count; 
    }
      
}
