package mvc.view;

import mvc.model.Person;
import mvc.model.PersonList;

import java.util.List;

public class View {
    public void display(PersonList personList) {
        for (Person person: personList.listPersons()) {
            System.out.println(person.getName() + ", " + person.getAge());
        }
    }
}
