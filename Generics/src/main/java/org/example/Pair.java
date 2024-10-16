package org.example;

public interface Pair<K, V> {
    K getKey();
    V getValue();
}

class Order<K,V> implements Pair<K,V>{
    private K key;
    private V value;

    public Order(K key, V value) {
        this.key = key;
        this.value = value;
    }


    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
