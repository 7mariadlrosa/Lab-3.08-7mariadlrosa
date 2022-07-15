package models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Conferences extends Event {

    @OneToMany(mappedBy="conferences")
    private List<Speakers> speakers;

    public Conferences() {
    }

    public Conferences(Date date, double duration, String location, String title) {
        super(date, duration, location, title);
    }
}
