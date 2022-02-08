//Median of two sorted arrays of equal Size same as this one of different size 
public class MSort {

      static int getMedian(int ar1[], int ar2[], int n, int m){
            if(ar1.length>ar2.length){
                  getMedian(ar2, ar1, ar2.length, ar1.length);
            }

            int n1 = ar1.length ; 
            int n2 = ar2.length ; 
            //implemneting our binary search 
            int lo =  0  , hi = n1 ; 
            while(lo<hi){
                  //Finding our cuts or partition 
                  int cut1 = (lo+(hi-lo))/2 ; 
                  int cut2 = ((n1+n2)/2)-cut1 ; 

                  //Initializing our l1 , l2 , r1 , r2 
                  int l1 = (cut1==0)? Integer.MIN_VALUE : ar1[cut1-1] ; 
                  int l2 = (cut2 == 0) ? Integer.MIN_VALUE : ar2[cut2 - 1];
                  int r1 = (cut1 == n1) ? Integer.MAX_VALUE : ar1[cut1];
                  int r2 = (cut2 == n2) ? Integer.MAX_VALUE : ar2[cut2];     
                  
                  if(l1>r2) hi = cut1-1 ; 
                  else if (l2 > r1)
                        lo = cut1 + 1;
                  else{
                        if((m+n)%2==0){
                              return (int)(Math.max(l1, l2) + Math.min(r1, r2))/2 ; 
                        }else{
                              return (int)(Math.min(r1, r2));
                        }
                  }
            }
            return 0 ; 
      }
      public static void main(String[] args) {
            
            int A[] = { 900 };
            int B[] = { 5, 8, 10, 20 };

            int N = A.length;
            int M = B.length;
            System.out.println(getMedian(A, B ,N, M));
      }
      
}
