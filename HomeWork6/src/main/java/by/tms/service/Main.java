package by.tms.service;

import by.tms.model.Address;
import by.tms.model.MilitaryOffice;
import by.tms.model.Person;
import by.tms.model.PersonRegistry;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        {
            Person person = new Person("Alexandr", 25, "MALE", new Address("Minsk"));
            people[0] = person;
        }
        {
            Person person = new Person("Dima", 18, "MALE", new Address("Minsk"));
            people[1] = person;
        }
        {
            Person person = new Person("Sergey", 27, "MALE", new Address("Grodno"));
            people[2] = person;
        }
        {
            Person person = new Person("Margo", 22, "FEMALE", new Address("Brest"));
            people[3] = person;
        }
        PersonRegistry personRegistry = new PersonRegistry(people);
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        int count = militaryOffice.findCountPersonByName("Alexandr");
        System.out.println("The number of recruits named Alexander" + count);
    }
}