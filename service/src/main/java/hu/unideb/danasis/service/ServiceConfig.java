package hu.unideb.danasis.service;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "hu.unideb.danasis.service")
public class ServiceConfig {

//    @Bean
//    public DozerBeanMapper dozerBeanMapper(){
//        DozerBeanMapper dozerBeanMapper ;
//
//
//            dozerBeanMapper = new DozerBeanMapper();
//
//            List<String> mappingFiles =  new ArrayList<>();
//            mappingFiles.add("dozerJdk8Converters.xml");
//
//            dozerBeanMapper.setMappingFiles(mappingFiles);
//
//
//        return dozerBeanMapper;
//    }

//    private static DozerBeanMapper dozerBeanMapper ;
//
//    static {
//        dozerBeanMapper = new DozerBeanMapper();
//
//            List<String> mappingFiles =  new ArrayList<>();
//            mappingFiles.add("dozerJdk8Converters.xml");
//
//            dozerBeanMapper.setMappingFiles(mappingFiles);
//
//    }
//
//    private ServiceConfig(){}
//
//
//    public DozerBeanMapper dozerBeanMapper() {
//        return dozerBeanMapper;
//    }


}
