package ir.ariana.q2.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

//@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private Date birthDate;

    public Person(String name, String lastName, Date birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Person(String name, String lastName) {
        this.name=name;
        this.lastName=lastName;
    }
}
