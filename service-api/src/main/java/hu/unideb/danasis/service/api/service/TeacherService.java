package hu.unideb.danasis.service.api.service;

import hu.unideb.danasis.service.api.vo.TeacherVO;

import java.util.List;

public interface TeacherService {

    List<TeacherVO> getAllTeachers();

    TeacherVO getTeacherById(Long id);
}
