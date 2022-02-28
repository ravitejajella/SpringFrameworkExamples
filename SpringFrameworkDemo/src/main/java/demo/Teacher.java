package demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = "prototype")
public class Teacher implements Staff, BeanNameAware {

    private String qualification;
    public Address address;

    @Override
    public String toString() {
        return "Teacher{" +
                "qualification='" + qualification + '\'' +
                ", address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void teaching (){
           System.out.println("Teaching");
       }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


    @Override
    public void setBeanName(String s) {
        System.out.println("We are in the setbeanName method of teacher class");
    }

    @PostConstruct
    public void postConnstructMethod(){
        System.out.println("We are in the post constuct method of teacher class");
    }

    @PreDestroy
    public void preDestroyMethod(){
        System.out.println("We are in the predestroy method of teacher class");
    }
}
