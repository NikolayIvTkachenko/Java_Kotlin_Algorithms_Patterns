package org.example.algorithms_task_oop.movie_ticket_booking;

public enum SeatType {

    SIMPLE(1), SILVER(5), GOLD(10);

    private final int price;

    private SeatType(int price) {
        this.price = price;
    }

    protected int getPrice() {
        return price;
    }
}
