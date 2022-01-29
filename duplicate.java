import java.util.ArrayList;

//Find duplicate in an array of n+1 integers
public class duplicate {

      //This case was only question specifiic .
      public static  int findDuplicate(int[] nums) {
            //Create an boolean array 

            //nums.length+1 isliye liya gya hai kyuki manlo agar 6 length ka array hai 
            //aur manlo tumhara boolean array bhi 6 lenght ka hai toh according to question agar original array mein number 6 hua joki valid hai length of array jitna number hoskta hai
            //lekin jab tum usko boolean array mein place karoge toh tumhe 6 index position nhi milegi kyuki lenght of boolean array 6 hai toh indexing to usme 5 tak hi rahegi isiliye error aajayegi therefore
            //We put as lenght + 1

            boolean[] visted = new boolean[nums.length+1];
            for(int value : nums){
                  //Agar array mein firse vahi element toh jab ham log
                  //Boolean array mein jayenge toh humne uss index par already true milega
                  //Toh hum log uss number ko repeated kahenge and usko return kardenge .
                  if(visted[value]){
                        return value ;
                  }
                  //Else ham log uske corresponding index value par true put kardenge
                  visted[value] = true ; 
            }

            return -1 ;
      }

      //If there are more than one duplicates .
      public static ArrayList<Integer> multipleDuplicate(int[] nums) {
            // Create an boolean array

            // nums.length+1 isliye liya gya hai kyuki manlo agar 6 length ka array hai
            // aur manlo tumhara boolean array bhi 6 lenght ka hai toh according to question
            // agar original array mein number 6 hua joki valid hai length of array jitna
            // number hoskta hai
            // lekin jab tum usko boolean array mein place karoge toh tumhe 6 index position
            // nhi milegi kyuki lenght of boolean array 6 hai toh indexing to usme 5 tak hi
            // rahegi isiliye error aajayegi therefore
            // We put as lenght + 1
            boolean[] visted = new boolean[nums.length + 1];
            ArrayList<Integer> list = new ArrayList<>(); 
            for (int value : nums) {
                  // Agar array mein firse vahi element toh jab ham log
                  // Boolean array mein jayenge toh humne uss index par already true milega
                  // Toh hum log uss number ko repeated kahenge and usko return kardenge .
                  if (visted[value]) {
                        if(list.contains(value)){
                              continue ;
                        }
                        list.add(value);
                  }
                  // Else ham log uske corresponding index value par true put kardenge
                  visted[value] = true;
            }

            return list;
      }


      public static void main(String[] args) {
            int nums[] = {3, 2, 1 , 2, 2, 3};
            //int duplicate = findDuplicate(numRay);
            ArrayList<Integer> result = multipleDuplicate(nums);
            for(int i = 0 ; i < result.size() ; i++){
                  System.out.println(result.get(i));
            }
            
      }
}
