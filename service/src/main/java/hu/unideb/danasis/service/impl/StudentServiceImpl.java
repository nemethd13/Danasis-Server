package hu.unideb.danasis.service.impl;

import hu.unideb.danasis.data.entity.Student;
import hu.unideb.danasis.data.repository.StudentRepository;
import hu.unideb.danasis.service.api.service.StudentService;
import hu.unideb.danasis.service.api.vo.StudentVO;
import hu.unideb.danasis.service.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<StudentVO> findAll() {

        List<Student> students = null;

        students = studentRepository.findAll();

        return studentMapper.toVO(students);
    }

    @Override
    public StudentVO findStudentByName(String name) {
        Student student = null;

        student = studentRepository.findByUserName(name);

        return studentMapper.toVO(student);
    }

    @Override
    public void saveStudent(StudentVO student) {

        Student studentEntity = null;

        studentEntity = studentMapper.toEntity(student);

        studentEntity.setPassword(passwordEncoder.encode(studentEntity.getPassword()));

        studentRepository.save(studentEntity);
    }
}
