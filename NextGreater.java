import java.util.Arrays;

public class NextGreater {
      static void swap(char ar[] , int i , int j ){
            char temp = ar[i] ; 
            ar[i] = ar[j] ; 
            ar[j] = temp ; 
      }
      static void findNext(char ar[] , int n){
            int i ;
            //Start from the right most digit and find the first digit that is smaller than the digit next to it.
            for(i = n-1 ; i>0 ; i--){
                  if(ar[i]>ar[i-1]){
                        break ; 
                  }
            }

            //IF we reach 0 then the given string number is already greater   
            //Then not possible 
            if(i==0){
                  System.out.println("Not Possible");
            }else{
                  int x = ar[i-1] , min = i ; 
                  //Find the next smallest in right side of i-1 
                  //That is greater than x 
                  for(int j = i+1 ; j<n ; j++){
                        if(ar[j]>x && ar[j]<ar[min]){
                              min = j ; 
                        }
                  }

                  //Swap digits at that positions 
                  swap(ar, i-1, min);
                  //Sorting in subpart of the array .
                  Arrays.sort(ar , i , n);

                  for(int k = 0 ; k < n ; k++){
                        System.out.print(ar[k]);
                  }
            }
      }
      public static void main(String[] args) {
            char digits[] = {'5' , '3' , '4' , '9' , '7' , '6'} ; 
            int n = digits.length ; 
            findNext(digits, n);
       }
      
}
