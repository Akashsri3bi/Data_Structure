import java.util.HashMap;

import org.w3c.dom.Node;

public class LRUCache {

      class Node{
    int key;
    int value;
    Node pre;
    Node next;
    
    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}


    //Constructor for initializing the cache capacity with the given value.
    HashMap<Integer,Node> map;
    Node head , tail;
    int cap, count;
    
    public LRUCache(int cap)
    {
        //code here
        this.cap = cap;
        map = new HashMap<>();
        head = new Node(0 , 0);
        tail = new Node(0 , 0);
        head.next = tail;
        tail.pre = head;
        head.pre = null;
        tail.next = null;
        count = 0;
    }
    
    public void delete(Node node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
    
    public void add(Node node){
        node.next = head.next;
        node.next.pre = node;
        node.pre = head;
        head.next = node;
    }

    //Function to return value corresponding to the key.
    public int get(int key)
    {
        // your code here
        if(map.containsKey(key)){
            Node node = map.get(key);
            int res = node.value;
            delete(node);
            add(node);
            return res;
        }
        return -1;
    }

    //Function for storing key-value pair.
    public void set(int key, int value)
    {
        // your code here
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            delete(node);
            add(node);
        }
        else{
            Node node = new Node(key,value);
            map.put(key,node);
            if(count<cap){
                count++;
                add(node);
            }
            else{
                map.remove(tail.pre.key);
                delete(tail.pre);
                add(node);
            }
        }
    }
}
      
