package hu.unideb.danasis.service.impl;

import hu.unideb.danasis.data.entity.Result;
import hu.unideb.danasis.data.entity.Student;
import hu.unideb.danasis.data.repository.StudentRepository;
import hu.unideb.danasis.service.api.service.StudentService;
import hu.unideb.danasis.service.api.vo.ResultVO;
import hu.unideb.danasis.service.api.vo.StudentVO;
import hu.unideb.danasis.service.mapper.ResultMapper;
import hu.unideb.danasis.service.mapper.StudentMapper;
import javafx.util.converter.LocalDateTimeStringConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    ResultMapper resultMapper;

    DateTimeFormatter format;

    LocalDateTimeStringConverter converter;

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

    @Override
    public StudentVO findById(Long id) {
        format = DateTimeFormatter.ofPattern("yyyy/MM/dd");


        Student student = null;

        student = studentRepository.findOne(id);

//        List<Result> results = student.getResults();
//
//        System.out.println("Elotte");
//        for (Result result : results){
//            System.out.println(result.getDate());
//        }
//
//        for(Result result : results) {
//            result.getDate().format(format);
//        }
//
//        System.out.println("Utana");
//        for (Result result : results){
//            System.out.println(result.getDate());
//        }

        //student.setResults(results);

        return studentMapper.toVO(student);
    }

    @Override
    public void updateStudentWithResult(Long id, ResultVO resultVO) {

        Student student = studentRepository.findOne(id);

        List<Result> resultList = student.getResults();

        Result newResult = resultMapper.toEntity(resultVO);

        newResult.setStudentId(student);

        resultList.add(newResult);

        student.setResults(resultList);

        studentRepository.save(student);

    }
}
