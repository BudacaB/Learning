package mvc.view;

import mvc.model.Person;
import mvc.model.PersonList;

public class View {

    private PersonList personList;

    public View(PersonList personList) {
        this.personList = personList;
    }

    public void display() {
        for (Person person: personList.listPersons()) {
            System.out.println(person.getName() + ", " + person.getAge());
        }
    }
}
