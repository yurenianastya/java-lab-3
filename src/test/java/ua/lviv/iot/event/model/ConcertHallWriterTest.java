package ua.lviv.iot.event.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.event.enums.Age;
import ua.lviv.iot.event.enums.LiteratureTheme;
import ua.lviv.iot.event.enums.MusicGenre;
import ua.lviv.iot.event.manager.EventManager;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

class ConcertHallWriterTest extends ConcertHallWriter {

    private File testFile = new File("ListsConcertHall.csv");
    private ConcertHallWriter writer = new ConcertHallWriter();
    private List<ConcertHall> eventList = new LinkedList<ConcertHall>();
    private EventManager testManager = new EventManager();

    @BeforeEach
    public void setUp() {

        eventList = new LinkedList<>();

        MusicEvent hurtsConcert = new MusicEvent(600.0, 750.0,
                "Green Street", 3, true,
                2, MusicGenre.INDIE, 3,
                "Hurts");

        LiteratureEvening podervyanskyiEvening = new LiteratureEvening(100.0, 350.0,
                "Blue Street", 2, false,
                0, LiteratureTheme.COMEDY, "Les' Podervyanskyi",
                100);

        DiscoNightEvent deltaHeavyConcert = new DiscoNightEvent(400.0, 1000.0,
                "White Street", 5, true,
                1, Age.AGE_16_PLUS,  MusicGenre.ELECTRONIC, "Casual");

        eventList.add(hurtsConcert);
        eventList.add(podervyanskyiEvening);
        eventList.add(deltaHeavyConcert);

        testManager.setEventsList(eventList);

    }

    @Test
    void testWriteToFile() throws IOException {
        System.out.println(eventList);
        writer.writeToFile(eventList, testFile);
        Assertions.assertNotEquals(testFile.length(), 0);
    }
}