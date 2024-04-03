package ir.ariana.repository;

import ir.ariana.q2.model.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class TeacherRepository extends PersonRepository{
    public void save(Teacher teacher) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(teacher);
        transaction.commit();
        session.close();
    }
}
