public class User {
    // методы класса User
    public static String name;
    public static int age;
    public static String gender;

    public User() { // конструктор 1
        System.out.println("first constructor");
    }

    public User(String name, int age, String gender) { // конструктор 2
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
