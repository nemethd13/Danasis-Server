package hu.unideb.danasis.service.impl;

import hu.unideb.danasis.data.entity.Exercise;
import hu.unideb.danasis.data.repository.ExerciseRepository;
import hu.unideb.danasis.service.api.service.ExerciseService;
import hu.unideb.danasis.service.api.vo.ExerciseVO;
import hu.unideb.danasis.service.mapper.ExerciseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    ExerciseRepository exerciseRepository;

    @Autowired
    ExerciseMapper exerciseMapper;

    @Override
    public List<ExerciseVO> findAll() {
        List<Exercise> exercises = null;

        exercises = exerciseRepository.findAll();

        return exerciseMapper.toVO(exercises);
    }

//    @Override
//    public List<ExerciseVO> findByExercisesId(String exercisesId) {
//        List<Exercise> exercises = null;
//
//        exercises = exerciseRepository.findByExercisesid(exercisesId);
//
//        return ExerciseMapper.toVO(exercises);
//    }
}
