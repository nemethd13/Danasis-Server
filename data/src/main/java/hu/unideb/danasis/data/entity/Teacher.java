package hu.unideb.danasis.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Data
@ToString(exclude="exercises")
@Entity
public class Teacher extends BaseEntity{

    private String userName;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String role;

    private String city;

    private String school;

    private String subject;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "teacherId", cascade = CascadeType.ALL, orphanRemoval=true)
    private List<Exercises> exercises;

}
