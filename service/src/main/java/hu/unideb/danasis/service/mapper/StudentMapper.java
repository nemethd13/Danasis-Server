package hu.unideb.danasis.service.mapper;

import hu.unideb.danasis.data.entity.Student;
import hu.unideb.danasis.service.api.vo.StudentVO;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public final class StudentMapper {


    //private static DozerBeanMapper mapper = new DozerBeanMapper();
    @Autowired
    private DozerBeanMapper mapper;

    public  StudentVO toVO(final Student student) {
        if(student == null) {
            return null;
        }

        return mapper.map(student, StudentVO.class);
    }

    public  Student toEntity(final StudentVO studentVO) {
        if(studentVO == null) {
            return null;
        }

        return mapper.map(studentVO, Student.class);
    }


    public  List<StudentVO> toVO(List<Student> students){
        List<StudentVO> studentVOs = new ArrayList<>();

        for (Student student : students) {
            studentVOs.add(toVO(student));
        }
        return studentVOs;
    }

    public  List<Student> toEntity(List<StudentVO> studentVOs){
        List<Student> studentEntities = new ArrayList<>();

        for (StudentVO studentVO : studentVOs){
            studentEntities.add(toEntity(studentVO));
        }
        return studentEntities;
    }
}
