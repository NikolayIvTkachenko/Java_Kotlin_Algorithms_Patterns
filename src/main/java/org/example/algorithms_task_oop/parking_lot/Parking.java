package org.example.algorithms_task_oop.parking_lot;

public interface Parking {

    public ParkingTicket parkVehicleBtn(String licensePlate, VehicleType type);
    public boolean unparkVehicleBtn(String licensePlate, VehicleType type);
    public boolean unparkVehicleBtn(ParkingTicket parkingTicket);
}
