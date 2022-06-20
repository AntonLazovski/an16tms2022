package robots.hands;

import robots.price.RobotParts;

public class SonyHand extends RobotParts implements IHand {
    public SonyHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднимаются руки Sony");
    }
}