package p.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class GasTank {
    private int totalTankVolume;
    private double fuelQuantity;

}
