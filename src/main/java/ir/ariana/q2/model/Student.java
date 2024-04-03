package ir.ariana.q2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Student extends Person {
    @Id
    private Long id;
    private String studentId;
    private String fieldOfStudy;
    private int enteringYear;

    public Student(Long id, String name, String lastName, Date birthDate, String studentId,
                   String fieldOfStudy, int enteringYear) {
        super(id, name, lastName, birthDate);
        this.studentId = studentId;
        this.fieldOfStudy = fieldOfStudy;
        this.enteringYear = enteringYear;
    }
}
