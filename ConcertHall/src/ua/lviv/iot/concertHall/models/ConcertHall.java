package ua.lviv.iot.concertHall.models;

public class ConcertHall {

    private double ticketPrice;

    private double arenaSize;

    private String locationStreet;

    private int eventDuration;

    private boolean areThereMusicians;

    private int musiciansQuantity;

    public ConcertHall() {

    }

    public ConcertHall(double ticketPrice, double arenaSize, String locationStreet,
                       int eventDuration, boolean areThereMusicians, int musiciansQuantity) {
        this.ticketPrice = ticketPrice;
        this.arenaSize = arenaSize;
        this.locationStreet = locationStreet;
        this.eventDuration = eventDuration;
        this.areThereMusicians = areThereMusicians;
        this.musiciansQuantity = musiciansQuantity;
    }

    public double getTicketPrice() {

        return ticketPrice;

    }

    public void setTicketPrice(double ticketPrice) {

        this.ticketPrice = ticketPrice;

    }

    public double getArenaSize() {

        return arenaSize;

    }

    public void setArenaSize(double arenaSize) {

        this.arenaSize = arenaSize;

    }

    public String getLocationStreet() {

        return locationStreet;

    }

    public void setLocationStreet(String locationStreet) {

        this.locationStreet = locationStreet;

    }

    public int getEventDuration() {

        return eventDuration;

    }

    public void setEventDuration(int eventDuration) {

        this.eventDuration = eventDuration;

    }

    public boolean isAreThereMusicians() {
        return areThereMusicians;
    }

    public void setAreThereMusicians(boolean areThereMusicians) {
        this.areThereMusicians = areThereMusicians;
    }

    public int getMusiciansQuantity() {

        return musiciansQuantity;

    }

    public void setMusiciansQuantity(int musiciansQuantity) {

        this.musiciansQuantity = musiciansQuantity;

    }

    @Override
    public String toString() {
        return  "ConcertHall: " + "\n" +
                "ticketPrice = " + ticketPrice + "\n" +
                "arenaSize = " + arenaSize + "\n" +
                "locationStreet = " + locationStreet + '\n' +
                "eventDuration = " + eventDuration + "\n" +
                "areThereMusicians = " + areThereMusicians + "\n" +
                "musiciansQuantity = " + musiciansQuantity + "\n";
    }
}
