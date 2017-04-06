package hu.unideb.danasis.data.repository;

import hu.unideb.danasis.data.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    Teacher findByUserName(String userName);
}
