//1) Создать класс User для хранения о обработки данных о пользователе.
//     * Создать поля для хранения имени и фамилии, возраста и пола. Создать методы для:
//     *  - Возврата имени и фамилии полностью
//     *  - Увеличения возраста
//     *  - Вывода общей информации о пользователе
//     *  В Main классе в методе main создайте экземпляр класса User и вызовите все созданные методы, передав им необходимые параметры.
//     * 2) Создать в классе User несколько конструкторов. Создать объект этого класса, использовав один из них.
//     * В этом конструкторе сделать вызов другого конструктора этого же класса.
//     * Отметьте один из методов как @Deprecated. Попробуйте на экземпляре класса вызвать этот метод.

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
