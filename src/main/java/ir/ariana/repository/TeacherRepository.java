package ir.ariana.repository;

import ir.ariana.q2.model.Person;
import ir.ariana.q2.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public abstract class TeacherRepository extends PersonRepository{
    StandardServiceRegistry build = new StandardServiceRegistryBuilder()
            .configure()
            .build();

    SessionFactory sessionFactory = new MetadataSources(build)
            .addAnnotatedClass(Teacher.class)
            .buildMetadata()
            .buildSessionFactory();

    public void save(Teacher teacher) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(teacher);
        transaction.commit();
        session.close();
    }

    public Teacher findById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Teacher teacher = session.find(Teacher.class, id);
        transaction.commit();
        session.close();
        return teacher;
    }

    public void delete(Long id){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Teacher teacher= session.get(Teacher.class, id);
        session.delete(teacher);
        transaction.commit();
        session.close();
    }

    public void update(Teacher teacher){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(teacher);
        transaction.commit();
        session.close();
    }


}
