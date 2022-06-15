package p.transport;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder

public class Military extends Air {
    private boolean catapultSystem;
    private int countRockets;

    public void shoot() {
        if (countRockets > 0) {
            System.out.println("Ракета пошла...");
            countRockets--;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapult() {
        if (catapultSystem) {
            System.out.println("Катапультирование прошло успешно");
            catapultSystem = false;
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
