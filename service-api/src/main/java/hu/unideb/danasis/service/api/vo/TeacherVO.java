package hu.unideb.danasis.service.api.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Data
@ToString(exclude = "exercises")
public class TeacherVO implements Serializable{

    private static final long serialVersionUID = -8829475116594407645L;
    private Long id;

    private String userName;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String role;

    private String city;

    private String school;

    private String subject;

    private List<ExercisesVO> exercises;


}