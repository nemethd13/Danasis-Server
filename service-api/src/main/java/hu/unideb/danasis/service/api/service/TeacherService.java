package hu.unideb.danasis.service.api.service;

import hu.unideb.danasis.service.api.vo.ExercisesVO;
import hu.unideb.danasis.service.api.vo.TeacherVO;

import java.util.List;

public interface TeacherService {

    List<TeacherVO> getAllTeachers();

    TeacherVO getTeacherById(Long id);

    void saveUser(TeacherVO teacher);

    TeacherVO findTeacherByName(String name);

    void updateTeacher(Long id, ExercisesVO exercises);

    void updateTeacherDeleteExercises(Long teacherId, Long exercisesId);

}
