package hu.unideb.danasis.web.controller;

import hu.unideb.danasis.service.api.service.StudentService;
import hu.unideb.danasis.service.api.service.TeacherService;
import hu.unideb.danasis.service.api.vo.StudentVO;
import hu.unideb.danasis.service.api.vo.TeacherVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class LogInController {

    @Autowired
    TeacherService teacherService;

    @Autowired
    StudentService studentService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<User> findUser(@RequestParam("param") String username) {//, @RequestParam("param2") String password) {


        TeacherVO teacher = new TeacherVO();
        teacher = teacherService.findTeacherByName(username);

        StudentVO student = null;
        student = studentService.findStudentByName(username);

        User user = new User();

        if(teacher != null){
            user.setId(teacher.getId());
            user.setUserName(teacher.getUserName());
            user.setRole(teacher.getRole());
        }

        if(student != null){
            user.setId(student.getId());
            user.setUserName(student.getUserName());
            user.setRole(student.getRole());
        }


        if(user == null){
            return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
