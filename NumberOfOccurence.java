public class NumberOfOccurence {

          static int binaryLeft(int low , int high , int target , int[] arr){
        int result = -1 ; 
        while(low<=high){
            int mid = low + (high-low)/2 ; 
            if(arr[mid]==target){
                result = mid ; 
                high = mid-1;
            }else if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
        return result; 
    }
    
    static int binaryRight(int low , int high , int target , int[] arr){
        int result = -1 ; 
        while(low<=high){
            int mid = low + (high-low)/2 ; 
            if(arr[mid]==target){
                result = mid ; 
                low = mid+1;
            }else if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
        return result; 
    }
    int count(int[] arr, int n, int x) {
        // code here
        
        
        int l = binaryLeft(0,n-1,x,arr) ; 
        int r = binaryRight(0,n-1,x,arr) ;
        
        if(l==-1 || r==-1){
            return 0;
        }else{
        
        return r-l+1;
            
        }
        
    }
      
}
