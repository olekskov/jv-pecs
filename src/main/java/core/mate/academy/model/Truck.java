package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

import java.util.List;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    public Truck() {
    }

    public Truck(String name, String color) {
        super(name, color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
