package hu.unideb.danasis.service.mapper;

import hu.unideb.danasis.data.entity.Exercise;
import hu.unideb.danasis.service.api.vo.ExerciseVO;
import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

public class ExerciseMapper {

    private static DozerBeanMapper mapper = new DozerBeanMapper();

    public static ExerciseVO toVO(final Exercise exercise) {
        if(exercise == null) {
            return null;
        }

        return mapper.map(exercise, ExerciseVO.class);
    }

    public static Exercise toEntity(final ExerciseVO exerciseVO) {
        if(exerciseVO == null) {
            return null;
        }

        return mapper.map(exerciseVO, Exercise.class);
    }


    public static List<ExerciseVO> toVO(List<Exercise> exerciseList){
        List<ExerciseVO> exerciseVOS = new ArrayList<>();

        for (Exercise exercise : exerciseList) {
            exerciseVOS.add(toVO(exercise));
        }
        return exerciseVOS;
    }

    public static List<Exercise> toEntity(List<ExerciseVO> exerciseVOs){
        List<Exercise> exerciseEntities = new ArrayList<>();

        for (ExerciseVO exerciseVO : exerciseVOs){
            exerciseEntities.add(toEntity(exerciseVO));
        }
        return exerciseEntities;
    }
}
