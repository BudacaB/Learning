/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public enum Education {
    
    PHD("Doctoral degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("Highschool diploma");
    
    private final String education;
    
    private Education(String education) {
        this.education = education;
    }

    public String getEducationLevel() {
        return education;
    }
    
}
