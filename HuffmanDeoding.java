public class HuffmanDeoding {

      String decodeString(minHeapNode root, String encodedStr) {
            // Code here
            minHeapNode temp = root;
            String result = "";
            for (int i = 0; i < encodedStr.length(); i++) {
                  if (encodedStr.charAt(i) == '0') {
                        temp = temp.left;
                  } else if (encodedStr.charAt(i) == '1') {
                        temp = temp.right;
                  }

                  if (temp.left == null && temp.right == null) {
                        result += temp.data;
                        temp = root;
                  }
            }

            return result;
      }
      
}
