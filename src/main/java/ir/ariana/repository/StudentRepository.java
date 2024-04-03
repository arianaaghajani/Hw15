package ir.ariana.repository;

import ir.ariana.q2.model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentRepository extends PersonRepository{
    public void save(Student student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();
        session.close();
    }

    public Student findById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.find(Student.class, id);
        transaction.commit();
        session.close();
        return student;
    }

    public void delete(Long id){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.get(Student.class, id);
        session.delete(student);
        transaction.commit();
        session.close();
    }

    public void update(Student student){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(student);
        transaction.commit();
        session.close();
    }
}
