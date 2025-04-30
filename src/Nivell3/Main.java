package Nivell3;

import Nivell3.parkingBusiness.Vehicle;
import Nivell3.parkingBusiness.actions.*;
import Nivell3.parkingBusiness.ParkingValet;

public class Main {
    public static void main(String[] args) {

        Vehicle plane = new Vehicle("Plane");
        Vehicle bike = new Vehicle("Bicycle");
        Vehicle car = new Vehicle("Car");
        Vehicle boat = new Vehicle("Boat");

        TurnOnVehicle turnOnPlane = new TurnOnVehicle(plane);
        TurnOnVehicle turnOnBike = new TurnOnVehicle(bike);
        TurnOnVehicle turnOnCar = new TurnOnVehicle(car);
        TurnOnVehicle turnOnBoat = new TurnOnVehicle(boat);

        AccelerateVehicle acceleratePlane = new AccelerateVehicle(plane);
        AccelerateVehicle accelerateBike = new AccelerateVehicle(bike);
        AccelerateVehicle accelerateCar = new AccelerateVehicle(car);
        AccelerateVehicle accelerateBoat = new AccelerateVehicle(boat);

        BrakeVehicle brakePlane = new BrakeVehicle(plane);
        BrakeVehicle brakeBike = new BrakeVehicle(bike);
        BrakeVehicle brakeCar = new BrakeVehicle(car);
        BrakeVehicle brakeBoat = new BrakeVehicle(boat);

        ParkingValet parkingGuy = new ParkingValet();

        parkingGuy.getTask(turnOnPlane);
        parkingGuy.getTask(acceleratePlane);
        parkingGuy.getTask(brakePlane);
        parkingGuy.getTask(turnOnBike);
        parkingGuy.getTask(accelerateBike);
        parkingGuy.getTask(brakeBike);
        parkingGuy.getTask(turnOnCar);
        parkingGuy.getTask(accelerateCar);
        parkingGuy.getTask(brakeCar);
        parkingGuy.getTask(turnOnBoat);
        parkingGuy.getTask(accelerateBoat);
        parkingGuy.getTask(brakeBoat);

        parkingGuy.completeTask(4);
        parkingGuy.completeTask(5);
        parkingGuy.completeTask(3);
    }
}
