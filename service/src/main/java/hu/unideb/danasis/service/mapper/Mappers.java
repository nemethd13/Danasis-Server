package hu.unideb.danasis.service.mapper;

import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;


public final class Mappers {

    private static DozerBeanMapper dozerBeanMapper ;

    static {


        List<String> mappingFiles =  new ArrayList<>();

        mappingFiles.add("dozerJdk8Converters.xml");

        dozerBeanMapper = new DozerBeanMapper();

        dozerBeanMapper.setMappingFiles(mappingFiles);

    }

    private Mappers(){}


    public static DozerBeanMapper dozerBeanMapper() {
        return dozerBeanMapper;
    }
}
