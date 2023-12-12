package fabiosimonelli;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventDAO {
    private final EntityManager em;

    public EventDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Event event){
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(event);

        transaction.commit();

        System.out.println("Evento salvato nel database.");
    }

    public Event getById(long id){
        return em.find(Event.class, id);
    }

    public void delete(long id){
        Event found = this.getById(id);

        if(found != null){
            EntityTransaction transaction = em.getTransaction();

            transaction.begin();

            em.remove(found);

            transaction.commit();

            System.out.println("Evento rimosso dal database");
        }else{
            System.out.println("Evento non trovato, sicuro che l'id sia corretto?");
        }
    }
}
