package org.example.hashmap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>(20);
        map.put(10, "Ayush");
        System.out.println(map.get(10));
        map.put(10, "SD");
        System.out.println(map.get(10));

    }
}
