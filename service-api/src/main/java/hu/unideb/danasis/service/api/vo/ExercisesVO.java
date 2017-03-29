package hu.unideb.danasis.service.api.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Data
@ToString(exclude = "exercises")
public class ExercisesVO {

    private Long id;

    //private TeacherVO teacherId;

    private List<ExerciseVO> exercises;


}
