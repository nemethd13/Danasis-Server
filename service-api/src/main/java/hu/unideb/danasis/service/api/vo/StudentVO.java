package hu.unideb.danasis.service.api.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class StudentVO {

    private Long id;

    private String userName;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String role;

    private String city;

    private String school;
}