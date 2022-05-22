public class Main {
    public static void main(String[] args) {
        User user = new User();
        User.name = "Anton Lazovski";
        User.age = 24;
        User.gender = "Male";
        System.out.println(user);
    }
}
