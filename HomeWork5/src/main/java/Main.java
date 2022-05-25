import by.tms.user.User;

public class Main {
    //1) Создать класс User для хранения обработки данных о пользователе.
    public static void main(String[] args) {
        User user = new User("Anton", "Lazovski", 24, "male");
        System.out.println(user.getFirstLastName());
        user.addAge(22);
        System.out.println(user.getAge());
        System.out.println(user.info());
        System.out.println(user);
    }
}
