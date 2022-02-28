package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Teacher teacher = applicationContext.getBean(Teacher.class);
        teacher.setQualification("9581972063");
        teacher.teaching();
        System.out.println(teacher);
        Teacher teacher1= applicationContext.getBean(Teacher.class);
        System.out.println(teacher1);

        //Calling an address which is other object via setter injection.
       // System.out.println(staff.getAddress());
       // System.out.println(staff.getQualification());
    }
}
