
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {
    
    private List<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.persons.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        this.persons.addAll(peopleToAdd);
    }
    
    public void print() {
        Iterator<Person> iterator = persons.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = persons.iterator();
        
        while(iterator.hasNext()) {
            Person nextPers = iterator.next();
            if (nextPers.getEducation().equals(education)) System.out.println(nextPers);
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = persons.iterator();
        
        while(iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) iterator.remove();
        }
    }
}
