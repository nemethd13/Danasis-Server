package hu.unideb.danasis.service.api.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class ExerciseVO implements Serializable {

    private static final long serialVersionUID = 8729513932256891534L;

    private Long id;

    //private ExercisesVO exercisesId;

    private String theme;

    private String question;

    private String answera;

    private String answerb;

    private String answerc;

    private String answerd;

    private String rightAnswer;
}
