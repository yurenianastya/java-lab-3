package ua.lviv.iot.concertHall.models;

import ua.lviv.iot.concertHall.enums.age;
import ua.lviv.iot.concertHall.enums.musicGenre;

public class DiscoNightEvent extends ConcertHall{

    private age ageRestriction;

    private String specificDressCode;

    private musicGenre musicForParty;

    public DiscoNightEvent() {

        super();

    }

    public DiscoNightEvent(double ticketPrice, double arenaSize, String locationStreet,
                    int eventDuration, boolean areThereMusicians, int musiciansQuantity) {

        super(ticketPrice, arenaSize, locationStreet,
                eventDuration, areThereMusicians, musiciansQuantity);

    }

    public age getAgeRestriction() {

        return ageRestriction;

    }

    public void setAgeRestriction(age ageRestriction) {

        this.ageRestriction = ageRestriction;

    }

    public String getSpecificDressCode() {

        return specificDressCode;

    }

    public void setSpecificDressCode(String specificDressCode) {

        this.specificDressCode = specificDressCode;

    }

    public musicGenre getMusicForParty() {

        return musicForParty;

    }

    public void setMusicForParty(musicGenre musicForParty) {

        this.musicForParty = musicForParty;

    }

    @Override
    public String toString() {
        return super.toString() +
                "DiscoNightEvent: " + "\n" +
                "ageRestriction = " + ageRestriction + "\n" +
                "specificDressCode = " + specificDressCode + '\n' +
                "musicForParty = " + musicForParty;
    }
}
