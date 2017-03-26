package hu.unideb.danasis.service.api.service;

import hu.unideb.danasis.service.api.vo.ExerciseVO;

import java.util.List;

public interface ExerciseService {

    List<ExerciseVO> findAll();

   // List<ExerciseVO> findByExercisesId(String exercisesId);
}
