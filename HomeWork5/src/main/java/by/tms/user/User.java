package by.tms.user;

public class User {
    // методы класса User

    public String name;
    public int age;
    public String gender;

    public User() { // конструктор 1

        System.out.println("first constructor");
    }

    public User(String name, int age, String gender) {
        System.out.println("second constructor");
        // конструктор 2
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
