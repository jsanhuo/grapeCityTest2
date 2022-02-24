package com.grapeCityTest.P2.util;

/**
 * 数据条目
 * @param <K> 数据名称类型
 * @param <V> 数据类型
 */
public class Entry<K,V> {
    public K key;
    public V value;
    public static int maxKLen = 0;
    public static int maxVLen = 0;
    public Entry(K key, V value) {
        this.key = key;
        if(key instanceof String){
            if(((String) key).length()>maxKLen){
                maxKLen = ((String) key).length();
            }
        }
        this.value = value;
        if(value instanceof Integer){
            if((Integer)value>maxVLen){
                maxVLen = (Integer)value;
            }
        }

    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
