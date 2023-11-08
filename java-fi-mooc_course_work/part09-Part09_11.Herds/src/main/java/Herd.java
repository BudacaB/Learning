
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class Herd implements Movable {

    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        this.herd.forEach((movable) -> {
            movable.move(dx, dy);
        });
    }

    @Override
    public String toString() {
        StringBuilder print = new StringBuilder();
        this.herd.stream().map((organism) -> {
            print.append(organism);
            return organism;
        }).forEachOrdered((_item) -> {
            print.append(System.lineSeparator());
        });
        return print.toString();
    } 
    
}
