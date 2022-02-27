package demo;

import org.springframework.stereotype.Component;
@Component
public class JuniorLecture implements Staff{

    public void teaching (){
        System.out.println("Junior is teaching");
    }
}
