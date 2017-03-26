package hu.unideb.danasis.service.impl;

import hu.unideb.danasis.data.entity.Student;
import hu.unideb.danasis.data.repository.StudentRepository;
import hu.unideb.danasis.service.api.service.StudentService;
import hu.unideb.danasis.service.api.vo.StudentVO;
import hu.unideb.danasis.service.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<StudentVO> findAll() {

        List<Student> students = null;

        students = studentRepository.findAll();
        return StudentMapper.toVO(students);
    }
}
