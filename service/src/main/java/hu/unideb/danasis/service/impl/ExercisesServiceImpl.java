package hu.unideb.danasis.service.impl;

import hu.unideb.danasis.data.entity.Exercises;
import hu.unideb.danasis.data.repository.ExercisesRepository;
import hu.unideb.danasis.service.api.service.ExercisesService;
import hu.unideb.danasis.service.api.vo.ExercisesVO;
import hu.unideb.danasis.service.mapper.ExercisesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExercisesServiceImpl implements  ExercisesService{

    @Autowired
    ExercisesRepository exercisesRepository;

    @Autowired
    ExercisesMapper exercisesMapper;

    @Override
    public List<ExercisesVO> findAll() {

        List<Exercises> exercises = null;

        exercises = exercisesRepository.findAll();

        return exercisesMapper.toVO(exercises);

    }

    @Override
    public ExercisesVO findById(Long id) {

        Exercises exercises = exercisesRepository.findById(id);

        return exercisesMapper.toVO(exercises);
    }

    @Override
    public List<ExercisesVO> findByTeacherId(Long id) {

        List<Exercises> exercisesEntity = null;
        exercisesEntity = exercisesRepository.findByTeacherId(id);
        return exercisesMapper.toVO(exercisesEntity);


    }
}
