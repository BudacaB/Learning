
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
public class TodoList {
    
    private List<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList();
    }
    
    public void add(String task) {
        this.todoList.add(task);
    }
    
    public void print() {
        for (int i = 1; i < todoList.size() + 1; i++) {
            System.out.println(i + ": " + todoList.get(i-1));
        }
    }
    
    public void remove(int number) {
        this.todoList.remove(number - 1);
    }
    
}
