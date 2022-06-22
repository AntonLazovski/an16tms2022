package robots.hands;

import robots.price.RobotParts;

public class SamsungHand extends RobotParts implements IHand {
    public SamsungHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднимаются руки Samsung");
    }
}


