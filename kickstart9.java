import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class kickstart9 {

      // Sample is Passed 

      static class Fabrics {
            String c ; 
            int d ; 
            int u ; 

            Fabrics(String c , int d , int u){
                  this.c = c  ; 
                  this.d = d ; 
                  this.u = u ; 
            }
      }

      static int sortByColor(Fabrics fabric1 , Fabrics fabric2){
            int compare = fabric1.c.compareTo(fabric2.c) ;
            if(compare<=0){
                  return -1;
            }else{
                  return 1;
            }
      }

      static int sortByDurability(Fabrics fabric1, Fabrics fabric2) {
            return fabric1.d-fabric2.d ;
      }

      static int sortByU(Fabrics fabric1, Fabrics fabric2) {
            return fabric1.u - fabric2.u;
      }
      public static void main(String[] args) {

            /*Approach 2 Sample Passed */
            Scanner sc = new Scanner(System.in) ; 
            int t = sc.nextInt() ;
            int i = 0 ;

            while(i<t){
                  ArrayList<Fabrics> list = new ArrayList<>() ;
                  int n = sc.nextInt() ; 
                  int answer = 0;
                  for(int k = 0 ; k < n ; k++){
                        String c = sc.next() ;
                        int d = sc.nextInt(); 
                        int u = sc.nextInt() ; 
                        Fabrics fabric = new Fabrics(c, d, u) ;
                        list.add(fabric) ; 
                  }
                  ArrayList<Fabrics> sortedOnColour = new ArrayList<>(list);
                  Collections.sort(sortedOnColour , new Comparator<Fabrics>() {
                        @Override
                        public int compare(Fabrics fabric1,Fabrics fabric2){
                              return sortByColor(fabric1, fabric2) ; 
                        }
                  });

                  ArrayList<Fabrics> sortedOnDurability = new ArrayList<>(list);
                  Collections.sort(sortedOnDurability, new Comparator<Fabrics>() {
                        @Override
                        public int compare(Fabrics fabric1, Fabrics fabric2){
                              return sortByDurability(fabric1, fabric2);
                        }
                  });

                  ArrayList<Fabrics> sortedOnU = new ArrayList<>(list);
                  Collections.sort(sortedOnU, new Comparator<Fabrics>() {
                        @Override
                        public int compare(Fabrics fabric1, Fabrics fabric2) {
                              return sortByU(fabric1, fabric2);
                        }
                  });
                  if(list.size()<=1){
                        answer = 1 ; 
                  }else{
                  for(int k=0 ; k<list.size() ; k++){
                        if(sortedOnColour.get(k).u==sortedOnU.get(k).u){
                              if(sortedOnDurability.get(k).u==sortedOnU.get(k).u){
                                    answer++ ; 
                              }
                        }
                  }
            }

                  System.out.println("Case #" + (i + 1) + ": " + answer);
                  i++ ;
            }
      }    
}

/*
 * Approach 1
 * Scanner sc = new Scanner(System.in) ;
 * int t = sc.nextInt() ;
 * int i = 0 ;
 * 
 * while(i<t){
 * ArrayList<Fabrics> list = new ArrayList<>() ;
 * int n = sc.nextInt() ;
 * int answer = 0;
 * for(int k = 0 ; k < n ; k++){
 * String c = sc.next() ;
 * int d = sc.nextInt();
 * int u = sc.nextInt() ;
 * Fabrics fabric = new Fabrics(c, d, u) ;
 * list.add(fabric) ;
 * }
 * 
 * if(list.size()==1){
 * answer = 1 ;
 * }else{
 * for(int k = 0 ; k < list.size()-1 ; k++){
 * if(sortByColor(list.get(k) , list.get(k+1))==sortByDurability(list.get(k) ,
 * list.get(k+1))){
 * if(answer==0){
 * answer+=2 ;
 * }else{
 * answer++ ;
 * }
 * }
 * }
 * }
 * System.out.println("Case #" + (i + 1) + ": " + answer);
 * i++ ;
 * }
 */
