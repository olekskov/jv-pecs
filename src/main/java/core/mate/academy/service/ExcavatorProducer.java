package core.mate.academy.service;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Machine> get() {
        List<Machine> excavators = new ArrayList<>();
        excavators.add(new Excavator("VOLVO", "Red"));
        excavators.add(new Excavator("CASE", "Blue"));
        excavators.add(new Excavator("TEREX", "Yellow"));
        return excavators;
    }
}
