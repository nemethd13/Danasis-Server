package hu.unideb.danasis.web.controller;

import hu.unideb.danasis.service.api.service.StudentService;
import hu.unideb.danasis.service.api.vo.StudentVO;
import hu.unideb.danasis.service.api.vo.TeacherVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    StudentService studentService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ResponseEntity<List<StudentVO>> getAllStudents() {

        List<StudentVO> students = studentService.findAll();

        System.out.println(students);

        if( students == null){
            return new ResponseEntity<List<StudentVO>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<StudentVO>>(students, HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/students/registration", method = RequestMethod.POST)
    public void saveUser(@RequestBody StudentVO student) {

        studentService.saveStudent(student);


    }

}
