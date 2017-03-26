package hu.unideb.danasis.service.api.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class ExercisesVO {

    private Long id;

    private TeacherVO teacherId;

    private List<ExerciseVO> exercises;
}
