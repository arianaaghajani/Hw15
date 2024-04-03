package ir.ariana.q2.model;
import jakarta.persistence.Entity;
import lombok.*;

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





}
