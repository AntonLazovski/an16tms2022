package p.transport;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter
@Getter
@ToString(callSuper = true)

public class Cargo extends Ground {
    private double loadCapacity;

    public void checkWeightCapacity(double weight) {
        if (weight < loadCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик больше");
        }
    }
}
