package models;

import enums.guessStatus;

import javax.persistence.*;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private guessStatus guessStatus;

    @ManyToOne
    @JoinColumn(name="event_id")
    private Event event;

    public Guest() {
    }

    public Guest(String name, guessStatus status, Event event) {
        this.name = name;
        this.guessStatus = guessStatus;
        this.event = event;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public guessStatus getGuessStatus() {
        return guessStatus;
    }

    public void setGuessStatus(guessStatus guessStatus) {
        this.guessStatus = guessStatus;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
