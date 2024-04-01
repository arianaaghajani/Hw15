package ir.ariana.repository;

import ir.ariana.q2.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class PersonRepository {
        StandardServiceRegistry build = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        SessionFactory sessionFactory = new MetadataSources(build)
                .addAnnotatedClass(Person.class)
                .buildMetadata()
                .buildSessionFactory();


        public void save(Person person) {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.persist(person);
            transaction.commit();
            session.close();
        }

        public Person findById(Long id) {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            Person person = session.find(Person.class, id);
            transaction.commit();
            session.close();
            return person;
        }
}