package by.tms.servece;

import by.tms.model.Computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer(" intel core i7", "16GB", "2TB", "on");
        System.out.println(computer);
        computer.on();
    }
}
