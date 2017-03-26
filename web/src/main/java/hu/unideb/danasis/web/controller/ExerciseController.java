package hu.unideb.danasis.web.controller;

import hu.unideb.danasis.service.api.service.ExerciseService;
import hu.unideb.danasis.service.api.vo.ExerciseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ExerciseController {

    @Autowired
    ExerciseService exerciseService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/exercise", method = RequestMethod.GET)
    public ResponseEntity<List<ExerciseVO>> getAllExercises() {

        List<ExerciseVO> exercises = exerciseService.findAll();

        if( exercises == null){
            return new ResponseEntity<List<ExerciseVO>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<ExerciseVO>>(exercises, HttpStatus.OK);
    }

//    @CrossOrigin(origins = "*")
//    @RequestMapping(value = "exercise/{exercisesId}", method = RequestMethod.GET)
//    public ResponseEntity<List<ExerciseVO>> getExercisesById(@PathVariable("exercisesId") String exercisesId) {
//
//        List<ExerciseVO> exercises = exerciseService.findByExercisesId(exercisesId);
//
//        if( exercises == null){
//            return new ResponseEntity<List<ExerciseVO>>(HttpStatus.NO_CONTENT);
//        }
//
//        return new ResponseEntity<List<ExerciseVO>>(exercises, HttpStatus.OK);
//    }
}
