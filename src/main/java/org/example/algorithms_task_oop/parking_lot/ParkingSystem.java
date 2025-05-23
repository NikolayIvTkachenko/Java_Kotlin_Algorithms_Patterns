package org.example.algorithms_task_oop.parking_lot;

public class ParkingSystem implements Parking {

    private final String id;
    private final ParkingLot parkingLot;

    public ParkingSystem(String id, ParkingLot parkingLot) {
        this.id = id;
        this.parkingLot = parkingLot;
    }

    @Override
    public ParkingTicket parkVehicleBtn(String licensePlate, VehicleType type) {

        if (isFull()) {
            throw new RuntimeException("The parking is full! This is why the red light is on!");
        }

        Vehicle vehicle = new Vehicle(licensePlate, type.getSpotsNeeded(), type);

        return parkingLot.parkVehicle(vehicle);
    }

    @Override
    public boolean unparkVehicleBtn(String licensePlate, VehicleType type) {

        Vehicle vehicle = new Vehicle(licensePlate, type.getSpotsNeeded(), type);

        return parkingLot.unparkVehicle(vehicle);
    }

    @Override
    public boolean unparkVehicleBtn(ParkingTicket parkingTicket) {

        return parkingLot.unparkVehicle(parkingTicket);
    }

    public String getId() {
        return id;
    }

    // if this flag is true then the parking system will
    // show it by lighting a red bulb
    private boolean isFull() { return parkingLot.isFull(); }
}