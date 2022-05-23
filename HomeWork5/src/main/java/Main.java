import by.tms.user.User;

public class Main {
    //1) Создать класс User для хранения обработки данных о пользователе.
    public static void main(String[] args) {
        User user = new User("Anton Lazovski", 24, "Male");
        user.name = "Anton Lazovski";
        user.age = 24;
        user.gender = "Male";
        System.out.println(user);
    }
}
