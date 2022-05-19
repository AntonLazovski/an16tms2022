public class HW4 {
    public static void main(String[] args) {
        int a = 12;
        // катет а
        int b = 16;
        // катет b
        double c = Math.sqrt(a * a + b * b);
        // Теорема Пифагора, с - гипотенуза
        System.out.println(c);
    }

    public static double calculateHypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }
}
