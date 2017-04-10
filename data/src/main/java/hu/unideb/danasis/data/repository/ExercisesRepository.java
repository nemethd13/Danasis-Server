package hu.unideb.danasis.data.repository;

import hu.unideb.danasis.data.entity.Exercises;
import hu.unideb.danasis.data.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExercisesRepository extends JpaRepository<Exercises, Long>{

    Exercises findById(Long id);


    List<Exercises> findByTeacherId(Teacher teacherId);


}
