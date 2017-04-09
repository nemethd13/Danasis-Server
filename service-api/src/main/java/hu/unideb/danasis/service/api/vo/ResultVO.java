package hu.unideb.danasis.service.api.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class ResultVO implements Serializable{

    private static final long serialVersionUID = -5454792906786220779L;
    private  Long id;

    //private StudentVO studentId;
    private String exercisesTheme;

    private Long allQuestion;

    private Long score;

    private LocalDateTime date;

}
