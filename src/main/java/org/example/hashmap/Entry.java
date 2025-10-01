package org.example.hashmap;

public class Entry<K, V> {
    public K key;
    public V value;
    public Entry next;

    public Entry(K k, V v) {
        this.key = k;
        this.value = v;
        this.next = null;
    }
}
