package hu.unideb.danasis.service.api.service;

import hu.unideb.danasis.service.api.vo.StudentVO;

import java.util.List;

public interface StudentService {

    List<StudentVO> findAll();
}
