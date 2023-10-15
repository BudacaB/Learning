
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class Abbreviations {
    
    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        String abb = sanitizeAbbreviation(abbreviation);
        if (this.abbreviations.containsKey(abb)) {
            System.out.println("Already added");
        } else {
            this.abbreviations.put(abb, explanation);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        String abb = sanitizeAbbreviation(abbreviation);
        return this.abbreviations.containsKey(abb);
    }
    
    public String findExplanationFor(String abbreviation) {
        String abb = sanitizeAbbreviation(abbreviation);
        return this.abbreviations.get(abb);
    }
    
    private static String sanitizeAbbreviation(String abbreviation) {
        if (abbreviation == null) abbreviation = "";        
        abbreviation = abbreviation.toLowerCase();
        return abbreviation.trim();        
    }
    
}
