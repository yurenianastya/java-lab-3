package ua.lviv.iot.event.manager;

import ua.lviv.iot.event.enums.Age;
import ua.lviv.iot.event.enums.LiteratureTheme;
import ua.lviv.iot.event.enums.MusicGenre;
import ua.lviv.iot.event.model.ConcertHall;
import ua.lviv.iot.event.model.DiscoNightEvent;
import ua.lviv.iot.event.model.LiteratureEvening;
import ua.lviv.iot.event.model.MusicEvent;

import java.util.List;


public final class Main {

    private Main() {

    }

            public static void main(final String[] args) {

               EventManager manager = new EventManager();

                List<ConcertHall> eventsListTemp;

                eventsListTemp = manager.getEventsList();

                ConcertHall arcadeFireConcert = new MusicEvent(50.0,
                        360.0, "Pid Dubom Street",
                        2, true,
                        5, MusicGenre.INDIE,
                        7, "Arcade_Fire");

                ConcertHall xParty = new DiscoNightEvent(154.0, 641.0,
                        "Staroyevreyska Street",
                        3, true,
                        1, Age.AGE_18_PLUS,
                        MusicGenre.ELECTRONIC, "Black'n'White");

                ConcertHall modernUkrLitEvening = new LiteratureEvening(67.7,
                        34.5, "Antonovycha Street",
                        4, false,
                        0, LiteratureTheme.HISTORICAL,
                        "Yuriy Andrukhovych", 35);


                manager.addEvent(arcadeFireConcert);

                manager.addEvent(xParty);

                manager.addEvent(modernUkrLitEvening);

                System.out.println("MUSIC EVENT - ARCADE FIRE"
                        + "\n" + arcadeFireConcert + "\n");

                System.out.println("LITERATURE EVENT - WRITER'S EVENING"
                        + "\n" + modernUkrLitEvening + "\n");

                System.out.println("DISCONIGHT EVENT - STUDENT PARTY"
                        + "\n" + xParty + "\n");

                System.out.println("WITH MUSICIANS ONLY"
                       + "\n" + manager.findWithMusicians(true) + "\n");

                System.out.println("MUSICIANS SORT"
                        + "\n" + manager.musiciansSort(eventsListTemp,
                        true) + "\n");

                System.out.println("PRICE SORT" + "\n" +
                        manager.sortByAveragePrice(eventsListTemp, true)
                        + "\n");


                System.out.println(manager.findWithMusicians(false));

            }

        }
