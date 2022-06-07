package by.tms.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Address {
    private String city;
    private String country;

    public Address(String city) {
        this.city = city;
    }
}
