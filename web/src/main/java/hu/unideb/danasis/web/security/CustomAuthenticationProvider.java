package hu.unideb.danasis.web.security;

import hu.unideb.danasis.service.api.service.StudentService;
import hu.unideb.danasis.service.api.service.TeacherService;
import hu.unideb.danasis.service.api.vo.StudentVO;
import hu.unideb.danasis.service.api.vo.TeacherVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component("customAuthenticationProvider")
public class CustomAuthenticationProvider implements AuthenticationProvider {


    @Autowired
    TeacherService teacherService;

    @Autowired
    StudentService studentService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String name = authentication.getName();
        String password = authentication.getCredentials().toString();

        Collection<GrantedAuthority> authorities = null;

        TeacherVO teacherFromDB = null;
        teacherFromDB = teacherService.findTeacherByName(name);

        StudentVO studentFromDB = null;
        studentFromDB = studentService.findStudentByName(name);

        if(teacherFromDB != null) {
            authorities = Collections.singleton(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }
        if(studentFromDB != null) {
            authorities = Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
        }

//        User userFromDB = userService.getUserByUserName(name);
//        System.out.println(userFromDB);
//        if(userFromDB != null && "user".equals(userFromDB.getRole())) {
//            authorities = Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
//        }
//        if(userFromDB != null && "admin".equals(userFromDB.getRole())) {
//            authorities = Collections.singleton(new SimpleGrantedAuthority("ROLE_ADMIN"));
//        }

        System.out.println(name + " " + password + " " + authorities);
        System.out.println("AUTHORITIES: " + authorities);

        return new UsernamePasswordAuthenticationToken(name, password, authorities);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
