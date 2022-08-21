import java.util.Scanner;

public class Kickstart6 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int i = 0;
            while (i < t) {
                  int n = sc.nextInt();
                  if(n==0){
                        System.out.println("Case #" + (i + 1)  +  ": "+n);
                  }else if(n<3){
                        int k = 1 ; 
                        System.out.println("Case #" + (i + 1) + ": "+k);
                  }else{
                  int min = n/3 ; 
                  System.out.println("Case #" + (i + 1) + ": "+min);
                  }
                  i++;
            }
      }

}
