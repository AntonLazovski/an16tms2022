package robots.heads;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int price() {
        return price();
    }
}
