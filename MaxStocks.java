public class MaxStocks {

          public static int buyMaximumProducts(int n, int k, int[] price) {
        int arr[][] = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=price[i];
            arr[i][1]=i+1;
        }
        Arrays.sort(arr,(a,b)->(a[0]-b[0]));
        int ans = 0;
        for(int i=0;i<n;i++){
            int x = arr[i][0]*arr[i][1];
            if(x<=k){
                ans+=arr[i][1];
                k-=x;
            }else{
                ans+=k/arr[i][0];
                return ans;
            }
        }
        return ans;
    }
      
}
