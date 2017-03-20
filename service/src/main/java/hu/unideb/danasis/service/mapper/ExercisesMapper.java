package hu.unideb.danasis.service.mapper;

import hu.unideb.danasis.data.entity.Exercise;
import hu.unideb.danasis.data.entity.Exercises;
import hu.unideb.danasis.data.entity.Student;
import hu.unideb.danasis.service.api.vo.ExercisesVO;
import hu.unideb.danasis.service.api.vo.StudentVO;
import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

public class ExercisesMapper {

    private static DozerBeanMapper mapper = new DozerBeanMapper();

    public static ExercisesVO toVO(final Exercises exercises) {
        if(exercises == null) {
            return null;
        }

        return mapper.map(exercises, ExercisesVO.class);
    }

    public static Exercises toEntity(final ExercisesVO exercisesVO) {
        if(exercisesVO == null) {
            return null;
        }

        return mapper.map(exercisesVO, Exercises.class);
    }


    public static List<ExercisesVO> toVO(List<Exercises> exercisesList){
        List<ExercisesVO> exercisesVOS = new ArrayList<>();

        for (Exercises exercises : exercisesList) {
            exercisesVOS.add(toVO(exercises));
        }
        return exercisesVOS;
    }

    public static List<Exercises> toEntity(List<ExercisesVO> exercisesVOs){
        List<Exercises> exercisesEntities = new ArrayList<>();

        for (ExercisesVO exercisesVO : exercisesVOs){
            exercisesEntities.add(toEntity(exercisesVO));
        }
        return exercisesEntities;
    }
}
