package hu.unideb.danasis.data.repository;

import hu.unideb.danasis.data.entity.Student;
import hu.unideb.danasis.data.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByUserName(String userName);
}
