package ua.lviv.iot.event.model;

import ua.lviv.iot.event.enums.Age;
import ua.lviv.iot.event.enums.MusicGenre;

public class DiscoNightEvent extends ConcertHall {

    private Age ageRestriction;

    private String specificDressCode;

    private MusicGenre musicForParty;

    public DiscoNightEvent() {

    }

    public DiscoNightEvent(final double tempTicketPrice,
                           final double tempArenaSize,
                           final String tempLocationStreet,
                           final int tempEventDuration,
                           final boolean tempAreThereMusicians,
                           final int tempMusiciansQuantity,
                           final Age tempAgeRestriction,
                           final MusicGenre tempMusicForParty,
                           final String tempSpecificDressCode) {

        super(tempTicketPrice, tempArenaSize, tempLocationStreet,
                tempEventDuration, tempAreThereMusicians,
                tempMusiciansQuantity);

        this.ageRestriction = tempAgeRestriction;
        this.musicForParty = tempMusicForParty;
        this.specificDressCode = tempSpecificDressCode;

    }

    public final Age getAgeRestriction() {

        return ageRestriction;

    }

    public final void setAgeRestriction(final Age tempAgeRestriction) {

        this.ageRestriction = tempAgeRestriction;

    }

    public final String getSpecificDressCode() {

        return specificDressCode;

    }

    public final void setSpecificDressCode(
            final String tempSpecificDressCode) {

        this.specificDressCode = tempSpecificDressCode;

    }

    public final MusicGenre getMusicForParty() {

        return musicForParty;

    }

    public final void setMusicForParty(final MusicGenre tempMusicForParty) {

        this.musicForParty = tempMusicForParty;

    }

    @Override
    public String toString() {
        return super.toString()
                + "DiscoNightEvent: " + "\n"
                + "ageRestriction = " + ageRestriction + "\n"
                + "specificDressCode = " + specificDressCode + '\n'
                + "musicForParty = " + musicForParty;
    }
}
