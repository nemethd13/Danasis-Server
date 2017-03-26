package hu.unideb.danasis.data.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Entity
public class Result extends BaseEntity {

    @ManyToOne//(targetEntity = Student.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "studentid")
    @JsonBackReference
    private Student studentId;

    private Long score;

    private LocalDateTime date;
}
