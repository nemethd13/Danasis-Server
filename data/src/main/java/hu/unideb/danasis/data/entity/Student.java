package hu.unideb.danasis.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

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


}
