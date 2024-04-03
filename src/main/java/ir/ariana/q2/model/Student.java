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
@Table(name = "student")
public class Student extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
