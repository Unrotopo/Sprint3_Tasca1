package Nivell3.parkingBusiness;

public class Vehicle {

    private final String VEHICLE_TYPE;

    public Vehicle(String vehicleType) {
        this.VEHICLE_TYPE = vehicleType;
    }

    public void accelerate() {
        System.out.println(VEHICLE_TYPE + " accelerates");
    }

    public void brake() {
        System.out.println(VEHICLE_TYPE + " brakes");
    }

    public void turnOn() {
        System.out.println(VEHICLE_TYPE + " turns on");
    }
}
