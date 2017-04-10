package hu.unideb.danasis.service.api.service;

import hu.unideb.danasis.service.api.vo.ResultVO;
import hu.unideb.danasis.service.api.vo.StudentVO;
import hu.unideb.danasis.service.api.vo.TeacherVO;

import java.util.List;

public interface StudentService {

    List<StudentVO> findAll();

    StudentVO findStudentByName(String name);

    StudentVO findById(Long id);

    void saveStudent(StudentVO student);

    void updateStudentWithResult(Long id, ResultVO resultVO);
}
