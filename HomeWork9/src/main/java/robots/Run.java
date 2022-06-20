package robots;

import robots.hands.IHand;
import robots.hands.SamsungHand;
import robots.hands.SonyHand;
import robots.hands.ToshibaHand;
import robots.heads.IHead;
import robots.heads.SamsungHead;
import robots.heads.SonyHead;
import robots.heads.ToshibaHead;
import robots.legs.ILeg;
import robots.legs.SamsungLeg;
import robots.legs.SonyLeg;
import robots.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        IHand[] hands = new IHand[3];
        hands[0] = new SonyHand(1500);
        hands[1] = new SamsungHand(2000);
        hands[2] = new ToshibaHand(1000);

        IHead[] heads = new IHead[3];
        heads[0] = new SonyHead(3000);
        heads[1] = new SamsungHead(3500);
        heads[2] = new ToshibaHead(2500);

        ILeg[] legs = new ILeg[3];
        legs[0] = new SonyLeg(4500);
        legs[1] = new SamsungLeg(5000);
        legs[2] = new ToshibaLeg(4000);

        IRobot[] robots = new IRobot[3];
        int maxPrice = Integer.MIN_VALUE;
        int maxPriceIndex = -1;
        for (int i = 0; i < 3; i++) {
            robots[i] = new Robot(hands[i], heads[i], legs[i]);
            robots[i].action();
            System.out.println();
            int price = robots[i].getPrice();
            if (price > maxPrice) {
                maxPriceIndex = 1;
                maxPrice = price;
            }
        }
        Robot maxPriceRobot = (Robot) robots[maxPriceIndex];
        System.out.printf("Самый дорогой робот стоит %d у.е. и состоит из головы %s, рук %s и ног %s \n", maxPrice, maxPriceRobot.getHead().getClass().getSimpleName(),
                maxPrice, maxPriceRobot.getHand().getClass().getSimpleName(), maxPrice, maxPriceRobot.getLeg().getClass().getSimpleName());
    }
}
