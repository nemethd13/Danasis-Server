package hu.unideb.danasis.service.mapper;

import hu.unideb.danasis.data.entity.Result;
import hu.unideb.danasis.data.entity.Student;
import hu.unideb.danasis.service.api.vo.ResultVO;
import hu.unideb.danasis.service.api.vo.StudentVO;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResultMapper {

    //private static DozerBeanMapper mapper = new DozerBeanMapper();
    @Autowired
    private DozerBeanMapper mapper;

    public  ResultVO toVO(final Result result) {
        if(result == null) {
            return null;
        }

        return mapper.map(result, ResultVO.class);
    }

    public  Result toEntity(final ResultVO resultVO) {
        if(resultVO == null) {
            return null;
        }

        return mapper.map(resultVO, Result.class);
    }


    public  List<ResultVO> toVO(List<Result> results){
        List<ResultVO> resultVOs = new ArrayList<>();

        for (Result result : results) {
            resultVOs.add(toVO(result));
        }
        return resultVOs;
    }

    public  List<Result> toEntity(List<ResultVO> resultVOs){
        List<Result> resultEntities = new ArrayList<>();

        for (ResultVO resultVO : resultVOs){
            resultEntities.add(toEntity(resultVO));
        }
        return resultEntities;
    }
}
