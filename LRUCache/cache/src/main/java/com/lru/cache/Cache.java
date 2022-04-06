package com.lru.cache;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cache {

    Logger logger
            = Logger.getLogger(
            Cache.class.getName());

    // store keys of cache
    private final Deque<Integer> doublyQueue;
    // store references of key in cache
    private final HashSet<Integer> hashSet;
    // max capacity of cache
    private final int cacheSize;

    public Cache(int capacity) {
        this.doublyQueue = new LinkedList<>();
        this.hashSet = new HashSet<>();
        this.cacheSize = capacity;
    }

    // refer the page within the LRU cache
    public void refer(int page) {
        if (!hashSet.contains(page)) {
            if (doublyQueue.size() == cacheSize) {
                int last = doublyQueue.removeLast();
                hashSet.remove(last);
            }
        } else {/* The found page may not be always the last element, even if it's an
               intermediate element that needs to be removed and added to the start
               of the Queue */
            doublyQueue.remove(page);
        }
        doublyQueue.push(page);
        hashSet.add(page);
    }

    // display contents of cache
    public void display() {
        for (Integer integer : doublyQueue) {
            logger.log(Level.INFO, () -> integer + " ");
        }
    }
}
