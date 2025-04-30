package Nivell3.parkingBusiness.actions;

import Nivell3.parkingBusiness.Command;
import Nivell3.parkingBusiness.Vehicle;

public class BrakeVehicle implements Command {

    private Vehicle vehicle;

    public BrakeVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.brake();
    }
}
