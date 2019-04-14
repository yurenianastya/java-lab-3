package ua.lviv.iot.event.model;

public class CircusEvent extends ConcertHall {

    private String originalCircusCity;

    private int circusEquipmentQuantity;

    public CircusEvent() {

        super();

    }

    public CircusEvent(final double ticketPrice,
                       final double arenaSize,
                       final String locationStreet,
                       final int eventDuration,
                       final boolean areThereMusicians,
                       final int musiciansQuantity) {

        super(ticketPrice, arenaSize, locationStreet,
                eventDuration, areThereMusicians, musiciansQuantity);
    }

    public final String getOriginalCircusCity() {

        return originalCircusCity;

    }

    public final void setOriginalCircusCity(
            final String tempOriginalCircusCity) {

        this.originalCircusCity = tempOriginalCircusCity;

    }

    public final int getCircusEquipmentQuantity() {

        return circusEquipmentQuantity;

    }

    public final void setCircusEquipmentQuantity(
            final int tempCircusEquipmentQuantity) {

        this.circusEquipmentQuantity = tempCircusEquipmentQuantity;

    }

    public String getHeaders() {

        return super.getHeaders() + ", Circus City" + ", Circus Number Of Equipment";

    }

    public String toCSV() {

        return super.toCSV() + ", " + this.getOriginalCircusCity() + ", "
                + this.getCircusEquipmentQuantity();

    }

    @Override
    public String toString() {
        return "CircusEvent{"
                + "originalCircusCity='" + originalCircusCity + '\''
                + ", circusEquipmentQuantity=" + circusEquipmentQuantity
                + '}';
    }

}
