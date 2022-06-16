package p.transport;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString
public abstract class Transport {
    private double power;
    private double maxSpeed;
    private double weight;
    private String brand;

    private double getPower() {
        return power * 0.74;
    }
}
