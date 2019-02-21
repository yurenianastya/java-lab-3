package ua.lviv.iot.concertHall.manager;

import ua.lviv.iot.concertHall.models.ConcertHall;

import java.util.*;
import java.util.stream.Collectors;

public class EventManager extends ConcertHall {

    private List<ConcertHall> eventsList = new ArrayList<>();

    public EventManager() {

    }

    public List<ConcertHall> getEventsList() {

        return eventsList;

    }

    public void setEventsList(List<ConcertHall> eventsList) {

        this.eventsList = eventsList;

    }

    public void addEvent(ConcertHall newEvent) {

        eventsList.add(newEvent);

    }

    public List<ConcertHall> sortByMusiciansQuantity(boolean ascending) {

        if (ascending) {
            Collections.sort(eventsList, Comparator.comparing(ConcertHall::getMusiciansQuantity));

        } else {
            Collections.sort(eventsList, Comparator.comparing(ConcertHall::getMusiciansQuantity).reversed());

        }
        return eventsList;
    }

    public List<ConcertHall> sortByAveragePrice(boolean ascending) {

        if (ascending) {
            Collections.sort(eventsList, Comparator.comparing(ConcertHall::getTicketPrice));
        } else {
            Collections.sort(eventsList, Comparator.comparing(ConcertHall::getTicketPrice).reversed());
        }
        return eventsList;
    }

    public List<ConcertHall> findWithMusicians(boolean areThereMusicians) {
        return eventsList.stream().filter(machinery ->
                machinery.isAreThereMusicians() == (areThereMusicians)).collect(Collectors.toList());
    }


}
