package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Staff staff = applicationContext.getBean(Teacher.class);
         staff.teaching();  //Calling an address which is other object via setter injection.
       // System.out.println(staff.getAddress());
       // System.out.println(staff.getQualification());
    }
}
