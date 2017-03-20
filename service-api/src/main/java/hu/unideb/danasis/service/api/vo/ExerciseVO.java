package hu.unideb.danasis.service.api.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ExerciseVO {

    private Long id;

    private ExercisesVO exercisesId;

    private String theme;

    private String question;

    private String answera;

    private String answerb;

    private String answerc;

    private String answerd;

    private String rightAnswer;
}
