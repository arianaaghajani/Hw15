package ir.ariana.q2.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "teacher")
public class Teacher extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String teacherId;
    private String degreeOfEducation;
//    @Enumerated(EnumType.STRING)
    private String teacherGrade;
    private double monthlySalary;

    public Teacher(String teacherId, String degreeOfEducation, String teacherGrade) {
        this.teacherId=teacherId;
        this.degreeOfEducation=degreeOfEducation;
        this.teacherGrade=teacherGrade;
    }

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
