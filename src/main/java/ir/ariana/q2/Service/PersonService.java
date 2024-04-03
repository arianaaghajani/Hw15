package ir.ariana.q2.Service;

import ir.ariana.q2.model.Person;
import ir.ariana.repository.PersonRepository;

import java.util.List;

public class PersonService {
    public final PersonRepository personRepository= new PersonRepository();

    public void save(Person person){
        personRepository.save(person);
    }

    public Person findById(Long id){
        return personRepository.findById(id);
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public void delete(Long id){
        personRepository.delete(id);
    }

    public void update(Person person){
        personRepository.update(person);
    }
    public Person signUp(String name,String lastName){
        Person person = new Person(name, lastName);
        personRepository.save(person);
        return person;
    }

//    public boolean contains(String name,String lastName){
//        return this.name.equals(name) && this.lastName.equals(lastName);
//    }

}
