public class ElementThrice {

      static int singleElement(int[] arr , int N) {
        // code here
        int res = 0 ; 
            for(int i = 0 ; i<32 ; i++){
                int ans = 0 ;
                for(int j = 0 ;j<arr.length;j++){
                    if((arr[j] & (1<<i))!=0){
                        ans++;
                    }
                }
                if(ans%3==1){
                    res+= (1<<i) ; 
                }
            }
            return res;
    }
      
}
