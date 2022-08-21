
import java.util.Arrays;
import java.util.Scanner;

public class kickstart7 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int i = 0;
            while (i < t) {
                  int n = sc.nextInt();
                  int[] arr = new int[n] ;
                  for(int k = 0 ; k < n ; k++){
                        int r = sc.nextInt() ;
                        arr[k] = r ;
                  }

                  int[] copyarr = arr.clone() ; 
                  int[] mentors = new int[n]  ;
                  int mentor = -1  ;
                  Arrays.sort(copyarr);
                  for(int l = 0 ; l < arr.length ; l++){
                        int current = arr[l] ; 
                        for(int j = 0  ; j<copyarr.length ; j++){
                              if(mentor <= copyarr[j] && copyarr[j]<=2*current){
                                    if(copyarr[j]!=current){
                                          mentor = copyarr[j] ; 
                                    }
                              }
                        }
                        mentors[l] = mentor ; 
                        mentor = -1; 
                  }

                  System.out.print("Case #" + (i + 1) + ": ");
                  String answer = "" ;
                  for(int m = 0 ; m < mentors.length ; m++){
                        answer = answer + mentors[m] + " "; 
                  }
                  String result  = answer.trim() ;
                  System.out.println(result);
                  
                  i++;
            }
      }
      
}
