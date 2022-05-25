package by.tms.servece;

import by.tms.model.Computer;

public class MainComputer {
    public static void main(String[] args) {
        int cycleCounter = 11;
        Computer computer = new Computer("intel core i7", 16, 2000, cycleCounter);

        computer.off();
        computer.on();
        computer.on();
        computer.off();
        computer.on();
        computer.on();
        computer.off();

        for (int i = 0; i < cycleCounter; i++) {
            if (computer.isBurned()) {
                break;
            }
            computer.on();
            computer.off();
        }
        System.out.println(computer);
    }
}
