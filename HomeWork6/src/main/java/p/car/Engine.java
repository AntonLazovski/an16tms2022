package p.car;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Engine {
    private final String enginesType;
    private final double volume;
    private boolean isMotorOn;

    public Engine(String enginesType, double volume) {
        this.enginesType = enginesType;
        this.volume = volume;
    }

    public void engineOn() {
        isMotorOn = true;
        System.out.println("Engine on");
    }

    public void engineStop() {
        isMotorOn = false;
        System.out.println("Engine off");
    }
}
