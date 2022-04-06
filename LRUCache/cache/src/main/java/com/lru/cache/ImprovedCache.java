package com.lru.cache;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImprovedCache {

    Logger logger
            = Logger.getLogger(
            ImprovedCache.class.getName());

    Set<Integer> cache;
    int capacity;

    public ImprovedCache(int capacity) {
        this.cache = new LinkedHashSet<>();
        this.capacity = capacity;
    }

    public boolean get(int key) {
        if (!cache.contains(key))
            return false;
        cache.remove(key);
        cache.add(key);
        return true;
    }

    public void put(int key) {
        if (cache.size() == capacity) {
            int firstKey = cache.iterator().next();
            cache.remove(firstKey);
        }
        cache.add(key);
    }

    public void refer(int key) {
        if (!get(key))
            put(key);
    }

    public void display() {
        LinkedList<Integer> list = new LinkedList<>(cache);
        Iterator<Integer> itr = list.descendingIterator();

        while(itr.hasNext())
            logger.log(Level.INFO, () -> itr.next() + " ");
    }
}
