package hu.unideb.danasis.service.impl;

import hu.unideb.danasis.data.entity.Exercise;
import hu.unideb.danasis.data.entity.Exercises;
import hu.unideb.danasis.data.entity.Teacher;
import hu.unideb.danasis.data.repository.TeacherRepository;
import hu.unideb.danasis.service.api.service.TeacherService;
import hu.unideb.danasis.service.api.vo.ExercisesVO;
import hu.unideb.danasis.service.api.vo.TeacherVO;
import hu.unideb.danasis.service.mapper.ExercisesMapper;
import hu.unideb.danasis.service.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    ExercisesMapper exercisesMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

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

    @Override
    public void saveUser(TeacherVO teacher) {
        Teacher teacherEntity = null;

        teacherEntity = teacherMapper.toEntity(teacher);

        teacherEntity.setPassword(passwordEncoder.encode(teacher.getPassword()));
        teacherRepository.save(teacherEntity);
    }

    @Override
    public TeacherVO findTeacherByName(String name) {
        Teacher teacher = null;

        teacher = teacherRepository.findByUserName(name);

        return teacherMapper.toVO(teacher);
    }


    @Override
    public void updateTeacher(Long id, ExercisesVO exercises) {



        Teacher teacher = teacherRepository.findOne(id);

        List<Exercises> exercisesList = teacher.getExercises();

        Exercises newExercises = exercisesMapper.toEntity(exercises);

        List<Exercise> exerciseList = newExercises.getExercisesList();

        if(exerciseList != null) {
            for (Exercise e : exerciseList) {
                e.setExercisesId(newExercises);
            }
        }

        newExercises.setTeacherId(teacher);

        exercisesList.add(newExercises);

        teacher.setExercises(exercisesList);

        System.out.println("loglog" + teacher.getExercises());

        teacherRepository.save(teacher);
    }

    @Override
    public void updateTeacherDeleteExercises(Long teacherId, Long exercisesId) {

        Teacher teacher = teacherRepository.findOne(teacherId);

        List<Exercises> exercisesList = teacher.getExercises();

        System.out.println("Ez az id kene " + exercisesId);

        System.out.println();

        for (Exercises e : exercisesList) {
            System.out.println(e.getId());
        }

            for(int i = 0; i < exercisesList.size(); i++) {
                System.out.println("ciklusba vagyunk");
                System.out.println("Ezt torolnenk: " + exercisesId + "Ez van most iteracioban" + exercisesList.get(i).getId());
                if(exercisesId.equals(exercisesList.get(i).getId())){

                    System.out.println("Torlendo feladatsor: " + exercisesList.get(i));
                    exercisesList.remove(i);

                }
            }

        for (Exercises e : exercisesList) {
            System.out.println(e.getId());
        }


        teacher.setExercises(exercisesList);

        teacherRepository.save(teacher);
    }
}
