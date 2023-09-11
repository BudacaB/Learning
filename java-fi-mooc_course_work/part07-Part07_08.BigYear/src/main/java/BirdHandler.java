
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class BirdHandler {
    
    private ArrayList<Bird> birds;

    public BirdHandler() {
        this.birds = new ArrayList();
    }
    
   public void add(Bird bird) {
       this.birds.add(bird);
   } 
   
   public void listAll() {
       this.birds.forEach(bird -> System.out.println(bird));
   }
   
   public void listOne(String name) {
       this.birds.forEach((storedBird) -> {
           if (storedBird.getName().equals(name)) System.out.println(storedBird);
           else System.out.println("Not a bird!");
        });
   }

    void addObservation(String name) {
        this.birds.stream().filter((storedBird) -> (storedBird.getName().equals(name))).forEachOrdered((storedBird) -> {
            storedBird.addObservation();
        });
    }
    
}
