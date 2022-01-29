import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

class Student{
    String firstname ; 
    String lastname ; 
    int Id ; 

    

    int Maxi = 0 ;
    int __elements[] ; 
    Student(String firstname , String lastname , int Id ){
        this.firstname = firstname ; 
        this.lastname = lastname ; 
        this.Id = Id  ;
    }

    int computeDiff(){

        int[] x ; 
        return 1 ;
    }
    
    char Calculate(int n , int[]a){
        int sum = 0 ; 
        char x = 'L' ;
        for (int i : a){
            sum+=i ; 
        }
        
        int average = (sum / n) ;
        
        if(average>=90 && average<=100){
            x = 'O' ;
        }else if(average>=80 && average<90){
            x = 'E'  ;
        }else if(average>=70 && average<80){
            x = 'A'  ;
        }else if(average>=55 && average<70){
            x = 'P'  ;
        }else if(average>=40 && average<90){
            x = 'D'  ;
        }else if(average<40){
            x = 'T'  ;
        }
        
        return x ;
    }
    
    void Display(){
        System.out.println("Name:"+lastname+","+firstname); 
        System.out.println("ID:"+Id); 
        int[] x = new int[]{} ; 
        int y = x.length - 1 ; 

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int flag = 0;
            for (int j = 2; j < k; j++) {
                if (k % j == 0) {
                    flag = 1;
                    break ;
                } else {
                    flag = 0;
                }
            }
            if (flag == 1) {
                System.out.println("Not prime");
            } else {
                System.out.println("Prime");
            }
        }
    }
}