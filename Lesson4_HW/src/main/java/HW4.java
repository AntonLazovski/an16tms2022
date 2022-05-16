public class HW4 {
    public static void main(String[] args) {
        int day = (int) (Math.random() * 7);
        System.out.println(day);
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("dayOff");
                break;
            case 7:
                System.out.println("dayOff");
                break;
            default:
                System.out.println("don't day");
        }
    }
}