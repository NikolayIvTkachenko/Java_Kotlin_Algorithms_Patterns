package org.example.algorithms_task_oop.movie_ticket_booking;

public interface MovieTicketing {

    // this is like the Template design pattern
    public boolean selectMovieBtn(Movie movie);   // step 1
    public boolean selectStartTimeBtn();          // step 2
    public boolean selectCinemaRoom();            // step 3
    public boolean selectSeats();                 // step 4

    public MovieTicket buyTicketBtn();            // step 5
}
