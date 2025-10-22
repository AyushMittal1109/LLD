package org.example.hashmap;

import java.util.HashMap;

public class MyHashMap<K, V> {
    private static final int DEFAULT_SIZE = 1 << 4;
    private static final int MAX_SIZE = 1 << 30;

    public Entry<K, V>[] hashTable;

    public MyHashMap() {
        hashTable = new Entry[DEFAULT_SIZE];
    }

    public MyHashMap(int size) {
        int tableSize = tableSizeFor(size);
        System.out.println("table size is " + tableSize );
        hashTable = new Entry[tableSize];
    }

    // size should be smallest power of 2 which is greater than or equal to size
    private int tableSizeFor(int size) {
        int n = -1 >>> Integer.numberOfLeadingZeros(size - 1);
        // -1 binary representation is all 32 1
        // number of LeadingZeros gives count of zeros before msb
        // >> ignores sign bit, >>> also shifts sign bit
        return size < 0 ? 1 : (size >= MAX_SIZE) ? MAX_SIZE : n + 1;
    }

    public void put(K k, V v) {
        int hashCode = k.hashCode() % hashTable.length;
        Entry<K, V> node = hashTable[hashCode];

        if (node == null) {
            Entry<K, V> newNode = new Entry<>(k, v);
            hashTable[hashCode] = newNode;
        } else {
            Entry<K,V> previousNode = node;
            while(node != null) {

                if (node.key == k) {
                    node.value = v;
                    return;
                }

                previousNode = node;
                node = node.next;
            }
            Entry<K, V> newNode = new Entry<>(k, v);
            previousNode.next = newNode;
        }
    }

    public V get(K k) {
        int hashCode = k.hashCode() % hashTable.length;
        Entry<K,V> node = hashTable[hashCode];
        while (node != null) {
            if (node.key == k) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }
}
