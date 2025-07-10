package meta.medium.Design;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private final int capacity;
    private final Map<Integer, Node> dictionary;
    private final Node head;
    private final Node tail;

    // Optimized and readable Node class
    private static class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + "=" + value + "}";
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.dictionary = new HashMap<>();
        this.head = new Node(-1, -1); // dummy head
        this.tail = new Node(-1, -1); // dummy tail
        head.next = tail;
        tail.prev = head;
    }

    private void addToTail(Node node) {
        Node prevTail = tail.prev;
        prevTail.next = node;
        node.prev = prevTail;
        node.next = tail;
        tail.prev = node;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int get(int key) {
        if (!dictionary.containsKey(key)) {
            return -1;
        }
        Node node = dictionary.get(key);
        removeNode(node);
        addToTail(node); // Mark as recently used
        return node.value;
    }

    public void put(int key, int value) {
        if (dictionary.containsKey(key)) {
            Node existing = dictionary.get(key);
            removeNode(existing);
            dictionary.remove(key);
        }

        Node newNode = new Node(key, value);
        addToTail(newNode);
        dictionary.put(key, newNode);

        if (dictionary.size() > capacity) {
            Node lru = head.next;
            removeNode(lru);
            dictionary.remove(lru.key);
        }
    }
}

// Time complexity --get : O(1)  --put : O(1)
// Space Complexity :O(N)