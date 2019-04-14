package ua.lviv.iot.event.model;

import ua.lviv.iot.event.enums.MusicGenre;

public class MusicEvent extends ConcertHall {

    private MusicGenre eventGenre;

    private int instrumentsCount;

    private String bandName;

    public MusicEvent() {

    }

    public MusicEvent(final MusicGenre tempEventGenre,
                      final int tempInstrumentsCount,
                      final String tempBandName) {
        this.eventGenre = tempEventGenre;
        this.instrumentsCount = tempInstrumentsCount;
        this.bandName = tempBandName;
    }

    public MusicEvent(final double tempTicketPrice,
                      final double tempArenaSize,
                      final String tempLocationStreet,
                      final int tempEventDuration,
                      final boolean tempAreThereMusicians,
                      final int tempMusiciansQuantity,
                      final MusicGenre tempEventGenre,
                      final int tempInstrumentsCount,
                      final String tempBandName) {
        super(tempTicketPrice, tempArenaSize, tempLocationStreet,
                tempEventDuration, tempAreThereMusicians,
                tempMusiciansQuantity);
        this.eventGenre = tempEventGenre;
        this.instrumentsCount = tempInstrumentsCount;
        this.bandName = tempBandName;
    }

    public MusicEvent(final double tempTicketPrice,
                      final double tempArenaSize,
                      final String tempLocationStreet,
                      final int tempEventDuration,
                      final boolean tempAreThereMusicians,
                      final int tempMusiciansQuantity) {

        super(tempTicketPrice, tempArenaSize, tempLocationStreet,
                tempEventDuration, tempAreThereMusicians,
                tempMusiciansQuantity);
    }

    public final MusicGenre getEventGenre() {

        return eventGenre;

    }

    public final void setEventGenre(final MusicGenre tempEventGenre) {

        this.eventGenre = tempEventGenre;

    }

    public final int getInstrumentsCount() {

        return instrumentsCount;

    }

    public final void setInstrumentsCount(final int tempInstrumentsCount) {

        this.instrumentsCount = tempInstrumentsCount;

    }

    public final String getBandName() {

        return bandName;

    }

    public final void setBandName(final String tempBandName) {

        this.bandName = tempBandName;

    }

    @Override
    public String toString() {
        return super.toString()
                + "MusicEvent: " + "\n"
                + "eventGenre = " + eventGenre + "\n"
                + "instrumentsCount = " + instrumentsCount + "\n"
                + "bandName = " + bandName + "\n";

    }
}
