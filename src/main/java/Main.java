import ir.ariana.q2.Person;
import ir.ariana.repository.PersonRepository;

public class Main {
    public static void main(String[] args) {
        PersonRepository personRepository=new PersonRepository();
        personRepository.save(new Person("elham","afshar","1376/03/21"));

        System.out.println(personRepository.findById(1L));
    }
}
