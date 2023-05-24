/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class Book {
    
    private final String name;
    private final int pages;
    private final int pubYear;
    
    public Book(String name, int pages, int pubYear) {
        this.name = name;
        this.pages = pages;
        this.pubYear = pubYear;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.pubYear;
    }
    
}
