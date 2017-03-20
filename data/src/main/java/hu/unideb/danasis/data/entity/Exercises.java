package hu.unideb.danasis.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class Exercises extends BaseEntity{

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacherid")
    private Teacher teacherId;


}
