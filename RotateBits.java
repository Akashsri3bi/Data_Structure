import java.util.ArrayList;

class RotateBits{
      ArrayList<Integer> rotate(int N, int D)
    {
        // your code here
        D = D%16 ; 
        ArrayList<Integer> list = new ArrayList<>() ; 
        int leftRotation = ( N<<D | N>>(16-D) )&65535 ;  //to convert into 16 bit;
        int rightRotation = ( N>>D | N<<(16-D) ) &65535 ;
        
        list.add(leftRotation) ; 
        list.add(rightRotation) ; 
        return list;
    }
}