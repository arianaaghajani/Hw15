import ir.ariana.q2.Service.PersonService;
import ir.ariana.q2.Service.StudentService;
import ir.ariana.q2.Service.TeacherService;
import ir.ariana.q2.model.Person;
import ir.ariana.q2.model.Student;
import ir.ariana.q2.model.Teacher;
import ir.ariana.repository.TeacherRepository;

public class Main {
    public static void main(String[] args) {

       //todo: person
        PersonService personService =new PersonService();
        personService.save(new Person("elnaz","afshar"));
        personService.save(new Person("ana","kiani"));

//        System.out.println(personService.findAll());
//        System.out.println(personService.findById(2L));
//        personService.delete(2L);
//        System.out.println(personService.signUp("sama", "amiri"));
        //todo: teacher

    }
}
