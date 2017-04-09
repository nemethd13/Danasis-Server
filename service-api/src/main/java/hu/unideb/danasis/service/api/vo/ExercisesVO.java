package hu.unideb.danasis.service.api.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Data
@ToString(exclude = "exercises")
public class ExercisesVO implements Serializable{

    private static final long serialVersionUID = -3508108294876503780L;

    private Long id;

    private String exercisesTheme;

    //private TeacherVO teacherId;

    private List<ExerciseVO> exercisesList;


}
