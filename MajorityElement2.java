import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityElement2 {
       public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>() ; 
        int cnt1 = 0 ; 
        int cnt2 = 0 ;
        int ele1 = Integer.MIN_VALUE ;
        int ele2 = Integer.MIN_VALUE ;

        for(int i = 0 ;i<nums.length; i++){
            if(cnt1==0 && nums[i]!=ele2){
                cnt1 = 1 ; 
                ele1 = nums[i] ; 
            }
            else if(cnt2==0 && nums[i]!=ele1){
                cnt2 = 1 ; 
                ele2 = nums[i] ; 
            }else if(ele1==nums[i]){
                cnt1++;
            }
            else if(ele2==nums[i]){
                cnt2++;
            }else{
                cnt1--;
                cnt2-- ;
            }
        }

        cnt1 = 0 ;
        cnt2 = 0;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]==ele1){
                cnt1++;
            }
            if(nums[i]==ele2){
                cnt2++;
            }
        }

        int count = (int)(nums.length/3)+1;
        if(cnt1>=count) ans.add(ele1) ; 
        if(cnt2>=count) ans.add(ele2) ;

        Collections.sort(ans) ;  //Sorting here because 2 elements only is just O(1) 
        return ans ;


    }
      
}
