package p.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine("Diesel", 1.7), new GasTank(40, 25)); // параметры
        System.out.println(car);
        car.startCar();
        car.stopCar();
        car.addFuel(15);
        car.wentCar(200);
        car.startCar();
        car.addFuel(20);
        car.getFuelInfo();
        car.wentCar(500);
        car.addFuel(40);
        car.wentCar(250);
        car.addFuel(20);
        car.getFuelInfo();
        car.wentCar(150);
        car.getAllDistance();
    }
}
