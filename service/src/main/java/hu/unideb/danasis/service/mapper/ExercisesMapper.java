package hu.unideb.danasis.service.mapper;

import hu.unideb.danasis.data.entity.Exercise;
import hu.unideb.danasis.data.entity.Exercises;
import hu.unideb.danasis.data.entity.Student;
import hu.unideb.danasis.service.api.vo.ExercisesVO;
import hu.unideb.danasis.service.api.vo.StudentVO;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ExercisesMapper {

    //private static DozerBeanMapper mapper = new DozerBeanMapper();
    @Autowired
    private DozerBeanMapper mapper;

    public  ExercisesVO toVO(final Exercises exercises) {
        if(exercises == null) {
            return null;
        }

        return mapper.map(exercises, ExercisesVO.class);
    }

    public  Exercises toEntity(final ExercisesVO exercisesVO) {
        if(exercisesVO == null) {
            return null;
        }

        return mapper.map(exercisesVO, Exercises.class);
    }


    public  List<ExercisesVO> toVO(List<Exercises> exercisesList){
        List<ExercisesVO> exercisesVOS = new ArrayList<>();

        for (Exercises exercises : exercisesList) {
            exercisesVOS.add(toVO(exercises));
        }
        return exercisesVOS;
    }

    public  List<Exercises> toEntity(List<ExercisesVO> exercisesVOs){
        List<Exercises> exercisesEntities = new ArrayList<>();

        for (ExercisesVO exercisesVO : exercisesVOs){
            exercisesEntities.add(toEntity(exercisesVO));
        }
        return exercisesEntities;
    }
}
