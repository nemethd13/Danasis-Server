package hu.unideb.danasis.service.mapper;

import hu.unideb.danasis.data.entity.Exercise;
import hu.unideb.danasis.service.api.vo.ExerciseVO;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ExerciseMapper {

    //private static DozerBeanMapper mapper = new DozerBeanMapper();
    @Autowired
    private DozerBeanMapper mapper;

    public  ExerciseVO toVO(final Exercise exercise) {
        if(exercise == null) {
            return null;
        }

        return mapper.map(exercise, ExerciseVO.class);
    }

    public  Exercise toEntity(final ExerciseVO exerciseVO) {
        if(exerciseVO == null) {
            return null;
        }

        return mapper.map(exerciseVO, Exercise.class);
    }


    public  List<ExerciseVO> toVO(List<Exercise> exerciseList){
        List<ExerciseVO> exerciseVOS = new ArrayList<>();

        for (Exercise exercise : exerciseList) {
            exerciseVOS.add(toVO(exercise));
        }
        return exerciseVOS;
    }

    public  List<Exercise> toEntity(List<ExerciseVO> exerciseVOs){
        List<Exercise> exerciseEntities = new ArrayList<>();

        for (ExerciseVO exerciseVO : exerciseVOs){
            exerciseEntities.add(toEntity(exerciseVO));
        }
        return exerciseEntities;
    }
}
