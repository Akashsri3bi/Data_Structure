public class OnePlus {
    public static int[] plusOne(int[] digits) {
        int carry = 0;
        for(int i=digits.length-1;i>=0;i--){
            int a = 1+digits[i];
            carry = a/10;
            if(carry==0){
                digits[i] = a;
                return digits;
            }
            else{
                digits[i] = a%10;
            }
        }
        int[] arr = new int[digits.length+1];
        arr[0] = carry;
        for(int i=1;i<arr.length;i++){
            arr[i] = digits[i-1];
        }
        return arr;
    }
      public static void main(String[] args) {
            int[] digits = {1,2,9};
            plusOne(digits);
      }
      
}
