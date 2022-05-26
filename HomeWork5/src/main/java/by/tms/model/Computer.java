package by.tms.model;


import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private int ram;
    private int hdd;
    private int resourceCycles;
    private boolean burned;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    //конструктор
    public Computer(String cpu, int ram, int hdd, int resourceCycles) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resourceCycles = resourceCycles;
    }

    public void info() {
        System.out.println("processor " + cpu + " opetativka " + ram + " gestki disk " + hdd + " resurs polnych cuklov raboty " + resourceCycles);
        System.out.printf("processor %s opetativka %d gestki disk %d resurs polnych cuklov raboty %d\n", cpu, ram, hdd, resourceCycles);
    }

    public void on() {
        if (!isBurned()) {
            System.out.println("Vkluchenie...");
            if (checkResourceCycles() && checkAction()) {
                System.out.println("Computer vkluchen");
//                off();
            } else {
                burned();
            }
        } else {
            burned();
        }
    }

    private void burned() {
        System.out.println("Computer burned");
        burned = true;
    }

    private boolean checkAction() {
        int value = -1;
        do {
            System.out.println("Attention! Vvedite 0 ili 1");
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
            } else {
                System.out.println("Nekorektnye dannye");
            }
        }
        while (!(value == 0 || value == 1));
        return random.nextInt(2) == value;

    }

    public void off() {
        if (!isBurned() && checkResourceCycles()) {
            System.out.println("Vykluchenie...");
            System.out.println("Computer vykluchen");
            resourceCycles--;
            System.out.println("Kolichestvo ostavshyhsya cyklov: " + resourceCycles);
//            on();
        } else {
            burned();
        }
    }

    private boolean checkResourceCycles() {
        return resourceCycles > 0;
    }

    // гетеры и сетеры
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getResourceCycles() {
        return resourceCycles;
    }

    public void setResourceCycles(int resourceCycles) {
        this.resourceCycles = resourceCycles;
    }

    public boolean isBurned() {
        return burned;
    }

    public void setBurned(boolean burned) {
        this.burned = burned;
    }
}

