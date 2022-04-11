import java.util.Scanner;

public class Kickstart2 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ; 
            int t = sc.nextInt() ; 
            int i = 0 ;
            while(i<t){
                  int k = sc.nextInt() ; 
                  int num = k ; 
                  int sum = 0 ; 
                  while(num>0){
                        sum  = sum + num%10 ; 
                        num = num/10  ; 
                  }
                  int output = 9 - sum ; 
                  

                  if(output>k){
                        System.out.println("Case #"+(i+1)+": "+k+output);
                  }else{
                        System.out.println("Case #" + (i + 1) + ": "+ output + k);
                  }
                  i++ ; 
            }
      }
      
}
