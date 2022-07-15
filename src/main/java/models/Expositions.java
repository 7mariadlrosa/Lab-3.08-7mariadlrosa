package models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Expositions extends Event {

    public Expositions() {
    }

    public Expositions(Date date, double duration, String location, String title) {
        super(date, duration, location, title);
    }

}
