package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sound.midi.SysexMessage;

@Component
public class Address implements BeanNameAware {

    private String phoneNumber;
    private String colony;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }

    @Override
    public String toString() {
        return "Address{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", colony='" + colony + '\'' +
                '}';
    }

    @PostConstruct
    public void preconstructionMethod(){
        System.out.println("We are in the post Construction method of Address bean");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("We are in set bean name of address bean");
    }
    @PreDestroy
    public void preDestroyMethod(){
        System.out.println("We are in the pre-destroy method of address bean");
    }


}
