public class SumOfXOR {

          public long sumXOR (int arr[], int n) {
        //Complete the function
        long sum = 0 ;
        for(int i = 0 ; i<32 ; i++){
            long one_cnt = 0 ;
            long zero_cnt = 0 ;
            for(int j = 0; j<n; j++){
                if((arr[j]&1)==0){
                    zero_cnt++;
                }else{
                    one_cnt++;
                }
                arr[j] = arr[j]>>1;
            }
            sum+= (one_cnt*zero_cnt)*(1<<i) ;
        }
        return sum ; 
    }
      
}
