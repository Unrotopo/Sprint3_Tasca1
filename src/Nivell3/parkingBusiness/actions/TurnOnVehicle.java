package Nivell3.parkingBusiness.actions;

import Nivell3.parkingBusiness.Command;
import Nivell3.parkingBusiness.Vehicle;

public class TurnOnVehicle implements Command {

    private Vehicle vehicle;

    public TurnOnVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.turnOn();
    }
}
