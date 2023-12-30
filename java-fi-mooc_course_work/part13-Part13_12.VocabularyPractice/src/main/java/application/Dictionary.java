/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author bogdan
 */
public class Dictionary {
    
    private List<String> words;
    private Map<String, String> translations;

    public Dictionary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
        
        add("book", "carte");
    }
    
    public void add(String word, String translation) {
        this.translations.putIfAbsent(word, translation);
        if (!this.words.contains(word)) this.words.add(word);
    }
    
    public String get(String word) {
        return this.translations.get(word);
    }
    
    public String getRandomWord() {
        Random rand = new Random();
        return this.words.get(rand.nextInt(this.words.size()));
    }
    
}
