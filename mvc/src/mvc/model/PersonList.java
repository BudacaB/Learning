package mvc.model;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    List<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.personList.add(person);
    }

    public List<Person> listPersons() {
        return personList;
    }
}
