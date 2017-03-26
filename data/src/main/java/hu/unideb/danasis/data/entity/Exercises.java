package hu.unideb.danasis.data.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class Exercises extends BaseEntity{

    @ManyToOne(targetEntity = Teacher.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "teacherid")
    @JsonBackReference
    private Teacher teacherId;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "exercisesId", cascade = CascadeType.ALL)
    List<Exercise> exercises;

}
