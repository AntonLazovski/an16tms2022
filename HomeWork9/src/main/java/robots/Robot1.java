package robots;

import robots.hands.SonyHand;
import robots.heads.SamsungHead;
import robots.legs.ToshibaLeg;

public class Robot1 implements IRobot {
    public static void main(String[] args) {
        SamsungHead samsungHead = new SamsungHead(40);
        SonyHand sonyHand = new SonyHand(30);
        ToshibaLeg toshibaLeg = new ToshibaLeg(50);
    }

    @Override
    public void action() {

    }

    @Override
    public int price() {
        return 0;
    }
}
