package fabiosimonelli;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Random;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventDAO eventDAO = new EventDAO(em);

//        for (int i = 1; i <= 10; i++) {
//            Event event = new Event();
//            event.setTitle("Evento " + i);
//            event.setEventDate("Data " + i);
//            event.setDescription("Descrizione evento " + i);
//            event.setEventType(EventTypes.PUBLIC);
//            event.setMaxPeople(5 * new Random().nextInt(1, i + 1));
//            eventDAO.save(event);
//        }

//        Event retrievedEvent = eventDAO.getById(12);
//        if (retrievedEvent != null) {
//            System.out.println("Dettagli dell'evento recuperato:");
//            System.out.println("ID: " + retrievedEvent.getId());
//            System.out.println("Titolo: " + retrievedEvent.getTitle());
//            System.out.println("Data dell'evento: " + retrievedEvent.getEventDate());
//            System.out.println("Descrizione: " + retrievedEvent.getDescription());
//            System.out.println("Tipo di evento: " + retrievedEvent.getEventType());
//            System.out.println("Numero massimo di partecipanti: " + retrievedEvent.getMaxPeople());
//        } else {
//            System.out.println("Evento non trovato.");
//        }
//
        eventDAO.delete(14);

        em.close();
        emf.close();
    }
}
