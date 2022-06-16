package p.transport;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString(callSuper = true)
@Getter
@Setter
public class Civil extends Air {
    private int numberOfPassengers;
    private boolean availabilityOfBusinessClass;

    public void checkPassengersCapacity(int people) {
        if (people < numberOfPassengers) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет больше");
        }
    }
}
