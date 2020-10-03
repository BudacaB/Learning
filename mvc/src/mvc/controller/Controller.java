package mvc.controller;

import mvc.model.Person;
import mvc.model.PersonList;
import mvc.view.View;

public class Controller {
    private PersonList personList;
    private View view;

    public Controller(PersonList personList, View view) {
        this.personList = personList;
        this.view = view;
    }

    public void addPerson(Person person) {
        personList.addPerson(person);
    }

    public void displayList() {
        view.display();
    }
}
