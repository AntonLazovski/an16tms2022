package robots.heads;

import robots.price.RobotParts;

public class ToshibaHead extends RobotParts implements IHead {
    public ToshibaHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Toshiba");
    }
}
