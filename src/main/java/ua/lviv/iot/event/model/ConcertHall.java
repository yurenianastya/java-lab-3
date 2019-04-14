package ua.lviv.iot.event.model;

public class ConcertHall {

    private double ticketPrice;

    private double arenaSize;

    private String locationStreet;

    private int eventDuration;

    private boolean areThereMusicians;

    private int musiciansQuantity;

    public ConcertHall() {

    }

    public ConcertHall(final double tempTicketPrice,
                       final double tempArenaSize,
                       final String tempLocationStreet,
                       final int tempEventDuration,
                       final boolean tempAreThereMusicians,
                       final int tempMusiciansQuantity) {
        this.ticketPrice = tempTicketPrice;
        this.arenaSize = tempArenaSize;
        this.locationStreet = tempLocationStreet;
        this.eventDuration = tempEventDuration;
        this.areThereMusicians = tempAreThereMusicians;
        this.musiciansQuantity = tempMusiciansQuantity;
    }

    public final double getTicketPrice() {

        return ticketPrice;

    }

    public final void setTicketPrice(final double tempTicketPrice) {

        this.ticketPrice = tempTicketPrice;

    }

    public final double getArenaSize() {

        return arenaSize;

    }

    public final void setArenaSize(final double tempArenaSize) {

        this.arenaSize = tempArenaSize;

    }

    public final String getLocationStreet() {

        return locationStreet;

    }

    public final void setLocationStreet(final String tempLocationStreet) {

        this.locationStreet = tempLocationStreet;

    }

    public final int getEventDuration() {

        return eventDuration;

    }

    public final void setEventDuration(final int tempEventDuration) {

        this.eventDuration = tempEventDuration;

    }

    public final boolean isAreThereMusicians() {

        return areThereMusicians;

    }

    public final void setAreThereMusicians(
            final boolean tempAreThereMusicians) {

        this.areThereMusicians = tempAreThereMusicians;

    }

    public final int getMusiciansQuantity() {

        return musiciansQuantity;

    }

    public final void setMusiciansQuantity(final int tempMusiciansQuantity) {

        this.musiciansQuantity = tempMusiciansQuantity;

    }

    @Override
    public String toString() {
        return  "ConcertHall: " + "\n"
                + "ticketPrice = " + ticketPrice + "\n"
                + "arenaSize = " + arenaSize + "\n"
                + "locationStreet = " + locationStreet + '\n'
                + "eventDuration = " + eventDuration + "\n"
                + "areThereMusicians = " + areThereMusicians + "\n"
                + "musiciansQuantity = " + musiciansQuantity + "\n";
    }
}
