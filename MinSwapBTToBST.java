import java.beans.VetoableChangeListenerProxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

public class MinSwapBTToBST {

      static void inorder(int[] a , Vector<Integer> v , int n , int index){
            if(index>=n){
                  return ; 
            }

            inorder(a,v,n,2*index+1) ; //2*index+1 --> denotes left of tree in the array
            v.add(a[index]) ; 
            inorder(a, v, n, 2*index+2); //2*index+2 --> denotes right of tree in the array 

      }

      public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
      }

      static int minswaps(Vector<Integer> v){
            int count = 0 ;
            int[] arr = new int[v.size()] ; 
            for(int  i = 0 ; i < v.size() ; i++){
                  arr[i] = v.get(i) ; 
            }

            int[] temp = Arrays.copyOfRange(arr,0,v.size()) ;
            Arrays.sort(arr);
            HashMap<Integer,Integer> map = new HashMap<>() ; 
            for(int i = 0 ; i < arr.length ; i++){
                  map.put(arr[i], i) ;

            }

            for(int i = 0 ; i<arr.length ; i++){
                  if(arr[i]!=temp[i]){
                        count++ ;
                        int init = arr[i] ; 
                        swap(arr,i,map.get(temp[i]));

                        map.put(init, map.get(temp[i])) ;
                        map.put(temp[i], i) ;  
                  }
            }

            return count ;
            


      }

      public static void main(String[] args) {
            int a[] = { 5, 6, 7, 8, 9, 10, 11 };
            int n = a.length;
            
            Vector<Integer> v = new Vector<>()  ;
            inorder(a,v,n,0) ;
            System.out.println(minswaps(v));
      }
      
}
