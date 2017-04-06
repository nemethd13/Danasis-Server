package hu.unideb.danasis.service.api.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Data
@ToString(exclude = "results")
public class StudentVO implements Serializable {

    private static final long serialVersionUID = -7658816512463274065L;
    private Long id;

    private String userName;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String role;

    private String city;

    private String school;

    private List<ResultVO> results;
}