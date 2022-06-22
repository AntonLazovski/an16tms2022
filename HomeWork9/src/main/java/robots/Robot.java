package robots;

import lombok.*;
import robots.hands.IHand;
import robots.heads.IHead;
import robots.legs.ILeg;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor

public class Robot implements IRobot {
    private IHand hand;
    private IHead head;
    private ILeg leg;

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    @Override
    public int price() {
        return 0;
    }


    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }
}

