package p.transport;

public class Main {
    public static void main(String[] args) {
        Light light = Light.builder()
                .power(110)
                .maxSpeed(180)
                .weight(5)
                .brand("Opel")
                .numberOfWheels(4)
                .fuelConsumption(8)
                .bodyStyle("Hatchback")
                .numberOfPassengers(5)
                .build();
        System.out.println(light);
        light.info(3);

        Cargo cargo = Cargo.builder()
                .power(180)
                .maxSpeed(120)
                .weight(10)
                .brand("MAZ")
                .numberOfWheels(6)
                .fuelConsumption(15)
                .loadCapacity(1200)
                .build();
        System.out.println(cargo);
        cargo.checkWeightCapacity(15);

        Civil civil = Civil.builder()
                .power(1500)
                .maxSpeed(800)
                .weight(20)
                .brand("Boing")
                .wingspan(8)
                .minimumRunwayLengthForTakeoff(25)
                .numberOfPassengers(500)
                .availabilityOfBusinessClass(true)
                .build();
        System.out.println(civil);
        civil.checkPassengersCapacity(300);

        Military military = Military.builder()
                .power(1300)
                .maxSpeed(1400)
                .weight(14)
                .brand("Mig")
                .wingspan(10)
                .minimumRunwayLengthForTakeoff(20)
                .catapultSystem(true)
                .countRockets(12)
                .build();
        System.out.println(military);
        military.shoot();
        military.catapult();

    }
}
