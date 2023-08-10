public class Trie {


static final int ALPHABET_SIZE = 26;

// trie node
static class TrieNode {
      TrieNode[] children = new TrieNode[ALPHABET_SIZE];

      // isEndOfWord is true if the node represents
      // end of a word
      boolean isEndOfWord;

      TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                  children[i] = null;
      }
};

// Function to insert string into TRIE.
static void insert(TrieNode root, String key) {
      // Your code here
      TrieNode curr = root;
      for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (curr.children[c - 'a'] == null) {
                  TrieNode node = new TrieNode();
                  curr.children[c - 'a'] = node;
            }

            curr = curr.children[c - 'a'];

      }
      curr.isEndOfWord = true;

}

// Function to use TRIE data structure and search the given string.
static boolean search(TrieNode root, String key) {
      // Your code here
      TrieNode curr = root;
      for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (curr.children[c - 'a'] == null) {
                  return false;
            }

            curr = curr.children[c - 'a'];

      }
      return curr.isEndOfWord;
}
      
}
