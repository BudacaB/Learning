package mvc;

import mvc.controller.Controller;
import mvc.model.Person;
import mvc.model.PersonList;
import mvc.view.View;

public class Main {

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        View view = new View();
        Controller controller = new Controller(personList, view);

        controller.addPerson(new Person("Tex", 25));
        controller.addPerson(new Person("Bla", 33));
        controller.displayList();
    }
}
