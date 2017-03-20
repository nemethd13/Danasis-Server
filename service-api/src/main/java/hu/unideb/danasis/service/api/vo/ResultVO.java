package hu.unideb.danasis.service.api.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class ResultVO {

    private  Long id;

    private StudentVO studentId;

    private Long score;

    private LocalDateTime date;

}
