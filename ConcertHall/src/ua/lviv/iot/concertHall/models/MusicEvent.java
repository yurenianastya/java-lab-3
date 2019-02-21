package ua.lviv.iot.concertHall.models;

import ua.lviv.iot.concertHall.enums.musicGenre;
import ua.lviv.iot.concertHall.manager.*;

public class MusicEvent extends ConcertHall {

    private musicGenre eventGenre;

    private int instrumentsCount;

    private String bandName;

    public MusicEvent() {

    }

    public MusicEvent(musicGenre eventGenre, int instrumentsCount, String bandName) {
        this.eventGenre = eventGenre;
        this.instrumentsCount = instrumentsCount;
        this.bandName = bandName;
    }

    public MusicEvent(double ticketPrice, double arenaSize, String locationStreet, int eventDuration, boolean areThereMusicians, int musiciansQuantity, musicGenre eventGenre, int instrumentsCount, String bandName) {
        super(ticketPrice, arenaSize, locationStreet, eventDuration, areThereMusicians, musiciansQuantity);
        this.eventGenre = eventGenre;
        this.instrumentsCount = instrumentsCount;
        this.bandName = bandName;
    }

    public MusicEvent(double ticketPrice, double arenaSize, String locationStreet,
                      int eventDuration, boolean areThereMusicians, int musiciansQuantity) {

        super(ticketPrice, arenaSize, locationStreet,
                eventDuration, areThereMusicians, musiciansQuantity);
    }

    public musicGenre getEventGenre() {

        return eventGenre;

    }

    public void setEventGenre(musicGenre eventGenre) {

        this.eventGenre = eventGenre;

    }

    public int getInstrumentsCount() {

        return instrumentsCount;

    }

    public void setInstrumentsCount(int instrumentsCount) {

        this.instrumentsCount = instrumentsCount;

    }

    public String getBandName() {

        return bandName;

    }

    public void setBandName(String bandName) {

        this.bandName = bandName;

    }

    @Override
    public String toString() {
        return super.toString() +
                "MusicEvent: " + "\n" +
                "eventGenre = " + eventGenre +"\n" +
                "instrumentsCount = " + instrumentsCount + "\n" +
                "bandName = " + bandName + "\n";

    }
}
