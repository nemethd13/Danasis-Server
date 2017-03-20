package hu.unideb.danasis.data.entity;

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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "studentid")
    private Student studentId;

    private Long score;

    private LocalDateTime date;
}
