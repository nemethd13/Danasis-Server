package hu.unideb.danasis.service.impl;

import hu.unideb.danasis.data.entity.Teacher;
import hu.unideb.danasis.data.repository.TeacherRepository;
import hu.unideb.danasis.service.api.service.TeacherService;
import hu.unideb.danasis.service.api.vo.TeacherVO;
import hu.unideb.danasis.service.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public List<TeacherVO> getAllTeachers() {
        List<Teacher> teachers = null;

        teachers = teacherRepository.findAll();

        return  teacherMapper.toVO(teachers);
    }

    @Override
    public TeacherVO getTeacherById(Long id) {
        Teacher teacher = null;

        teacher = teacherRepository.findOne(id);

        return teacherMapper.toVO(teacher);
    }
}
