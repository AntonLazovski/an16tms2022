package robots.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднимаются руки Samsung");
    }

    @Override
    public int price() {
        return price();
    }
}
