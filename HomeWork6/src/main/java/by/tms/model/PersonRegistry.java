package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PersonRegistry {
    private Person[] people;

    public Person[] getRecruits() {
        Person[] recruits = new Person[people.length];
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getSex().equals("MALE")) {
                recruits[i] = person;
            }
        }
        return recruits;
    }
}
