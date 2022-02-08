public class Remove {
      public static int removeElement(int[] nums, int val) {
            int i = 0  , j = nums.length-1; 
            while(i<=j){
                  if(nums[i]!=val){
                        i++ ; 
                        continue ;
                  } 
                  if(nums[j]==val){
                        j-- ; 
                        continue ;
                  }

                  nums[i++] = nums[j--] ; 
            }
            return i ; 
      }
      public static void main(String[] args) {
            int[] arr = { 3, 2, 2, 3};
            System.out.println(removeElement(arr, 3));
      }
      
}
