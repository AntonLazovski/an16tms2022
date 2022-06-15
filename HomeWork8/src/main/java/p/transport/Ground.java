package p.transport;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter
@Getter
@ToString(callSuper = true)
public abstract class Ground extends Transport {
    private int numberOfWheels;
    private double fuelConsumption;
}
