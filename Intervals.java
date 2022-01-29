import java.util.Arrays;
import java.util.Comparator;

//Merge Intervals

//Section class is used to make the array have start and end since the array 
// Intervals will contain only two values 
class Interval {
      int start;
      int end;

      Interval(int start, int end) {
            this.start = start;
            this.end = end;
      }
} 
public class Intervals {

      public static void merge(Interval arr[]){
            //Sorting of Array is required because in some case the overrlapped interval
            //maybe after the big interval

            //For example => [[1,3] , [8,10] , [2,6]] this array is overrlaped but 
            //Without sorting we wont be able to know the ovelap so sorting this array in
            //Basis of Interval.start

            //[[1,3] ,[2,6],[8,10] ]

            //Comparator is an Interface in java which is used for ordering or sorting of array object in java
            Arrays.sort(arr , new Comparator<Interval>() {
                  public int compare(Interval i1 , Interval i2){
                        return i1.start - i2.start ; 
                  }                  
            });

            // [[1,9],[2,4],[4,7],[6,8]] 
            int index =  0 ; 
            for(int i = 1 ; i < arr.length-1 ; i++){
                  if(arr[index].end>=arr[i].start){
                        arr[index].end = Math.max(arr[index].end, arr[i].end);
                  }else{
                        index++; 
                        arr[index]=arr[i]  ;
                  }
            }

            for(int i = 0 ; i <=index ; i++){
                  System.out.println("["+arr[i].start + "," + arr[i].end + "]");
            }
      }
      public static void main(String[] args) {
            Interval arr[] = new Interval[4];
            arr[0] = new Interval(6, 8);
            arr[1] = new Interval(1, 9);
            arr[2] = new Interval(2, 4);
            arr[3] = new Interval(4, 7);
            merge(arr);

            
      }
      
}
