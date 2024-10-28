package core.mate.academy.service;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Machine> get() {
        List<Machine> trucks = new ArrayList<>();
        trucks.add(new Truck("VOLVO", "Red"));
        trucks.add(new Truck("CASE", "Blue"));
        trucks.add(new Truck("TEREX", "Yellow"));
        return trucks;
    }
}
