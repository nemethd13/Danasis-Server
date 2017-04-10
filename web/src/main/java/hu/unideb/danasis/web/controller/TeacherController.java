package hu.unideb.danasis.web.controller;

import hu.unideb.danasis.service.api.service.TeacherService;
import hu.unideb.danasis.service.api.vo.ExercisesVO;
import hu.unideb.danasis.service.api.vo.TeacherVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/teachers", method = RequestMethod.GET)
    public ResponseEntity<List<TeacherVO>> getAllTeachers() {

        List<TeacherVO> teachers = teacherService.getAllTeachers();



        if( teachers == null){
            return new ResponseEntity<List<TeacherVO>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<TeacherVO>>(teachers, HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/teachers/{id}", method = RequestMethod.GET)
    public ResponseEntity<TeacherVO> getTeacherById(@PathVariable("id") Long id) {

        TeacherVO teacher = teacherService.getTeacherById(id);

        if( teacher == null){
            return new ResponseEntity<TeacherVO>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<TeacherVO>(teacher, HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/teachers/registration", method = RequestMethod.POST)
    public void saveUser(@RequestBody TeacherVO teacher) {

        teacherService.saveUser(teacher);


    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/teachers/{id}/exercises", method = RequestMethod.POST)
    public void updateTeacherExercises(@PathVariable("id") Long id, @RequestBody ExercisesVO exercises) {

        teacherService.updateTeacher(id, exercises);
        System.out.println("fasz" + exercises);

    }






}
