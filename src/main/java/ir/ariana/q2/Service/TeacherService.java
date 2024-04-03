package ir.ariana.q2.Service;

import ir.ariana.q2.model.Person;
import ir.ariana.q2.model.Teacher;
import ir.ariana.repository.TeacherRepository;

public class TeacherService extends PersonService {
    private final TeacherRepository teacherRepository = new TeacherRepository() {
        @Override
        public void save(Teacher teacher) {
            super.save(teacher);
        }

        @Override
        public Teacher findById(Long id) {
            return super.findById(id);
        }

        @Override
        public void delete(Long id) {
            super.delete(id);
        }

        @Override
        public void update(Teacher teacher) {
            super.update(teacher);
        }
    };

    public Teacher signUp(String teacherId,String degreeOfEducation ,String teacherGrade){
        Teacher teacher = new Teacher(teacherId, degreeOfEducation, teacherGrade);
        personRepository.save(teacher);
        return teacher;
    }
}
