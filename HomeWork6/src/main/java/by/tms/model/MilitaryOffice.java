package by.tms.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public int findCountPersonByName(String name) {
        int counter = 0;
        Person[] people = personRegistry.getRecruits();
        for (Person person : people) {
            if (person != null && name.equals(person.getName())) {
                counter++;
            }
        }
        return counter;
    }
}
