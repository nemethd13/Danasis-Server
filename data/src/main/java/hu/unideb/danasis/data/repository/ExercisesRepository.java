package hu.unideb.danasis.data.repository;

import hu.unideb.danasis.data.entity.Exercises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExercisesRepository extends JpaRepository<Exercises, Long>{

    Exercises findById(Long id);

    @Query("select e from Exercises e where e.teacherid = :teacherId")
    List<Exercises> findByTeacherId(@Param("teacherId") Long id);


}
