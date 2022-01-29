//Minimum number of jumps to reach end of array

//Approach 1 is naive approach
public class jumps {

      static int jumping(int[] arr , int start , int end){
            //When source and destination are same 
            if(start==end){
                  return 0 ; 
            }
            //When nothing is reachable from given source 
            if(arr[start]==0){
                  return Integer.MAX_VALUE ;
            }

            //Traversing through all points reachable from arr[l]
            //Recursively to get the number of jumps needed to reach arr[h] from
            //These reachable points

            int min = Integer.MAX_VALUE ;
            for(int i = start+1 ; i<=end && i<= start + arr[start] ; i++){
                  int jumps = jumping(arr, i , end);
                  if(jumps!=Integer.MAX_VALUE){
                        min = jumps+1 ;
                  }
            }
            return min ; 

      }

      //Approach 2 Dynamic Programming 
      
      //In this approach we build jumps array from right to left 
      //jumps[0] will hold the result 
      static int minJumps(int[] arr , int n){
            int[] jumps = new int[n];
            int min ;
            //minimum number of jumps needed to reach last element from last element itself is 0 
            jumps[n-1] = 0 ; 
            //moving from right to left and construct the jumps[] array where jumps[i] will hold minimum number
            //of jumps needed to reach arr[m-1] from arr[i] ;
            for(int i = n-2 ; i>=0 ; i--){
                  if(arr[i]==0){
                        //If at that position element is 0 then we cannot reach end from there 
                        jumps[i] = Integer.MAX_VALUE;
                  }
                  if(arr[i]>=n-i-1){
                        //If the number on array[at that index] is equal or greater than arrayLast Index 
                        //And we can reach the end at one jump from there then we store 
                        jumps[i]=1 ;
                  }
                  else{
                        min = Integer.MAX_VALUE ;
                        for(int j = i+1 ; j<n && j<=arr[i]+i ; j++){
                              if(min>jumps[j]){
                                    min = jumps[j];
                              }
                        }

                        if(min!=Integer.MAX_VALUE){
                              jumps[i] = min+1 ;
                        }else{
                              jumps[i] = min ;
                        }
                  }
            }
            
            return jumps[0];
      }
      

      public static void main(String[] args) {
            int arr[] = {1,1,1,1};
            int min = jumping(arr, 0 , arr.length-1);
            int minFromNewFunction = minJumps(arr, arr.length);
            System.out.println(min);
            System.out.print(minFromNewFunction);
      }
      
}
