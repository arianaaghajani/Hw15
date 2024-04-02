package ir.ariana.q2.Service;

import ir.ariana.q2.Person;
import ir.ariana.repository.PersonRepository;

public class PersonService {
    public final PersonRepository personRepository= new PersonRepository();

    public void save(Person person){
        personRepository.save(person);
    }
}
