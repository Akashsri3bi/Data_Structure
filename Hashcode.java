import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hashcode {
      public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in) ; 
            int clients = sc.nextInt() ; 
            for(int i = 0 ; i < clients ; i++){
                  int n = sc.nextInt() ; 
                  BufferedReader bi = new BufferedReader(
                              new InputStreamReader(System.in));
                  String[] likes ;
                  likes = bi.readLine().split(" ");
                  int k  = sc.nextInt() ; 
                  String[] dislikes ;
                  dislikes = bi.readLine().split(" ");
                  for (int j = 0; j < likes.length; j++) {
                        System.out.println(likes[j]);
                  }
            }
      }
}
