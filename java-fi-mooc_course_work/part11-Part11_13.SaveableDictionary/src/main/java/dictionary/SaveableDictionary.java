/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author bogdan
 */
public class SaveableDictionary {
    
    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }
     
    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }
    
    public String translate(String word) {
        if (this.dictionary.containsValue(word)) {
            return this.dictionary.entrySet().stream().filter(entry -> word.equals(entry.getValue()))
                    .map(Map.Entry::getKey).findFirst().get();
        }
        return this.dictionary.getOrDefault(word, null);
    }
    
    public void delete(String word) {
        if (this.dictionary.containsValue(word)) {
            String key = this.dictionary.entrySet().stream().filter(entry -> word.equals(entry.getValue()))
                    .map(Map.Entry::getKey).findFirst().get();
            this.dictionary.remove(key);
        }
        this.dictionary.remove(word);
    }
    
    public boolean load() {
        try (Scanner fileReader = new Scanner(new File(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.putIfAbsent(parts[0], parts[1]);
            }
            return true;
        } catch(FileNotFoundException e) {
            return false;
        }
    }
    
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(file)) {
            this.dictionary.forEach((k, v) -> writer.println(k + ":" + v));
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
}
