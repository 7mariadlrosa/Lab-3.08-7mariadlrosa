package models;

import javax.persistence.*;

@Entity
public class Speakers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double presentationDuration;

    @ManyToOne
    @JoinColumn(name="conference_id")
    private Conferences conferences;

    public Speakers() {
    }

    public Speakers(String name, double presentationDuration) {
        this.name = name;
        this.presentationDuration = presentationDuration;
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

    public double getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(double presentationDuration) {
        this.presentationDuration = presentationDuration;
    }
}