public class RotationString {
      //One String is Rotation of another ; 
      static boolean areRotations(String str1, String str2){
            if(str1.length()==str2.length()){
                  String intermediate = str1+str1 ; 
                  if(intermediate.contains(str2)){
                        return true ;
                  }
            }

            return false ;
      }
      public static void main(String[] args) {
            String str1 = "AACD";
            String str2 = "ACDA";

            if (areRotations(str1, str2))
                  System.out.println("Strings are rotations of each other");
            else
                  System.out.printf("Strings are not rotations of each other");
      }
      
}
