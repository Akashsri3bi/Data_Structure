public class FirstNLast {

          static int firstOcc(int arr[], int n, int x){
        int first = -1 ; 
        int low = 0 ;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2 ; 
            if(arr[mid]==x){
                first = mid ; 
                high = mid-1 ;
            }else if(arr[mid]<x){
                low = mid + 1 ; 
            }else{
                high = mid -1 ;
            }
        }
        
        return first ; 
    }
    
    static int lastOcc(int arr[], int n, int x){
        int last = -1 ; 
        int low = 0 ;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2 ; 
            if(arr[mid]==x){
                last = mid ; 
                low = mid+1 ;
            }else if(arr[mid]<x){
                low = mid + 1 ; 
            }else{
                high = mid - 1 ;
            }
        }
        
        return last ; 
    }
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>() ;
        int first = firstOcc(arr,n,x) ; 
        if(first==-1){
            ans.add(-1) ; 
            ans.add(-1) ; 
            return ans ;
        }
        int last = lastOcc(arr,n,x) ; 
        
        ans.add(first) ;
        ans.add(last) ; 
        return ans ;
    }
      
}
