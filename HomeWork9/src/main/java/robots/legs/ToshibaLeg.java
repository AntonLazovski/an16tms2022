package robots.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Делает шаг ноги Toshiba");
    }

    @Override
    public int price() {
        return price();
    }
}
