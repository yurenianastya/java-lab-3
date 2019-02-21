import ua.lviv.iot.concertHall.enums.age;
import ua.lviv.iot.concertHall.enums.literatureTheme;
import ua.lviv.iot.concertHall.enums.musicGenre;
import ua.lviv.iot.concertHall.models.*;
import ua.lviv.iot.concertHall.manager.EventManager;


public class Main {

    public static void main(String[] args) {

        EventManager manager = new EventManager();

        ConcertHall arcadeFireConcert = new MusicEvent(250.0, 360.0,
                "Pid Dubom Street", 2, true, 5,
                musicGenre.INDIE, 7, "Arcade_Fire");

        ConcertHall xparty = new DiscoNightEvent(100.0, 640.0, "Staroyevreyska Street",
                3, true, 1);

        ConcertHall modernUkrLitEvening = new LiteratureEvening(67.7, 34.5, "Antonovycha Street",
                4, true, 4,
                literatureTheme.HISTORICAL, "Yuriy Andrukhovych", 35);


        manager.addEvent(arcadeFireConcert);

        manager.addEvent(xparty);

        manager.addEvent(modernUkrLitEvening);

        System.out.println(arcadeFireConcert);

        System.out.println();

        System.out.println(modernUkrLitEvening);

        System.out.println();

        System.out.println(xparty);

        System.out.println();

        System.out.println(manager.findWithMusicians(true));

        System.out.println();

        System.out.println(manager.sortByMusiciansQuantity(true));

        System.out.println();

        System.out.println(manager.sortByAveragePrice(true));

    }

}
