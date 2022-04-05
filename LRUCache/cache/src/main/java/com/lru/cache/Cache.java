package com.lru.cache;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Cache {

    // store keys of cache
    private Deque<Integer> doublyQueue;
    // store references of key in cache
    private HashSet<Integer> hashSet;
    // max capacity of cache
    private final int CACHE_SIZE;

    public Cache(int capacity) {
        this.doublyQueue = new LinkedList<>();
        this.hashSet = new HashSet<>();
        this.CACHE_SIZE = capacity;
    }

    // refer the page within the LRU cache
    public void refer(int page) {
        if (!hashSet.contains(page)) {
            if (doublyQueue.size() == CACHE_SIZE) {
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
        Iterator<Integer> itr = doublyQueue.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
