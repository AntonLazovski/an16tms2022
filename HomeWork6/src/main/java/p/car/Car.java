package p.car;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car implements ICar {
    private final Engine engine;
    private GasTank gasTank;
    private double countAllDistance;

    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    @Override
    public void startCar() {
        if (checkFuel()) {
            engine.engineOn();
        } else {
            System.out.println("Refuel the car");
        }
    }

    private boolean checkFuel() {
        if (gasTank.getFuelQuantity() > 0) {
            return true;
        } else {
            System.out.println("No fuel");
            return false;
        }
    }

    @Override
    public void stopCar() {
        if (engine.isMotorOn()) {
            engine.engineStop();
        } else {
            System.out.println("Engine off");
        }
    }

    public void wentCar(double distance) {
        if (gasTank.getFuelQuantity() == 0) {
            System.out.println("Car stalled - need to refuel");
            engine.setMotorOn(false);
        } else if (engine.isMotorOn()) {
            countAllDistance += distance;
            double countFuelForDistance = distance / 100 * 10;
            if (gasTank.getFuelQuantity() >= countFuelForDistance) {
                gasTank.setFuelQuantity(gasTank.getFuelQuantity() - countFuelForDistance);
            } else {
                System.out.println("Not enough fuel");
            }
            System.out.println("The car passed" + distance + "km and spent fuel" + countFuelForDistance + "left in the tank" + gasTank.getFuelQuantity());
        }
    }

    public void getAllDistance() {
        System.out.println("The car has passed all the time" + countAllDistance + "km");
    }

    public void getFuelInfo() {
        System.out.println(gasTank.getFuelQuantity());
    }

    public void addFuel(double countFuel) {
        if (countFuel > gasTank.getTotalTankVolume()) {
            System.out.println("The tank is rated for" + gasTank.getTotalTankVolume() + "l");
        } else if (countFuel + gasTank.getFuelQuantity() > gasTank.getTotalTankVolume()) {
            double needFuel = gasTank.getTotalTankVolume() - gasTank.getFuelQuantity();
            System.out.println("You need" + needFuel + "l,to fill up a full tank");
        } else {
            gasTank.setFuelQuantity(gasTank.getFuelQuantity() + countFuel);
            System.out.println("The car is filled" + countFuel + "l");
            engine.setMotorOn(true);
        }
    }
}
