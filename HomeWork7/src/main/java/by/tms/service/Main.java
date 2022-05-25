package by.tms.service;

import by.tms.model.Season;

public class Main {
    public static void main(String[] args) {
        Season sn = Season.Summer;
        System.out.println(sn);
        switch (sn) {
            case Winter:
                System.out.println("I love Winter");
                break;
            case Spring:
                System.out.println("I love Spring");
                break;
            case Summer:
                System.out.println("I love Summer");
                break;
            case Autumn:
                System.out.println("I love Autumn");
                break;
        }
        for (Season value : Season.values()) {
            System.out.println(value.getTemp());
        }
    }
}