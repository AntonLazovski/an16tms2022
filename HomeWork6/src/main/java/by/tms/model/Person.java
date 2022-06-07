package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Person {
    private String name;
    private int age;
    private String sex;
    private Address address;
}
