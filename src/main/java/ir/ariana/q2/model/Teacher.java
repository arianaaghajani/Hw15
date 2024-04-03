package ir.ariana.q2.model;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Teacher extends Person {
    private Long id;
    private String teacherId;
    private String degreeOfEducation;
    private String teacherGrade;
    private double monthlySalary;

    public enum TeacherGrade{
        ASSISTANT_PROFESSOR,
        ASSOCIATE_PROFESSOR,
        PROFESSOR
    }

    public Teacher(Long id, String name, String lastName, Date birthDate, Long id1, String teacherId,
                   String degreeOfEducation, String teacherGrade, double monthlySalary) {
        super(id, name, lastName, birthDate);
        this.id = id1;
        this.teacherId = teacherId;
        this.degreeOfEducation = degreeOfEducation;
        this.teacherGrade = teacherGrade;
        this.monthlySalary = monthlySalary;
    }
}
