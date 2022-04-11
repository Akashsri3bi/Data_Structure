import java.util.HashMap;

public class CouldNotGetComputer {

      public static int runCustomerSimulation(int n , String customer){
            char[] seen = new char[26] ; 
            int res = 0 ; 
            int occupied = 0 ; 
            for(int i = 0 ; i < customer.length() ; i++){
                  int indx = customer.charAt(i) - 'A' ;
                  if(seen[indx]==0){
                        //This shows the customer has entered the bar
                        seen[indx]=1;
                        if(occupied<n){
                              seen[indx]=2 ; 
                              occupied++ ;
                        }else{
                              res++ ; 
                        }
                  }else{
                        if(seen[indx]==2){
                              occupied-- ; 
                        }
                  }
            }

            return res ; 
      }
      public static void main(String[] args) {
            System.out.println(runCustomerSimulation(2, "ABBAJJKZKZ"));
            System.out.println(runCustomerSimulation(3, "GACCBDDBAGEE"));
            System.out.println(runCustomerSimulation(3, "GACCBGDDBAEE"));
            System.out.println(runCustomerSimulation(1, "ABCBCA"));
            System.out.println(runCustomerSimulation(1, "ABCBCADEED"));
      }
      
}
