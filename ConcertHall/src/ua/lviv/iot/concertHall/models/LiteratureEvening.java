package ua.lviv.iot.concertHall.models;

import ua.lviv.iot.concertHall.enums.literatureTheme;

public class LiteratureEvening extends ConcertHall {

    private literatureTheme discussionTheme;

    private String speakerName;

    private int booksForSale;

    public LiteratureEvening() {

    }

    public LiteratureEvening(double ticketPrice, double arenaSize, String locationStreet, int eventDuration, boolean areThereMusicians, int musiciansQuantity, literatureTheme discussionTheme, String speakerName, int booksForSale) {
        super(ticketPrice, arenaSize, locationStreet, eventDuration, areThereMusicians, musiciansQuantity);
        this.discussionTheme = discussionTheme;
        this.speakerName = speakerName;
        this.booksForSale = booksForSale;
    }


    public literatureTheme getDiscussionTheme() {

        return discussionTheme;

    }


    public void setDiscussionTheme(literatureTheme discussionTheme) {

        this.discussionTheme = discussionTheme;

    }

    public String getSpeakerName() {

        return speakerName;

    }

    public void setSpeakerName(String speakerName) {

        this.speakerName = speakerName;

    }

    public int getBooksForSale() {

        return booksForSale;

    }

    public void setBooksForSale(int booksForSale) {

        this.booksForSale = booksForSale;

    }

    @Override
    public String toString() {
        return super.toString() +
                "LiteratureEvening: " + "\n" +
                "discussionTheme = " + discussionTheme + "\n" +
                "speakerName = " + speakerName + '\n' +
                "booksForSale = " + booksForSale + "\n";
    }
}
