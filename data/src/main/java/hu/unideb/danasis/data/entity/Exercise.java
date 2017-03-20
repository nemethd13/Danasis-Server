package hu.unideb.danasis.data.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Data
@Entity
public class Exercise extends BaseEntity{

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exercisesid")
    private Exercises exercisesId;

    private String theme;

    private String question;

    private String answera;

    private String answerb;

    private String answerc;

    private String answerd;

    private String rightAnswer;
}
