/**
 *
 */
package map_interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Implementation of a Map using a List of entries, so most
 * operations are linear time.
 *
 * @param <K>
 * @param <V>
 * @author downey
 */
public class MyLinearMap<K, V> implements Map<K, V> {

    private List<Entry> entries = new ArrayList<Entry>();

    public class Entry implements Map.Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
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

        @Override
        public V setValue(V newValue) {
            value = newValue;
            return value;
        }
    }

    @Override
    public void clear() {
        entries.clear();
    }

    @Override
    public boolean containsKey(Object target) {
        return findEntry(target) != null;
    }

    /**
     * Returns the entry that contains the target key, or null if there is none.
     *
     * @param target
     */
    private Entry findEntry(Object target) {
        for (Entry entry : entries) {
            if (equals(target, entry.key)) {
                return entry;
            }
        }
        return null;
    }

    /**
     * Compares two keys or two values, handling null correctly.
     *
     * @param target
     * @param obj
     * @return
     */
    private boolean equals(Object target, Object obj) {
        if (target == null) {
            return obj == null;
        }
        return target.equals(obj);
    }

    @Override
    public boolean containsValue(Object target) {
        for (Map.Entry<K, V> entry : entries) {
            if (equals(target, entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param key : the key whose associated value is to be returned
     * @return : the value to which the specified key is mapped, or null if this map contains no mapping for the key
     */
    @Override
    public V get(Object key) {
        for (Entry entry : entries) {
            if (equals(key, entry.key)) {
                return entry.value;
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return entries.isEmpty();
    }

    @Override
    public Set<K> keySet() {
        Set<K> set = new HashSet<K>();
        for (Entry entry : entries) {
            set.add(entry.getKey());
        }
        return set;
    }

    @Override
    public V put(K key, V value) {
        Entry entry = findEntry(key);
        if (entry == null) {
            entries.add(new Entry(key, value));
            return null;
        } else {
            V beforeValue = entry.getValue();
            entry.setValue(value);
            return beforeValue;
        }
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /**
     *
     * @param key : key whose mapping is to be removed from the map
     * @return : the previous value associated with key, or null if there was no mapping for key.
     */
    @Override
    public V remove(Object key) {
        Entry entry = findEntry(key);
        if (entry == null) {
            return null;
        } else {
            V value = entry.getValue();
            entries.remove(entry);
            return value;
        }
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public Collection<V> values() {
        Set<V> set = new HashSet<V>();
        for (Entry entry : entries) {
            set.add(entry.getValue());
        }
        return set;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<String, Integer> map = new MyLinearMap<String, Integer>();
        map.put("Word1", 1);
        map.put("Word2", 2);
        Integer value = map.get("Word1");
        System.out.println(value);

        for (String key : map.keySet()) {
            System.out.println(key + ", " + map.get(key));
        }
    }

    /**
     * Returns a reference to `entries`.
     * <p>
     * This is not part of the Map interface; it is here to provide the functionality
     * of `entrySet` in a way that is substantially simpler than the "right" way.
     *
     * @return
     */
    protected Collection<? extends Map.Entry<K, V>> getEntries() {
        return entries;
    }
}
