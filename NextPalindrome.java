import java.util.Vector;

public class NextPalindrome {

          static boolean isAll9(int[] num)

    {

        for(int i=0;i<num.length;i++)

        {

            if(num[i] != 9) return false;

        }

        return true;

    }
    
    
    void generateNext(int[] num , int n ){
        int mid= n/2 ; 
        int left = mid-1 ;
        int right = (n%2==0)?mid:mid+1;
        
        boolean leftSmaller = false ; 
        while(left>=0 && num[left]==num[right]){
            left--;
            right++ ;
        }
        
        if(left<0 || num[left]<num[right]){
            leftSmaller= true ; 
        }
        while(left>=0){
            num[right] = num[left] ; 
            right++;
            left--;
        }
        
        if(leftSmaller){
            int carry = 1 ; 
            if(n%2==1){
                num[mid]+=1 ;
                carry = num[mid]/10 ; 
                num[mid] = num[mid]%10 ;
            }
            left = mid - 1 ;
            right = (n%2==0)?mid:mid+1;
            while(left>=0){
                num[left] = num[left] + carry ; 
                carry = num[left]/10; 
                num[left] = num[left]%10 ; 
                num[right] = num[left] ; 
                right++;
                left--;
            }
        }
    }

    Vector<Integer> generateNextPalindrome(int num[], int n) {
        Vector<Integer> ans = new Vector<>() ; 
         
        if(isAll9(num)){
            ans.add(1) ; 
            for(int i = 1 ; i<n;i++){
                ans.add(0) ; 
            }
            ans.add(1) ; 
            return ans ; 
        }else{
            generateNext(num,n) ; 
            for(int i =0 ;i<n;i++){
                ans.add(num[i]) ; 
                
            }
            return ans ;
        }
        
    }
      
}
