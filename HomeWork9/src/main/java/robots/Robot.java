package robots;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import robots.hands.IHand;
import robots.heads.IHead;
import robots.legs.ILeg;

@AllArgsConstructor
@Setter
@Getter
@ToString

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
        int price = head.price() + hand.price() + leg.price();
        return price;
    }
}

