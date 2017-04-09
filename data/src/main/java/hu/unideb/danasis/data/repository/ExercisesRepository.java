package hu.unideb.danasis.data.repository;

import hu.unideb.danasis.data.entity.Exercises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExercisesRepository extends JpaRepository<Exercises, Long>{

    Exercises findById(Long id);

//    List<Exercises> findByTeacherId(Long id);
}
