public class MuLL{
      public long convertNumber(Node l1) {
            // Output Could be large take modulo
            Node temp = l1;
            long mod = 1000000007;
            long sum = 0;
            while (temp != null) {
                  sum = ((sum * 10) + temp.info) % mod;
                  temp = temp.next;
            }
            return sum;
      }

      public long multiplyTwoLists(Node l1, Node l2) {
            long mod = 1000000007;
            long s1 = convertNumber(l1);
            long s2 = convertNumber(l2);

            return (s1 * s2) % mod;
      }
      
}
