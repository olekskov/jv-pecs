package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

import java.util.List;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    public Bulldozer() {
    }

    public Bulldozer(String name, String color) {
        super(name, color);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
