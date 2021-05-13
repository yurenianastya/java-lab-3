package ua.lviv.iot.event.manager;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.rule.impl.SetterMustExistRule;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.event.model.LiteratureEvening;
import ua.lviv.iot.event.model.MusicEvent;
import ua.lviv.iot.event.model.CircusEvent;
import ua.lviv.iot.event.model.ConcertHall;
import ua.lviv.iot.event.model.DiscoNightEvent;

import ua.lviv.iot.event.manager.EventManager;
import ua.lviv.iot.event.manager.Main;
import ua.lviv.iot.event.enums.LiteratureTheme;
import ua.lviv.iot.event.enums.MusicGenre;
import ua.lviv.iot.event.enums.Age;


class EventManagerTest extends EventManager {

    private List<ConcertHall> expected;
    private List<ConcertHall> actual;
    private List<ConcertHall> testList;

    private EventManager eventManager;
    private CircusEvent lvivCircus;
    private MusicEvent theRasmus;
    private LiteratureEvening rayBradbury;
    private MusicEvent massiveAttack;
    private DiscoNightEvent partyNight;

    @BeforeEach
    public void setUp() {

        eventManager = new EventManager();

        lvivCircus = new CircusEvent(100.0, 400.0,
                "Horodotska St", 1, false,
                0);

        massiveAttack = new MusicEvent(1523.0, 1500.75,
                "Shevchenka Street", 7,
                true, 8, MusicGenre.ALTERNATIVE,
                5, "Massive Attack");

        rayBradbury = new LiteratureEvening(420.0, 150.5, "Zelena Street",
                2, false, 0,
                LiteratureTheme.SCIENCE_FICTION, "Ray Bradbury", 60);

        theRasmus = new MusicEvent(3676.5, 4500,
                "Shevchenka Street", 4,
                true,
                4, MusicGenre.METAL,
                5, "The Rasmus");
        eventManager.addEvent(lvivCircus);
        eventManager.addEvent(theRasmus);
        eventManager.addEvent(rayBradbury);
        eventManager.addEvent(massiveAttack);

        testList = Arrays.asList(lvivCircus, massiveAttack, rayBradbury, theRasmus);
    }


    @Test
    public void testGetterSetter() {
        PojoClass pojoclass = PojoClassFactory.getPojoClass(EventManager.class);
        Validator validator = ValidatorBuilder
                .create()
                .with(new SetterMustExistRule())
                .with(new GetterMustExistRule())
                .with(new SetterTester())
                .with(new GetterTester())
                .build();
        validator.validate(pojoclass);
    }

    @Test
    public void testFindWithMusiciansWithListLength() {

        Assertions.assertEquals(2, eventManager.findWithMusicians(true).size());
        Assertions.assertEquals(2, eventManager.findWithMusicians(false).size());
    }

    @Test
    public void testFingWithMusiciansOneList() {

        expected = new LinkedList<>();
        expected.add(theRasmus);
        expected.add(massiveAttack);
        actual = eventManager.findWithMusicians(true);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortByTicketPriceByDecreasing() {

        expected = Arrays.asList(theRasmus, massiveAttack, rayBradbury, lvivCircus);
        actual = eventManager.sortByAveragePrice(testList, false);

        Assertions.assertEquals(expected, actual);

   }

    @Test
    public void testSortByTicketPriceByIncreasing() {

        expected = Arrays.asList(theRasmus, massiveAttack, rayBradbury, lvivCircus);
        actual = eventManager.sortByAveragePrice(testList, true);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testMusiciansSortByDecreasing() {

        expected = Arrays.asList(massiveAttack, theRasmus, lvivCircus, rayBradbury);
        actual = eventManager.musiciansSort(testList, false);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMusiciansSortByIncreasing() {

        expected = Arrays.asList(massiveAttack, theRasmus, lvivCircus, rayBradbury);
        actual = eventManager.musiciansSort(testList, true);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testSortingFuncByArenaSizeByIncreasing() {

        expected = Arrays.asList(theRasmus, massiveAttack, lvivCircus, rayBradbury);
        actual = eventManager.sortingFunc(testList, true, Comparator.comparing(ConcertHall::getArenaSize));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortingFuncByEventDurationByDecreasing() {

        expected = Arrays.asList(lvivCircus, rayBradbury, theRasmus, massiveAttack);
        actual = eventManager.sortingFunc(testList, false, Comparator.comparing(ConcertHall::getEventDuration));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testListViewing() {
        eventManager.setEventsList(testList);
        expected = eventManager.getEventsList();
        System.out.println(expected);

    }

    @Test
    public void testEventAdd() {
        partyNight = new DiscoNightEvent(40, 1500, "Honeymoon avenue",
                4, true, 2, Age.AGE_18_PLUS, MusicGenre.ELECTRONIC,
                "like 80's");
        eventManager.addEvent(partyNight);
        testList = Arrays.asList(theRasmus, lvivCircus, partyNight, massiveAttack, rayBradbury);
        Assertions.assertEquals(5, testList.size());
    }

    @Test
    public void testToStringCircusEvent() {
        CircusEvent odessaCircus = new CircusEvent();
        odessaCircus.setCircusEquipmentQuantity(5);
        odessaCircus.setOriginalCircusCity("Lviv");
        String expected = "CircusEvent{originalCircusCity='Lviv', circusEquipmentQuantity=5}";
        Assertions.assertEquals(expected, odessaCircus.toString());
    }

    @Test
    public void testToStringDiscoNightEvent() {
        DiscoNightEvent MalevichParty = new DiscoNightEvent();
        String expected = "ConcertHall: \n" +
                "ticketPrice = 0.0\n" +
                "arenaSize = 0.0\n" +
                "locationStreet = null\n" +
                "eventDuration = 0\n" +
                "areThereMusicians = false\n" +
                "musiciansQuantity = 0\n" +
                "DiscoNightEvent: \n" +
                "ageRestriction = null\n" +
                "specificDressCode = null\n" +
                "musicForParty = null";
        Assertions.assertEquals(expected, MalevichParty.toString());
    }

    @Test
    public void testAnotherMusicEventConstructor() {
        MusicEvent BillieEilishConcert = new MusicEvent(MusicGenre.ALTERNATIVE,
                5, "Billie Eilish");
        String expected = "ConcertHall: \n" +
        "ticketPrice = 0.0\n" +
        "arenaSize = 0.0\n" +
        "locationStreet = null\n" +
        "eventDuration = 0\n" +
        "areThereMusicians = false\n" +
        "musiciansQuantity = 0\n" +
        "MusicEvent: \n" +
        "eventGenre = ALTERNATIVE\n" +
        "instrumentsCount = 5\n" +
        "bandName = Billie Eilish\n";
        String actual =  BillieEilishConcert.toString();
        Assertions.assertEquals(expected, actual);
    }
}