package core.mate.academy.service;

import core.mate.academy.model.Machine;

import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        return switch (type.getSimpleName()) {
            case "Bulldozer" -> new BulldozerProducer().get();
            case "Truck" -> new TruckProducer().get();
            case "Excavator" -> new ExcavatorProducer().get();
            default -> List.of();
        };
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Machine::doWork);
    }
}
