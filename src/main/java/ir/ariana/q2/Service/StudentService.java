package ir.ariana.q2.Service;

import ir.ariana.q2.model.Person;
import ir.ariana.q2.model.Student;
import ir.ariana.repository.StudentRepository;

import java.util.List;
public class StudentService extends PersonService{
    private final StudentRepository studentRepository=new StudentRepository();

    @Override
    public void save(Person person) {
        super.save(person);
    }

    @Override
    public Person findById(Long id) {
        return super.findById(id);
    }

    @Override
    public List<Person> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }

    @Override
    public void update(Person person) {
        super.update(person);
    }

    @Override
    public Person signUp(String name, String lastName) {
        return super.signUp(name, lastName);
    }
}
