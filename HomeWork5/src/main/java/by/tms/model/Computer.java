package by.tms.model;

import java.util.Random;

public class Computer {
    public String CPU;
    public String RAM;
    public String HDD;
    public String cycle;

    public Computer(String CPU, String RAM, String HDD, String cycle) { // конструктор
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.cycle = cycle;
    }

    public void on() {
        System.out.println("Attention! Enter 0 or 1");
        Random random = new Random();
        System.out.println(random.nextInt(1));
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", cycle='" + cycle + '\'' +
                '}';
    }
}
