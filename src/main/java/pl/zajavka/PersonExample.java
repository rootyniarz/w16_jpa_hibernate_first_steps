package pl.zajavka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PersonExample {
    public static void main(String[] args) {
        try (
                SessionFactory sessionFactory = createSessionFactory();
                Session session = sessionFactory.openSession();
        ){
            session.beginTransaction();
            Person newPerson = new Person();
            newPerson.setName("Damian");
            newPerson.setAge(42);
            session.persist(newPerson);
            session.getTransaction().commit();

            Person person = session.find(Person.class,1);
            System.out.println(person);
        }
    }

    private static SessionFactory createSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure("/META-INF/hibernate.cfg.xml");
        return configuration.buildSessionFactory();
    }
}
