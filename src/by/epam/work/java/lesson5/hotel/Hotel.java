package by.epam.work.java.lesson5.hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel {
    private String name;
    private String address;

    private List<Reservation> reservations = new ArrayList<Reservation>();

    public void makeReservation(Room room, Client client, Date startDate, Date endDate) {
    }

    public void cancelReservation(Room room, Client client, Date startDate, Date endDate){
    }

    public void editReservation(Room room, Client client, Date startDate, Date endDate) {
    }
}