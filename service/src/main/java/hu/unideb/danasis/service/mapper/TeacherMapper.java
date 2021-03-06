package hu.unideb.danasis.service.mapper;

import hu.unideb.danasis.data.entity.Student;
import hu.unideb.danasis.data.entity.Teacher;
import hu.unideb.danasis.service.api.vo.StudentVO;
import hu.unideb.danasis.service.api.vo.TeacherVO;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Component
public class TeacherMapper {

    private static DozerBeanMapper mapper = Mappers.dozerBeanMapper();
//    @Autowired
//    private DozerBeanMapper mapper;



    public static TeacherVO toVO(final Teacher teacher) {
        if(teacher == null) {
            return null;
        }

        return mapper.map(teacher, TeacherVO.class);
    }

    public static Teacher toEntity(final TeacherVO teacherVO) {
        if(teacherVO == null) {
            return null;
        }

        return mapper.map(teacherVO, Teacher.class);
    }


    public static List<TeacherVO> toVO(List<Teacher> teachers){
        List<TeacherVO> teacherVOS = new ArrayList<>();

        for (Teacher teacher : teachers) {
            teacherVOS.add(toVO(teacher));
        }
        return teacherVOS;
    }

    public static List<Teacher> toEntity(List<TeacherVO> teacherVOs){
        List<Teacher> teacherEntities = new ArrayList<>();

        for (TeacherVO teacherVO : teacherVOs){
            teacherEntities.add(toEntity(teacherVO));
        }
        return teacherEntities;
    }
}
