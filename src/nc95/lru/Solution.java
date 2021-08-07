package nc95.lru;

import java.util.*;

public class Solution {
    int capacity;
    Map<Integer, Node> keyMap;
    Node head;
    Node tail;

    /**
     * lru design
     *
     * @param operators int整型二维数组 the ops
     * @param k         int整型 the k
     * @return int整型一维数组
     */
    public int[] LRU(int[][] operators, int k) {
        init(k);
        List<Integer> resultSet = new ArrayList<>();
        for (int i = 0; i < operators.length; i++) {
            if (operators[i][0] == 1) {
                set(operators[i][1], operators[i][2]);

            } else {
                resultSet.add(get(operators[i][1]));
            }
        }
        return resultSet.stream().mapToInt(i -> i).toArray();
    }

    void init(int k) {
        keyMap = new HashMap<>(k);
        capacity = k;
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.pre = head;
    }

    int get(int key) {
        if (!keyMap.containsKey(key)) {
            return -1;
        }
        Node node = keyMap.get(key);
        node.pre.next = node.next;
        node.next.pre = node.pre;
        head.next.pre = node;
        node.next = head.next;
        node.pre = head;
        head.next = node;
        return node.value;
    }

    void set(int key, int value) {
        if (keyMap.containsKey(key)) {
            Node node = keyMap.get(key);
            node.pre.next = node.next;
            node.next.pre = node.pre;
        } else if (capacity == keyMap.size()) {
            Node temp = tail.pre;
            temp.pre.next = tail;
            tail.pre = temp.pre;
            temp.next = null;
            temp.pre = null;
            keyMap.remove(temp.key);
        }
        Node newNode = new Node(key, value);
        head.next.pre = newNode;
        newNode.next = head.next;
        newNode.pre = head;
        head.next = newNode;
        keyMap.put(key, newNode);
    }
}

class Node {
    int key;
    int value;
    Node pre;
    Node next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.pre = null;
        this.next = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return key == node.key && value == node.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}