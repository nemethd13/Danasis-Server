package hu.unideb.danasis.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class Student extends BaseEntity{

    private String userName;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String role;

    private String city;

    private String school;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "studentId", cascade = CascadeType.ALL)
    private List<Result> results;


}
