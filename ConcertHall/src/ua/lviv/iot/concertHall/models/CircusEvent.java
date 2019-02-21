package ua.lviv.iot.concertHall.models;

public class CircusEvent extends ConcertHall {

    private  String originalCircusCity;

    private  int circusEquipmentQuantity;

    public CircusEvent() {

        super();

    }

    public CircusEvent(double ticketPrice, double arenaSize, String locationStreet,
                       int eventDuration, boolean areThereMusicians, int musiciansQuantity) {

        super(ticketPrice, arenaSize, locationStreet,
                eventDuration, areThereMusicians, musiciansQuantity);
    }

    public String getOriginalCircusCity() {

        return originalCircusCity;

    }

    public void setOriginalCircusCity(String originalCircusCity) {

        this.originalCircusCity = originalCircusCity;

    }

    public int getCircusEquipmentQuantity() {

        return circusEquipmentQuantity;

    }

    public void setCircusEquipmentQuantity(int circusEquipmentQuantity) {

        this.circusEquipmentQuantity = circusEquipmentQuantity;

    }

    @Override
    public String toString() {
        return "CircusEvent{" +
                "originalCircusCity='" + originalCircusCity + '\'' +
                ", circusEquipmentQuantity=" + circusEquipmentQuantity +
                '}';
    }
}
