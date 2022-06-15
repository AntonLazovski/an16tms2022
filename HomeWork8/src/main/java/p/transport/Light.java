package p.transport;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString(callSuper = true)
@SuperBuilder
@Getter
@Setter

public class Light extends Ground {
    private String bodyStyle;
    private int numberOfPassengers;

    public void info(double time) {
        System.out.println("За время " + time + " ч, автомобиль " + getBrand() + " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч проедет "
                + getWay(time) + " км и израсходует " + calculateConsumedFuel(time) + " литров топлива.");
    }

    private double calculateConsumedFuel(double time) {
        return getWay(time) * getFuelConsumption() / 100;
    }

    private double getWay(double time) {
        return getMaxSpeed() * time;
    }


}
