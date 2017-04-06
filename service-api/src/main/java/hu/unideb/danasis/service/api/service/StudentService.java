package hu.unideb.danasis.service.api.service;

import hu.unideb.danasis.service.api.vo.StudentVO;
import hu.unideb.danasis.service.api.vo.TeacherVO;

import java.util.List;

public interface StudentService {

    List<StudentVO> findAll();

    StudentVO findStudentByName(String name);

    void saveStudent(StudentVO student);
}
