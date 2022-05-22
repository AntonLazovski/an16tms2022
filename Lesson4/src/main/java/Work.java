public class Work {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i += 5) {
            System.out.println(i);
        }

        int i = 100;
        int g = 200;
        while (i != g) {
            i++;
            g--;
        }
        System.out.println("seredina promegutka" + ' ' + i);

        while (true) {
            i++;
            g--;
            if (i == g) {
                break;
            }
        }
        int sa = -5;
        if (sa > 0) {
            System.out.println(sa + " " + "polog");
        } else {
            System.out.println(sa + " " + "otric");
        }
    }
}
