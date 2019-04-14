package ua.lviv.iot.event.manager;

import ua.lviv.iot.event.model.ConcertHall;

import java.util.Collections;
import java.util.Comparator;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EventManager extends ConcertHall {

    private List<ConcertHall> eventsList = new LinkedList<>();

    EventManager() {

    }

    public List<ConcertHall> getEventsList() {

        return eventsList;

    }

    public void setEventsList(final List<ConcertHall> eventsListTemp) {

        this.eventsList = eventsListTemp;

    }

     void addEvent(final ConcertHall newEvent) {

        eventsList.add(newEvent);

    }

    public final List<ConcertHall> sortingFunc(
            final List<ConcertHall> eventsListTemp, final boolean ascending,
            final Comparator<ConcertHall> comparator) {

        if (ascending) {
            Collections.sort(eventsListTemp, comparator.reversed());
        } else {
            Collections.sort(eventsListTemp, comparator);
        }
        return eventsListTemp;

    }

    List<ConcertHall> musiciansSort(
            final List<ConcertHall> eventsListTemp,
            final boolean ascending) {

        return sortingFunc(eventsListTemp, true,
                Comparator.comparing(ConcertHall::getMusiciansQuantity));

    }

    public final List<ConcertHall> sortByAveragePrice(
            final List<ConcertHall> eventsListTemp, final boolean ascending) {

        return sortingFunc(eventsListTemp, true,
                Comparator.comparing(ConcertHall::getTicketPrice));

    }


    public List<ConcertHall> findWithMusicians(boolean areThereMusicians) {
        return eventsList.stream().filter(event ->
                event.isAreThereMusicians() == (areThereMusicians)).collect(Collectors.toList());
    }

}

