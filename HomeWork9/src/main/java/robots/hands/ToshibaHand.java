package robots.hands;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднимаются руки Toshiba");
    }

    @Override
    public int price() {
        return price();
    }
}
