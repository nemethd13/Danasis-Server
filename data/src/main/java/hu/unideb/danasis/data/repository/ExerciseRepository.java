package hu.unideb.danasis.data.repository;

import hu.unideb.danasis.data.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {


//    List<Exercise> findByExercisesid(String exercisesid);


}
