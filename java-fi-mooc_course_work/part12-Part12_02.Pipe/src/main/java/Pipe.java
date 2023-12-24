
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bogdan
 */
public class Pipe<T> {
    
    List<T> pipeContents;

    public Pipe() {
        this.pipeContents = new ArrayList<>();
    }
   
    public void putIntoPipe(T value) {
        this.pipeContents.add(0, value);
    }
    
    public T takeFromPipe() {
        return Optional.of(this.pipeContents.remove(this.pipeContents.size() - 1)).orElse(null);
    }
    
    public boolean isInPipe() {
        return !this.pipeContents.isEmpty();
    }
   
}
