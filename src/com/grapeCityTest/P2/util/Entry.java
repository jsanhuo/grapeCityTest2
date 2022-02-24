package com.grapeCityTest.P2.util;

/**
 * 数据条目
 * @param <K> 数据名称类型
 * @param <V> 数据类型
 */
public class Entry<K,V> {
    public K key;
    public V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
