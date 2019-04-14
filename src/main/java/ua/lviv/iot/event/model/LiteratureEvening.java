package ua.lviv.iot.event.model;

import ua.lviv.iot.event.enums.LiteratureTheme;

public class LiteratureEvening extends ConcertHall {

    private LiteratureTheme discussionTheme;

    private String speakerName;

    private int booksForSale;

    public LiteratureEvening() {

    }

    public LiteratureEvening(final double tempTicketPrice,
                             final double tempArenaSize,
                             final String tempLocationStreet,
                             final int tempEventDuration,
                             final boolean tempAreThereMusicians,
                             final int tempMusiciansQuantity,
                             final LiteratureTheme tempDiscussionTheme,
                             final String tempSpeakerName,
                             final int tempBooksForSale) {
        super(tempTicketPrice, tempArenaSize, tempLocationStreet,
                tempEventDuration, tempAreThereMusicians,
                tempMusiciansQuantity);
        this.discussionTheme = tempDiscussionTheme;
        this.speakerName = tempSpeakerName;
        this.booksForSale = tempBooksForSale;
    }


    public final LiteratureTheme getDiscussionTheme() {

        return discussionTheme;

    }


    public final void setDiscussionTheme(
            final LiteratureTheme tempDiscussionTheme) {

        this.discussionTheme = tempDiscussionTheme;

    }

    public final String getSpeakerName() {

        return speakerName;

    }

    public final void setSpeakerName(final String tempSpeakerName) {

        this.speakerName = tempSpeakerName;

    }

    public final int getBooksForSale() {

        return booksForSale;

    }

    public final void setBooksForSale(final int tempBooksForSale) {

        this.booksForSale = tempBooksForSale;

    }

    @Override
    public String toString() {
        return super.toString()
                + "LiteratureEvening: " + "\n"
                + "discussionTheme = " + discussionTheme + "\n"
                + "speakerName = " + speakerName + '\n'
                + "booksForSale = " + booksForSale + "\n";
    }
}
