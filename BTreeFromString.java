public class BTreeFromString {
      static class Node {
            int data;
            Node left, right;

            Node(int data) {
                  data = data;
                  left = null;
                  right = null;
            }
      }
      static int start = 0 ; 

      static Node constructTree(String s){
            if(s.length()<=0 || s==null){
                  return null ; 
            }

            if(start>=s.length()){
                  return null ; 
            }

            boolean neg = false ;
            if(s.charAt(start)=='-'){
                  neg = true ; 
                  start++ ;
            }

            int num = 0 ; 
            while(start<s.length() && Character.isDigit(s.charAt(start))){
                  int digit = Character.getNumericValue(s.charAt(start)) ; 
                  num = num*10 + digit ; 
                  start++ ; 
            }

            if(neg){num=-num ;}

            Node node = new Node(num) ;
            if(start>=s.length()){
                  return node ; 
            } 

            if(start<s.length() && s.charAt(start)=='('){
                  start++ ; 
                  node.left = constructTree(s) ;
            }

            if(start<s.length() && s.charAt(num)==')'){
                  start++ ; 
                  return node ;  
            }


            if (start < s.length() && s.charAt(start) == '(') {
                  start++;
                  node.right = constructTree(s);
            }

            if (start < s.length() && s.charAt(num) == ')') {
                  start++;
                  return node;
            }

            return node ;

            
      } 

      static void printTree(Node root){
            if(root==null){
                  return ;
            }

            System.out.print(root.data+" ");
            printTree(root.left);
            printTree(root.right);
            
      }

      public static void main(String[] args) {
            String s = "4(3)(2)" ; 

            Node root = constructTree(s) ; 
            printTree(root) ; 
      }

      
}
