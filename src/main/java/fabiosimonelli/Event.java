package fabiosimonelli;

import javax.persistence.*;


@Entity
@Table(name = "evento")
public class Event {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column (name = "titolo")
    private String title;

    @Column (name = "data_evento")
    private String eventDate;

    @Column (name = "descrizione")
    private String description;

    @Column (name = "tipo_evento")
    @Enumerated(EnumType.STRING)
    private EventTypes eventType;

    @Column (name = "numero_massimo_partecipanti")
    private int maxPeople;

    public Event() {
    }

    public Event(String title, String eventDate, String description, EventTypes eventType, int maxPeople) {
        this.title = title;
        this.eventDate = eventDate;
        this.description = description;
        this.eventType = eventType;
        this.maxPeople = maxPeople;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventTypes getEventType() {
        return eventType;
    }

    public void setEventType(EventTypes eventType) {
        this.eventType = eventType;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", description='" + description + '\'' +
                ", eventType=" + eventType +
                ", maxPeople=" + maxPeople +
                '}';
    }
}
