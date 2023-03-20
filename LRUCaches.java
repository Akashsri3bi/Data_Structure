import java.util.HashMap;

public class LRUCaches {


      class Node {
            int key;
            int value;
            Node prev;
            Node next;

            public Node(int key, int value) {
                  this.key = key;
                  this.value = value;
            }
      }

      class LRUCache {
            // Constructor for initializing the cache capacity with the given value.
             int cap;
             Node head = new Node(0, 0);
       Node tail = new Node(0, 0);
             HashMap<Integer, Node> map;

            LRUCache(int cap) {
                  // code he

                  this.cap = cap;
                  map = new HashMap<>();
                  head.next = tail;
                  tail.prev = head;
            }

            private void insert(Node node) {
                  map.put(node.key, node);
                  Node headNext = head.next;
                  head.next = node;
                  node.prev = head;
                  node.next = headNext;
                  headNext.prev = node;
            }

            private void remove(Node node) {
                  map.remove(node.key);
                  node.next.prev = node.prev;
                  node.prev.next = node.next;
            }

            // Function to return value corresponding to the key.
            public int get(int key) {
                  // your code here
                  if (map.containsKey(key)) {
                        Node node = map.get(key);
                        remove(node);
                        insert(node);
                        return node.value;
                  } else {
                        return -1;
                  }
            }

            // Function for storing key-value pair.
            public void set(int key, int value) {
                  // your code here
                  if (map.containsKey(key)) {
                        remove(map.get(key));
                  }

                  if (cap == map.size()) {
                        remove(tail.prev);
                  }

                  insert(new Node(key, value));

            }
      }
      
}
